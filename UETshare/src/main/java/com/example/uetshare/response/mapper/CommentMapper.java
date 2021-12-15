package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.Comment;
import com.example.uetshare.response.dto.CommentDto;

import java.util.Calendar;

public class CommentMapper {

    public static CommentDto toCommentDto(Comment comment){
        CommentDto commentDto = new CommentDto();

        if(comment.getId() != null){
            commentDto.setId(comment.getId());
        }

        if(comment.getContent() != null){
            commentDto.setContent(comment.getContent());
        }

        if(comment.getImage() != null){
            commentDto.setImage(comment.getImage());
        }

        if (comment.getQuestion() != null){
            if(comment.getQuestion().getId() != null){
                commentDto.setQuestion_id(comment.getQuestion().getId());
            }
        }

        if (comment.getAccount() != null){
            if (comment.getAccount().getId() != null){
                commentDto.setAccount_id(comment.getAccount().getId());
            }
        }

        if (comment.getTime() != null){
            comment.getTime().roll(Calendar.HOUR_OF_DAY, 7);
            commentDto.setTime(comment.getTime());
        }

        if (comment.getAccount() != null){
            commentDto.setAccountDto(AccountMapper.toAccountDto(comment.getAccount()));
        }

        return commentDto;

    }

}
