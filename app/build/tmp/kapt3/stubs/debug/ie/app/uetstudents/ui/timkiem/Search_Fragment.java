package ie.app.uetstudents.ui.timkiem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0016J \u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0012\u0010&\u001a\u00020\u00162\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u000201H\u0016J\u001a\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020*2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lie/app/uetstudents/ui/timkiem/Search_Fragment;", "Landroidx/fragment/app/Fragment;", "Lie/app/uetstudents/ui/timkiem/OnCLickItem_search;", "Lie/app/uetstudents/ui/timkiem/OnClickItem_SearchPerson;", "Lie/app/uetstudents/ui/timkiem/SearchContract$View;", "()V", "adapter_person", "Lie/app/uetstudents/ui/timkiem/adapter_search_person;", "adapter_question", "Lie/app/uetstudents/ui/timkiem/adapter_search;", "id_user", "", "getId_user", "()Ljava/lang/Integer;", "setId_user", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "page_search", "presenter", "Lie/app/uetstudents/ui/timkiem/SearchContract$Presenter;", "type_content_id", "ClickItem", "", "AccountDto", "Lie/app/uetstudents/data/response/AccountDto;", "Onclick", "Questiontdo", "Lie/app/uetstudents/Entity/Search/Question/QuestionDto;", "UpdateViewPerson", "person", "Lie/app/uetstudents/Entity/Search/person/person;", "UpdateViewQuestion", "searchQuestion", "Lie/app/uetstudents/Entity/Search/Question/search_question;", "getdulieusearch", "page", "textsearch", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onViewCreated", "view", "app_debug"})
public final class Search_Fragment extends androidx.fragment.app.Fragment implements ie.app.uetstudents.ui.timkiem.OnCLickItem_search, ie.app.uetstudents.ui.timkiem.OnClickItem_SearchPerson, ie.app.uetstudents.ui.timkiem.SearchContract.View {
    private int page_search = 1;
    private int type_content_id = 1;
    private ie.app.uetstudents.ui.timkiem.SearchContract.Presenter presenter;
    private ie.app.uetstudents.ui.timkiem.adapter_search_person adapter_person;
    private ie.app.uetstudents.ui.timkiem.adapter_search adapter_question;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer id_user;
    private java.util.HashMap _$_findViewCache;
    
    public Search_Fragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId_user() {
        return null;
    }
    
    public final void setId_user(@org.jetbrains.annotations.Nullable()
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
    
    private final void getdulieusearch(int page, java.lang.String textsearch, int type_content_id) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void Onclick(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Search.Question.QuestionDto Questiontdo) {
    }
    
    @java.lang.Override()
    public void UpdateViewPerson(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Search.person.person person) {
    }
    
    @java.lang.Override()
    public void UpdateViewQuestion(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Search.Question.search_question searchQuestion) {
    }
    
    @java.lang.Override()
    public void ClickItem(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.data.response.AccountDto AccountDto) {
    }
}