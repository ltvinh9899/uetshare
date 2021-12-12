package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.SubComment;
import com.example.uetshare.response.dto.SubCommentDto;

import java.util.Calendar;

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

        if (subComment.getTime() != null){
            subComment.getTime().roll(Calendar.HOUR_OF_DAY, 7);
            subCommentDto.setTime(subComment.getTime());
        }

        return subCommentDto;

    }

}
