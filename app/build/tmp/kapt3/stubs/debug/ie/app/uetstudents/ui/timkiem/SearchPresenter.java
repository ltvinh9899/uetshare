package ie.app.uetstudents.ui.timkiem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lie/app/uetstudents/ui/timkiem/SearchPresenter;", "Lie/app/uetstudents/ui/timkiem/SearchContract$Presenter;", "View", "Lie/app/uetstudents/ui/timkiem/SearchContract$View;", "repository", "Lie/app/uetstudents/Repository/Repository;", "(Lie/app/uetstudents/ui/timkiem/SearchContract$View;Lie/app/uetstudents/Repository/Repository;)V", "UpdateUIQuestion", "", "searchQuestion", "Lie/app/uetstudents/Entity/Search/Question/search_question;", "UpdateUIperson", "person", "Lie/app/uetstudents/Entity/Search/person/person;", "getPersonsearch", "page", "", "text", "", "getQuestions", "type_content_id", "account_id", "app_debug"})
public final class SearchPresenter implements ie.app.uetstudents.ui.timkiem.SearchContract.Presenter {
    private final ie.app.uetstudents.ui.timkiem.SearchContract.View View = null;
    private final ie.app.uetstudents.Repository.Repository repository = null;
    
    public SearchPresenter(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.timkiem.SearchContract.View View, @org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Repository.Repository repository) {
        super();
    }
    
    @java.lang.Override()
    public void getPersonsearch(int page, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public void UpdateUIperson(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Search.person.person person) {
    }
    
    @java.lang.Override()
    public void getQuestions(int page, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int type_content_id, int account_id) {
    }
    
    @java.lang.Override()
    public void UpdateUIQuestion(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Search.Question.search_question searchQuestion) {
    }
}