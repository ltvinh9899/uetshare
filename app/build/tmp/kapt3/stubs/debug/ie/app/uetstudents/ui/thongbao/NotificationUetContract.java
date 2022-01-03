package ie.app.uetstudents.ui.thongbao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lie/app/uetstudents/ui/thongbao/NotificationUetContract;", "", "Presenter", "View", "app_debug"})
public abstract interface NotificationUetContract {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lie/app/uetstudents/ui/thongbao/NotificationUetContract$View;", "", "UpdateDataViewItem", "", "question", "Lie/app/uetstudents/Entity/Question/get/question;", "app_debug"})
    public static abstract interface View {
        
        public abstract void UpdateDataViewItem(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Question.get.question question);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&\u00a8\u0006\u000b"}, d2 = {"Lie/app/uetstudents/ui/thongbao/NotificationUetContract$Presenter;", "", "UpdateUIItem", "", "question", "Lie/app/uetstudents/Entity/Question/get/question;", "getQuestionList", "index", "", "type_content_id", "account_id", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getQuestionList(int index, int type_content_id, int account_id);
        
        public abstract void UpdateUIItem(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Question.get.question question);
    }
}