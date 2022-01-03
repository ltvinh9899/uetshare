package ie.app.uetstudents.Repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ&\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ&\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ\u001e\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ&\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ&\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eJ\u001e\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eJ\u001e\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eJ\u001e\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"J.\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020\b2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020/J\u0016\u00100\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u000eJ\u001e\u00102\u001a\u00020\b2\u0006\u0010\t\u001a\u0002032\u0006\u00104\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ\u0016\u00105\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000eJ&\u00106\u001a\u00020\b2\u0006\u0010\t\u001a\u0002072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ\u001e\u00108\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\f2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020;J\u000e\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020>J\u000e\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020AJ\u000e\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020DR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006E"}, d2 = {"Lie/app/uetstudents/Repository/Repository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "CallCategorys", "", "presenter", "Lie/app/uetstudents/ui/diendan/category/CategoryContract$Presenter;", "CallCommentQuestion", "Lie/app/uetstudents/ui/detailForum/DetailForumContract$Presenter;", "id", "", "index", "account_id", "CallItemQuestion", "Lie/app/uetstudents/ui/diendan/forum_main/forumContract$Presenter;", "id_type_content", "CallQuestionDetail", "CallQuestions_Category", "id_category", "GetQuestion_accountid", "Lie/app/uetstudents/ui/profile/ProfileContract$Presenter;", "type_content_id", "callNotificationComment", "Lie/app/uetstudents/ui/notifications/notification_Contract$Presenter;", "id_account", "page", "callNotificationQuestion", "callPersonSearch", "Lie/app/uetstudents/ui/timkiem/SearchContract$Presenter;", "text", "", "callQuestionSearch", "change_email_user", "emailRequest", "Lie/app/uetstudents/Entity/userProfile/post/email/request/email_request;", "change_khoa_user", "khoaRequest", "Lie/app/uetstudents/Entity/userProfile/post/khoa/request/khoa_request;", "change_mssv_user", "mssvRequest", "Lie/app/uetstudents/Entity/userProfile/post/mssv/request/mssv_request;", "change_password", "put_password", "Lie/app/uetstudents/Entity/Account/Put/request/password_put;", "deletelike_comment", "id_comment", "getDetaiNotifiUet", "Lie/app/uetstudents/ui/thongbao/detail/DetailContract$Presenter;", "id_question", "getInformationAccount", "getNotificationUet", "Lie/app/uetstudents/ui/thongbao/NotificationUetContract$Presenter;", "getPersons_LikeQuestion", "putSeenNotifi_comment", "commentIdPut", "Lie/app/uetstudents/Entity/notifications_comment/put/request/comment_id_put;", "putseenNotifiQuestion", "questionIdPut", "Lie/app/uetstudents/Entity/notifications_question/put/request/question_id_put;", "updateNotifi_Comment", "postnotifi_comment", "Lie/app/uetstudents/Entity/notifications_comment/post/post_notifi_comment;", "updateNotifi_Question", "notifi_item", "Lie/app/uetstudents/Entity/notifications_question/post/notification_question_post;", "app_debug"})
public final class Repository {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public Repository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void CallItemQuestion(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.diendan.forum_main.forumContract.Presenter presenter, int id_type_content, int index, int account_id) {
    }
    
    public final void CallCategorys(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.diendan.category.CategoryContract.Presenter presenter) {
    }
    
    public final void CallQuestions_Category(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.diendan.forum_main.forumContract.Presenter presenter, int id_category, int index, int account_id) {
    }
    
    public final void CallQuestionDetail(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.detailForum.DetailForumContract.Presenter presenter, int id, int account_id) {
    }
    
    public final void CallCommentQuestion(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.detailForum.DetailForumContract.Presenter presenter, int id, int index, int account_id) {
    }
    
    public final void callNotificationQuestion(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.notifications.notification_Contract.Presenter presenter, int id_account, int page) {
    }
    
    public final void putseenNotifiQuestion(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.notifications_question.put.request.question_id_put questionIdPut) {
    }
    
    public final void callNotificationComment(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.notifications.notification_Contract.Presenter presenter, int id_account, int page) {
    }
    
    public final void putSeenNotifi_comment(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.notifications_comment.put.request.comment_id_put commentIdPut) {
    }
    
    public final void callPersonSearch(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.timkiem.SearchContract.Presenter presenter, int page, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void callQuestionSearch(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.timkiem.SearchContract.Presenter presenter, int page, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int type_content_id, int account_id) {
    }
    
    public final void updateNotifi_Question(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.notifications_question.post.notification_question_post notifi_item) {
    }
    
    public final void updateNotifi_Comment(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.notifications_comment.post.post_notifi_comment postnotifi_comment) {
    }
    
    public final void getPersons_LikeQuestion(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.detailForum.DetailForumContract.Presenter presenter, int id_question, int page) {
    }
    
    public final void GetQuestion_accountid(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.profile.ProfileContract.Presenter presenter, int index, int account_id, int type_content_id) {
    }
    
    public final void getInformationAccount(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.profile.ProfileContract.Presenter presenter, int account_id) {
    }
    
    public final void getNotificationUet(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.thongbao.NotificationUetContract.Presenter presenter, int index, int type_content_id, int account_id) {
    }
    
    public final void getDetaiNotifiUet(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.thongbao.detail.DetailContract.Presenter presenter, int id_question, int account_id) {
    }
    
    public final void change_email_user(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.userProfile.post.email.request.email_request emailRequest) {
    }
    
    public final void change_khoa_user(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.userProfile.post.khoa.request.khoa_request khoaRequest) {
    }
    
    public final void change_mssv_user(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.userProfile.post.mssv.request.mssv_request mssvRequest) {
    }
    
    public final void change_password(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Account.Put.request.password_put put_password) {
    }
    
    public final void deletelike_comment(int id_account, int id_comment) {
    }
}