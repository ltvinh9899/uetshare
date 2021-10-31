package com.example.uetshare.service;

import com.example.uetshare.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionServiceInterface {

    public void createQuestion(Question question);
    public List<Question> getAllQuestion();

}
