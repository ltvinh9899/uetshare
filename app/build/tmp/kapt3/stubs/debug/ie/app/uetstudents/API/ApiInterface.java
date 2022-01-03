package ie.app.uetstudents.API;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u000eH\'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\'J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0016\u001a\u00020\u0012H\'J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003H\'J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u00122\b\b\u0001\u0010\u001c\u001a\u00020\u0012H\'J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u001f\u001a\u00020\u00122\b\b\u0001\u0010 \u001a\u00020!2\b\b\u0001\u0010\u001b\u001a\u00020\u0012H\'J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u001c\u001a\u00020\u0012H\'J\"\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u0012H\'J\"\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u0012H\'J\"\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u00122\b\b\u0001\u0010*\u001a\u00020!H\'J\"\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u0012H\'J\"\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u0012H\'J\"\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u0012H\'J6\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u00122\b\b\u0001\u0010*\u001a\u00020!2\b\b\u0001\u00102\u001a\u00020\u00122\b\b\u0001\u0010\u001c\u001a\u00020\u0012H\'J,\u00103\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u00104\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u00122\b\b\u0001\u0010\u001c\u001a\u00020\u0012H\'J,\u00105\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u00122\b\b\u0001\u00106\u001a\u00020\u0012H\'J6\u00107\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u00122\b\b\u0001\u00106\u001a\u00020\u00122\b\b\u0001\u00102\u001a\u00020\u0012H\'J\"\u00108\u001a\b\u0012\u0004\u0012\u0002090\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u001c\u001a\u00020\u0012H\'J,\u0010:\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010;\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u00122\b\b\u0001\u0010\u001c\u001a\u00020\u0012H\'J\"\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u0012H\'J\"\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00032\b\b\u0001\u00104\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u0012H\'J\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00032\b\b\u0001\u0010B\u001a\u00020\u0012H\'J\u0018\u0010C\u001a\b\u0012\u0004\u0012\u00020A0\u00032\b\b\u0001\u0010B\u001a\u00020\u0012H\'J\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u00032\b\b\u0001\u0010F\u001a\u00020\u0012H\'J\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u00032\b\b\u0001\u0010G\u001a\u00020!H\'J\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020=0\u00032\b\b\u0001\u0010I\u001a\u00020JH\'J\u0018\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010L\u001a\u00020\u0015H\'J\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u00032\b\b\u0001\u0010O\u001a\u00020PH\'J\u0018\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00032\b\b\u0001\u0010S\u001a\u00020TH\'J\u0018\u0010U\u001a\b\u0012\u0004\u0012\u00020A0\u00032\b\b\u0001\u0010\t\u001a\u00020VH\'J\u0018\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010I\u001a\u00020JH\'J\u0018\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\u00032\b\b\u0001\u0010Z\u001a\u00020YH\'J\u0018\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0\u00032\b\b\u0001\u0010]\u001a\u00020\\H\'J\u0018\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u00032\b\b\u0001\u0010`\u001a\u00020_H\'J\u0018\u0010a\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010I\u001a\u00020JH\'J\u0018\u0010b\u001a\b\u0012\u0004\u0012\u00020c0\u00032\b\b\u0001\u0010I\u001a\u00020JH\'J\u0018\u0010d\u001a\b\u0012\u0004\u0012\u00020e0\u00032\b\b\u0001\u0010f\u001a\u00020gH\'J\u0018\u0010h\u001a\b\u0012\u0004\u0012\u00020e0\u00032\b\b\u0001\u0010i\u001a\u00020jH\'J\u0018\u0010k\u001a\b\u0012\u0004\u0012\u00020e0\u00032\b\b\u0001\u0010l\u001a\u00020mH\'\u00a8\u0006n"}, d2 = {"Lie/app/uetstudents/API/ApiInterface;", "", "CallsetAccount", "Lretrofit2/Call;", "Lie/app/uetstudents/Entity/Account/Get/dangky/dangky_account;", "Account", "Lie/app/uetstudents/Entity/Account/Post/account;", "callSigninAccount", "Lie/app/uetstudents/data/response/login/LoginResponse;", "request", "Lie/app/uetstudents/data/request/LoginRequest;", "change_password", "Lie/app/uetstudents/Entity/Account/Put/response/password_response;", "put_password", "Lie/app/uetstudents/Entity/Account/Put/request/password_put;", "deletelikeComment", "Lie/app/uetstudents/Entity/like/disLike/dislike_comment;", "id_account", "", "id_comment", "deletelikeQueston", "Lie/app/uetstudents/Entity/like_question/post/like_question;", "id_question", "getCategory", "Lie/app/uetstudents/Entity/Category/category;", "getCommentQuestion", "Lie/app/uetstudents/Entity/Comment/get/Comment;", "index", "account_id", "getDataSubjectforid", "Lie/app/uetstudents/Entity/subject/DataSubject/data_subject;", "id_subject", "type", "", "getDetailQuestion", "Lie/app/uetstudents/Entity/Question/get/question;", "getNotification_comment_account", "Lie/app/uetstudents/Entity/notifications_comment/get/get_notifi_comment;", "getNotification_question_account", "Lie/app/uetstudents/Entity/notifications_question/get/notification_question;", "getPerSonSearch", "Lie/app/uetstudents/Entity/Search/person/person;", "text", "getPersonLikeComment", "Lie/app/uetstudents/Entity/like/Get/like_comment_get;", "getPersonLikeQuestion", "Lie/app/uetstudents/Entity/like_question/get/like_question;", "getPersonsLikeComment", "getQuestionSearch", "Lie/app/uetstudents/Entity/Search/Question/search_question;", "type_content_id", "getQuestion_of_Category", "id_category", "getQuestion_of_account", "accountid", "getQuestion_of_account_type_content", "getQuestion_of_comment", "Lie/app/uetstudents/Entity/Question/get/QuestionX;", "getQuestions", "id_type_content", "getSubComment", "Lie/app/uetstudents/Entity/subcomment/get/getsubcomment;", "getSubject_category", "Lie/app/uetstudents/Entity/subject/subject;", "getUnreadComment", "Lie/app/uetstudents/data/response/Response;", "id", "getUnreadQuestion", "getUserProfile", "Lie/app/uetstudents/Entity/userProfile/get/userprofile;", "id_user", "username", "postSubcomment", "body", "Lokhttp3/RequestBody;", "postlikequestion", "likeQuestion", "putseenNotifi", "Lie/app/uetstudents/Entity/notifications_question/put/respont/question_notifi_put;", "question_id", "Lie/app/uetstudents/Entity/notifications_question/put/request/question_id_put;", "putseenNotifi_comment", "Lie/app/uetstudents/Entity/notifications_comment/put/response/comment_notifi_put;", "comment_id_put", "Lie/app/uetstudents/Entity/notifications_comment/put/request/comment_id_put;", "registerFirebaseToken", "Lie/app/uetstudents/data/request/RegisterFirebaseTokenRequest;", "setCommentQuestion", "setLikeComment", "Lie/app/uetstudents/Entity/like/Post/like_comment;", "likeComment", "setNotification_comment", "Lie/app/uetstudents/Entity/notifications_comment/post/post_notifi_comment;", "postnotifi_comment", "setNotification_question", "Lie/app/uetstudents/Entity/notifications_question/post/notification_question_post;", "notificationQuestionPost", "setQuestion", "update_image_profile", "Lie/app/uetstudents/Entity/userProfile/post/avatar/avatar;", "update_user_email", "Lie/app/uetstudents/Entity/userProfile/post/response/update_user_response;", "emailRequest", "Lie/app/uetstudents/Entity/userProfile/post/email/request/email_request;", "update_user_khoa", "khoaRequest", "Lie/app/uetstudents/Entity/userProfile/post/khoa/request/khoa_request;", "update_user_mssv", "mssvRequest", "Lie/app/uetstudents/Entity/userProfile/post/mssv/request/mssv_request;", "app_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "question/type-content/{id_type_content}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.Question.get.question> getQuestions(@retrofit2.http.Path(value = "id_type_content")
    int id_type_content, @retrofit2.http.Query(value = "index")
    int index, @retrofit2.http.Query(value = "account_id")
    int account_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "category")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.Category.category> getCategory();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "question/category/{id_category}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.Question.get.question> getQuestion_of_Category(@retrofit2.http.Path(value = "id_category")
    int id_category, @retrofit2.http.Query(value = "index")
    int index, @retrofit2.http.Query(value = "account_id")
    int account_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "question/create")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.Question.get.question> setQuestion(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "question/id/{id_question}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.Question.get.question> getDetailQuestion(@retrofit2.http.Path(value = "id_question")
    int id_question, @retrofit2.http.Query(value = "account_id")
    int account_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "comment/question/{id_question}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.Comment.get.Comment> getCommentQuestion(@retrofit2.http.Path(value = "id_question")
    int id_question, @retrofit2.http.Query(value = "index")
    int index, @retrofit2.http.Query(value = "account_id")
    int account_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "comment/create")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.Comment.get.Comment> setCommentQuestion(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "react-icon-comment/create")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.like.Post.like_comment> setLikeComment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ie.app.uetstudents.Entity.like.Post.like_comment likeComment);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "react-icon/comment/{id_comment}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.like.Get.like_comment_get> getPersonsLikeComment(@retrofit2.http.Path(value = "id_comment")
    int id_comment, @retrofit2.http.Query(value = "index")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "react-icon-question/create")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.like_question.post.like_question> postlikequestion(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ie.app.uetstudents.Entity.like_question.post.like_question likeQuestion);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "react-icon-question/account/{id_account}/question/{id_question}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.like_question.post.like_question> deletelikeQueston(@retrofit2.http.Path(value = "id_account")
    int id_account, @retrofit2.http.Path(value = "id_question")
    int id_question);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "react-icon-comment/account/{id_account}/comment/{id_comment}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.like.disLike.dislike_comment> deletelikeComment(@retrofit2.http.Path(value = "id_account")
    int id_account, @retrofit2.http.Path(value = "id_comment")
    int id_comment);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "register")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.Account.Get.dangky.dangky_account> CallsetAccount(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ie.app.uetstudents.Entity.Account.Post.account Account);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "login")
    public abstract retrofit2.Call<ie.app.uetstudents.data.response.login.LoginResponse> callSigninAccount(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ie.app.uetstudents.data.request.LoginRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "question/search")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.Search.Question.search_question> getQuestionSearch(@retrofit2.http.Query(value = "index")
    int index, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "text")
    java.lang.String text, @retrofit2.http.Query(value = "type_content_id")
    int type_content_id, @retrofit2.http.Query(value = "account_id")
    int account_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "account/search")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.Search.person.person> getPerSonSearch(@retrofit2.http.Query(value = "index")
    int index, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "text")
    java.lang.String text);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "question/account/{account_id}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.Question.get.question> getQuestion_of_account(@retrofit2.http.Path(value = "account_id")
    int account_id, @retrofit2.http.Query(value = "index")
    int index, @retrofit2.http.Query(value = "account_id")
    int accountid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "question/account/{account_id}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.Question.get.question> getQuestion_of_account_type_content(@retrofit2.http.Path(value = "account_id")
    int account_id, @retrofit2.http.Query(value = "index")
    int index, @retrofit2.http.Query(value = "account_id")
    int accountid, @retrofit2.http.Query(value = "type_content_id")
    int type_content_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "notification-comment/author-account/{account_id}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.notifications_comment.get.get_notifi_comment> getNotification_comment_account(@retrofit2.http.Path(value = "account_id")
    int account_id, @retrofit2.http.Query(value = "index")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "notification-question/author-account/{account_id}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.notifications_question.get.notification_question> getNotification_question_account(@retrofit2.http.Path(value = "account_id")
    int account_id, @retrofit2.http.Query(value = "index")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "notification-question/create")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.notifications_question.post.notification_question_post> setNotification_question(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ie.app.uetstudents.Entity.notifications_question.post.notification_question_post notificationQuestionPost);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "notification-comment/create")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.notifications_comment.post.post_notifi_comment> setNotification_comment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ie.app.uetstudents.Entity.notifications_comment.post.post_notifi_comment postnotifi_comment);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "notification-question/seen")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.notifications_question.put.respont.question_notifi_put> putseenNotifi(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ie.app.uetstudents.Entity.notifications_question.put.request.question_id_put question_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "notification-comment/seen")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.notifications_comment.put.response.comment_notifi_put> putseenNotifi_comment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ie.app.uetstudents.Entity.notifications_comment.put.request.comment_id_put comment_id_put);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "react-icon-comment/comment/{id_comment}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.like.Get.like_comment_get> getPersonLikeComment(@retrofit2.http.Path(value = "id_comment")
    int id_comment, @retrofit2.http.Query(value = "index")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "react-icon-question/question/{id_question}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.like_question.get.like_question> getPersonLikeQuestion(@retrofit2.http.Path(value = "id_question")
    int id_question, @retrofit2.http.Query(value = "index")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "subject/category/{id_category}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.subject.subject> getSubject_category(@retrofit2.http.Path(value = "id_category")
    int id_category, @retrofit2.http.Query(value = "index")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "exam-document/subject/{id_subject}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.subject.DataSubject.data_subject> getDataSubjectforid(@retrofit2.http.Path(value = "id_subject")
    int id_subject, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type, @retrofit2.http.Query(value = "index")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "question/comment/{id_comment}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.Question.get.QuestionX> getQuestion_of_comment(@retrofit2.http.Path(value = "id_comment")
    int id_comment, @retrofit2.http.Query(value = "account_id")
    int account_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "register_firebase_token")
    public abstract retrofit2.Call<ie.app.uetstudents.data.response.Response> registerFirebaseToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ie.app.uetstudents.data.request.RegisterFirebaseTokenRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "notification-question/author-account/{userId}/unseen?index=1")
    public abstract retrofit2.Call<ie.app.uetstudents.data.response.Response> getUnreadQuestion(@retrofit2.http.Path(value = "userId")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "notification-comment/author-account/{userId}/unseen?index=1")
    public abstract retrofit2.Call<ie.app.uetstudents.data.response.Response> getUnreadComment(@retrofit2.http.Path(value = "userId")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "user-profile/get/{id_user}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.userProfile.get.userprofile> getUserProfile(@retrofit2.http.Path(value = "id_user")
    int id_user);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "change-password")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.Account.Put.response.password_response> change_password(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ie.app.uetstudents.Entity.Account.Put.request.password_put put_password);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user-profile/update")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.userProfile.post.response.update_user_response> update_user_email(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ie.app.uetstudents.Entity.userProfile.post.email.request.email_request emailRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user-profile/update")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.userProfile.post.response.update_user_response> update_user_khoa(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ie.app.uetstudents.Entity.userProfile.post.khoa.request.khoa_request khoaRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user-profile/update")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.userProfile.post.response.update_user_response> update_user_mssv(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ie.app.uetstudents.Entity.userProfile.post.mssv.request.mssv_request mssvRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user-profile/update-avatar")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.userProfile.post.avatar.avatar> update_image_profile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "sub-comment/comment/{id_comment}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.subcomment.get.getsubcomment> getSubComment(@retrofit2.http.Path(value = "id_comment")
    int id_comment, @retrofit2.http.Query(value = "index")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "sub-comment/create")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.subcomment.get.getsubcomment> postSubcomment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "user-profile/get/username/{username}")
    public abstract retrofit2.Call<ie.app.uetstudents.Entity.userProfile.get.userprofile> getUserProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username);
}