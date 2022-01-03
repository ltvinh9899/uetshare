package ie.app.uetstudents.ui.timkiem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lie/app/uetstudents/ui/timkiem/SearchContract;", "", "Presenter", "View", "app_debug"})
public abstract interface SearchContract {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lie/app/uetstudents/ui/timkiem/SearchContract$View;", "", "UpdateViewPerson", "", "person", "Lie/app/uetstudents/Entity/Search/person/person;", "UpdateViewQuestion", "searchQuestion", "Lie/app/uetstudents/Entity/Search/Question/search_question;", "app_debug"})
    public static abstract interface View {
        
        public abstract void UpdateViewPerson(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Search.person.person person);
        
        public abstract void UpdateViewQuestion(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Search.Question.search_question searchQuestion);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J(\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH&\u00a8\u0006\u0011"}, d2 = {"Lie/app/uetstudents/ui/timkiem/SearchContract$Presenter;", "", "UpdateUIQuestion", "", "searchQuestion", "Lie/app/uetstudents/Entity/Search/Question/search_question;", "UpdateUIperson", "person", "Lie/app/uetstudents/Entity/Search/person/person;", "getPersonsearch", "page", "", "text", "", "getQuestions", "type_content_id", "account_id", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getPersonsearch(int page, @org.jetbrains.annotations.NotNull()
        java.lang.String text);
        
        public abstract void UpdateUIperson(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Search.person.person person);
        
        public abstract void getQuestions(int page, @org.jetbrains.annotations.NotNull()
        java.lang.String text, int type_content_id, int account_id);
        
        public abstract void UpdateUIQuestion(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Search.Question.search_question searchQuestion);
    }
}