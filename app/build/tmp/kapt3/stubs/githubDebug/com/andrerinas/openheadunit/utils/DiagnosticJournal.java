package com.andrerinas.openheadunit.utils;

/**
 * App-owned history survives the very noisy BYD system log buffer. Producers never do disk I/O.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\fJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/andrerinas/openheadunit/utils/DiagnosticJournal;", "", "()V", "MAX_FILE_BYTES", "", "MAX_LINES", "", "directory", "Ljava/io/File;", "diskLock", "pending", "Ljava/util/concurrent/LinkedBlockingDeque;", "", "recent", "Ljava/util/ArrayDeque;", "init", "", "context", "Landroid/content/Context;", "record", "priority", "message", "snapshot", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class DiagnosticJournal {
    private static final long MAX_FILE_BYTES = 1048576L;
    private static final int MAX_LINES = 6000;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.LinkedBlockingDeque<java.lang.String> pending = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.ArrayDeque<java.lang.String> recent = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Object diskLock = null;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile java.io.File directory;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.DiagnosticJournal INSTANCE = null;
    
    private DiagnosticJournal() {
        super();
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void record(int priority, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * Called on the export worker, never the UI thread. Include queued lines without a flush wait.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> snapshot() {
        return null;
    }
}