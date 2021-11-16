package com.example.uetshare.service;

import com.example.uetshare.entity.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentServiceInterface {

    public void createComment(Comment comment);
    public List<Comment> getCommentByQuestionId(Integer index, Long question_id);

}
