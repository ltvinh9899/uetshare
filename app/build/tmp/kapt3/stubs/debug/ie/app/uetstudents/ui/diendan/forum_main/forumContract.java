package ie.app.uetstudents.ui.diendan.forum_main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lie/app/uetstudents/ui/diendan/forum_main/forumContract;", "", "Presenter", "View", "app_debug"})
public abstract interface forumContract {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lie/app/uetstudents/ui/diendan/forum_main/forumContract$View;", "", "updateViewData", "", "data", "Lie/app/uetstudents/Entity/Question/get/question;", "app_debug"})
    public static abstract interface View {
        
        public abstract void updateViewData(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Question.get.question data);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lie/app/uetstudents/ui/diendan/forum_main/forumContract$Presenter;", "", "getQuestions", "", "id_type_content", "", "index", "account_id", "getQuestions_of_Category", "id_category", "updateUI", "data", "Lie/app/uetstudents/Entity/Question/get/question;", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getQuestions(int id_type_content, int index, int account_id);
        
        public abstract void updateUI(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Question.get.question data);
        
        public abstract void getQuestions_of_Category(int id_category, int index, int account_id);
    }
}