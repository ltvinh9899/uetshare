package ie.app.uetstudents.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u00062\u00020\bB\u0005\u00a2\u0006\u0002\u0010\tJ*\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0002J\u0010\u00104\u001a\u00020/2\u0006\u00105\u001a\u000206H\u0016J\u0018\u00107\u001a\u00020/2\u0006\u00105\u001a\u0002062\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020/2\u0006\u00105\u001a\u000206H\u0016J\u001e\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u0002012\u0006\u00102\u001a\u00020\u000bJ\u0018\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020@2\u0006\u0010%\u001a\u00020\u000bH\u0016J\u0010\u0010A\u001a\u00020/2\u0006\u0010B\u001a\u00020CH\u0017J\u000e\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u000201J\u0018\u0010F\u001a\u00020/2\u0006\u0010G\u001a\u00020H2\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010F\u001a\u00020/2\u0006\u0010G\u001a\u000206H\u0016J\u0018\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u0002012\u0006\u0010K\u001a\u000201H\u0016J\u0016\u0010L\u001a\u00020/2\u0006\u0010M\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bJ \u0010N\u001a\u00020/2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000bH\u0002J\"\u0010P\u001a\u00020/2\u0006\u0010Q\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\u000b2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\u0012\u0010U\u001a\u00020/2\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J&\u0010X\u001a\u0004\u0018\u00010\u00172\u0006\u0010Y\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\\2\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\u0018\u0010]\u001a\u00020/2\u0006\u0010^\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u0007H\u0016J\u0018\u0010`\u001a\u00020/2\u0006\u0010^\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u0007H\u0016J\u0010\u0010a\u001a\u00020/2\u0006\u0010b\u001a\u00020cH\u0016J-\u0010d\u001a\u00020/2\u0006\u0010Q\u001a\u00020\u000b2\u000e\u0010e\u001a\n\u0012\u0006\b\u0001\u0012\u0002010f2\u0006\u0010g\u001a\u00020hH\u0016\u00a2\u0006\u0002\u0010iJ\u001a\u0010j\u001a\u00020/2\u0006\u0010k\u001a\u00020\u00172\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\b\u0010l\u001a\u00020/H\u0002J\u0006\u0010m\u001a\u00020/J\u0006\u0010n\u001a\u00020/J&\u0010o\u001a\u00020/2\u0006\u0010p\u001a\u0002012\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010E\u001a\u0002012\u0006\u0010=\u001a\u000201J \u0010q\u001a\u00020/2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u0002012\b\u0010&\u001a\u0004\u0018\u00010\'R\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u000e\u0010!\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006r"}, d2 = {"Lie/app/uetstudents/ui/profile/Profile_Fragment;", "Landroidx/fragment/app/Fragment;", "Lie/app/uetstudents/ui/profile/ProfileContract$View;", "Lie/app/uetstudents/adapter/OnClickItem_UetTalk;", "Lie/app/uetstudents/adapter/ClickItemCommentLike;", "Lie/app/uetstudents/adapter/ClickItem;", "Lie/app/uetstudents/adapter/BaseAdapter$OnclickPdf;", "Lie/app/uetstudents/Entity/Question/get/ImageDto;", "Lie/app/uetstudents/adapter/Clicktext;", "()V", "CAMERA_REQUEST", "", "IMAGE_REQUEST", "MY_REQUEST", "adapter", "Lie/app/uetstudents/adapter/adapter_forum;", "adapterUETTalk", "Lie/app/uetstudents/adapter/AdapterUETTalk;", "adapter_comment_uettalk", "Lie/app/uetstudents/adapter/CommentAdapter;", "bottomSheetDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "bottomSheetView", "Landroid/view/View;", "id_user", "getId_user", "()Ljava/lang/Integer;", "setId_user", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "id_user_other", "getId_user_other", "setId_user_other", "page_comment", "page_uettalk", "presenter_profile", "Lie/app/uetstudents/ui/profile/ProfileContract$Presenter;", "type_content_id", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "uri_updateanh", "view_update_image", "CallApiSubComment", "", "content", "", "id_account", "idComment", "ClickItem_comment", "QuestionDto", "Lie/app/uetstudents/Entity/Question/get/QuestionDtoX;", "ClickItem_like", "liked", "", "ClickItem_uettalk", "PostApiLike", "id_question", "owner_username", "UpdateViewDataQuestionProfile", "question", "Lie/app/uetstudents/Entity/Question/get/question;", "UpdateViewDataUser", "userprofile", "Lie/app/uetstudents/Entity/userProfile/get/userprofile;", "chuyentrangprofile", "username", "clickOnItem", "m", "Lie/app/uetstudents/Entity/Comment/get/CommentDto;", "clicktext", "name_account", "type", "deleteLikeQuestion", "account_id", "getComment", "page", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onItemCLickImage", "position", "item", "onItemClick", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "onclickRequestPermission", "openGallery", "openGallery_comment", "update_notification", "type_action", "xulybtncommemt", "app_debug"})
public final class Profile_Fragment extends androidx.fragment.app.Fragment implements ie.app.uetstudents.ui.profile.ProfileContract.View, ie.app.uetstudents.adapter.OnClickItem_UetTalk, ie.app.uetstudents.adapter.ClickItemCommentLike, ie.app.uetstudents.adapter.ClickItem, ie.app.uetstudents.adapter.BaseAdapter.OnclickPdf<ie.app.uetstudents.Entity.Question.get.ImageDto>, ie.app.uetstudents.adapter.Clicktext {
    private final int IMAGE_REQUEST = 121;
    private final int MY_REQUEST = 140;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer id_user;
    private ie.app.uetstudents.ui.profile.ProfileContract.Presenter presenter_profile;
    private ie.app.uetstudents.adapter.AdapterUETTalk adapterUETTalk;
    private ie.app.uetstudents.adapter.adapter_forum adapter;
    private final int CAMERA_REQUEST = 222;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri uri;
    private com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog;
    private ie.app.uetstudents.adapter.CommentAdapter adapter_comment_uettalk;
    private android.view.View bottomSheetView;
    private int page_comment = 1;
    private int page_uettalk = 1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer id_user_other;
    private int type_content_id = 2;
    private android.view.View view_update_image;
    private android.net.Uri uri_updateanh;
    private java.util.HashMap _$_findViewCache;
    
