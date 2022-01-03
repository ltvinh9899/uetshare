package ie.app.uetstudents.ui.profile.change;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u000eJ\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lie/app/uetstudents/ui/profile/change/changeFragment;", "Landroidx/fragment/app/Fragment;", "Lie/app/uetstudents/ui/profile/ProfileContract$View;", "()V", "id_user", "", "getId_user", "()Ljava/lang/Integer;", "setId_user", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "presenter", "Lie/app/uetstudents/ui/profile/ProfileContract$Presenter;", "UpdateViewDataQuestionProfile", "", "question", "Lie/app/uetstudents/Entity/Question/get/question;", "type_content_id", "UpdateViewDataUser", "user", "Lie/app/uetstudents/Entity/userProfile/get/userprofile;", "dialog", "changcontent", "", "dialogpassword", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onViewCreated", "view", "app_debug"})
public final class changeFragment extends androidx.fragment.app.Fragment implements ie.app.uetstudents.ui.profile.ProfileContract.View {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer id_user;
    private ie.app.uetstudents.ui.profile.ProfileContract.Presenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    public changeFragment() {
        super();
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
    
    public final void dialogpassword() {
    }
    
    public final void dialog(@org.jetbrains.annotations.NotNull()
    java.lang.String changcontent) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void UpdateViewDataQuestionProfile(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.question question, int type_content_id) {
    }
    
    @java.lang.Override()
    public void UpdateViewDataUser(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.userProfile.get.userprofile user) {
    }
}