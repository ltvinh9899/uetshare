package ie.app.uetstudents.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lie/app/uetstudents/ui/profile/ProfileContract;", "", "Presenter", "View", "app_debug"})
public abstract interface ProfileContract {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lie/app/uetstudents/ui/profile/ProfileContract$View;", "", "UpdateViewDataQuestionProfile", "", "question", "Lie/app/uetstudents/Entity/Question/get/question;", "type_content_id", "", "UpdateViewDataUser", "userprofile", "Lie/app/uetstudents/Entity/userProfile/get/userprofile;", "app_debug"})
    public static abstract interface View {
        
        public abstract void UpdateViewDataQuestionProfile(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Question.get.question question, int type_content_id);
        
        public abstract void UpdateViewDataUser(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.userProfile.get.userprofile userprofile);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0007H&\u00a8\u0006\u000f"}, d2 = {"Lie/app/uetstudents/ui/profile/ProfileContract$Presenter;", "", "UpdateUIQuestionProfile", "", "question", "Lie/app/uetstudents/Entity/Question/get/question;", "type_content_id", "", "UpdateUIUserinformation", "userprofile", "Lie/app/uetstudents/Entity/userProfile/get/userprofile;", "getQuestionProfile", "index", "account_id", "getUserInformation", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getQuestionProfile(int index, int account_id, int type_content_id);
        
        public abstract void UpdateUIQuestionProfile(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Question.get.question question, int type_content_id);
        
        public abstract void getUserInformation(int account_id);
        
        public abstract void UpdateUIUserinformation(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.userProfile.get.userprofile userprofile);
    }
}