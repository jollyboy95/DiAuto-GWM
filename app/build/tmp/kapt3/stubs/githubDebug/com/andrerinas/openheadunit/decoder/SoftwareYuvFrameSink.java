package com.andrerinas.openheadunit.decoder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/SoftwareYuvFrameSink;", "", "renderYuv420Frame", "", "width", "", "height", "yPlane", "Ljava/nio/ByteBuffer;", "yStride", "uPlane", "uStride", "vPlane", "vStride", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public abstract interface SoftwareYuvFrameSink {
    
    public abstract boolean renderYuv420Frame(int width, int height, @org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer yPlane, int yStride, @org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer uPlane, int uStride, @org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer vPlane, int vStride);
}