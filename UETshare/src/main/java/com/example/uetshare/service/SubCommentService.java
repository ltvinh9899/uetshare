package com.example.uetshare.service;

import com.example.uetshare.entity.Comment;
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
    public SubComment createSubComment(SubComment subComment) {
        return subCommentRepositoryInterface.save(subComment);
    }

    @Override
    public List<SubComment> getSubCommentByCommentId(Long comment_id, Integer index) {
        return subCommentRepositoryInterface.getSubCommentByCommentId(comment_id, index);
    }

    @Override
    public SubComment updateSubComment(Long id, SubComment subComment) {
        SubComment subCommentData = subCommentRepositoryInterface.getSubCommentById(id);

        if(subComment.getImage() != null) {
            subCommentData.setImage(subComment.getImage());
        }

        return subCommentData;
    }
}
