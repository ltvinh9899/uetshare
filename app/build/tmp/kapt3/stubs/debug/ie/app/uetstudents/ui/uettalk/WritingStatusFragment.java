package ie.app.uetstudents.ui.uettalk;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016J&\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020\rH\u0002J\"\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u000200H\u0016J-\u00101\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00052\u000e\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u0014032\u0006\u00104\u001a\u000205H\u0016\u00a2\u0006\u0002\u00106J\u001a\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u000e\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0014J\b\u0010;\u001a\u00020\u0010H\u0002J\u0006\u0010<\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lie/app/uetstudents/ui/uettalk/WritingStatusFragment;", "Landroidx/fragment/app/Fragment;", "Lie/app/uetstudents/adapter/OnclickItem_deleteanh;", "()V", "CAMERA_REQUEST", "", "DOCUMENT_REQUEST", "IMG_REQUEST", "MY_REQUEST", "adapteranh", "Lie/app/uetstudents/adapter/adapter_anhwrite;", "listanh", "Ljava/util/ArrayList;", "Landroid/net/Uri;", "Lkotlin/collections/ArrayList;", "CLickDelete", "", "anh", "callApi", "writeContent", "", "listUri", "", "user", "getByteDataFile", "", "uri", "getBytes", "inputStream", "Ljava/io/InputStream;", "getSelectedFileName", "selectFileUri", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "onclickRequestPermission", "theloai", "openDocument", "openGallery", "app_debug"})
public final class WritingStatusFragment extends androidx.fragment.app.Fragment implements ie.app.uetstudents.adapter.OnclickItem_deleteanh {
    private final int MY_REQUEST = 1111;
    private final int IMG_REQUEST = 1000;
    private final int DOCUMENT_REQUEST = 1005;
    private final int CAMERA_REQUEST = 100;
    private java.util.ArrayList<android.net.Uri> listanh;
    private ie.app.uetstudents.adapter.adapter_anhwrite adapteranh;
    private java.util.HashMap _$_findViewCache;
    
    public WritingStatusFragment() {
        super();
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
    
    public final void onclickRequestPermission(@org.jetbrains.annotations.NotNull()
    java.lang.String theloai) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public final void openGallery() {
    }
    
    private final void openDocument() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void callApi(java.lang.String writeContent, java.util.List<? extends android.net.Uri> listUri, int user) {
    }
    
    private final java.lang.String getSelectedFileName(android.net.Uri selectFileUri) {
        return null;
    }
    
    private final byte[] getByteDataFile(android.net.Uri uri) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final byte[] getBytes(java.io.InputStream inputStream) throws java.io.IOException {
        return null;
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void CLickDelete(@org.jetbrains.annotations.NotNull()
    android.net.Uri anh) {
    }
}