package com.example.uetshare.service;

import com.example.uetshare.entity.ReactIconComment;
import com.example.uetshare.entity.ReactIconQuestion;
import com.example.uetshare.response.ReactIconCommentResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReactIconCommentServiceInterface {

    public ResponseEntity<?> createReactIcon(ReactIconComment reactIcon, ReactIconCommentResponse reactIconCommentResponse);
    public List<ReactIconComment> getReactIconByCommentId(Long comment_id, Integer index);
    public ReactIconComment deleteReactIconComment(Long account_id, Long comment_id);
    public Boolean liked(Long account_id, Long comment_id);
}
