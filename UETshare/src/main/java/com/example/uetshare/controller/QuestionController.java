package com.example.uetshare.controller;

import com.example.uetshare.entity.Question;
import com.example.uetshare.response.QuestionResponse;
import com.example.uetshare.response.dto.QuestionDto;
import com.example.uetshare.response.mapper.QuestionMapper;
import com.example.uetshare.service.QuestionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionServiceInterface questionServiceInterface;

    private final Integer limit = 10;
//    @Autowired
//    private QuestionResponse  questionResponse;

    @PostMapping("/create")
    public ResponseEntity<?> createQuestion(@RequestBody Question question, QuestionResponse  questionResponse){

        try {

            questionServiceInterface.createQuestion(question);

            questionResponse.setSuccess(true);
            questionResponse.setMessage("Create question success");

            List<QuestionDto> questionDtoList = new ArrayList<>();
            questionDtoList.add(QuestionMapper.toQuestionDto(question));
            questionResponse.setQuestionDtoList(questionDtoList);

            return ResponseEntity.ok(questionResponse);

        } catch (Exception e){

            questionResponse.setSuccess(false);
            questionResponse.setMessage(e.toString());


            return new ResponseEntity<>(questionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("")
    public ResponseEntity<?> getAllQuestion(QuestionResponse  questionResponse, @Param("index") Integer index){

        try {
            Integer indexToQuery = index*limit;
            List<Question> questionList = questionServiceInterface.getAllQuestion(indexToQuery); // index trong sql bắt đầu từ 0 nên phải trừ 1
            List<QuestionDto> questionDtoList = new ArrayList<>();

            for(Question question : questionList){
                questionDtoList.add(QuestionMapper.toQuestionDto(question));
            }

            questionResponse.setSuccess(true);
            questionResponse.setMessage("success to get all question");
            questionResponse.setResult_quantity(questionDtoList.size());
            questionResponse.setQuestionDtoList(questionDtoList);


            return ResponseEntity.ok(questionResponse);


        } catch (Exception e){

            questionResponse.setSuccess(false);
            questionResponse.setMessage(e.toString());

            return new ResponseEntity<>(questionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> getQuestionById(@PathVariable Long id, QuestionResponse  questionResponse){
        try {
            Question question = questionServiceInterface.getQuestionById(id);

            questionResponse.setSuccess(true);
            questionResponse.setMessage("success to get question");

            if(question != null){
                List<QuestionDto> questionDtoList = new ArrayList<>();
                questionDtoList.add(QuestionMapper.toQuestionDto(question));
                questionResponse.setQuestionDtoList(questionDtoList);
            }


            return ResponseEntity.ok(questionResponse);

        } catch (Exception e){
            System.out.println(e);
            questionResponse.setSuccess(false);
            questionResponse.setMessage(e.toString());

            return new ResponseEntity<>(questionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/category/{category_id}")
    public ResponseEntity<?> getQuestionByCategory(@PathVariable Long category_id, QuestionResponse  questionResponse, @Param("index") Integer index) {

        try {
            Integer indexToQuery = index*limit;
            List<Question> questionList = questionServiceInterface.getQuestionByCategory(category_id, indexToQuery);
            List<QuestionDto> questionDtoList = new ArrayList<>();

            for(Question question : questionList){
                questionDtoList.add(QuestionMapper.toQuestionDto(question));
            }

            questionResponse.setSuccess(true);
            questionResponse.setMessage("success get all question");
            questionResponse.setResult_quantity(questionDtoList.size());
            questionResponse.setQuestionDtoList(questionDtoList);

            return ResponseEntity.ok(questionResponse);

        } catch (Exception e){
            questionResponse.setSuccess(false);
            questionResponse.setMessage(e.toString());

            return new ResponseEntity<>(questionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/type-content/{id}")
    public ResponseEntity<?> getQuestionByTypeContent(@PathVariable Long id, QuestionResponse questionResponse, @Param("index") Integer index){

        try {

            Integer indexToQuery = index*limit;
            List<Question> questionList = questionServiceInterface.getQuestionByContentType(id, indexToQuery);
            List<QuestionDto> questionDtoList = new ArrayList<>();

            for(Question question : questionList){
                questionDtoList.add(QuestionMapper.toQuestionDto(question));
            }

            questionResponse.setSuccess(true);
            questionResponse.setMessage("success get all question");
            questionResponse.setResult_quantity(questionDtoList.size());

            questionResponse.setQuestionDtoList(questionDtoList);

            return ResponseEntity.ok(questionResponse);

        } catch (Exception e){

            questionResponse.setSuccess(false);
            questionResponse.setMessage(e.toString());

            return new ResponseEntity<>(questionResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

    @GetMapping("/search")
    public ResponseEntity<?> getQuestionByText(QuestionResponse questionResponse, @Param("index") Integer index, @Param("text") String text, @Param("type_content_id") Long type_content_id){
        try {
            Integer indexToQuery = index*limit;

            String textToQuery = "%" + String.join("%", text.split(" ")) + "%";

            System.out.println(textToQuery);

            List<Question> questionList = questionServiceInterface.getQuestionByText(indexToQuery, textToQuery, type_content_id);
            List<QuestionDto> questionDtoList = new ArrayList<>();

            for(Question question : questionList){
                questionDtoList.add(QuestionMapper.toQuestionDto(question));
            }

            questionResponse.setSuccess(true);
            questionResponse.setMessage("success to get question");
            questionResponse.setResult_quantity(questionDtoList.size());
            questionResponse.setQuestionDtoList(questionDtoList);


            return ResponseEntity.ok(questionResponse);


        } catch (Exception e){

            questionResponse.setSuccess(false);
            questionResponse.setMessage(e.toString());

            return new ResponseEntity<>(questionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
