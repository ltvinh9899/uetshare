package ie.app.uetstudents.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bH\u0016J\u0014\u0010$\u001a\u00020\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lie/app/uetstudents/adapter/AdapterUETTalk;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lie/app/uetstudents/adapter/AdapterUETTalk$ViewHolder;", "context", "Landroid/content/Context;", "ClickItem", "Lie/app/uetstudents/adapter/OnClickItem_UetTalk;", "callback", "Lie/app/uetstudents/adapter/BaseAdapter$OnclickPdf;", "Lie/app/uetstudents/Entity/Question/get/ImageDto;", "(Landroid/content/Context;Lie/app/uetstudents/adapter/OnClickItem_UetTalk;Lie/app/uetstudents/adapter/BaseAdapter$OnclickPdf;)V", "getClickItem", "()Lie/app/uetstudents/adapter/OnClickItem_UetTalk;", "setClickItem", "(Lie/app/uetstudents/adapter/OnClickItem_UetTalk;)V", "getCallback", "()Lie/app/uetstudents/adapter/BaseAdapter$OnclickPdf;", "setCallback", "(Lie/app/uetstudents/adapter/BaseAdapter$OnclickPdf;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "dataList", "", "Lie/app/uetstudents/Entity/Question/get/QuestionDtoX;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "ViewHolder", "app_debug"})
public final class AdapterUETTalk extends androidx.recyclerview.widget.RecyclerView.Adapter<ie.app.uetstudents.adapter.AdapterUETTalk.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private ie.app.uetstudents.adapter.OnClickItem_UetTalk ClickItem;
    @org.jetbrains.annotations.NotNull()
    private ie.app.uetstudents.adapter.BaseAdapter.OnclickPdf<ie.app.uetstudents.Entity.Question.get.ImageDto> callback;
    private java.util.List<ie.app.uetstudents.Entity.Question.get.QuestionDtoX> dataList;
    
    public AdapterUETTalk(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.OnClickItem_UetTalk ClickItem, @org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.BaseAdapter.OnclickPdf<ie.app.uetstudents.Entity.Question.get.ImageDto> callback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ie.app.uetstudents.adapter.OnClickItem_UetTalk getClickItem() {
        return null;
    }
    
    public final void setClickItem(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.OnClickItem_UetTalk p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ie.app.uetstudents.adapter.BaseAdapter.OnclickPdf<ie.app.uetstudents.Entity.Question.get.ImageDto> getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.BaseAdapter.OnclickPdf<ie.app.uetstudents.Entity.Question.get.ImageDto> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ie.app.uetstudents.adapter.AdapterUETTalk.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
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
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.AdapterUETTalk.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007\u00a8\u0006\f"}, d2 = {"Lie/app/uetstudents/adapter/AdapterUETTalk$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindData", "", "d", "Lie/app/uetstudents/Entity/Question/get/QuestionDtoX;", "callback", "Lie/app/uetstudents/adapter/BaseAdapter$OnclickPdf;", "Lie/app/uetstudents/Entity/Question/get/ImageDto;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"ResourceAsColor"})
        public final void bindData(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Question.get.QuestionDtoX d, @org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.adapter.BaseAdapter.OnclickPdf<ie.app.uetstudents.Entity.Question.get.ImageDto> callback) {
        }
    }
}