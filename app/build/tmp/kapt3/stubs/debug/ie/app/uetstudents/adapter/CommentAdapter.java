package ie.app.uetstudents.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eJ\b\u0010*\u001a\u00020(H\u0016J\u000e\u0010+\u001a\u00020%2\u0006\u0010+\u001a\u00020\u0013J\u0018\u0010,\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010-\u001a\u00020(H\u0017J\u0018\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020(H\u0016J\u001e\u00102\u001a\u00020%2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u00065"}, d2 = {"Lie/app/uetstudents/adapter/CommentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lie/app/uetstudents/adapter/CommentAdapter$ViewHolder;", "clickItem", "Lie/app/uetstudents/adapter/ClickItemCommentLike;", "clicktext", "Lie/app/uetstudents/adapter/Clicktext;", "(Lie/app/uetstudents/adapter/ClickItemCommentLike;Lie/app/uetstudents/adapter/Clicktext;)V", "adapter_subcomment", "Lie/app/uetstudents/adapter/SubCommentAdapter;", "getAdapter_subcomment", "()Lie/app/uetstudents/adapter/SubCommentAdapter;", "setAdapter_subcomment", "(Lie/app/uetstudents/adapter/SubCommentAdapter;)V", "getClickItem", "()Lie/app/uetstudents/adapter/ClickItemCommentLike;", "setClickItem", "(Lie/app/uetstudents/adapter/ClickItemCommentLike;)V", "click_phanhoi", "Lie/app/uetstudents/adapter/truyen_name_account;", "getClick_phanhoi", "()Lie/app/uetstudents/adapter/truyen_name_account;", "setClick_phanhoi", "(Lie/app/uetstudents/adapter/truyen_name_account;)V", "getClicktext", "()Lie/app/uetstudents/adapter/Clicktext;", "setClicktext", "(Lie/app/uetstudents/adapter/Clicktext;)V", "dataList", "Ljava/util/ArrayList;", "Lie/app/uetstudents/Entity/Comment/get/CommentDto;", "Lkotlin/collections/ArrayList;", "getDataList", "()Ljava/util/ArrayList;", "setDataList", "(Ljava/util/ArrayList;)V", "callsubcomment", "", "holder", "page", "", "dataModel", "getItemCount", "listener", "onBindViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "ViewHolder", "app_debug"})
public final class CommentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ie.app.uetstudents.adapter.CommentAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private ie.app.uetstudents.adapter.ClickItemCommentLike clickItem;
    @org.jetbrains.annotations.NotNull()
    private ie.app.uetstudents.adapter.Clicktext clicktext;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<ie.app.uetstudents.Entity.Comment.get.CommentDto> dataList;
    @org.jetbrains.annotations.Nullable()
    private ie.app.uetstudents.adapter.truyen_name_account click_phanhoi;
    @org.jetbrains.annotations.Nullable()
    private ie.app.uetstudents.adapter.SubCommentAdapter adapter_subcomment;
    
    public CommentAdapter(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.ClickItemCommentLike clickItem, @org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.Clicktext clicktext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ie.app.uetstudents.adapter.ClickItemCommentLike getClickItem() {
        return null;
    }
    
    public final void setClickItem(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.ClickItemCommentLike p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ie.app.uetstudents.adapter.Clicktext getClicktext() {
        return null;
    }
    
    public final void setClicktext(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.Clicktext p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<ie.app.uetstudents.Entity.Comment.get.CommentDto> getDataList() {
        return null;
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<ie.app.uetstudents.Entity.Comment.get.CommentDto> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ie.app.uetstudents.adapter.truyen_name_account getClick_phanhoi() {
        return null;
    }
    
    public final void setClick_phanhoi(@org.jetbrains.annotations.Nullable()
    ie.app.uetstudents.adapter.truyen_name_account p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ie.app.uetstudents.adapter.SubCommentAdapter getAdapter_subcomment() {
        return null;
    }
    
    public final void setAdapter_subcomment(@org.jetbrains.annotations.Nullable()
    ie.app.uetstudents.adapter.SubCommentAdapter p0) {
    }
    
    public final void listener(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.truyen_name_account listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ie.app.uetstudents.adapter.CommentAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<ie.app.uetstudents.Entity.Comment.get.CommentDto> list) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.CommentAdapter.ViewHolder holder, int position) {
    }
    
    public final void callsubcomment(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.CommentAdapter.ViewHolder holder, int page, @org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Comment.get.CommentDto dataModel) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lie/app/uetstudents/adapter/CommentAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindData", "", "d", "Lie/app/uetstudents/Entity/Comment/get/CommentDto;", "clicktext", "Lie/app/uetstudents/adapter/Clicktext;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"ResourceAsColor"})
        public final void bindData(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Comment.get.CommentDto d, @org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.adapter.Clicktext clicktext) {
        }
    }
}