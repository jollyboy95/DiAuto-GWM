package com.andrerinas.openheadunit.extractor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\b\u0010 \u001a\u00020\u0014H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\bH\u0016J,\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0(H\u0016J \u0010\"\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bH\u0016J\u0010\u0010-\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\f\u00a8\u0006/"}, d2 = {"Lcom/andrerinas/openheadunit/extractor/StreamVideoExtractor;", "Lcom/andrerinas/openheadunit/extractor/MediaExtractorInterface;", "()V", "mContentData", "", "mFormat", "Landroid/media/MediaFormat;", "mSampleOffset", "", "<set-?>", "sampleFlags", "getSampleFlags", "()I", "sampleTime", "", "getSampleTime", "()J", "trackCount", "getTrackCount", "advance", "", "findNextNAL", "offset", "findSPS", "getSampleCryptoInfo", "cryptoInfo", "Landroid/media/MediaCodec$CryptoInfo;", "getTrackFormat", "index", "readSampleData", "buffer", "Ljava/nio/ByteBuffer;", "release", "selectTrack", "setDataSource", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "headers", "", "", "content", "width", "height", "unselectTrack", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class StreamVideoExtractor implements com.andrerinas.openheadunit.extractor.MediaExtractorInterface {
    @org.jetbrains.annotations.Nullable()
    private android.media.MediaFormat mFormat;
    @org.jetbrains.annotations.Nullable()
    private byte[] mContentData;
    private int mSampleOffset = -1;
    private int sampleFlags = 0;
    private static final byte SPS_BIT = (byte)103;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.extractor.StreamVideoExtractor.Companion Companion = null;
    
    public StreamVideoExtractor() {
        super();
    }
    
    @java.lang.Override()
    public int getSampleFlags() {
        return 0;
    }
    
    @java.lang.Override()
    public int readSampleData(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer buffer, int offset) {
        return 0;
    }
    
    @java.lang.Override()
    public void getSampleCryptoInfo(@org.jetbrains.annotations.NotNull()
    android.media.MediaCodec.CryptoInfo cryptoInfo) {
    }
    
    @java.lang.Override()
    public void release() {
    }
    
    @java.lang.Override()
    public void setDataSource(@org.jetbrains.annotations.NotNull()
    byte[] content, int width, int height) {
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public void setDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> headers) {
    }
    
    @java.lang.Override()
    public int getTrackCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void unselectTrack(int index) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.media.MediaFormat getTrackFormat(int index) {
        return null;
    }
    
    @java.lang.Override()
    public void selectTrack(int index) {
    }
    
    @java.lang.Override()
    public long getSampleTime() {
        return 0L;
    }
    
    @java.lang.Override()
    public void advance() {
    }
    
    private final int findNextNAL(int offset) {
        return 0;
    }
    
    private final int findSPS() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/andrerinas/openheadunit/extractor/StreamVideoExtractor$Companion;", "", "()V", "SPS_BIT", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}