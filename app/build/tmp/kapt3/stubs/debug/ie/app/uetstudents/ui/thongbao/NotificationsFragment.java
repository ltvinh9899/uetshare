package ie.app.uetstudents.ui.thongbao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010,\u001a\u00020\u001dH\u0016J\u001a\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\'2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lie/app/uetstudents/ui/thongbao/NotificationsFragment;", "Landroidx/fragment/app/Fragment;", "Lie/app/uetstudents/ui/thongbao/NotificationUetContract$View;", "Lie/app/uetstudents/adapter/OnclickItem_NotificationUet;", "()V", "_binding", "Lie/app/uetstudents/databinding/FragmentNotificationsBinding;", "adapter", "Lie/app/uetstudents/adapter/adapter_itembantin;", "binding", "getBinding", "()Lie/app/uetstudents/databinding/FragmentNotificationsBinding;", "iduser", "", "getIduser", "()Ljava/lang/Integer;", "setIduser", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "notificationsViewModel", "Lie/app/uetstudents/ui/thongbao/NotificationsViewModel;", "page", "getPage", "()I", "setPage", "(I)V", "presenter", "Lie/app/uetstudents/ui/thongbao/NotificationUetContract$Presenter;", "OnclickItem", "", "itembantin", "Lie/app/uetstudents/Entity/Question/get/QuestionDtoX;", "UpdateDataViewItem", "question", "Lie/app/uetstudents/Entity/Question/get/question;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "app_debug"})
public final class NotificationsFragment extends androidx.fragment.app.Fragment implements ie.app.uetstudents.ui.thongbao.NotificationUetContract.View, ie.app.uetstudents.adapter.OnclickItem_NotificationUet {
    private ie.app.uetstudents.ui.thongbao.NotificationsViewModel notificationsViewModel;
    private ie.app.uetstudents.databinding.FragmentNotificationsBinding _binding;
    private ie.app.uetstudents.adapter.adapter_itembantin adapter;
    private ie.app.uetstudents.ui.thongbao.NotificationUetContract.Presenter presenter;
    private int page = 1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer iduser;
    private java.util.HashMap _$_findViewCache;
    
    public NotificationsFragment() {
        super();
    }
    
    private final ie.app.uetstudents.databinding.FragmentNotificationsBinding getBinding() {
        return null;
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIduser() {
        return null;
    }
    
    public final void setIduser(@org.jetbrains.annotations.Nullable()
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
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void UpdateDataViewItem(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.question question) {
    }
    
    @java.lang.Override()
    public void OnclickItem(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.QuestionDtoX itembantin) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}