package com.example.uetshare.controller;

import com.example.uetshare.entity.ReactIconComment;
import com.example.uetshare.entity.ReactIconQuestion;
import com.example.uetshare.response.ReactIconCommentResponse;
import com.example.uetshare.response.ReactIconQuestionResponse;
import com.example.uetshare.response.dto.ReactIconCommentDto;
import com.example.uetshare.response.dto.ReactIconQuestionDto;
import com.example.uetshare.response.mapper.ReactIconCommentMapper;
import com.example.uetshare.response.mapper.ReactIconQuestionMapper;
import com.example.uetshare.service.ReactIconCommentServiceInterface;
import com.example.uetshare.service.ReactIconQuestionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/react-icon-comment")
public class ReactIconCommentController {

    @Autowired
    private ReactIconCommentServiceInterface reactIconCommentServiceInterface;

    private final Integer limit = 10;

    @PostMapping("/create")
    public ResponseEntity<?> createReactIconInComment(@RequestBody ReactIconComment reactIcon, ReactIconCommentResponse reactIconCommentResponse) {

        return reactIconCommentServiceInterface.createReactIcon(reactIcon, reactIconCommentResponse);

    }



    @GetMapping("/comment/{id}")
    public ResponseEntity<?> getReactByCommentId(@PathVariable Long id, @Param("index") Integer index, ReactIconCommentResponse reactIconCommentResponse) {

        try {
            Integer indexToQuery = index*limit;
            List<ReactIconComment> reactIconCommentList = reactIconCommentServiceInterface.getReactIconByCommentId(id, indexToQuery);
            List<ReactIconCommentDto> reactIconCommentDtoList = new ArrayList<>();

            for(ReactIconComment reactIcon : reactIconCommentList){
                reactIconCommentDtoList.add(ReactIconCommentMapper.toReactIconCommentDto(reactIcon));
            }

            reactIconCommentResponse.setSuccess(true);
            reactIconCommentResponse.setMessage("success to get");
            reactIconCommentResponse.setResult_quantity(reactIconCommentDtoList.size());
            reactIconCommentResponse.setReactIconCommentDtoList(reactIconCommentDtoList);


            return ResponseEntity.ok(reactIconCommentResponse);


        } catch (Exception e){

            reactIconCommentResponse.setSuccess(false);
            reactIconCommentResponse.setMessage(e.toString());

            return new ResponseEntity<>(reactIconCommentResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/liked/account/{account_id}/comment/{comment_id}")
    public ResponseEntity<Boolean> liked(@PathVariable("account_id") Long account_id, @PathVariable("comment_id") Long comment_id, ReactIconQuestionResponse reactIconQuestionResponse){
        try {

            Boolean liked = reactIconCommentServiceInterface.liked(account_id, comment_id);

            System.out.println(liked);

            return ResponseEntity.ok().body(liked);


        } catch (Exception e){



            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("account/{account_id}/comment/{comment_id}")
    public ResponseEntity<?> deleteReactIcon(@PathVariable("account_id") Long account_id, @PathVariable("account_id") Long comment_id, ReactIconCommentResponse reactIconCommentResponse){
        try {

            ReactIconComment reactIconComment = reactIconCommentServiceInterface.deleteReactIconComment(account_id, account_id);

            reactIconCommentResponse.setSuccess(true);
            reactIconCommentResponse.setMessage("success to get");

            List<ReactIconCommentDto> reactIconCommentDtoList = new ArrayList<>();
            reactIconCommentDtoList.add(ReactIconCommentMapper.toReactIconCommentDto(reactIconComment));
            reactIconCommentResponse.setResult_quantity(reactIconCommentDtoList.size());
            reactIconCommentResponse.setReactIconCommentDtoList(reactIconCommentDtoList);

            return ResponseEntity.ok(reactIconCommentResponse);


        } catch (Exception e){

            reactIconCommentResponse.setSuccess(false);
            reactIconCommentResponse.setMessage(e.toString());

            return new ResponseEntity<>(reactIconCommentResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
