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

        if (question.getImage() != null){
            questionDto.setImage(question.getImage());
        }

        if (question.getType_content() != null) {
            if(question.getType_content().getId() != null){
                questionDto.setType_content_id(question.getType_content().getId());
            }
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
