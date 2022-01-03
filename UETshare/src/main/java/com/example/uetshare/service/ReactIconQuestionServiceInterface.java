package com.example.uetshare.service;

import com.example.uetshare.entity.ReactIconQuestion;
import com.example.uetshare.response.ReactIconQuestionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReactIconQuestionServiceInterface {

    public ResponseEntity<?> createReactIcon(ReactIconQuestion reactIcon, ReactIconQuestionResponse reactIconQuestionResponse);
    public List<ReactIconQuestion> getReactIconByQuestionId(Long question_id, Integer index);
//    public List<ReactIconQuestion> getReactIconByCommentId(Long comment_id, Integer index);
    public ReactIconQuestion deleteReactIconQuestion(Long account_id, Long question_id);
    public Boolean liked(Long account_id, Long question_id);
}
