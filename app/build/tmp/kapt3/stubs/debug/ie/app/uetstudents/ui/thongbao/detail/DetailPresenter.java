package ie.app.uetstudents.ui.thongbao.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lie/app/uetstudents/ui/thongbao/detail/DetailPresenter;", "Lie/app/uetstudents/ui/thongbao/detail/DetailContract$Presenter;", "View", "Lie/app/uetstudents/ui/thongbao/detail/DetailContract$View;", "Repository", "Lie/app/uetstudents/Repository/Repository;", "(Lie/app/uetstudents/ui/thongbao/detail/DetailContract$View;Lie/app/uetstudents/Repository/Repository;)V", "UpdateUiDetail", "", "Question", "Lie/app/uetstudents/Entity/Question/get/QuestionDtoX;", "getQuestionDetail", "id_question", "", "account_id", "app_debug"})
public final class DetailPresenter implements ie.app.uetstudents.ui.thongbao.detail.DetailContract.Presenter {
    private final ie.app.uetstudents.ui.thongbao.detail.DetailContract.View View = null;
    private final ie.app.uetstudents.Repository.Repository Repository = null;
    
    public DetailPresenter(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.ui.thongbao.detail.DetailContract.View View, @org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Repository.Repository Repository) {
        super();
    }
    
    @java.lang.Override()
    public void getQuestionDetail(int id_question, int account_id) {
    }
    
    @java.lang.Override()
    public void UpdateUiDetail(@org.jetbrains.annotations.NotNull()
    ie.app.uetstudents.Entity.Question.get.QuestionDtoX Question) {
    }
}