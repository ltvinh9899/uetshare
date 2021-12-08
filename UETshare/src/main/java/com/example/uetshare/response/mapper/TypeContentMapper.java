package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.TypeContent;
import com.example.uetshare.response.dto.TypeContentDto;

import java.util.Calendar;

public class TypeContentMapper {

    public static TypeContentDto toTypeContentDto(TypeContent typeContent){
        TypeContentDto typeContentDto = new TypeContentDto();

        if (typeContent.getId() != null){
            typeContentDto.setId(typeContent.getId());
        }

        if(typeContent.getType_content() != null){
            typeContentDto.setType_content(typeContent.getType_content());
        }

        if (typeContent.getTime() != null){
            typeContent.getTime().roll(Calendar.HOUR_OF_DAY, 7);
            typeContentDto.setTime(typeContent.getTime());
        }

        return typeContentDto;
    }

}
