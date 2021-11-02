package com.example.uetshare.service;

import com.example.uetshare.entity.Question;
import com.example.uetshare.repository.QuestionRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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
        try {
            return questionRepositoryInterface.findAll();

        } catch (Exception e){
            System.out.println("hello");
            System.out.println(e);
            return null;
        }

    }

    @Override
    public Question getQuestionById(Long question_id) {
        try{
            return questionRepositoryInterface.getQuestionById(question_id);
        } catch (Exception e){
            System.out.println(e);
            return null;
        }

    }

    @Override
    public List<Question> getQuestionByCategory(Integer category_id) {
        return questionRepositoryInterface.getByCategory(category_id);
    }
}
