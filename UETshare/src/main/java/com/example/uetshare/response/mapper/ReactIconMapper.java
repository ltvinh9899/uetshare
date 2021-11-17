package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.ReactIconQuestion;
import com.example.uetshare.response.dto.ReactIconDto;

public interface ReactIconMapper {

    public static ReactIconDto toReactIconDto(ReactIconQuestion reactIconQuestion){
        ReactIconDto reactIconDto = new ReactIconDto();

        if(reactIconQuestion.getId() != null){
            reactIconDto.setId(reactIconQuestion.getId());
        }

        if(reactIconQuestion.getAccount() != null){
            if(reactIconQuestion.getAccount().getId() != null){
                reactIconDto.setAccount_id(reactIconQuestion.getAccount().getId());
            }
        }

        if(reactIconQuestion.getQuestion() != null){
            if(reactIconQuestion.getQuestion().getId() != null){
                reactIconDto.setQuestion_id(reactIconQuestion.getQuestion().getId());
            }
        }

//        if(reactIcon.getComment() != null){
//            if(reactIcon.getComment().getId() != null){
//                reactIconDto.setComment_id(reactIcon.getComment().getId());
//            }
//        }

        return reactIconDto;

    }

}
