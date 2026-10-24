package com.andrerinas.openheadunit.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bJ&\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016J,\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/andrerinas/openheadunit/utils/LogFilesHelper;", "", "()V", "DEFAULT_MAX_LOG_FILES", "", "DEFAULT_MAX_TOTAL_SIZE", "", "LOG_FILE_PREFIX", "", "LOG_FILE_SUFFIX", "createTimestampedLogFile", "Ljava/io/File;", "logDir", "prefix", "ensureDirectory", "", "resolveLogDirectory", "context", "Landroid/content/Context;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "allowInternalFallback", "", "rotateLogs", "maxFiles", "maxTotalSizeBytes", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class LogFilesHelper {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOG_FILE_PREFIX = "HUR_Log_";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LOG_FILE_SUFFIX = ".txt";
    public static final int DEFAULT_MAX_LOG_FILES = 10;
    public static final long DEFAULT_MAX_TOTAL_SIZE = 52428800L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.LogFilesHelper INSTANCE = null;
    
    private LogFilesHelper() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File resolveLogDirectory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.utils.Settings settings, boolean allowInternalFallback) {
        return null;
    }
    
    public final void rotateLogs(@org.jetbrains.annotations.NotNull()
    java.io.File logDir, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, int maxFiles, long maxTotalSizeBytes) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File createTimestampedLogFile(@org.jetbrains.annotations.NotNull()
    java.io.File logDir, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix) {
        return null;
    }
    
    public final void ensureDirectory(@org.jetbrains.annotations.NotNull()
    java.io.File logDir) {
    }
}