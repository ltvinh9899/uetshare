package com.example.uetshare.service;

import com.example.uetshare.entity.ActionType;
import com.example.uetshare.entity.FirebaseToken;
import com.example.uetshare.repository.FirebaseTokenRepository;
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
public class BaseSendFCMService {
    @Autowired
    private FirebaseTokenRepository firebaseTokenRepository;

    public void sendFCMNotification(String user, ActionType type) {
        SendNotificationRequest request = createFCMRequest(user, type);
        Call<SendNotificationResponse> call = RetrofitConfig.apiClient.sendNotifications(request);
        call.enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<SendNotificationResponse> call, Response<SendNotificationResponse> response) {
                System.out.print("onResponse " + response.toString());
            }

            @Override
            public void onFailure(Call<SendNotificationResponse> call, Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }

    public SendNotificationRequest createFCMRequest(String user, ActionType type){
        List<FirebaseToken> tokens = firebaseTokenRepository.getTokensByUser(user);

        Data data = new Data();
        Notification notification = new Notification();
        if(type == ActionType.LIKE) {
            notification.title = "Một người bạn vừa thích hoạt động của bạn";
            notification.body = "Một người bạn vừa thích hoạt động của bạn";

            data.title = "Một người bạn vừa thích hoạt động của bạn";
            data.message = "Một người bạn vừa thích hoạt động của bạn";
        } else {
            notification.title = "Một người bạn vừa bình luận hoạt động của bạn";
            notification.body = "Một người bạn vừa bình luận hoạt động của bạn";

            data.title = "Một người bạn vừa bình luận hoạt động của bạn";
            data.message = "Một người bạn vừa bình luận hoạt động của bạn";
        }

        SendNotificationRequest request = new SendNotificationRequest();
        request.data = data;
        request.notification = notification;
        request.collapseKey = "type_a";
        request.priority = "high";
        request.registrationIds = new ArrayList<>();

        for(FirebaseToken token : tokens) {
            request.registrationIds.add(token.getToken());
        }

        return request;
    }
}
