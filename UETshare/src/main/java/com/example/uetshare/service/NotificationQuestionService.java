package com.example.uetshare.service;

import com.example.uetshare.entity.NotificationQuestion;
import com.example.uetshare.repository.NotificationQuestionRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NotificationQuestionService implements NotificationQuestionServiceInterface{

    @Autowired
    private NotificationQuestionRepositoryInterface notificationQuestionRepositoryInterface;

    @Override
    public void createNotificationQuestion(NotificationQuestion notificationQuestion) {
        notificationQuestionRepositoryInterface.save(notificationQuestion);
    }

    @Override
    public List<NotificationQuestion> getNotificationQuestionByAuthorAccountId(Long author_account_id, Integer index) {
        return notificationQuestionRepositoryInterface.getNotificationQuestionByAccountAuthorId(author_account_id, index);
    }

    @Override
    public NotificationQuestion updateSeen(Long id) {

        NotificationQuestion notificationQuestion = notificationQuestionRepositoryInterface.getNotificationQuestionById(id);

        notificationQuestion.setSeen(true);

        notificationQuestionRepositoryInterface.save(notificationQuestion);

        return notificationQuestion;
    }

    @Override
    public List<NotificationQuestion> getUnseenNotificationQuestion(Long author_account_id, Integer index) {
        return notificationQuestionRepositoryInterface.getUnseenNotificationQuestion(author_account_id, index);
    }
}
