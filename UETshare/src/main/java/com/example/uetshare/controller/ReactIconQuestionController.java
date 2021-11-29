package com.example.uetshare.controller;

import com.example.uetshare.entity.ReactIconComment;
import com.example.uetshare.entity.ReactIconQuestion;
import com.example.uetshare.response.ReactIconCommentResponse;
import com.example.uetshare.response.ReactIconQuestionResponse;
import com.example.uetshare.response.dto.ReactIconCommentDto;
import com.example.uetshare.response.dto.ReactIconQuestionDto;
import com.example.uetshare.response.mapper.ReactIconCommentMapper;
import com.example.uetshare.response.mapper.ReactIconQuestionMapper;
import com.example.uetshare.service.ReactIconQuestionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/react-icon-question")
public class ReactIconQuestionController {

    @Autowired
    private ReactIconQuestionServiceInterface reactIconQuestionServiceInterface;

    private final Integer limit = 10;

    @PostMapping("/create")
    public ResponseEntity<?> createReactIconInQuestion(@RequestBody ReactIconQuestion reactIcon, ReactIconQuestionResponse reactIconQuestionResponse) {

        try {

            reactIconQuestionServiceInterface.createReactIcon(reactIcon);

            reactIconQuestionResponse.setSuccess(true);
            reactIconQuestionResponse.setMessage("create success");

            List<ReactIconQuestionDto> reactIconQuestionDtoList = new ArrayList<>();
            reactIconQuestionDtoList.add(ReactIconQuestionMapper.toReactIconDto(reactIcon));
            reactIconQuestionResponse.setReactIconQuestionDtoList(reactIconQuestionDtoList);

            return ResponseEntity.ok(reactIconQuestionResponse);

        } catch (Exception e){

            reactIconQuestionResponse.setSuccess(false);
            reactIconQuestionResponse.setMessage(e.toString());


            return new ResponseEntity<>(reactIconQuestionResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

//    @PostMapping("/comment/{id}")
//    public ResponseEntity<?> createReactInComment(@RequestBody ReactIcon reactIcon, @PathVariable Long id) {
//
//        return null;
//
//    }

    @GetMapping("/question/{id}")
    public ResponseEntity<?> getReactIconByQuestionId(@PathVariable Long id, @Param("index") Integer index, ReactIconQuestionResponse reactIconQuestionResponse) {

        try {
            Integer indexToQuery = index*limit;
            List<ReactIconQuestion> reactIconList = reactIconQuestionServiceInterface.getReactIconByQuestionId(id, indexToQuery);
            List<ReactIconQuestionDto> reactIconQuestionDtoList = new ArrayList<>();

            for(ReactIconQuestion reactIcon : reactIconList){
                reactIconQuestionDtoList.add(ReactIconQuestionMapper.toReactIconDto(reactIcon));
            }

            reactIconQuestionResponse.setSuccess(true);
            reactIconQuestionResponse.setMessage("success to get");
            reactIconQuestionResponse.setResult_quantity(reactIconQuestionDtoList.size());
            reactIconQuestionResponse.setReactIconQuestionDtoList(reactIconQuestionDtoList);


            return ResponseEntity.ok(reactIconQuestionResponse);


        } catch (Exception e){

            reactIconQuestionResponse.setSuccess(false);
            reactIconQuestionResponse.setMessage(e.toString());

            return new ResponseEntity<>(reactIconQuestionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("account/{account_id}/comment/{question_id}")
    public ResponseEntity<?> deleteReactIcon(@PathVariable("account_id") Long account_id, @PathVariable("question_id") Long question_id, ReactIconQuestionResponse reactIconQuestionResponse){
        try {

            ReactIconQuestion reactIconQuestion = reactIconQuestionServiceInterface.deleteReactIconQuestion(account_id, question_id);

            reactIconQuestionResponse.setSuccess(true);
            reactIconQuestionResponse.setMessage("success to get");

            List<ReactIconQuestionDto> reactIconQuestionDtoList = new ArrayList<>();
            reactIconQuestionDtoList.add(ReactIconQuestionMapper.toReactIconDto(reactIconQuestion));
            reactIconQuestionResponse.setResult_quantity(reactIconQuestionDtoList.size());
            reactIconQuestionResponse.setReactIconQuestionDtoList(reactIconQuestionDtoList);

            return ResponseEntity.ok(reactIconQuestionResponse);


        } catch (Exception e){

            reactIconQuestionResponse.setSuccess(false);
            reactIconQuestionResponse.setMessage(e.toString());

            return new ResponseEntity<>(reactIconQuestionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


//    @GetMapping("/comment/{id}")
//    public ResponseEntity<?> getReactByCommentId(@PathVariable Long id, @Param("index") Integer index, ReactIconResponse reactIconResponse) {
//
//        try {
//            Integer indexToQuery = index*limit;
//            List<ReactIconQuestion> reactIconList = reactIconServiceInterface.getReactIconByCommentId(id, index);
//            List<ReactIconDto> reactIconDtoList = new ArrayList<>();
//
//            for(ReactIconQuestion reactIcon : reactIconList){
//                reactIconDtoList.add(ReactIconMapper.toReactIconDto(reactIcon));
//            }
//
//            reactIconResponse.setSuccess(true);
//            reactIconResponse.setMessage("success to get");
//            reactIconResponse.setResult_quantity(reactIconDtoList.size());
//            reactIconResponse.setReactIconDtoList(reactIconDtoList);
//
//
//            return ResponseEntity.ok(reactIconResponse);
//
//
//        } catch (Exception e){
//
//            reactIconResponse.setSuccess(false);
//            reactIconResponse.setMessage(e.toString());
//
//            return new ResponseEntity<>(reactIconResponse, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//
//    }

}
