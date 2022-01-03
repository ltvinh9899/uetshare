package ie.app.uetstudents.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lie/app/uetstudents/ui/profile/ProfilePresenter;", "Lie/app/uetstudents/ui/profile/ProfileContract$Presenter;", "View", "Lie/app/uetstudents/ui/profile/ProfileContract$View;", "Repository", "Lie/app/uetstudents/Repository/Repository;", "(Lie/app/uetstudents/ui/profile/ProfileContract$View;Lie/app/uetstudents/Repository/Repository;)V", "UpdateUIQuestionProfile", "", "question", "Lie/app/uetstudents/Entity/Question/get/question;", "type_content_id", "", "UpdateUIUserinformation", "userprofile", "Lie/app/uetstudents/Entity/userProfile/get/userprofile;", "getQuestionProfile", "index", "account_id", "getUserInformation", "app_debug"})
public final class ProfilePresenter implements ie.app.uetstudents.ui.profile.ProfileContract.Presenter {
    private final ie.app.uetstudents.ui.profile.ProfileContract.View View = null;
    private final ie.app.uetstudents.Repository.Repository Repository = null;
    
    public ProfilePresenter(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.profile.ProfileContract.View View, @org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Repository.Repository Repository) {
        super();
    }
    
    @java.lang.Override()
    public void getQuestionProfile(int index, int account_id, int type_content_id) {
    }
    
    @java.lang.Override()
    public void UpdateUIQuestionProfile(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.question question, int type_content_id) {
    }
    
    @java.lang.Override()
    public void getUserInformation(int account_id) {
    }
    
    @java.lang.Override()
    public void UpdateUIUserinformation(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.userProfile.get.userprofile userprofile) {
    }
}