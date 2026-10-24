package com.andrerinas.openheadunit.extractor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\rH&J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0003H&J,\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0 H&J \u0010\u001a\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H&J\u0010\u0010&\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005\u00a8\u0006\'"}, d2 = {"Lcom/andrerinas/openheadunit/extractor/MediaExtractorInterface;", "", "sampleFlags", "", "getSampleFlags", "()I", "sampleTime", "", "getSampleTime", "()J", "trackCount", "getTrackCount", "advance", "", "getSampleCryptoInfo", "cryptoInfo", "Landroid/media/MediaCodec$CryptoInfo;", "getTrackFormat", "Landroid/media/MediaFormat;", "index", "readSampleData", "buffer", "Ljava/nio/ByteBuffer;", "offset", "release", "selectTrack", "setDataSource", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "headers", "", "", "content", "", "width", "height", "unselectTrack", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public abstract interface MediaExtractorInterface {
    
    public abstract int readSampleData(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer buffer, int offset);
    
    public abstract void getSampleCryptoInfo(@org.jetbrains.annotations.NotNull()
    android.media.MediaCodec.CryptoInfo cryptoInfo);
    
    public abstract void release();
    
    public abstract void setDataSource(@org.jetbrains.annotations.NotNull()
    byte[] content, int width, int height);
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public abstract void setDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> headers);
    
    public abstract int getTrackCount();
    
    public abstract void unselectTrack(int index);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.media.MediaFormat getTrackFormat(int index);
    
    public abstract void selectTrack(int index);
    
    public abstract int getSampleFlags();
    
    public abstract long getSampleTime();
    
    public abstract void advance();
}