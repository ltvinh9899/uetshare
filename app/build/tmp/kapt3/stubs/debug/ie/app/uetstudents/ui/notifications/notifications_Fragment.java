package ie.app.uetstudents.ui.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010*\u001a\u00020\u001eH\u0016J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0007J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u001eH\u0016J\b\u00102\u001a\u00020\u001eH\u0016J\u001a\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020:H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u000fj\b\u0012\u0004\u0012\u00020\u0017`\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u000e\u0010\u001a\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lie/app/uetstudents/ui/notifications/notifications_Fragment;", "Landroidx/fragment/app/Fragment;", "Lie/app/uetstudents/adapter/OnClickItem_Notification;", "Lie/app/uetstudents/ui/notifications/notification_Contract$View;", "()V", "adapterNotification", "Lie/app/uetstudents/adapter/adapter_notification;", "id_user", "", "getId_user", "()Ljava/lang/Integer;", "setId_user", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "list_notification_Comment", "Ljava/util/ArrayList;", "Lie/app/uetstudents/Entity/notifications_comment/get/NotificationCommentDto;", "Lkotlin/collections/ArrayList;", "getList_notification_Comment", "()Ljava/util/ArrayList;", "setList_notification_Comment", "(Ljava/util/ArrayList;)V", "list_notification_Question", "Lie/app/uetstudents/Entity/notifications_question/get/NotificationQuestionDto;", "getList_notification_Question", "setList_notification_Question", "page", "presenter", "Lie/app/uetstudents/ui/notifications/notification_Contract$Presenter;", "OnCLick", "", "n", "Lie/app/uetstudents/Entity/notifications_question/notification_item;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onMessageEvent", "event", "", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onStart", "onStop", "onViewCreated", "view", "updateViewNotification_comment", "notification_comment", "Lie/app/uetstudents/Entity/notifications_comment/get/get_notifi_comment;", "updateViewNotification_question", "notification_question", "Lie/app/uetstudents/Entity/notifications_question/get/notification_question;", "app_debug"})
public final class notifications_Fragment extends androidx.fragment.app.Fragment implements ie.app.uetstudents.adapter.OnClickItem_Notification, ie.app.uetstudents.ui.notifications.notification_Contract.View {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<ie.app.uetstudents.Entity.notifications_question.get.NotificationQuestionDto> list_notification_Question;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<ie.app.uetstudents.Entity.notifications_comment.get.NotificationCommentDto> list_notification_Comment;
    private ie.app.uetstudents.adapter.adapter_notification adapterNotification;
    private ie.app.uetstudents.ui.notifications.notification_Contract.Presenter presenter;
    private int page = 1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer id_user;
    private java.util.HashMap _$_findViewCache;
    
    public notifications_Fragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<ie.app.uetstudents.Entity.notifications_question.get.NotificationQuestionDto> getList_notification_Question() {
        return null;
    }
    
    public final void setList_notification_Question(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<ie.app.uetstudents.Entity.notifications_question.get.NotificationQuestionDto> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<ie.app.uetstudents.Entity.notifications_comment.get.NotificationCommentDto> getList_notification_Comment() {
        return null;
    }
    
    public final void setList_notification_Comment(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<ie.app.uetstudents.Entity.notifications_comment.get.NotificationCommentDto> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId_user() {
        return null;
    }
    
    public final void setId_user(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void OnCLick(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.notifications_question.notification_item n) {
    }
    
    @java.lang.Override()
    public void updateViewNotification_question(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.notifications_question.get.notification_question notification_question) {
    }
    
    @java.lang.Override()
    public void updateViewNotification_comment(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.notifications_comment.get.get_notifi_comment notification_comment) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}