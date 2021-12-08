package com.example.uetshare.service;

import com.example.uetshare.entity.NotificationQuestion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NotificationQuestionServiceInterface {

    public void createNotificationQuestion(NotificationQuestion notificationQuestion);
    public List<NotificationQuestion> getNotificationQuestionByAuthorAccountId(Long author_account_id, Integer index);
    public NotificationQuestion updateSeen(Long id);
    public List<NotificationQuestion> getUnseenNotificationQuestion(Long author_account_id, Integer index);

}
