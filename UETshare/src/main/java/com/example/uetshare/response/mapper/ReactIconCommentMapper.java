package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.ReactIconComment;
import com.example.uetshare.entity.ReactIconQuestion;
import com.example.uetshare.response.dto.ReactIconCommentDto;
import com.example.uetshare.response.dto.ReactIconQuestionDto;

public class ReactIconCommentMapper {

    public static ReactIconCommentDto toReactIconCommentDto(ReactIconComment reactIconComment){
        ReactIconCommentDto reactIconCommentDto = new ReactIconCommentDto();

        if(reactIconComment.getId() != null){
            reactIconCommentDto.setId(reactIconComment.getId());
        }

        if(reactIconComment.getAccount() != null){
            if(reactIconComment.getAccount().getId() != null){
                reactIconCommentDto.setAccount_id(reactIconComment.getAccount().getId());
            }
        }

        if(reactIconComment.getComment() != null){
            if(reactIconComment.getComment().getId() != null){
                reactIconCommentDto.setComment_id(reactIconComment.getComment().getId());
            }
        }

        if (reactIconComment.getTime() != null){
            reactIconCommentDto.setTime(reactIconComment.getTime());
        }

        return reactIconCommentDto;

    }

}
