package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.ReactIcon;
import com.example.uetshare.response.dto.ReactIconDto;

public interface ReactIconMapper {

    public static ReactIconDto toReactIconDto(ReactIcon reactIcon){
        ReactIconDto reactIconDto = new ReactIconDto();

        if(reactIcon.getId() != null){
            reactIconDto.setId(reactIcon.getId());
        }

        if(reactIcon.getAccount() != null){
            if(reactIcon.getAccount().getId() != null){
                reactIconDto.setAccount_id(reactIcon.getAccount().getId());
            }
        }

        if(reactIcon.getQuestion() != null){
            if(reactIcon.getQuestion().getId() != null){
                reactIconDto.setQuestion_id(reactIcon.getQuestion().getId());
            }
        }

        if(reactIcon.getComment() != null){
            if(reactIcon.getComment().getId() != null){
                reactIconDto.setComment_id(reactIcon.getComment().getId());
            }
        }

        return reactIconDto;

    }

}
