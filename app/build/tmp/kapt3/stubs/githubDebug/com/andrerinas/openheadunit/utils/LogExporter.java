package com.andrerinas.openheadunit.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001 B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u000fJ\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\bJ\u0016\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u000fJ\u0006\u0010\u001f\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/andrerinas/openheadunit/utils/LogExporter;", "", "()V", "MAX_CAPTURE_BYTES", "", "MAX_RESTARTS", "", "captureFile", "Ljava/io/File;", "captureProcess", "Ljava/lang/Process;", "captureRestarts", "captureThread", "Ljava/lang/Thread;", "captureVerbosity", "Lcom/andrerinas/openheadunit/utils/LogExporter$LogLevel;", "currentLevel", "getCurrentLevel", "()Lcom/andrerinas/openheadunit/utils/LogExporter$LogLevel;", "isCapturing", "", "()Z", "launchLogcatPipe", "", "file", "verbosity", "saveLogToPublicFile", "context", "Landroid/content/Context;", "shareLogFile", "startCapture", "stopCapture", "LogLevel", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class LogExporter {
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Process captureProcess;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Thread captureThread;
    @org.jetbrains.annotations.Nullable()
    private static java.io.File captureFile;
    @org.jetbrains.annotations.NotNull()
    private static com.andrerinas.openheadunit.utils.LogExporter.LogLevel captureVerbosity = com.andrerinas.openheadunit.utils.LogExporter.LogLevel.DEBUG;
    private static int captureRestarts = 0;
    private static final int MAX_RESTARTS = 5;
    
    /**
     * Ceiling for one capture file. Sits under [LogFilesHelper]'s 50 MB budget for the whole
     * directory, so a single runaway capture cannot consume it.
     */
    private static final long MAX_CAPTURE_BYTES = 16777216L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.LogExporter INSTANCE = null;
    
    private LogExporter() {
        super();
    }
    
    public final boolean isCapturing() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.utils.LogExporter.LogLevel getCurrentLevel() {
        return null;
    }
    
    /**
     * Starts a continuous logcat process writing to a timestamped file.
     * Unlike [saveLogToPublicFile], this captures everything from the moment it is called,
     * bypassing the small shared ring buffer.
     */
    public final void startCapture(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.LogExporter.LogLevel verbosity) {
    }
    
    /**
     * Spawns a logcat process piping stdout into [file] (append mode).
     * When the process exits unexpectedly, restarts automatically up to [MAX_RESTARTS] times
     * so a system-killed logcat doesn't silently stop the capture.
     */
    private final void launchLogcatPipe(java.io.File file, com.andrerinas.openheadunit.utils.LogExporter.LogLevel verbosity) {
    }
    
    /**
     * Stops the continuous capture process.
     */
    public final void stopCapture() {
    }
    
    /**
     * Writes logs to a timestamped file and returns it.
     * - If a capture file is available (capture was started, active or already stopped):
     *  copies its content into a fresh export file so the original capture file is preserved.
     * - Otherwise: dumps the current logcat ring buffer.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.io.File saveLogToPublicFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.LogExporter.LogLevel verbosity) {
        return null;
    }
    
    public final void shareLogFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/utils/LogExporter$LogLevel;", "", "filter", "", "logLevel", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getFilter", "()Ljava/lang/String;", "getLogLevel", "()I", "VERBOSE", "DEBUG", "INFO", "WARNING", "ERROR", "SILENT", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum LogLevel {
        /*public static final*/ VERBOSE /* = new VERBOSE(null, 0) */,
        /*public static final*/ DEBUG /* = new DEBUG(null, 0) */,
        /*public static final*/ INFO /* = new INFO(null, 0) */,
        /*public static final*/ WARNING /* = new WARNING(null, 0) */,
        /*public static final*/ ERROR /* = new ERROR(null, 0) */,
        /*public static final*/ SILENT /* = new SILENT(null, 0) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String filter = null;
        private final int logLevel = 0;
        
        LogLevel(java.lang.String filter, int logLevel) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFilter() {
            return null;
        }
        
        public final int getLogLevel() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.utils.LogExporter.LogLevel> getEntries() {
            return null;
        }
    }
}