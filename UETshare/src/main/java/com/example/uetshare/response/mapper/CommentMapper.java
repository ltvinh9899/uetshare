package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.Comment;
import com.example.uetshare.response.dto.CommentDto;

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

        System.out.println(comment.getQuestion().getId());

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

        return commentDto;

    }

}
