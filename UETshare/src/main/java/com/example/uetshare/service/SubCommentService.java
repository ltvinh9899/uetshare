package com.example.uetshare.service;

import com.example.uetshare.entity.SubComment;
import com.example.uetshare.repository.SubCommentRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SubCommentService implements SubCommentServiceInterface{

    @Autowired
    private SubCommentRepositoryInterface subCommentRepositoryInterface;

    @Override
    public void createSubComment(SubComment subComment) {
        subCommentRepositoryInterface.save(subComment);
    }

    @Override
    public List<SubComment> getSubCommentByCommentId(Long comment_id, Integer index) {
        return subCommentRepositoryInterface.getSubCommentByCommentId(comment_id, index);
    }
}
