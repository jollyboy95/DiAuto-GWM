package com.andrerinas.openheadunit.utils;

/**
 * Saves an app-owned report without depending on an OEM's document-picker activity.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/utils/DiagnosticExportStore;", "", "()V", "saveToDownloads", "Landroid/net/Uri;", "resolver", "Landroid/content/ContentResolver;", "fileName", "", "report", "write", "", "uri", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class DiagnosticExportStore {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.DiagnosticExportStore INSTANCE = null;
    
    private DiagnosticExportStore() {
        super();
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri saveToDownloads(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver resolver, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.lang.String report) {
        return null;
    }
    
    public final void write(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver resolver, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.lang.String report) {
    }
}