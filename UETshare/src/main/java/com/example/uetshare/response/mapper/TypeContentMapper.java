package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.TypeContent;
import com.example.uetshare.response.dto.TypeContentDto;

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
            typeContentDto.setTime(typeContent.getTime());
        }

        return typeContentDto;
    }

}
