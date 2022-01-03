package ie.app.uetstudents.ui.tailieu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lie/app/uetstudents/ui/tailieu/DetailDocumentExamActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "pdfurl", "", "getPdfurl", "()Ljava/lang/String;", "setPdfurl", "(Ljava/lang/String;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "RetrivePDFfromUrl", "app_debug"})
public final class DetailDocumentExamActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pdfurl = "http://34.126.110.103:8080/uetshare/image/home/uet/data/account_1/exam_document_5/giaitich.pdf";
    private java.util.HashMap _$_findViewCache;
    
    public DetailDocumentExamActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPdfurl() {
        return null;
    }
    
    public final void setPdfurl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\'\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\r\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lie/app/uetstudents/ui/tailieu/DetailDocumentExamActivity$RetrivePDFfromUrl;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "Ljava/io/InputStream;", "Pdfview", "Lcom/github/barteksc/pdfviewer/PDFView;", "(Lcom/github/barteksc/pdfviewer/PDFView;)V", "getPdfview", "()Lcom/github/barteksc/pdfviewer/PDFView;", "setPdfview", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/io/InputStream;", "onPostExecute", "", "inputStream", "app_debug"})
    static final class RetrivePDFfromUrl extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.io.InputStream> {
        @org.jetbrains.annotations.NotNull()
        private com.github.barteksc.pdfviewer.PDFView Pdfview;
        
        public RetrivePDFfromUrl(@org.jetbrains.annotations.NotNull()
        com.github.barteksc.pdfviewer.PDFView Pdfview) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.github.barteksc.pdfviewer.PDFView getPdfview() {
            return null;
        }
        
        public final void setPdfview(@org.jetbrains.annotations.NotNull()
        com.github.barteksc.pdfviewer.PDFView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.io.InputStream doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.io.InputStream inputStream) {
        }
    }
}