package com.example.uetshare.controller;

import com.example.uetshare.entity.Comment;
import com.example.uetshare.entity.Question;
import com.example.uetshare.entity.SubComment;
import com.example.uetshare.response.SubCommentResponse;
import com.example.uetshare.response.dto.QuestionDto;
import com.example.uetshare.response.dto.SubCommentDto;
import com.example.uetshare.response.mapper.QuestionMapper;
import com.example.uetshare.response.mapper.SubCommentMapper;
import com.example.uetshare.service.SubCommentServiceInterface;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/sub-comment")
public class SubCommentController {

    @Autowired
    private SubCommentServiceInterface subCommentServiceInterface;

    @Value("${file.upload-dir}")
    String FILE_DIRECTORY;

    private final Integer limit = 10;

    @PostMapping("/create")
    public ResponseEntity<?> createSubComment(@RequestParam("SubComment") String subCommentJson, @RequestParam("image_file") MultipartFile image_file, SubCommentResponse subCommentResponse){
        try {

            SubComment subComment = new ObjectMapper().readValue(subCommentJson, SubComment.class);
            subComment.setTime(Calendar.getInstance());
            SubComment subCommentFromDb = subCommentServiceInterface.createSubComment(subComment);

            if (image_file.isEmpty()) {
                String pathDirectoryString = FILE_DIRECTORY + "account_" + subCommentFromDb.getAccount().getId() + "/sub_comment_" + subCommentFromDb.getId() + "/";
                String pathFileString = CommentController.writeFile(pathDirectoryString, image_file);
                subCommentFromDb.setImage(pathFileString);
            }

            SubComment subCommentAfterUpdate = subCommentServiceInterface.updateSubComment(subCommentFromDb.getId(),subCommentFromDb);

            subCommentResponse.setSuccess(true);
            subCommentResponse.setMessage("Create question success");

            List<SubCommentDto> subCommentDtoList = new ArrayList<>();
            subCommentDtoList.add(SubCommentMapper.toSubCommentDto(subCommentAfterUpdate));
            subCommentResponse.setSubCommentDtoList(subCommentDtoList);

            return ResponseEntity.ok(subCommentResponse);

        } catch (Exception e){

            subCommentResponse.setSuccess(false);
            subCommentResponse.setMessage(e.toString());


            return new ResponseEntity<>(subCommentResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/comment/{id}")
    public ResponseEntity<?> getSubCommentByCommentId(@PathVariable Long id, SubCommentResponse subCommentResponse, @Param("index") Integer index){
        try {

            Integer indexToQuery = index*limit;
            List<SubComment> subCommentList = subCommentServiceInterface.getSubCommentByCommentId(id, indexToQuery);
            List<SubCommentDto> subCommentDtoList = new ArrayList<>();

            for(SubComment subComment : subCommentList){
                subCommentDtoList.add(SubCommentMapper.toSubCommentDto(subComment));
            }

            subCommentResponse.setSuccess(true);
            subCommentResponse.setMessage("success get all question");
            subCommentResponse.setResult_quantity(subCommentDtoList.size());

            subCommentResponse.setSubCommentDtoList(subCommentDtoList);

            return ResponseEntity.ok(subCommentResponse);

        } catch (Exception e){

            subCommentResponse.setSuccess(false);
            subCommentResponse.setMessage(e.toString());

            return new ResponseEntity<>(subCommentResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

}
