package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.Category;
import com.example.uetshare.entity.Question;
import com.example.uetshare.response.dto.QuestionDto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class QuestionMapper {

    public static QuestionDto toQuestionDto(Question question){
        QuestionDto questionDto = new QuestionDto();

        if (question.getId() != null){
            questionDto.setId(question.getId());
        }

        if(question.getAccount() != null){
            if(question.getAccount().getId() != null){
                questionDto.setAccount_id(question.getAccount().getId());
            }
        }

        if (question.getContent() != null){
            questionDto.setContent(question.getContent());
        }

        if (question.getTitle() != null){
            questionDto.setTitle(question.getTitle());
        }

        if (question.getTime() != null){
            question.getTime().roll(Calendar.HOUR_OF_DAY, 7);
            questionDto.setTime(question.getTime());
        }

        if (question.getType_content() != null) {
            if(question.getType_content().getId() != null){
                questionDto.setType_content_id(question.getType_content().getId());
            }
        }

        if (question.getCategory() != null){
            if(question.getCategory().getId() != null){
                questionDto.setCategory_id(question.getCategory().getId());
            }
        }

        if (question.getAccount() != null){
            questionDto.setAccountDto(AccountMapper.toAccountDto(question.getAccount()));
        }

        if (question.getReactIconQuestions() != null) {
            questionDto.setLike_quantity(question.getReactIconQuestions().size());
        }
        else {
            questionDto.setLike_quantity(0);
        }

        if (question.getComment() != null) {
            questionDto.setComment_quantity(question.getComment().size());
        }
        else {
            questionDto.setComment_quantity(0);
        }

        return questionDto;
    }

}
