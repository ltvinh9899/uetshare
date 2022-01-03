package ie.app.uetstudents.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001&B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0016\u00a2\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0019H\u0016J\u0015\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u00162\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u001d\u0010 \u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010!\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u00162\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lie/app/uetstudents/adapter/BaseAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lie/app/uetstudents/adapter/BaseViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "callback", "Lie/app/uetstudents/adapter/BaseAdapter$OnclickPdf;", "getCallback", "()Lie/app/uetstudents/adapter/BaseAdapter$OnclickPdf;", "setCallback", "(Lie/app/uetstudents/adapter/BaseAdapter$OnclickPdf;)V", "getContext", "()Landroid/content/Context;", "items", "", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "clear", "", "getItemAt", "position", "", "(I)Ljava/lang/Object;", "getItemCount", "insertItem", "item", "(Ljava/lang/Object;)V", "setOnClickListener", "updateItem", "newItem", "(ILjava/lang/Object;)V", "updateList", "newList", "", "OnclickPdf", "app_debug"})
public abstract class BaseAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<ie.app.uetstudents.adapter.BaseViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<T> items;
    @org.jetbrains.annotations.Nullable()
    private ie.app.uetstudents.adapter.BaseAdapter.OnclickPdf<T> callback;
    
    public BaseAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.List<T> getItems() {
        return null;
    }
    
    protected final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<T> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final ie.app.uetstudents.adapter.BaseAdapter.OnclickPdf<T> getCallback() {
        return null;
    }
    
    protected final void setCallback(@org.jetbrains.annotations.Nullable()
    ie.app.uetstudents.adapter.BaseAdapter.OnclickPdf<T> p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> newList) {
    }
    
    public void insertItem(T item) {
    }
    
    public void clear() {
    }
    
    public void updateItem(int position, T newItem) {
    }
    
    public T getItemAt(int position) {
        return null;
    }
    
    public void setOnClickListener(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.adapter.BaseAdapter.OnclickPdf<T> callback) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\n"}, d2 = {"Lie/app/uetstudents/adapter/BaseAdapter$OnclickPdf;", "T", "", "onItemCLickImage", "", "position", "", "item", "(ILjava/lang/Object;)V", "onItemClick", "app_debug"})
    public static abstract interface OnclickPdf<T extends java.lang.Object> {
        
        public abstract void onItemClick(int position, T item);
        
        public abstract void onItemCLickImage(int position, T item);
    }
}