package com.example.uetshare.controller;

import com.example.uetshare.entity.Comment;
import com.example.uetshare.response.CommentResponse;
import com.example.uetshare.response.dto.CommentDto;
import com.example.uetshare.response.mapper.CommentMapper;
import com.example.uetshare.service.CommentServiceInterface;
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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentServiceInterface commentServiceInterface;

    @Value("${file.upload-dir}")
    String FILE_DIRECTORY;

    private final Integer limit = 10;

    @PostMapping("/create")
    public ResponseEntity<?> createComment(@RequestParam("Comment") String commentJson, @RequestParam(name="image_file", required = false) MultipartFile image_file, CommentResponse commentResponse) throws IOException {

        try {

            Comment comment = new ObjectMapper().readValue(commentJson, Comment.class);
            comment.setTime(Calendar.getInstance());
            Comment commentFromBb = commentServiceInterface.createComment(comment);

            if(image_file != null) {
                if (!image_file.isEmpty()) {
                    String pathDirectoryString = FILE_DIRECTORY + "account_" + commentFromBb.getAccount().getId() + "/comment_" + commentFromBb.getId() + "/";
                    String pathFileString = writeFile(pathDirectoryString, image_file);
                    commentFromBb.setImage(pathFileString);
                }
            }
            Comment commentAfterUpdate = commentServiceInterface.updateComment(commentFromBb.getId(),commentFromBb);

            commentResponse.setSuccess(true);
            commentResponse.setMessage("Create comment success");

            List<CommentDto> commentDtoList = new ArrayList<>();
            commentDtoList.add(CommentMapper.toCommentDto(commentAfterUpdate));
            commentResponse.setCommentDtoList(commentDtoList);

            return ResponseEntity.ok(commentResponse);

        } catch (Exception e) {
            commentResponse.setSuccess(false);
            commentResponse.setMessage(e.toString());

            return new ResponseEntity<>(commentResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    public static String writeFile(String pathDirectoryString, MultipartFile file) throws IOException {
        Path path = Paths.get(pathDirectoryString);
        Files.createDirectories(path);

        String pathFileString = pathDirectoryString + file.getOriginalFilename();
        File myFile = new File(pathFileString);
        myFile.createNewFile();

        FileOutputStream fos =new FileOutputStream(myFile);
        fos.write(file.getBytes());
        fos.close();

        return pathFileString;
    }

    @GetMapping("/question/{id}")
    public ResponseEntity<?> getCommentByQuestionId(CommentResponse commentResponse, @Param("index") Integer index, @PathVariable Long id){
        try {
            Integer indexToQuery = index*limit;
            List<Comment> commentList = commentServiceInterface.getCommentByQuestionId(indexToQuery, id);
            List<CommentDto> commentDtoList = new ArrayList<>();

            for(Comment comment : commentList){
                commentDtoList.add(CommentMapper.toCommentDto(comment));
            }

            commentResponse.setSuccess(true);
            commentResponse.setMessage("Get comment success");
            commentResponse.setResult_quantity(commentDtoList.size());
            commentResponse.setCommentDtoList(commentDtoList);

            return ResponseEntity.ok(commentResponse);

        } catch (Exception e){
            commentResponse.setSuccess(false);
            commentResponse.setMessage(e.toString());

            return new ResponseEntity<>(commentResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
