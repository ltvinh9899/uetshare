package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.SubComment;
import com.example.uetshare.response.dto.SubCommentDto;

public class SubCommentMapper {

    public static SubCommentDto toSubCommentDto(SubComment subComment){
        SubCommentDto subCommentDto = new SubCommentDto();

        if(subComment.getId() != null){
            subCommentDto.setId(subComment.getId());
        }

        if(subComment.getContent() != null){
            subCommentDto.setContent(subComment.getContent());
        }

        if(subComment.getImage() != null){
            subCommentDto.setImage(subComment.getImage());
        }

        if(subComment.getComment() != null){
            if(subComment.getComment().getId() != null) {
                subCommentDto.setId(subComment.getId());
            }
        }

        return subCommentDto;

    }

}
