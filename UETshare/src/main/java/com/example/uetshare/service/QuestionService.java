package com.example.uetshare.service;

import com.example.uetshare.entity.Question;
import com.example.uetshare.repository.QuestionRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionService implements QuestionServiceInterface {

    @Autowired
    private QuestionRepositoryInterface questionRepositoryInterface;

    @Override
    public void createQuestion(Question question) {
        questionRepositoryInterface.save(question);
    }

    @Override
    public List<Question> getAllQuestion() {
        return questionRepositoryInterface.findAll();
    }
}
