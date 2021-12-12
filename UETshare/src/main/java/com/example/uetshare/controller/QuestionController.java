package com.example.uetshare.controller;

import com.example.uetshare.entity.Comment;
import com.example.uetshare.entity.Image;
import com.example.uetshare.entity.Question;
import com.example.uetshare.response.QuestionResponse;
import com.example.uetshare.response.dto.ImageDto;
import com.example.uetshare.response.dto.QuestionDto;
import com.example.uetshare.response.mapper.ImageMapper;
import com.example.uetshare.response.mapper.QuestionMapper;
import com.example.uetshare.service.ImageServiceInterface;
import com.example.uetshare.service.QuestionServiceInterface;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionServiceInterface questionServiceInterface;

    @Autowired
    private ImageServiceInterface imageServiceInterface;

    @Value("${file.upload-dir}")
    String FILE_DIRECTORY;

    private final Integer limit = 10;
//    @Autowired
//    private QuestionResponse  questionResponse;

    @PostMapping("/create")
    public ResponseEntity<?> createQuestion(@RequestParam("Question") String questionJson, @RequestParam("image_files") List<MultipartFile> image_files, QuestionResponse  questionResponse){

        try {

            Question question = new ObjectMapper().readValue(questionJson, Question.class);
            question.setTime(Calendar.getInstance());
            Question questionInDb = questionServiceInterface.createQuestion(question);

            String pathDirectoryString = FILE_DIRECTORY + "account_" + questionInDb.getAccount().getId() + "/question_" + questionInDb.getId() + "/";
            List<Image> imageList = new ArrayList<>();
            for (MultipartFile image_file : image_files) {
                if(!image_file.isEmpty()){
                    System.out.println(image_file.isEmpty());
                    String pathFileString = CommentController.writeFile(pathDirectoryString, image_file);

                    Image image = new Image();
                    image.setImage(pathFileString);
                    imageList.add(image);
                }
            }

            questionInDb.setImage(imageList);

            for (Image image : question.getImage()) {
                image.setQuestion(questionInDb);
                imageServiceInterface.createImage(image);
            }


            questionResponse.setSuccess(true);
            questionResponse.setMessage("Create question success");

            List<QuestionDto> questionDtoList = new ArrayList<>();
            questionDtoList.add(mapperDto(questionInDb));
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

            if(questionList.size() > 0){
                for(Question question : questionList){

                    questionDtoList.add(mapperDto(question));
                }
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

            List<QuestionDto> questionDtoList = new ArrayList<>();
            if(question != null){
                questionDtoList.add(mapperDto(question));
            }

            questionResponse.setQuestionDtoList(questionDtoList);

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

            if (questionList.size() > 0) {
                for (Question question : questionList) {
                    questionDtoList.add(mapperDto(question));
                }
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

            if (questionList.size() >= 0) {
                for (Question question : questionList) {
                    questionDtoList.add(mapperDto(question));
                }
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

            if (questionList.size() > 0) {
                for (Question question : questionList) {
                    questionDtoList.add(mapperDto(question));
                }
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

    @GetMapping("/account/{id}")
    public ResponseEntity<?> getQuestionByAccountId(@PathVariable("id") Long id, QuestionResponse questionResponse, @Param("index") Integer index){

        try {

            Integer indexToQuery = index*limit;
            List<Question> questionList = questionServiceInterface.getQuestionByAccountId(id, indexToQuery);
            List<QuestionDto> questionDtoList = new ArrayList<>();

            if (questionList.size() > 0) {
                for (Question question : questionList) {
                    questionDtoList.add(mapperDto(question));
                }
            }
            questionResponse.setSuccess(true);
            questionResponse.setMessage("success to get question");
            questionResponse.setResult_quantity(questionDtoList.size());
            questionResponse.setQuestionDtoList(questionDtoList);


            return ResponseEntity.ok(questionResponse);

        } catch (Exception e) {

            questionResponse.setSuccess(false);
            questionResponse.setMessage(e.toString());

            return new ResponseEntity<>(questionResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

    @GetMapping("/comment/{id}")
    public ResponseEntity<?> getQuestionByCommentId(@PathVariable("id") Long id, QuestionResponse questionResponse){

        try {

            Question question = questionServiceInterface.getQuestionByCommentId(id);

            questionResponse.setSuccess(true);
            questionResponse.setMessage("success to get question");

            List<QuestionDto> questionDtoList = new ArrayList<>();
            if (question != null){
                questionDtoList.add(mapperDto(question));
            }

            questionResponse.setResult_quantity(questionDtoList.size());
            questionResponse.setQuestionDtoList(questionDtoList);


            return ResponseEntity.ok(questionResponse);

        } catch (Exception e) {

            questionResponse.setSuccess(false);
            questionResponse.setMessage(e.toString());

            return new ResponseEntity<>(questionResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }


    private QuestionDto mapperDto(Question question) {

        List<Image> imageList = imageServiceInterface.getImageByQuestionId(question.getId());
        QuestionDto questionDto = QuestionMapper.toQuestionDto(question);

        List<ImageDto> imageDtoList = new ArrayList<>();
        for(Image image : imageList){
            imageDtoList.add(ImageMapper.toImageDto(image));
        }
        questionDto.setImageDtoList(imageDtoList);



        return questionDto;
    }

}
