package com.andrerinas.openheadunit.decoder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007JH\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0007H\u0003J\b\u0010\u001c\u001a\u00020\u0007H\u0002J\u0006\u0010\u001d\u001a\u00020\u000bJ\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/FfmpegHevcDecoder;", "", "surface", "Landroid/view/Surface;", "yuvFrameSink", "Lcom/andrerinas/openheadunit/decoder/SoftwareYuvFrameSink;", "width", "", "height", "(Landroid/view/Surface;Lcom/andrerinas/openheadunit/decoder/SoftwareYuvFrameSink;II)V", "isStarted", "", "()Z", "nativeHandle", "", "decode", "buffer", "", "offset", "size", "onNativeYuv420Frame", "yPlane", "Ljava/nio/ByteBuffer;", "yStride", "uPlane", "uStride", "vPlane", "vStride", "recommendedThreadCount", "start", "stop", "", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
@androidx.annotation.Keep()
public final class FfmpegHevcDecoder {
    @org.jetbrains.annotations.Nullable()
    private final android.view.Surface surface = null;
    @org.jetbrains.annotations.Nullable()
    private final com.andrerinas.openheadunit.decoder.SoftwareYuvFrameSink yuvFrameSink = null;
    private final int width = 0;
    private final int height = 0;
    private long nativeHandle = 0L;
    private static final boolean libraryLoaded = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.FfmpegHevcDecoder.Companion Companion = null;
    
    public FfmpegHevcDecoder(@org.jetbrains.annotations.Nullable()
    android.view.Surface surface, @org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.decoder.SoftwareYuvFrameSink yuvFrameSink, int width, int height) {
        super();
    }
    
    public final boolean isStarted() {
        return false;
    }
    
    public final boolean start() {
        return false;
    }
    
    public final int decode(@org.jetbrains.annotations.NotNull()
    byte[] buffer, int offset, int size) {
        return 0;
    }
    
    public final void stop() {
    }
    
    private final int recommendedThreadCount() {
        return 0;
    }
    
    @androidx.annotation.Keep()
    @kotlin.Suppress(names = {"unused"})
    private final boolean onNativeYuv420Frame(int width, int height, java.nio.ByteBuffer yPlane, int yStride, java.nio.ByteBuffer uPlane, int uStride, java.nio.ByteBuffer vPlane, int vStride) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J;\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0082 J1\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0007H\u0082 J\t\u0010\u0018\u001a\u00020\u0004H\u0082 J\u0011\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0007H\u0082 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/FfmpegHevcDecoder$Companion;", "", "()V", "libraryLoaded", "", "isAvailable", "nativeCreate", "", "surface", "Landroid/view/Surface;", "callback", "Lcom/andrerinas/openheadunit/decoder/FfmpegHevcDecoder;", "useYuvCallback", "width", "", "height", "threadCount", "nativeDecode", "handle", "buffer", "", "offset", "size", "presentationTimeUs", "nativeIsAvailable", "nativeRelease", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isAvailable() {
            return false;
        }
        
        private final native boolean nativeIsAvailable() {
            return false;
        }
        
        private final native long nativeCreate(android.view.Surface surface, com.andrerinas.openheadunit.decoder.FfmpegHevcDecoder callback, boolean useYuvCallback, int width, int height, int threadCount) {
            return 0L;
        }
        
        private final native int nativeDecode(long handle, byte[] buffer, int offset, int size, long presentationTimeUs) {
            return 0;
        }
        
        private final native void nativeRelease(long handle) {
        }
    }
}