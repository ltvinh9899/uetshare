package com.example.uetshare.service;

import com.example.uetshare.entity.NotificationComment;
import com.example.uetshare.entity.NotificationQuestion;
import com.example.uetshare.repository.NotificationCommentRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NotificationCommentService implements NotificationCommentServiceInterface{

    @Autowired
    private NotificationCommentRepositoryInterface notificationCommentRepositoryInterface;

    @Override
    public void createNotificationComment(NotificationComment notificationComment) {
        notificationCommentRepositoryInterface.save(notificationComment);
    }

    @Override
    public List<NotificationComment> getNotificationCommentByAuthorAccountId(Long author_account_id, Integer index) {
        return notificationCommentRepositoryInterface.getNotificationCommentByAccountAuthorId(author_account_id, index);
    }

    @Override
    public NotificationComment updateSeen(Long id) {
        NotificationComment notificationComment = notificationCommentRepositoryInterface.getNotificationCommentById(id);

        notificationComment.setSeen(true);

        notificationCommentRepositoryInterface.save(notificationComment);

        return notificationComment;
    }
}
