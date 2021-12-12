package com.example.uetshare.controller;

import com.example.uetshare.entity.NotificationComment;
import com.example.uetshare.entity.NotificationQuestion;
import com.example.uetshare.response.NotificationCommentResponse;
import com.example.uetshare.response.NotificationQuestionResponse;
import com.example.uetshare.response.dto.NotificationCommentDto;
import com.example.uetshare.response.dto.NotificationQuestionDto;
import com.example.uetshare.response.mapper.NotificationCommentMapper;
import com.example.uetshare.response.mapper.NotificationQuestionMapper;
import com.example.uetshare.service.NotificationCommentServiceInterface;
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
@RequestMapping("/notification-comment")
public class NotificationCommentController {

    @Autowired
    private NotificationCommentServiceInterface notificationCommentServiceInterface;

    private final Integer limit = 10;

    @PostMapping("/create")
    public ResponseEntity<?> createNotificationComment(@RequestBody NotificationComment notificationComment, NotificationCommentResponse notificationCommentResponse){
        try {
            notificationComment.setSeen(false);
            notificationComment.setTime(Calendar.getInstance());
            notificationCommentServiceInterface.createNotificationComment(notificationComment);

            notificationCommentResponse.setSuccess(true);
            notificationCommentResponse.setMessage("create success");

            List<NotificationCommentDto> notificationCommentDtoList = new ArrayList<>();
            notificationCommentDtoList.add(NotificationCommentMapper.toNotificationCommentDto(notificationComment));
            notificationCommentResponse.setNotificationCommentDtoList(notificationCommentDtoList);

            return ResponseEntity.ok(notificationCommentResponse);

        } catch (Exception e){

            notificationCommentResponse.setSuccess(false);
            notificationCommentResponse.setMessage(e.toString());


            return new ResponseEntity<>(notificationCommentResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @GetMapping("/author-account/{id}")
    public ResponseEntity<?> getNotificationQuestionByAccountAuthorId(@PathVariable Long id, @Param("index") Integer index, NotificationCommentResponse notificationCommentResponse){
        try {
            Integer indexToQuery = index*limit;
            List<NotificationComment> notificationCommentList = notificationCommentServiceInterface.getNotificationCommentByAuthorAccountId(id, indexToQuery);
            List<NotificationCommentDto> notificationCommentDtoList = new ArrayList<>();

            for(NotificationComment notificationComment : notificationCommentList){
                notificationCommentDtoList.add(NotificationCommentMapper.toNotificationCommentDto(notificationComment));
            }

            notificationCommentResponse.setSuccess(true);
            notificationCommentResponse.setMessage("success to get");
            notificationCommentResponse.setResult_quantity(notificationCommentDtoList.size());
            notificationCommentResponse.setNotificationCommentDtoList(notificationCommentDtoList);


            return ResponseEntity.ok(notificationCommentResponse);


        } catch (Exception e){

            notificationCommentResponse.setSuccess(false);
            notificationCommentResponse.setMessage(e.toString());

            return new ResponseEntity<>(notificationCommentResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/author-account/{id}/unseen")
    public ResponseEntity<?> getUnSeenNotificationQuestion(@PathVariable Long id, @Param("index") Integer index, NotificationCommentResponse notificationCommentResponse){
        try {
            Integer indexToQuery = index*limit;
            List<NotificationComment> notificationCommentList = notificationCommentServiceInterface.getUnseenNotificationComment(id, indexToQuery);
            List<NotificationCommentDto> notificationCommentDtoList = new ArrayList<>();

            for(NotificationComment notificationComment : notificationCommentList){
                notificationCommentDtoList.add(NotificationCommentMapper.toNotificationCommentDto(notificationComment));
            }

            notificationCommentResponse.setSuccess(true);
            notificationCommentResponse.setMessage("success to get");
            notificationCommentResponse.setResult_quantity(notificationCommentDtoList.size());
            notificationCommentResponse.setNotificationCommentDtoList(notificationCommentDtoList);


            return ResponseEntity.ok(notificationCommentResponse);


        } catch (Exception e){

            notificationCommentResponse.setSuccess(false);
            notificationCommentResponse.setMessage(e.toString());

            return new ResponseEntity<>(notificationCommentResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/seen")
    public ResponseEntity<?> updateSeen(@RequestBody NotificationComment notificationComment, NotificationCommentResponse notificationCommentResponse){

        try {

            NotificationComment notificationCommentUpdated = notificationCommentServiceInterface.updateSeen(notificationComment.getId());

            notificationCommentResponse.setSuccess(true);
            notificationCommentResponse.setMessage("update seen success");

            List<NotificationCommentDto> notificationCommentDtoList = new ArrayList<>();
            notificationCommentDtoList.add(NotificationCommentMapper.toNotificationCommentDto(notificationCommentUpdated));
            notificationCommentResponse.setNotificationCommentDtoList(notificationCommentDtoList);

            return ResponseEntity.ok(notificationCommentResponse);

        } catch (Exception e){

            notificationCommentResponse.setSuccess(false);
            notificationCommentResponse.setMessage(e.toString());


            return new ResponseEntity<>(notificationCommentResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

}
