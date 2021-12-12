package com.example.uetshare.retrofit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {
    public static final String KEY_SERVER = "AAAAHzCqA_w:APA91bFtOu5Athrdlw6KfN3pGX6i7QQX6Y0dZHOCINlLu6PcXsza2OV3DH8NbgO3RHVQEunFsw4osMQZiSq6cLT5bL9BXQTCG3rWWWG7mOJZ45PobTYCIx31RrApjqrSSHNH2HC9qEaL";

    public static OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
            .addInterceptor(chain -> {
                Request original = chain.request();
                Request request = original.newBuilder()
                        .header("Authorization", "key="+KEY_SERVER)
                        .build();
                return chain.proceed(request);
            });
    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://fcm.googleapis.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build();

    public static ApiClient apiClient = retrofit.create(ApiClient.class);
}
