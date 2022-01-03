package ie.app.uetstudents.ui.diendan.forum_main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lie/app/uetstudents/ui/diendan/forum_main/forumPresenter;", "Lie/app/uetstudents/ui/diendan/forum_main/forumContract$Presenter;", "view", "Lie/app/uetstudents/ui/diendan/forum_main/forumContract$View;", "repository", "Lie/app/uetstudents/Repository/Repository;", "(Lie/app/uetstudents/ui/diendan/forum_main/forumContract$View;Lie/app/uetstudents/Repository/Repository;)V", "getQuestions", "", "id_type_content", "", "index", "account_id", "getQuestions_of_Category", "id_category", "updateUI", "data", "Lie/app/uetstudents/Entity/Question/get/question;", "app_debug"})
public final class forumPresenter implements ie.app.uetstudents.ui.diendan.forum_main.forumContract.Presenter {
    private final ie.app.uetstudents.ui.diendan.forum_main.forumContract.View view = null;
    private final ie.app.uetstudents.Repository.Repository repository = null;
    
    public forumPresenter(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.diendan.forum_main.forumContract.View view, @org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Repository.Repository repository) {
        super();
    }
    
    @java.lang.Override()
    public void getQuestions(int id_type_content, int index, int account_id) {
    }
    
    @java.lang.Override()
    public void updateUI(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.question data) {
    }
    
    @java.lang.Override()
    public void getQuestions_of_Category(int id_category, int index, int account_id) {
    }
}