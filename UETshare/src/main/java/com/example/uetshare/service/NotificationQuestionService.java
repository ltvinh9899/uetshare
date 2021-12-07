package com.example.uetshare.service;

import com.example.uetshare.entity.NotificationQuestion;
import com.example.uetshare.repository.NotificationQuestionRepositoryInterface;
import com.example.uetshare.retrofit.RetrofitConfig;
import com.example.uetshare.retrofit.data.request.Data;
import com.example.uetshare.retrofit.data.request.Notification;
import com.example.uetshare.retrofit.data.request.SendNotificationRequest;
import com.example.uetshare.retrofit.data.response.SendNotificationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.ArrayList;
import java.util.List;

@Component
public class NotificationQuestionService extends BaseSendFCMService implements NotificationQuestionServiceInterface{

    @Autowired
    private NotificationQuestionRepositoryInterface notificationQuestionRepositoryInterface;

    @Override
    public void createNotificationQuestion(NotificationQuestion notificationQuestion) {
        notificationQuestionRepositoryInterface.save(notificationQuestion);

        sendFCMNotification(notificationQuestion.getUsername(), notificationQuestion.getAction_type());
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
