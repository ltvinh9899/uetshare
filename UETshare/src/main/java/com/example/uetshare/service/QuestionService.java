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
    public List<Question> getAllQuestion(Integer index) {
        try {
            return questionRepositoryInterface.getAllQuestion(index);

        } catch (Exception e){
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
    public List<Question> getQuestionByCategory(Long category_id, Integer index) {
        return questionRepositoryInterface.getByCategory(category_id, index);
    }

    @Override
    public List<Question> getQuestionByContentType(Long type_content_id, Integer index) {
        return questionRepositoryInterface.getQuestionByTypeContentId(type_content_id, index);
    }

    @Override
    public List<Question> getQuestionByText(Integer index, String text, Long type_content_id) {
       return questionRepositoryInterface.getQuestionByText(index, text, type_content_id);
    }

    @Override
    public List<Question> getQuestionByAccountId(Long account_id, Integer index) {
        return questionRepositoryInterface.getQuestionByAccountId(account_id, index);
    }

    @Override
    public Question getQuestionByCommentId(Long comment_id) {
        return questionRepositoryInterface.getQuestionByCommentId(comment_id);
    }
}
