package com.example.uetshare.service;

import com.example.uetshare.entity.ReactIconComment;
import com.example.uetshare.entity.ReactIconQuestion;
import com.example.uetshare.entity.Subject;
import com.example.uetshare.repository.ReactIconCommentRepositoryInterface;
import com.example.uetshare.repository.ReactIconQuestionRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReactIconCommentService implements ReactIconCommentServiceInterface{

    @Autowired
    private ReactIconCommentRepositoryInterface reactIconCommentRepositoryInterface;

    @Override
    public void createReactIcon(ReactIconComment reactIcon) {
        reactIconCommentRepositoryInterface.save(reactIcon);
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
}
