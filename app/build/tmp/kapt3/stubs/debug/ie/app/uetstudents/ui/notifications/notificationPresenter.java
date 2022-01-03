package ie.app.uetstudents.ui.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lie/app/uetstudents/ui/notifications/notificationPresenter;", "Lie/app/uetstudents/ui/notifications/notification_Contract$Presenter;", "View", "Lie/app/uetstudents/ui/notifications/notification_Contract$View;", "repository", "Lie/app/uetstudents/Repository/Repository;", "(Lie/app/uetstudents/ui/notifications/notification_Contract$View;Lie/app/uetstudents/Repository/Repository;)V", "getNotificationComment", "", "id_account", "", "page", "getNotificationQuestion", "getUpdateUINotificationComment", "notification_comment", "Lie/app/uetstudents/Entity/notifications_comment/get/get_notifi_comment;", "getUpdateUINotificationQuestion", "notification_question", "Lie/app/uetstudents/Entity/notifications_question/get/notification_question;", "app_debug"})
public final class notificationPresenter implements ie.app.uetstudents.ui.notifications.notification_Contract.Presenter {
    private final ie.app.uetstudents.ui.notifications.notification_Contract.View View = null;
    private final ie.app.uetstudents.Repository.Repository repository = null;
    
    public notificationPresenter(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.notifications.notification_Contract.View View, @org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Repository.Repository repository) {
        super();
    }
    
    @java.lang.Override()
    public void getNotificationQuestion(int id_account, int page) {
    }
    
    @java.lang.Override()
    public void getNotificationComment(int id_account, int page) {
    }
    
    @java.lang.Override()
    public void getUpdateUINotificationQuestion(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.notifications_question.get.notification_question notification_question) {
    }
    
    @java.lang.Override()
    public void getUpdateUINotificationComment(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.notifications_comment.get.get_notifi_comment notification_comment) {
    }
}