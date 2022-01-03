package ie.app.uetstudents.ui.thongbao.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lie/app/uetstudents/ui/thongbao/detail/DatailNotiFragment;", "Landroidx/fragment/app/Fragment;", "Lie/app/uetstudents/ui/thongbao/detail/DetailContract$View;", "Lie/app/uetstudents/adapter/OnclickImageDto;", "()V", "id_question", "", "getId_question", "()I", "setId_question", "(I)V", "id_user", "getId_user", "setId_user", "presenter", "Lie/app/uetstudents/ui/thongbao/detail/DetailContract$Presenter;", "OnclickItem", "", "imageDto", "Lie/app/uetstudents/Entity/Question/get/ImageDto;", "UpdateViewDetail", "Question", "Lie/app/uetstudents/Entity/Question/get/QuestionDtoX;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onViewCreated", "view", "app_debug"})
public final class DatailNotiFragment extends androidx.fragment.app.Fragment implements ie.app.uetstudents.ui.thongbao.detail.DetailContract.View, ie.app.uetstudents.adapter.OnclickImageDto {
    private int id_question = 0;
    private ie.app.uetstudents.ui.thongbao.detail.DetailContract.Presenter presenter;
    private int id_user = 0;
    private java.util.HashMap _$_findViewCache;
    
    public DatailNotiFragment() {
        super();
    }
    
    public final int getId_question() {
        return 0;
    }
    
    public final void setId_question(int p0) {
    }
    
    public final int getId_user() {
        return 0;
    }
    
    public final void setId_user(int p0) {
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
    
    @java.lang.Override()
    public void UpdateViewDetail(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.QuestionDtoX Question) {
    }
    
    @java.lang.Override()
    public void OnclickItem(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.ImageDto imageDto) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
}