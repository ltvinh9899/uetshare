package ie.app.uetstudents.ui.detailForum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lie/app/uetstudents/ui/detailForum/DetailForumContract;", "", "Presenter", "View", "app_debug"})
public abstract interface DetailForumContract {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lie/app/uetstudents/ui/detailForum/DetailForumContract$View;", "", "getDataView", "", "data", "Lie/app/uetstudents/Entity/Question/get/QuestionDtoX;", "getDataViewComment", "datacomment", "Lie/app/uetstudents/Entity/Comment/get/Comment;", "app_debug"})
    public static abstract interface View {
        
        public abstract void getDataView(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Question.get.QuestionDtoX data);
        
        public abstract void getDataViewComment(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Comment.get.Comment datacomment);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&\u00a8\u0006\u0015"}, d2 = {"Lie/app/uetstudents/ui/detailForum/DetailForumContract$Presenter;", "", "getDataUI", "", "data", "Lie/app/uetstudents/Entity/Question/get/QuestionDtoX;", "getDataUIComment", "datacomment", "Lie/app/uetstudents/Entity/Comment/get/Comment;", "getDetailComment", "id", "", "index", "account_id", "getDetailForum", "setNotificationComment", "notifi_comment", "Lie/app/uetstudents/Entity/notifications_comment/post/post_notifi_comment;", "setNotificationQuestion", "notifi_item", "Lie/app/uetstudents/Entity/notifications_question/post/notification_question_post;", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getDetailForum(int id, int account_id);
        
        public abstract void getDataUI(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Question.get.QuestionDtoX data);
        
        public abstract void getDataUIComment(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Comment.get.Comment datacomment);
        
        public abstract void getDetailComment(int id, int index, int account_id);
        
        public abstract void setNotificationQuestion(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.notifications_question.post.notification_question_post notifi_item);
        
        public abstract void setNotificationComment(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.notifications_comment.post.post_notifi_comment notifi_comment);
    }
}