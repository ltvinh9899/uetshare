package com.example.uetshare.service;

import com.example.uetshare.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface QuestionServiceInterface {

    public void createQuestion(Question question);
    public List<Question> getAllQuestion(Integer index);
    public Question getQuestionById(Long Id);
    public List<Question> getQuestionByCategory(Long category_id, Integer index);
    public List<Question> getQuestionByContentType(Long type_content_id, Integer index);
    public List<Question> getQuestionByText(Integer index, String text, Long type_content_id);
}
