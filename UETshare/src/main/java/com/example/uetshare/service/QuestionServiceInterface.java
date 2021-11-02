package com.example.uetshare.service;

import com.example.uetshare.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface QuestionServiceInterface {

    public void createQuestion(Question question);
    public List<Question> getAllQuestion();
    public Question getQuestionById(Long Id);
    public List<Question> getQuestionByCategory(Integer category_id);

}
