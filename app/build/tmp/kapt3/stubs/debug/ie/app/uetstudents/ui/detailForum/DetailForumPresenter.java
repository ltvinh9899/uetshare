package ie.app.uetstudents.ui.detailForum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lie/app/uetstudents/ui/detailForum/DetailForumPresenter;", "Lie/app/uetstudents/ui/detailForum/DetailForumContract$Presenter;", "View", "Lie/app/uetstudents/ui/detailForum/DetailForumContract$View;", "repository", "Lie/app/uetstudents/Repository/Repository;", "(Lie/app/uetstudents/ui/detailForum/DetailForumContract$View;Lie/app/uetstudents/Repository/Repository;)V", "getDataUI", "", "data", "Lie/app/uetstudents/Entity/Question/get/QuestionDtoX;", "getDataUIComment", "datacomment", "Lie/app/uetstudents/Entity/Comment/get/Comment;", "getDetailComment", "id", "", "index", "account_id", "getDetailForum", "setNotificationComment", "notifi_comment", "Lie/app/uetstudents/Entity/notifications_comment/post/post_notifi_comment;", "setNotificationQuestion", "notifi_item", "Lie/app/uetstudents/Entity/notifications_question/post/notification_question_post;", "app_debug"})
public final class DetailForumPresenter implements ie.app.uetstudents.ui.detailForum.DetailForumContract.Presenter {
    private final ie.app.uetstudents.ui.detailForum.DetailForumContract.View View = null;
    private final ie.app.uetstudents.Repository.Repository repository = null;
    
    public DetailForumPresenter(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.detailForum.DetailForumContract.View View, @org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Repository.Repository repository) {
        super();
    }
    
    @java.lang.Override()
    public void getDetailForum(int id, int account_id) {
    }
    
    @java.lang.Override()
    public void getDataUI(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.QuestionDtoX data) {
    }
    
    @java.lang.Override()
    public void getDataUIComment(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Comment.get.Comment datacomment) {
    }
    
    @java.lang.Override()
    public void getDetailComment(int id, int index, int account_id) {
    }
    
    @java.lang.Override()
    public void setNotificationQuestion(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.notifications_question.post.notification_question_post notifi_item) {
    }
    
    @java.lang.Override()
    public void setNotificationComment(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.notifications_comment.post.post_notifi_comment notifi_comment) {
    }
}