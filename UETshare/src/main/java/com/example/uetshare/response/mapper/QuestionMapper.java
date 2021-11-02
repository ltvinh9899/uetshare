package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.Category;
import com.example.uetshare.entity.Question;
import com.example.uetshare.response.dto.QuestionDto;

import java.util.ArrayList;
import java.util.List;

public class QuestionMapper {

    public static QuestionDto toQuestionDto(Question question){
        QuestionDto questionDto = new QuestionDto();

        if (question.getId() != null){
            questionDto.setId(question.getId());
        }

        if(question.getAccount() != null){
            questionDto.setAccount(question.getAccount());
        }

        if (question.getContent() != null){
            questionDto.setContent(question.getContent());
        }

        if (question.getImage() != null){
            questionDto.setImage(question.getImage());
        }

        if (question.getCategory() != null){
            List<Long> categoryIdList = new ArrayList<>();
            for(Category category : question.getCategory()){
                categoryIdList.add(category.getId());
            }
            questionDto.setCategoryIdList(categoryIdList);
        }

        return questionDto;
    }

}
