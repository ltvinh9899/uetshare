package com.example.uetshare.service;

import com.example.uetshare.entity.NotificationComment;
import com.example.uetshare.entity.NotificationQuestion;
import com.example.uetshare.repository.NotificationCommentRepositoryInterface;
import com.example.uetshare.response.NotificationQuestionResponse;
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
public class NotificationCommentService extends BaseSendFCMService implements NotificationCommentServiceInterface{

    @Autowired
    private NotificationCommentRepositoryInterface notificationCommentRepositoryInterface;

    @Override
    public void createNotificationComment(NotificationComment notificationComment) {
        notificationCommentRepositoryInterface.save(notificationComment);

        sendFCMNotification(notificationComment.getUsername(), notificationComment.getAction_type());
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

    @Override
    public List<NotificationComment> getUnseenNotificationComment(Long author_account_id, Integer index) {
        return notificationCommentRepositoryInterface.getUnSeenNotification(author_account_id, index);
    }

    public SendNotificationRequest createFCMRequest(){
        Data data = new Data("Hihi title", "Hihi message");
        Notification notification = new Notification("title notification", "body notification");

        SendNotificationRequest request = new SendNotificationRequest();
        request.data = data;
        request.notification = notification;
        request.collapseKey = "type_a";
        request.priority = "high";
        request.registrationIds = new ArrayList<>();
        request.registrationIds.add("eFUC7Yz5Sf-CvQdkewWi1W:APA91bF5YTgHxAoWmMuV8MLtNXsJYDx15nNOSzkgKcj8FTAPU_qD8LfIU3Pj7VUZHR25358BAu77y5P4k8IA7Nm0OlCYPLIQmlJlzpey5L3kmCyJz5K2ZO-i98ynzG6I9iMgshAUFxb8");

        return request;
    }
}
