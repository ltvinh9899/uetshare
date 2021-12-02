package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.NotificationComment;
import com.example.uetshare.entity.NotificationQuestion;
import com.example.uetshare.response.dto.NotificationCommentDto;
import com.example.uetshare.response.dto.NotificationQuestionDto;

public class NotificationCommentMapper {

    public static NotificationCommentDto toNotificationCommentDto(NotificationComment notificationComment){
        NotificationCommentDto notificationCommentDto = new NotificationCommentDto();

        if(notificationComment.getId() != null){
            notificationCommentDto.setId(notificationComment.getId());
        }

        if(notificationComment.getUsername() != null){
            notificationCommentDto.setUsername(notificationComment.getUsername());
        }

        if(notificationComment.getAvatar() != null){
            notificationCommentDto.setAvatar(notificationComment.getAvatar());
        }

        if(notificationComment.getSeen() != null){
            notificationCommentDto.setSeen(notificationComment.getSeen());
        }

        if(notificationComment.getAction_type() != null){
            notificationCommentDto.setAction_type(notificationComment.getAction_type());
        }

        if(notificationComment.getComment() != null){
            if(notificationComment.getComment().getId() != null){
                notificationCommentDto.setComment_id(notificationComment.getComment().getId());
            }
        }

        if (notificationComment.getTime() != null){
            notificationCommentDto.setTime(notificationComment.getTime());
        }

        return notificationCommentDto;

    }

}
