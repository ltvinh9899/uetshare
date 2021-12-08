package com.example.uetshare.response.mapper;

import com.example.uetshare.entity.NotificationQuestion;
import com.example.uetshare.response.dto.NotificationQuestionDto;

import java.util.Calendar;

public class NotificationQuestionMapper {

    public static NotificationQuestionDto toNotificationQuestionDto(NotificationQuestion notificationQuestion){
        NotificationQuestionDto notificationQuestionDto = new NotificationQuestionDto();

        if(notificationQuestion.getId() != null){
            notificationQuestionDto.setId(notificationQuestion.getId());
        }

        if(notificationQuestion.getUsername() != null){
            notificationQuestionDto.setUsername(notificationQuestion.getUsername());
        }

        if(notificationQuestion.getAvatar() != null){
            notificationQuestionDto.setAvatar(notificationQuestion.getAvatar());
        }

        if(notificationQuestion.getSeen() != null){
            notificationQuestionDto.setSeen(notificationQuestion.getSeen());
        }

        if(notificationQuestion.getAction_type() != null){
            notificationQuestionDto.setAction_type(notificationQuestion.getAction_type());
        }

        if(notificationQuestion.getQuestion() != null){
            if(notificationQuestion.getQuestion().getId() != null){
                notificationQuestionDto.setQuestion_id(notificationQuestion.getQuestion().getId());
            }
        }

        if (notificationQuestion.getTime() != null){
            notificationQuestion.getTime().roll(Calendar.HOUR_OF_DAY, 7);
            notificationQuestionDto.setTime(notificationQuestion.getTime());
        }

        return notificationQuestionDto;

    }

}
