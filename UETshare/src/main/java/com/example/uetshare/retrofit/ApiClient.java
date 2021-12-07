package com.example.uetshare.retrofit;

import com.example.uetshare.retrofit.data.request.SendNotificationRequest;
import com.example.uetshare.retrofit.data.response.SendNotificationResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiClient {
    @POST("fcm/send")
    public Call<SendNotificationResponse> sendNotifications(@Body SendNotificationRequest request);
}
