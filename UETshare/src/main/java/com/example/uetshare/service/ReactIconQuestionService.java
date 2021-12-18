package com.example.uetshare.service;

import com.example.uetshare.entity.ReactIconComment;
import com.example.uetshare.entity.ReactIconQuestion;
import com.example.uetshare.repository.ReactIconQuestionRepositoryInterface;
import com.example.uetshare.response.ReactIconQuestionResponse;
import com.example.uetshare.response.dto.ReactIconQuestionDto;
import com.example.uetshare.response.mapper.ReactIconQuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Component
public class ReactIconQuestionService implements ReactIconQuestionServiceInterface {

    @Autowired
    private ReactIconQuestionRepositoryInterface reactIconQuestionRepositoryInterface;

    @Override
    public ResponseEntity<?> createReactIcon(ReactIconQuestion reactIcon, ReactIconQuestionResponse reactIconQuestionResponse) {
        try {
            if (reactIcon.getAccount().getId() == null || reactIcon.getQuestion().getId() == null) {
                if (reactIconQuestionRepositoryInterface.getReactIconQuestionByByAccountAndQuestion(reactIcon.getAccount().getId(), reactIcon.getQuestion().getId()) != null) {
                    reactIcon.setTime(Calendar.getInstance());
                    reactIconQuestionRepositoryInterface.save(reactIcon);

                    reactIconQuestionResponse.setSuccess(true);
                    reactIconQuestionResponse.setMessage("create success");

                    List<ReactIconQuestionDto> reactIconQuestionDtoList = new ArrayList<>();
                    reactIconQuestionDtoList.add(ReactIconQuestionMapper.toReactIconDto(reactIcon));
                    reactIconQuestionResponse.setReactIconQuestionDtoList(reactIconQuestionDtoList);

                } else {
                    reactIconQuestionResponse.setSuccess(false);
                    reactIconQuestionResponse.setMessage("account id and question id existed in db");
                }

            } else {
                reactIconQuestionResponse.setSuccess(false);
                reactIconQuestionResponse.setMessage("account id or question id is null");
            }

            return ResponseEntity.ok(reactIconQuestionResponse);

        } catch (Exception e) {

            reactIconQuestionResponse.setSuccess(false);
            reactIconQuestionResponse.setMessage(e.toString());


            return new ResponseEntity<>(reactIconQuestionResponse, HttpStatus.INTERNAL_SERVER_ERROR);


        }
    }

    @Override
    public List<ReactIconQuestion> getReactIconByQuestionId(Long question_id, Integer index) {
        return reactIconQuestionRepositoryInterface.getReactIconByQuestionId(question_id, index);
    }

    @Override
    public ReactIconQuestion deleteReactIconQuestion(Long account_id, Long question_id) {
        ReactIconQuestion reactIconQuestion = reactIconQuestionRepositoryInterface.getReactIconQuestionByByAccountAndQuestion(account_id, question_id);
        reactIconQuestionRepositoryInterface.deleteReactIconQuestion(account_id, question_id);

        return reactIconQuestion;
    }

    @Override
    public Boolean liked(Long account_id, Long question_id) {
        if(reactIconQuestionRepositoryInterface.getReactIconQuestionByByAccountAndQuestion(account_id, question_id) != null){
            return true;
        } else {
            return false;
        }
    }

//    @Override
//    public List<ReactIconQuestion> getReactIconByCommentId(Long comment_id, Integer index) {
//        return reactIconRepositoryInterface.getReactIconByCommentId(comment_id, index);
//    }
}
