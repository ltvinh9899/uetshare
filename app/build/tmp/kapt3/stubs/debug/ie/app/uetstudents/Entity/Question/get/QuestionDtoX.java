package ie.app.uetstudents.Entity.Question.get;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0013H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0089\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u00c6\u0001J\u0013\u00105\u001a\u00020\u00132\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u00020\u0003H\u00d6\u0001J\t\u00108\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0018\u00a8\u00069"}, d2 = {"Lie/app/uetstudents/Entity/Question/get/QuestionDtoX;", "", "account_id", "", "category_id", "content", "", "id", "imageDtoList", "", "Lie/app/uetstudents/Entity/Question/get/ImageDto;", "time", "title", "type_content_id", "accountDto", "Lie/app/uetstudents/data/response/AccountDto;", "like_quantity", "comment_quantity", "liked", "", "(IILjava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;ILie/app/uetstudents/data/response/AccountDto;IIZ)V", "getAccountDto", "()Lie/app/uetstudents/data/response/AccountDto;", "getAccount_id", "()I", "getCategory_id", "getComment_quantity", "getContent", "()Ljava/lang/String;", "getId", "getImageDtoList", "()Ljava/util/List;", "getLike_quantity", "getLiked", "()Z", "setLiked", "(Z)V", "getTime", "getTitle", "getType_content_id", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class QuestionDtoX {
    private final int account_id = 0;
    private final int category_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String content = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ie.app.uetstudents.Entity.Question.get.ImageDto> imageDtoList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String time = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    private final int type_content_id = 0;
    @org.jetbrains.annotations.Nullable()
    private final ie.app.uetstudents.data.response.AccountDto accountDto = null;
    private final int like_quantity = 0;
    private final int comment_quantity = 0;
    private boolean liked;
    
    @org.jetbrains.annotations.NotNull()
    public final ie.app.uetstudents.Entity.Question.get.QuestionDtoX copy(int account_id, int category_id, @org.jetbrains.annotations.NotNull()
    java.lang.String content, int id, @org.jetbrains.annotations.NotNull()
    java.util.List<ie.app.uetstudents.Entity.Question.get.ImageDto> imageDtoList, @org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int type_content_id, @org.jetbrains.annotations.Nullable()
    ie.app.uetstudents.data.response.AccountDto accountDto, int like_quantity, int comment_quantity, boolean liked) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public QuestionDtoX(int account_id, int category_id, @org.jetbrains.annotations.NotNull()
    java.lang.String content, int id, @org.jetbrains.annotations.NotNull()
    java.util.List<ie.app.uetstudents.Entity.Question.get.ImageDto> imageDtoList, @org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int type_content_id, @org.jetbrains.annotations.Nullable()
    ie.app.uetstudents.data.response.AccountDto accountDto, int like_quantity, int comment_quantity, boolean liked) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getAccount_id() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getCategory_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContent() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ie.app.uetstudents.Entity.Question.get.ImageDto> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ie.app.uetstudents.Entity.Question.get.ImageDto> getImageDtoList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getType_content_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ie.app.uetstudents.data.response.AccountDto component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ie.app.uetstudents.data.response.AccountDto getAccountDto() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getLike_quantity() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getComment_quantity() {
        return 0;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean getLiked() {
        return false;
    }
    
    public final void setLiked(boolean p0) {
    }
}