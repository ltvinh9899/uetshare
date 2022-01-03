package ie.app.uetstudents.ui.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\"\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0005R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lie/app/uetstudents/ui/notifications/notification_service;", "Landroid/app/Service;", "()V", "list_notification_Comment", "", "Lie/app/uetstudents/Entity/notifications_comment/get/NotificationCommentDto;", "getList_notification_Comment", "()Ljava/util/List;", "setList_notification_Comment", "(Ljava/util/List;)V", "list_notification_Question", "Lie/app/uetstudents/Entity/notifications_question/get/NotificationQuestionDto;", "getList_notification_Question", "setList_notification_Question", "page", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "flags", "startId", "sentNotification", "notifi", "app_debug"})
public final class notification_service extends android.app.Service {
    private int page = 1;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<ie.app.uetstudents.Entity.notifications_question.get.NotificationQuestionDto> list_notification_Question;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<ie.app.uetstudents.Entity.notifications_comment.get.NotificationCommentDto> list_notification_Comment;
    
    public notification_service() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ie.app.uetstudents.Entity.notifications_question.get.NotificationQuestionDto> getList_notification_Question() {
        return null;
    }
    
    public final void setList_notification_Question(@org.jetbrains.annotations.NotNull()
    java.util.List<ie.app.uetstudents.Entity.notifications_question.get.NotificationQuestionDto> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ie.app.uetstudents.Entity.notifications_comment.get.NotificationCommentDto> getList_notification_Comment() {
        return null;
    }
    
    public final void setList_notification_Comment(@org.jetbrains.annotations.NotNull()
    java.util.List<ie.app.uetstudents.Entity.notifications_comment.get.NotificationCommentDto> p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    public final void sentNotification(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.notifications_comment.get.NotificationCommentDto notifi) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}