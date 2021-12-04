package com.example.uetshare.controller;

import com.example.uetshare.entity.NotificationQuestion;
import com.example.uetshare.entity.ReactIconQuestion;
import com.example.uetshare.response.NotificationQuestionResponse;
import com.example.uetshare.response.dto.NotificationQuestionDto;
import com.example.uetshare.response.dto.ReactIconQuestionDto;
import com.example.uetshare.response.mapper.NotificationQuestionMapper;
import com.example.uetshare.response.mapper.ReactIconQuestionMapper;
import com.example.uetshare.service.NotificationQuestionService;
import com.example.uetshare.service.NotificationQuestionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/notification-question")
public class NotificationQuestionController {

    @Autowired
    private NotificationQuestionServiceInterface notificationQuestionServiceInterface;

    private final Integer limit = 10;

    @PostMapping("/create")
    public ResponseEntity<?> createNotificationQuestion(@RequestBody NotificationQuestion notificationQuestion, NotificationQuestionResponse notificationQuestionResponse){
        try {
            notificationQuestion.setSeen(false);
            notificationQuestion.setTime(Calendar.getInstance());
            notificationQuestionServiceInterface.createNotificationQuestion(notificationQuestion);

            notificationQuestionResponse.setSuccess(true);
            notificationQuestionResponse.setMessage("create success");

            List<NotificationQuestionDto> notificationQuestionDtoList = new ArrayList<>();
            notificationQuestionDtoList.add(NotificationQuestionMapper.toNotificationQuestionDto(notificationQuestion));
            notificationQuestionResponse.setNotificationQuestionDtoList(notificationQuestionDtoList);

            return ResponseEntity.ok(notificationQuestionResponse);

        } catch (Exception e){

            notificationQuestionResponse.setSuccess(false);
            notificationQuestionResponse.setMessage(e.toString());


            return new ResponseEntity<>(notificationQuestionResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @GetMapping("/author-account/{id}")
    public ResponseEntity<?> getNotificationQuestionByAccountAuthorId(@PathVariable Long id, @Param("index") Integer index, NotificationQuestionResponse notificationQuestionResponse){
        try {
            Integer indexToQuery = index*limit;
            List<NotificationQuestion> notificationQuestionList = notificationQuestionServiceInterface.getNotificationQuestionByAuthorAccountId(id, indexToQuery);
            List<NotificationQuestionDto> notificationQuestionDtoList = new ArrayList<>();

            for(NotificationQuestion notificationQuestion : notificationQuestionList){
                notificationQuestionDtoList.add(NotificationQuestionMapper.toNotificationQuestionDto(notificationQuestion));
            }

            notificationQuestionResponse.setSuccess(true);
            notificationQuestionResponse.setMessage("success to get");
            notificationQuestionResponse.setResult_quantity(notificationQuestionDtoList.size());
            notificationQuestionResponse.setNotificationQuestionDtoList(notificationQuestionDtoList);


            return ResponseEntity.ok(notificationQuestionResponse);


        } catch (Exception e){

            notificationQuestionResponse.setSuccess(false);
            notificationQuestionResponse.setMessage(e.toString());

            return new ResponseEntity<>(notificationQuestionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/seen")
    public ResponseEntity<?> updateSeen(@RequestBody NotificationQuestion notificationQuestion, NotificationQuestionResponse notificationQuestionResponse){

        try {

            NotificationQuestion notificationQuestionUpdated = notificationQuestionServiceInterface.updateSeen(notificationQuestion.getId());

            notificationQuestionResponse.setSuccess(true);
            notificationQuestionResponse.setMessage("update seen success");

            List<NotificationQuestionDto> notificationQuestionDtoList = new ArrayList<>();
            notificationQuestionDtoList.add(NotificationQuestionMapper.toNotificationQuestionDto(notificationQuestionUpdated));
            notificationQuestionResponse.setNotificationQuestionDtoList(notificationQuestionDtoList);

            return ResponseEntity.ok(notificationQuestionResponse);

        } catch (Exception e){

            notificationQuestionResponse.setSuccess(false);
            notificationQuestionResponse.setMessage(e.toString());


            return new ResponseEntity<>(notificationQuestionResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }


}
