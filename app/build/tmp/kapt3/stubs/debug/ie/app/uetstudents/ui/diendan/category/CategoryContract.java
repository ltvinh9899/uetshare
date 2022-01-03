package ie.app.uetstudents.ui.diendan.category;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lie/app/uetstudents/ui/diendan/category/CategoryContract;", "", "Presenter", "View", "app_debug"})
public abstract interface CategoryContract {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lie/app/uetstudents/ui/diendan/category/CategoryContract$View;", "", "updateViewData", "", "data", "Lie/app/uetstudents/Entity/Category/category;", "app_debug"})
    public static abstract interface View {
        
        public abstract void updateViewData(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Category.category data);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lie/app/uetstudents/ui/diendan/category/CategoryContract$Presenter;", "", "getCategorys", "", "updateUI", "data", "Lie/app/uetstudents/Entity/Category/category;", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getCategorys();
        
        public abstract void updateUI(@org.jetbrains.annotations.NotNull()
        ie.app.uetstudents.Entity.Category.category data);
    }
}