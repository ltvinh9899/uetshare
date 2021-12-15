package com.example.uetshare.service;

import com.example.uetshare.entity.Comment;
import com.example.uetshare.repository.CommentRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommentService implements CommentServiceInterface{

    @Autowired
    private CommentRepositoryInterface commentRepositoryInterface;

    @Override
    public Comment createComment(Comment comment) {
        return commentRepositoryInterface.save(comment);
    }

    @Override
    public List<Comment> getCommentByQuestionId(Integer index, Long question_id) {
        return commentRepositoryInterface.getCommentByQuestionId(index, question_id);
    }

    @Override
    public Comment updateComment(Long id, Comment comment) {
        Comment commentData = commentRepositoryInterface.getCommentById(id);

        if(comment.getImage() != null) {
            commentData.setImage(comment.getImage());
        }

        commentRepositoryInterface.save(commentData);

        return commentData;

    }
}
