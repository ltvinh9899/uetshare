package com.example.uetshare.service;

import com.example.uetshare.entity.ReactIconQuestion;
import com.example.uetshare.repository.ReactIconRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReactIconService implements ReactIconServiceInterface{

    @Autowired
    private ReactIconRepositoryInterface reactIconRepositoryInterface;

    @Override
    public void createReactIcon(ReactIconQuestion reactIcon) {
        reactIconRepositoryInterface.save(reactIcon);
    }

    @Override
    public List<ReactIconQuestion> getReactIconByQuestionId(Long question_id, Integer index) {
        return reactIconRepositoryInterface.getReactIconByQuestionId(question_id, index);
    }

//    @Override
//    public List<ReactIconQuestion> getReactIconByCommentId(Long comment_id, Integer index) {
//        return reactIconRepositoryInterface.getReactIconByCommentId(comment_id, index);
//    }
}
