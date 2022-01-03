package ie.app.uetstudents.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0014\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lie/app/uetstudents/adapter/adapter_forum;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lie/app/uetstudents/adapter/adapter_forum$ViewHolder;", "clickItem", "Lie/app/uetstudents/adapter/ClickItem;", "(Lie/app/uetstudents/adapter/ClickItem;)V", "getClickItem", "()Lie/app/uetstudents/adapter/ClickItem;", "setClickItem", "dataList", "", "Lie/app/uetstudents/Entity/Question/get/QuestionDtoX;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "ViewHolder", "app_debug"})
public final class adapter_forum extends androidx.recyclerview.widget.RecyclerView.Adapter<ie.app.uetstudents.adapter.adapter_forum.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private ie.app.uetstudents.adapter.ClickItem clickItem;
    private java.util.List<ie.app.uetstudents.Entity.Question.get.QuestionDtoX> dataList;
    
    public adapter_forum(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.ClickItem clickItem) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ie.app.uetstudents.adapter.ClickItem getClickItem() {
        return null;
    }
    
    public final void setClickItem(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.ClickItem p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ie.app.uetstudents.adapter.adapter_forum.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<ie.app.uetstudents.Entity.Question.get.QuestionDtoX> list) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.adapter_forum.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lie/app/uetstudents/adapter/adapter_forum$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindData", "", "d", "Lie/app/uetstudents/Entity/Question/get/QuestionDtoX;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindData(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Question.get.QuestionDtoX d) {
        }
    }
}