package com.andrerinas.openheadunit.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001CB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0002J\u000e\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0014J\'\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00142\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010*\"\u00020\u0001\u00a2\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010-\u001a\u00020.J\u0010\u0010,\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u0014J)\u0010,\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u00142\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010*\"\u00020\u0001\u00a2\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.J)\u0010/\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00142\u0012\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010*\"\u00020\u0001H\u0002\u00a2\u0006\u0002\u00101J\u000e\u00102\u001a\u00020&2\u0006\u00103\u001a\u000204J\u000e\u00102\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0014J\'\u00102\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00142\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010*\"\u00020\u0001\u00a2\u0006\u0002\u0010+J\u001c\u00105\u001a\u00020&2\b\u00106\u001a\u0004\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u000109J\u0010\u0010:\u001a\u00020\n2\u0006\u0010;\u001a\u00020\u000eH\u0002J\u0018\u0010<\u001a\u00020&2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0014H\u0002J\u001a\u0010=\u001a\u00020&2\u0006\u0010>\u001a\u00020\u00142\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u0015\u0010?\u001a\u00020\u00142\u0006\u0010-\u001a\u00020.H\u0000\u00a2\u0006\u0002\b@J\'\u0010A\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00142\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010*\"\u00020\u0001\u00a2\u0006\u0002\u0010+J\u000e\u0010B\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0014J\'\u0010B\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00142\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010*\"\u00020\u0001\u00a2\u0006\u0002\u0010+R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\fR\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010 \u001a\u0004\u0018\u00010\u00198F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u0011\u0010\"\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010$\u00a8\u0006D"}, d2 = {"Lcom/andrerinas/openheadunit/utils/AppLog;", "", "()V", "LOGGER", "Lcom/andrerinas/openheadunit/utils/AppLog$Logger;", "getLOGGER", "()Lcom/andrerinas/openheadunit/utils/AppLog$Logger;", "setLOGGER", "(Lcom/andrerinas/openheadunit/utils/AppLog$Logger;)V", "LOG_DEBUG", "", "getLOG_DEBUG", "()Z", "LOG_LEVEL", "", "getLOG_LEVEL", "()I", "LOG_VERBOSE", "getLOG_VERBOSE", "TAG", "", "appLogFileLogger", "Lcom/andrerinas/openheadunit/utils/AppLog$Logger$File;", "cachedLogLevel", "currentLogFile", "Ljava/io/File;", "getCurrentLogFile", "()Ljava/io/File;", "currentLogSource", "Lcom/andrerinas/openheadunit/utils/Settings$LogSource;", "isCapturing", "lastAppLogFile", "lastLogFile", "getLastLogFile", "logSource", "getLogSource", "()Lcom/andrerinas/openheadunit/utils/Settings$LogSource;", "closeAppLogFileLogger", "", "d", "msg", "params", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "e", "tr", "", "format", "array", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "i", "intent", "Landroid/content/Intent;", "init", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "context", "Landroid/content/Context;", "isLoggable", "priority", "log", "loge", "message", "throwableSummary", "throwableSummary$com_andrerinas_headunitrevived_0_3_12_githubDebug", "v", "w", "Logger", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AppLog {
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.andrerinas.openheadunit.utils.AppLog.Logger.File appLogFileLogger;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile java.io.File lastAppLogFile;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.NotNull()
    private static volatile com.andrerinas.openheadunit.utils.Settings.LogSource currentLogSource = com.andrerinas.openheadunit.utils.Settings.LogSource.LOGCAT;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.NotNull()
    private static volatile com.andrerinas.openheadunit.utils.AppLog.Logger LOGGER;
    @kotlin.jvm.Volatile()
    private static volatile int cachedLogLevel = android.util.Log.INFO;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "OPENHU";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.AppLog INSTANCE = null;
    
    private AppLog() {
        super();
    }
    
    public final void init(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.utils.Settings settings, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.utils.AppLog.Logger getLOGGER() {
        return null;
    }
    
    public final void setLOGGER(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.AppLog.Logger p0) {
    }
    
    private final int getLOG_LEVEL() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.utils.Settings.LogSource getLogSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getCurrentLogFile() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getLastLogFile() {
        return null;
    }
    
    public final boolean isCapturing() {
        return false;
    }
    
    public final boolean getLOG_VERBOSE() {
        return false;
    }
    
    public final boolean getLOG_DEBUG() {
        return false;
    }
    
    public final void i(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void i(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.Object... params) {
    }
    
    public final void e(@org.jetbrains.annotations.Nullable()
    java.lang.String msg) {
    }
    
    public final void e(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable tr) {
    }
    
    public final void e(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable tr) {
    }
    
    public final void e(@org.jetbrains.annotations.Nullable()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.Object... params) {
    }
    
    public final void v(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.Object... params) {
    }
    
    public final void d(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.Object... params) {
    }
    
    public final void d(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void w(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void w(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.Object... params) {
    }
    
    private final void log(int priority, java.lang.String msg) {
    }
    
    private final boolean isLoggable(int priority) {
        return false;
    }
    
    private final void loge(java.lang.String message, java.lang.Throwable tr) {
    }
    
    /**
     * One line per exception in the cause chain (type and message), followed by the first frames
     * of the innermost cause. Bounded so a deep chain cannot flood the journal.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String throwableSummary$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable tr) {
        return null;
    }
    
    private final void closeAppLogFileLogger() {
    }
    
    private final java.lang.String format(java.lang.String msg, java.lang.Object... array) {
        return null;
    }
    
    public final void i(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\t\nJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/utils/AppLog$Logger;", "", "println", "", "priority", "", "tag", "", "msg", "Android", "File", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static abstract interface Logger {
        
        public abstract void println(int priority, @org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String msg);
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/andrerinas/openheadunit/utils/AppLog$Logger$Android;", "Lcom/andrerinas/openheadunit/utils/AppLog$Logger;", "()V", "println", "", "priority", "", "tag", "", "msg", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Android implements com.andrerinas.openheadunit.utils.AppLog.Logger {
            
            public Android() {
                super();
            }
            
            @java.lang.Override()
            public void println(int priority, @org.jetbrains.annotations.NotNull()
            java.lang.String tag, @org.jetbrains.annotations.NotNull()
            java.lang.String msg) {
            }
        }
        
        /**
         * Writes to a file from one background thread fed by a bounded queue.
         *
         * Formatting and the write used to happen on the calling thread under a single lock shared
         * by the AAP poll and send threads, the audio and video threads and the main thread — so at
         * verbose, where several lines are emitted per frame, they serialised against each other and
         * against a disk flush. Here a caller only timestamps the line and offers it to the queue.
         *
         * When the queue is full the oldest line is dropped rather than blocking the caller: losing
         * log lines is always better than stalling the thread that produces them, and the count is
         * reported so a capture never silently under-reports.
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0002J \u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/andrerinas/openheadunit/utils/AppLog$Logger$File;", "Lcom/andrerinas/openheadunit/utils/AppLog$Logger;", "Ljava/io/Closeable;", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "closed", "", "dateFormat", "Ljava/text/SimpleDateFormat;", "dropped", "Ljava/util/concurrent/atomic/AtomicInteger;", "getFile", "()Ljava/io/File;", "queue", "Ljava/util/concurrent/ArrayBlockingQueue;", "", "writer", "Ljava/io/BufferedWriter;", "close", "", "drainLoop", "println", "priority", "", "tag", "", "msg", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class File implements com.andrerinas.openheadunit.utils.AppLog.Logger, java.io.Closeable {
            @org.jetbrains.annotations.NotNull()
            private final java.io.File file = null;
            @org.jetbrains.annotations.NotNull()
            private final java.io.BufferedWriter writer = null;
            @org.jetbrains.annotations.NotNull()
            private final java.text.SimpleDateFormat dateFormat = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.concurrent.ArrayBlockingQueue<java.lang.Object> queue = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.concurrent.atomic.AtomicInteger dropped = null;
            @kotlin.jvm.Volatile()
            private volatile boolean closed = false;
            @java.lang.Deprecated()
            public static final int QUEUE_CAPACITY = 4096;
            
            /**
             * End marker; a distinct type so it can never collide with a real line.
             */
            @org.jetbrains.annotations.NotNull()
            private static final java.lang.Object POISON = null;
            @org.jetbrains.annotations.NotNull()
            private static final com.andrerinas.openheadunit.utils.AppLog.Logger.File.Companion Companion = null;
            
            public File(@org.jetbrains.annotations.NotNull()
            java.io.File file) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.io.File getFile() {
                return null;
            }
            
            @java.lang.Override()
            public void println(int priority, @org.jetbrains.annotations.NotNull()
            java.lang.String tag, @org.jetbrains.annotations.NotNull()
            java.lang.String msg) {
            }
            
            private final void drainLoop() {
            }
            
            /**
             * Deliberately does not wait for the writer to finish. `close()` runs on the main thread
             * from [AppLog.init] every time the log settings change, and joining a thread that is
             * mid-flush to slow eMMC there is an ANR waiting to happen. The drain thread owns the
             * writer and flushes and closes it once it sees the sentinel, so the file still ends up
             * complete — just a moment later.
             */
            @java.lang.Override()
            public void close() {
            }
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/andrerinas/openheadunit/utils/AppLog$Logger$File$Companion;", "", "()V", "POISON", "getPOISON", "()Ljava/lang/Object;", "QUEUE_CAPACITY", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
                
                /**
                 * End marker; a distinct type so it can never collide with a real line.
                 */
                @org.jetbrains.annotations.NotNull()
                public final java.lang.Object getPOISON() {
                    return null;
                }
            }
        }
    }
}