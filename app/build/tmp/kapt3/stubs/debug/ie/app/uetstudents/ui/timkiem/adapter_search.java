package ie.app.uetstudents.ui.timkiem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0014\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lie/app/uetstudents/ui/timkiem/adapter_search;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lie/app/uetstudents/ui/timkiem/adapter_search$Viewholder;", "ClickItem", "Lie/app/uetstudents/ui/timkiem/OnCLickItem_search;", "(Lie/app/uetstudents/ui/timkiem/OnCLickItem_search;)V", "getClickItem", "()Lie/app/uetstudents/ui/timkiem/OnCLickItem_search;", "setClickItem", "listsearch", "Ljava/util/ArrayList;", "Lie/app/uetstudents/Entity/Search/Question/QuestionDto;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataQuestion", "list", "", "Viewholder", "app_debug"})
public final class adapter_search extends androidx.recyclerview.widget.RecyclerView.Adapter<ie.app.uetstudents.ui.timkiem.adapter_search.Viewholder> {
    @org.jetbrains.annotations.NotNull()
    private ie.app.uetstudents.ui.timkiem.OnCLickItem_search ClickItem;
    private java.util.ArrayList<ie.app.uetstudents.Entity.Search.Question.QuestionDto> listsearch;
    
    public adapter_search(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.timkiem.OnCLickItem_search ClickItem) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ie.app.uetstudents.ui.timkiem.OnCLickItem_search getClickItem() {
        return null;
    }
    
    public final void setClickItem(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.timkiem.OnCLickItem_search p0) {
    }
    
    public final void setDataQuestion(@org.jetbrains.annotations.NotNull()
    java.util.List<ie.app.uetstudents.Entity.Search.Question.QuestionDto> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ie.app.uetstudents.ui.timkiem.adapter_search.Viewholder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.timkiem.adapter_search.Viewholder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lie/app/uetstudents/ui/timkiem/adapter_search$Viewholder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemview", "Landroid/view/View;", "(Lie/app/uetstudents/ui/timkiem/adapter_search;Landroid/view/View;)V", "getItemview", "()Landroid/view/View;", "setItemview", "(Landroid/view/View;)V", "onBinData", "", "Questiontdo", "Lie/app/uetstudents/Entity/Search/Question/QuestionDto;", "app_debug"})
    public final class Viewholder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.view.View itemview;
        
        public Viewholder(@org.jetbrains.annotations.NotNull()
        android.view.View itemview) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getItemview() {
            return null;
        }
        
        public final void setItemview(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public final void onBinData(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Search.Question.QuestionDto Questiontdo) {
        }
    }
}