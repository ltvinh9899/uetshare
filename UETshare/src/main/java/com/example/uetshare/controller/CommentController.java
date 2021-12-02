package com.example.uetshare.controller;

import com.example.uetshare.entity.Comment;
import com.example.uetshare.response.CommentResponse;
import com.example.uetshare.response.dto.CommentDto;
import com.example.uetshare.response.mapper.CommentMapper;
import com.example.uetshare.service.CommentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentServiceInterface commentServiceInterface;

    private final Integer limit = 10;

    @PostMapping("/create")
    public ResponseEntity<?> createComment(@RequestBody Comment comment, CommentResponse commentResponse){

        try {
            comment.setTime(Calendar.getInstance());
            commentServiceInterface.createComment(comment);

            commentResponse.setSuccess(true);
            commentResponse.setMessage("Create comment success");

            List<CommentDto> commentDtoList = new ArrayList<>();
            commentDtoList.add(CommentMapper.toCommentDto(comment));
            commentResponse.setCommentDtoList(commentDtoList);

            return ResponseEntity.ok(commentResponse);

        } catch (Exception e) {
            commentResponse.setSuccess(false);
            commentResponse.setMessage(e.toString());

            return new ResponseEntity<>(commentResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }

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
