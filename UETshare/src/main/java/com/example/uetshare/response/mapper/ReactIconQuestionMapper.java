package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.ReactIconQuestion;
import com.example.uetshare.response.dto.ReactIconQuestionDto;

public class ReactIconQuestionMapper {

    public static ReactIconQuestionDto toReactIconDto(ReactIconQuestion reactIconQuestion){
        ReactIconQuestionDto reactIconQuestionDto = new ReactIconQuestionDto();

        if(reactIconQuestion.getId() != null){
            reactIconQuestionDto.setId(reactIconQuestion.getId());
        }

        if(reactIconQuestion.getAccount() != null){
            if(reactIconQuestion.getAccount().getId() != null){
                reactIconQuestionDto.setAccount_id(reactIconQuestion.getAccount().getId());
            }
        }

        if(reactIconQuestion.getQuestion() != null){
            if(reactIconQuestion.getQuestion().getId() != null){
                reactIconQuestionDto.setQuestion_id(reactIconQuestion.getQuestion().getId());
            }
        }

        if (reactIconQuestion.getTime() != null){
            reactIconQuestionDto.setTime(reactIconQuestion.getTime());
        }

//        if(reactIcon.getComment() != null){
//            if(reactIcon.getComment().getId() != null){
//                reactIconDto.setComment_id(reactIcon.getComment().getId());
//            }
//        }

        return reactIconQuestionDto;

    }

}
