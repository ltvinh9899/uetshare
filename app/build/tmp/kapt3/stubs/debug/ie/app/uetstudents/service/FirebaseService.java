package ie.app.uetstudents.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0003J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\rH\u0003\u00a8\u0006\u000f"}, d2 = {"Lie/app/uetstudents/service/FirebaseService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "", "sendNotification", "data", "sendNotificationOptions", "Lie/app/uetstudents/data/response/FirebaseMessageModel;", "Companion", "app_debug"})
public final class FirebaseService extends com.google.firebase.messaging.FirebaseMessagingService {
    @org.jetbrains.annotations.NotNull()
    public static final ie.app.uetstudents.service.FirebaseService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DATA_FCM = "KEY_DATA_FCM";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_NOTIFICATION = "UPDATE_NOTIFICATION";
    
    public FirebaseService() {
        super();
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    @android.annotation.SuppressLint(value = {"UnspecifiedImmutableFlag"})
    private final void sendNotification(java.lang.String data) {
    }
    
    @android.annotation.SuppressLint(value = {"UnspecifiedImmutableFlag"})
    private final void sendNotificationOptions(ie.app.uetstudents.data.response.FirebaseMessageModel data) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lie/app/uetstudents/service/FirebaseService$Companion;", "", "()V", "KEY_DATA_FCM", "", "UPDATE_NOTIFICATION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}