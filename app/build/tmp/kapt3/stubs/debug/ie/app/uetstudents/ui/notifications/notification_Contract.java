package ie.app.uetstudents.ui.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lie/app/uetstudents/ui/notifications/notification_Contract;", "", "Presenter", "View", "app_debug"})
public abstract interface notification_Contract {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lie/app/uetstudents/ui/notifications/notification_Contract$View;", "", "updateViewNotification_comment", "", "notification_comment", "Lie/app/uetstudents/Entity/notifications_comment/get/get_notifi_comment;", "updateViewNotification_question", "notification_question", "Lie/app/uetstudents/Entity/notifications_question/get/notification_question;", "app_debug"})
    public static abstract interface View {
        
        public abstract void updateViewNotification_question(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.notifications_question.get.notification_question notification_question);
        
        public abstract void updateViewNotification_comment(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.notifications_comment.get.get_notifi_comment notification_comment);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lie/app/uetstudents/ui/notifications/notification_Contract$Presenter;", "", "getNotificationComment", "", "id_account", "", "page", "getNotificationQuestion", "getUpdateUINotificationComment", "notification_comment", "Lie/app/uetstudents/Entity/notifications_comment/get/get_notifi_comment;", "getUpdateUINotificationQuestion", "notification_question", "Lie/app/uetstudents/Entity/notifications_question/get/notification_question;", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getNotificationQuestion(int id_account, int page);
        
        public abstract void getNotificationComment(int id_account, int page);
        
        public abstract void getUpdateUINotificationQuestion(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.notifications_question.get.notification_question notification_question);
        
        public abstract void getUpdateUINotificationComment(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.notifications_comment.get.get_notifi_comment notification_comment);
    }
}