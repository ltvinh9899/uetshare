package com.example.uetshare.service;

import com.example.uetshare.entity.NotificationComment;
import com.example.uetshare.entity.NotificationQuestion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NotificationCommentServiceInterface {

    public void createNotificationComment(NotificationComment notificationComment);
    public List<NotificationComment> getNotificationCommentByAuthorAccountId(Long author_account_id, Integer index);
    public NotificationComment updateSeen(Long id);

}
