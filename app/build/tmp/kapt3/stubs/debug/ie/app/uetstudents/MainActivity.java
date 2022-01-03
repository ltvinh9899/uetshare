package ie.app.uetstudents;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0002J\u0012\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u000bH\u0007J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\'H\u0017J\b\u0010(\u001a\u00020\u001aH\u0014J\b\u0010)\u001a\u00020\u001aH\u0014J\b\u0010*\u001a\u00020 H\u0016J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lie/app/uetstudents/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "binding", "Lie/app/uetstudents/databinding/ActivityMainBinding;", "id_user", "", "Ljava/lang/Integer;", "mBroadcastAction", "", "getMBroadcastAction", "()Ljava/lang/String;", "setMBroadcastAction", "(Ljava/lang/String;)V", "textItemCount", "Landroid/widget/TextView;", "unreadCount", "getUnreadCount", "()I", "setUnreadCount", "(I)V", "view", "Landroid/view/View;", "getUnreadNotification", "", "userId", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onMessageEvent", "event", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onStart", "onStop", "onSupportNavigateUp", "setupBadge", "count", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mBroadcastAction = "STRING_BROADCAST_ACTION";
    private androidx.navigation.ui.AppBarConfiguration appBarConfiguration;
    private ie.app.uetstudents.databinding.ActivityMainBinding binding;
    private android.view.View view;
    private java.lang.Integer id_user;
    private android.widget.TextView textItemCount;
    private int unreadCount = 0;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMBroadcastAction() {
        return null;
    }
    
    public final void setMBroadcastAction(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getUnreadCount() {
        return 0;
    }
    
    public final void setUnreadCount(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    private final void setupBadge(int count) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    private final void getUnreadNotification(int userId) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
}