    public Profile_Fragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId_user() {
        return null;
    }
    
    public final void setId_user(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getUri() {
        return null;
    }
    
    public final void setUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId_user_other() {
        return null;
    }
    
    public final void setId_user_other(@org.jetbrains.annotations.Nullable()
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
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void UpdateViewDataQuestionProfile(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.question question, int type_content_id) {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @java.lang.Override()
    public void UpdateViewDataUser(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.userProfile.get.userprofile userprofile) {
    }
    
    @java.lang.Override()
    public void ClickItem_like(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.QuestionDtoX QuestionDto, boolean liked) {
    }
    
    @java.lang.Override()
    public void ClickItem_comment(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.QuestionDtoX QuestionDto) {
    }
    
    private final void CallApiSubComment(java.lang.String content, int id_account, int idComment, android.net.Uri uri) {
    }
    
    public final void openGallery() {
    }
    
    public final void openGallery_comment() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void getComment(int id_question, int page, int id_account) {
    }
    
    @java.lang.Override()
    public void ClickItem_uettalk(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.QuestionDtoX QuestionDto) {
    }
    
    public final void PostApiLike(int id_question, @org.jetbrains.annotations.NotNull()
    java.lang.String owner_username, int id_account) {
    }
    
    public final void deleteLikeQuestion(int account_id, int id_question) {
    }
    
    public final void update_notification(@org.jetbrains.annotations.NotNull()
    java.lang.String type_action, int id_question, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String owner_username) {
    }
    
    @java.lang.Override()
    public void clickOnItem(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Comment.get.CommentDto m, boolean liked) {
    }
    
    public final void xulybtncommemt(int id_question, @org.jetbrains.annotations.NotNull()
    java.lang.String owner_username, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
    
    @java.lang.Override()
    public void clickOnItem(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.QuestionDtoX m) {
    }
    
    @java.lang.Override()
    public void onItemClick(int position, @org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.ImageDto item) {
    }
    
    private final void onclickRequestPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void clicktext(@org.jetbrains.annotations.NotNull()
    java.lang.String name_account, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public final void chuyentrangprofile(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    @java.lang.Override()
    public void onItemCLickImage(int position, @org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.ImageDto item) {
    }
}