package ie.app.uetstudents.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001#B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0017J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0006\u0010\u001b\u001a\u00020\u0014J\u0014\u0010\u001c\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u0014\u0010 \u001a\u00020\u00142\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R.\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006$"}, d2 = {"Lie/app/uetstudents/adapter/adapter_notification;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lie/app/uetstudents/adapter/adapter_notification$ViewHolder;", "ClickItem", "Lie/app/uetstudents/adapter/OnClickItem_Notification;", "(Lie/app/uetstudents/adapter/OnClickItem_Notification;)V", "getClickItem", "()Lie/app/uetstudents/adapter/OnClickItem_Notification;", "setClickItem", "listnotifi_item", "Ljava/util/ArrayList;", "Lie/app/uetstudents/Entity/notifications_question/notification_item;", "Lkotlin/collections/ArrayList;", "getListnotifi_item", "()Ljava/util/ArrayList;", "setListnotifi_item", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "resetList", "setData_question", "list_notifi_question", "", "Lie/app/uetstudents/Entity/notifications_question/get/NotificationQuestionDto;", "setdata_comment", "list_notifi_comment", "Lie/app/uetstudents/Entity/notifications_comment/get/NotificationCommentDto;", "ViewHolder", "app_debug"})
public final class adapter_notification extends androidx.recyclerview.widget.RecyclerView.Adapter<ie.app.uetstudents.adapter.adapter_notification.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private ie.app.uetstudents.adapter.OnClickItem_Notification ClickItem;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<ie.app.uetstudents.Entity.notifications_question.notification_item> listnotifi_item;
    
    public adapter_notification(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.OnClickItem_Notification ClickItem) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ie.app.uetstudents.adapter.OnClickItem_Notification getClickItem() {
        return null;
    }
    
    public final void setClickItem(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.OnClickItem_Notification p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<ie.app.uetstudents.Entity.notifications_question.notification_item> getListnotifi_item() {
        return null;
    }
    
    public final void setListnotifi_item(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<ie.app.uetstudents.Entity.notifications_question.notification_item> p0) {
    }
    
    public final void resetList() {
    }
    
    public final void setData_question(@org.jetbrains.annotations.NotNull()
    java.util.List<ie.app.uetstudents.Entity.notifications_question.get.NotificationQuestionDto> list_notifi_question) {
    }
    
    public final void setdata_comment(@org.jetbrains.annotations.NotNull()
    java.util.List<ie.app.uetstudents.Entity.notifications_comment.get.NotificationCommentDto> list_notifi_comment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ie.app.uetstudents.adapter.adapter_notification.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.adapter_notification.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lie/app/uetstudents/adapter/adapter_notification$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemview", "Landroid/view/View;", "(Lie/app/uetstudents/adapter/adapter_notification;Landroid/view/View;)V", "getItemview", "()Landroid/view/View;", "setItemview", "(Landroid/view/View;)V", "OnBinData", "", "n", "Lie/app/uetstudents/Entity/notifications_question/notification_item;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.view.View itemview;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemview) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getItemview() {
            return null;
        }
        
        public final void setItemview(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        @android.annotation.SuppressLint(value = {"ResourceAsColor"})
        public final void OnBinData(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.notifications_question.notification_item n) {
        }
    }
}