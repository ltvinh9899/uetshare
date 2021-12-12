package com.example.uetshare.service;

import com.example.uetshare.entity.ReactIconComment;
import com.example.uetshare.entity.ReactIconQuestion;
import com.example.uetshare.repository.ReactIconQuestionRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReactIconQuestionService implements ReactIconQuestionServiceInterface {

    @Autowired
    private ReactIconQuestionRepositoryInterface reactIconQuestionRepositoryInterface;

    @Override
    public void createReactIcon(ReactIconQuestion reactIcon) {
        reactIconQuestionRepositoryInterface.save(reactIcon);
    }

    @Override
    public List<ReactIconQuestion> getReactIconByQuestionId(Long question_id, Integer index) {
        return reactIconQuestionRepositoryInterface.getReactIconByQuestionId(question_id, index);
    }

    @Override
    public ReactIconQuestion deleteReactIconQuestion(Long account_id, Long question_id) {
        ReactIconQuestion reactIconQuestion = reactIconQuestionRepositoryInterface.getReactIconQuestionByByAccountAndComment(account_id, question_id);
        reactIconQuestionRepositoryInterface.deleteReactIconQuestion(account_id, question_id);

        return reactIconQuestion;
    }

//    @Override
//    public List<ReactIconQuestion> getReactIconByCommentId(Long comment_id, Integer index) {
//        return reactIconRepositoryInterface.getReactIconByCommentId(comment_id, index);
//    }
}
