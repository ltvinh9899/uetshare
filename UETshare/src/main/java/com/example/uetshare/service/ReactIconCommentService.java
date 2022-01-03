package com.example.uetshare.service;

import com.example.uetshare.entity.ReactIconComment;
import com.example.uetshare.entity.ReactIconQuestion;
import com.example.uetshare.entity.Subject;
import com.example.uetshare.repository.ReactIconCommentRepositoryInterface;
import com.example.uetshare.repository.ReactIconQuestionRepositoryInterface;
import com.example.uetshare.response.ReactIconCommentResponse;
import com.example.uetshare.response.dto.ReactIconCommentDto;
import com.example.uetshare.response.mapper.ReactIconCommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Component
public class ReactIconCommentService implements ReactIconCommentServiceInterface{

    @Autowired
    private ReactIconCommentRepositoryInterface reactIconCommentRepositoryInterface;

    @Override
    public ResponseEntity<?> createReactIcon(ReactIconComment reactIcon, ReactIconCommentResponse reactIconCommentResponse) {
        try {
            if (reactIcon.getAccount().getId() != null && reactIcon.getComment().getId() != null) {
                if(reactIconCommentRepositoryInterface.getReactIconCommentByAccountAndComment(reactIcon.getAccount().getId(), reactIcon.getComment().getId()) == null) {
                    reactIcon.setTime(Calendar.getInstance());
                    reactIconCommentRepositoryInterface.save(reactIcon);

                    reactIconCommentResponse.setSuccess(true);
                    reactIconCommentResponse.setMessage("create success");

                    List<ReactIconCommentDto> reactIconCommentDtoList = new ArrayList<>();
                    reactIconCommentDtoList.add(ReactIconCommentMapper.toReactIconCommentDto(reactIcon));
                    reactIconCommentResponse.setReactIconCommentDtoList(reactIconCommentDtoList);
                } else {
                    reactIconCommentResponse.setSuccess(false);
                    reactIconCommentResponse.setMessage("account id and question id existed in db");
                }

            } else {
                reactIconCommentResponse.setSuccess(false);
                reactIconCommentResponse.setMessage("account id or question id is null");
            }

            return ResponseEntity.ok(reactIconCommentResponse);

        } catch (Exception e){

            reactIconCommentResponse.setSuccess(false);
            reactIconCommentResponse.setMessage(e.toString());


            return new ResponseEntity<>(reactIconCommentResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

    @Override
    public List<ReactIconComment> getReactIconByCommentId(Long comment_id, Integer index) {
        return reactIconCommentRepositoryInterface.getReactIconByCommentId(comment_id, index);
    }

    @Override
    public ReactIconComment deleteReactIconComment(Long account_id, Long comment_id) {
        ReactIconComment reactIconComment = reactIconCommentRepositoryInterface.getReactIconCommentByAccountAndComment(account_id, comment_id);
        reactIconCommentRepositoryInterface.deleteReactIconComment(account_id, comment_id);

        return reactIconComment;
    }

    @Override
    public Boolean liked(Long account_id, Long comment_id) {
        if(reactIconCommentRepositoryInterface.getReactIconCommentByAccountAndComment(account_id, comment_id) != null){
            return true;
        } else {
            return false;
        }
    }
}
