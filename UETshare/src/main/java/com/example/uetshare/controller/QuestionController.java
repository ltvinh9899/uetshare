package com.example.uetshare.controller;

import com.example.uetshare.entity.Question;
import com.example.uetshare.response.QuestionResponse;
import com.example.uetshare.service.QuestionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionServiceInterface questionServiceInterface;

//    @Autowired
//    private QuestionResponse  questionResponse;

    @PostMapping("/create")
    public ResponseEntity<?> createQuestion(@RequestBody Question question, QuestionResponse  questionResponse){

        List<Question> questionListResponse = new ArrayList<>();

        try {

            questionServiceInterface.createQuestion(question);
            questionListResponse.add(question);

            questionResponse.setSuccess(true);
            questionResponse.setMessage("Create question success");
            questionResponse.setQuestion(questionListResponse);

            return ResponseEntity.ok(questionResponse);

        } catch (Exception e){

            questionResponse.setSuccess(false);
            questionResponse.setMessage(e.toString());
            questionResponse.setQuestion(questionListResponse);

            return new ResponseEntity<>(questionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("")
    public ResponseEntity<?> getAllQuestion(QuestionResponse  questionResponse){

        List<Question> questionList = new ArrayList<>();

        try {

            questionList = questionServiceInterface.getAllQuestion();
            questionResponse.setSuccess(true);
            questionResponse.setMessage("success to get all question");
            questionResponse.setQuestion(questionList);

            return ResponseEntity.ok(questionResponse);


        } catch (Exception e){

            questionResponse.setSuccess(false);
            questionResponse.setMessage(e.toString());
            questionResponse.setQuestion(questionList);

            return new ResponseEntity<>(questionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
