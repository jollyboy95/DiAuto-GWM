package com.andrerinas.openheadunit.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0014J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016JH\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u000e\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%J\u0018\u0010&\u001a\u00020\r2\u0006\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020%H\u0016J\u0018\u0010)\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/andrerinas/openheadunit/view/GlProjectionView;", "Landroid/opengl/GLSurfaceView;", "Lcom/andrerinas/openheadunit/view/IProjectionView;", "Lcom/andrerinas/openheadunit/decoder/SoftwareYuvFrameSink;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "callbacks", "", "Lcom/andrerinas/openheadunit/view/IProjectionView$Callbacks;", "renderer", "Lcom/andrerinas/openheadunit/view/GlProjectionView$VideoRenderer;", "addCallback", "", "callback", "getSurface", "Landroid/view/Surface;", "isSurfaceValid", "", "lastFrameDrawnMs", "", "longFrameEvents", "onDetachedFromWindow", "removeCallback", "renderYuv420Frame", "width", "", "height", "yPlane", "Ljava/nio/ByteBuffer;", "yStride", "uPlane", "uStride", "vPlane", "vStride", "setDesaturation", "value", "", "setVideoScale", "scaleX", "scaleY", "setVideoSize", "VideoRenderer", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class GlProjectionView extends android.opengl.GLSurfaceView implements com.andrerinas.openheadunit.view.IProjectionView, com.andrerinas.openheadunit.decoder.SoftwareYuvFrameSink {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.view.GlProjectionView.VideoRenderer renderer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.andrerinas.openheadunit.view.IProjectionView.Callbacks> callbacks = null;
    
    public GlProjectionView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    public void addCallback(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.view.IProjectionView.Callbacks callback) {
    }
    
    @java.lang.Override()
    public void removeCallback(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.view.IProjectionView.Callbacks callback) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.Surface getSurface() {
        return null;
    }
    
    public final boolean isSurfaceValid() {
        return false;
    }
    
    @java.lang.Override()
    public long lastFrameDrawnMs() {
        return 0L;
    }
    
    @java.lang.Override()
    public long longFrameEvents() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setVideoSize(int width, int height) {
    }
    
    @java.lang.Override()
    public void setVideoScale(float scaleX, float scaleY) {
    }
    
    public final void setDesaturation(float value) {
    }
    
    @java.lang.Override()
    public boolean renderYuv420Frame(int width, int height, @org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer yPlane, int yStride, @org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer uPlane, int uStride, @org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer vPlane, int vStride) {
        return false;
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u0010H\u0002J0\u0010[\u001a\u00020X2\u0006\u0010\\\u001a\u0002092\u0006\u0010]\u001a\u00020\u00072\u0006\u0010^\u001a\u0002092\u0006\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u0007H\u0002J\b\u0010a\u001a\u00020XH\u0002J\u0018\u0010b\u001a\u00020X2\u0006\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u0007H\u0002J\b\u0010c\u001a\u0004\u0018\u000101J \u0010d\u001a\u00020\f2\u0006\u0010e\u001a\u0002092\u0006\u0010f\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u0007H\u0002J\u0018\u0010g\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u00072\u0006\u0010i\u001a\u00020\u0010H\u0002J\b\u0010j\u001a\u00020XH\u0002J\u0012\u0010k\u001a\u00020X2\b\u0010l\u001a\u0004\u0018\u00010mH\u0016J\u0012\u0010n\u001a\u00020X2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\"\u0010o\u001a\u00020X2\b\u0010l\u001a\u0004\u0018\u00010m2\u0006\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u0007H\u0016J\u001c\u0010p\u001a\u00020X2\b\u0010l\u001a\u0004\u0018\u00010m2\b\u0010q\u001a\u0004\u0018\u00010rH\u0016JF\u0010s\u001a\u00020\f2\u0006\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u00072\u0006\u0010t\u001a\u0002092\u0006\u0010u\u001a\u00020\u00072\u0006\u0010v\u001a\u0002092\u0006\u0010w\u001a\u00020\u00072\u0006\u0010x\u001a\u0002092\u0006\u0010y\u001a\u00020\u0007J\u0006\u0010z\u001a\u00020XJF\u0010{\u001a\u00020\f2\u0006\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u00072\u0006\u0010t\u001a\u0002092\u0006\u0010u\u001a\u00020\u00072\u0006\u0010v\u001a\u0002092\u0006\u0010w\u001a\u00020\u00072\u0006\u0010x\u001a\u0002092\u0006\u0010y\u001a\u00020\u0007J\u000e\u0010|\u001a\u00020X2\u0006\u0010}\u001a\u00020\u0005J\u0017\u0010~\u001a\u00020X2\u0006\u0010\u007f\u001a\u00020\u00052\u0007\u0010\u0080\u0001\u001a\u00020\u0005J\u0017\u0010\u0081\u0001\u001a\u00020X2\u0006\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u0007JI\u0010\u0082\u0001\u001a\u00020\f2\u0006\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u00072\u0006\u0010t\u001a\u0002092\u0006\u0010u\u001a\u00020\u00072\u0006\u0010v\u001a\u0002092\u0006\u0010w\u001a\u00020\u00072\u0006\u0010x\u001a\u0002092\u0006\u0010y\u001a\u00020\u0007H\u0002J2\u0010\u0083\u0001\u001a\u00020X2\u0007\u0010\u0084\u0001\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u0010e\u001a\u0002092\u0006\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u000e\u0010!\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0085\u0001"}, d2 = {"Lcom/andrerinas/openheadunit/view/GlProjectionView$VideoRenderer;", "Landroid/opengl/GLSurfaceView$Renderer;", "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;", "(Lcom/andrerinas/openheadunit/view/GlProjectionView;)V", "desaturation", "", "directCancelled", "", "directDone", "directPending", "directRunning", "directUploadTimedOut", "", "directUploadTimeoutMs", "", "fragmentShaderCode", "", "frameSequence", "hasYuvFrame", "lastFrameDrawnMs", "getLastFrameDrawnMs", "()J", "setLastFrameDrawnMs", "(J)V", "lastOesFrameSeq", "lastYuvFrameSeq", "loggedFirstDirectYuvFrame", "loggedFirstYuvDraw", "loggedFirstYuvFrame", "loggedFirstYuvUpload", "longFrameEvents", "getLongFrameEvents", "setLongFrameEvents", "longFrameThresholdMs", "mScaleX", "mScaleY", "mVPMatrix", "", "maPositionHandle", "maTextureHandle", "muDesaturationHandle", "muMVPMatrixHandle", "muSTMatrixHandle", "pendingYuvFrame", "prevDrawMs", "program", "sSTMatrix", "squareCoords", "surface", "Landroid/view/Surface;", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "textureBuffer", "Ljava/nio/FloatBuffer;", "textureCoords", "textureId", "uPlaneBuffer", "Ljava/nio/ByteBuffer;", "uTextureHandle", "uTextureScaleHandle", "uTextureScaleX", "updateSurface", "uploadedPlaneHeights", "", "uploadedPlaneWidths", "vPlaneBuffer", "vTextureHandle", "vTextureScaleHandle", "vTextureScaleX", "vertexBuffer", "vertexShaderCode", "yPlaneBuffer", "yTextureHandle", "yTextureScaleHandle", "yTextureScaleX", "yuvDesaturationHandle", "yuvFragmentShaderCode", "yuvHeight", "yuvMVPMatrixHandle", "yuvPositionHandle", "yuvProgram", "yuvSTMatrixHandle", "yuvTextureBuffer", "yuvTextureCoords", "yuvTextureHandle", "yuvTextureIds", "yuvWidth", "checkProgram", "", "programId", "label", "copyPlane", "source", "sourceStride", "dest", "width", "height", "drawYuvFrame", "ensureYuvBuffers", "getSurface", "hasPlaneCapacity", "buffer", "stride", "loadShader", "type", "shaderCode", "markFrameDrawn", "onDrawFrame", "gl", "Ljavax/microedition/khronos/opengles/GL10;", "onFrameAvailable", "onSurfaceChanged", "onSurfaceCreated", "config", "Ljavax/microedition/khronos/egl/EGLConfig;", "queueYuv420Frame", "yPlane", "yStride", "uPlane", "uStride", "vPlane", "vStride", "release", "renderYuv420FrameDirect", "setDesaturation", "value", "setScale", "x", "y", "updateBufferSize", "uploadDirectYuvFrame", "uploadYuvPlane", "index", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    final class VideoRenderer implements android.opengl.GLSurfaceView.Renderer, android.graphics.SurfaceTexture.OnFrameAvailableListener {
        @org.jetbrains.annotations.Nullable()
        private android.graphics.SurfaceTexture surfaceTexture;
        @org.jetbrains.annotations.Nullable()
        private android.view.Surface surface;
        private int textureId = 0;
        private int program = 0;
        private int yuvProgram = 0;
        @org.jetbrains.annotations.NotNull()
        private final int[] yuvTextureIds = null;
        @org.jetbrains.annotations.NotNull()
        private float[] mVPMatrix;
        @org.jetbrains.annotations.NotNull()
        private float[] sSTMatrix;
        private float mScaleX = 1.0F;
        private float mScaleY = 1.0F;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String vertexShaderCode = "\n            attribute vec4 aPosition;\n            attribute vec4 aTextureCoord;\n            varying vec2 vTextureCoord;\n            uniform mat4 uMVPMatrix;\n            uniform mat4 uSTMatrix;\n            void main() {\n                gl_Position = uMVPMatrix * aPosition;\n                vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n            }\n        ";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fragmentShaderCode = "\n            #extension GL_OES_EGL_image_external : require\n            precision mediump float;\n            varying vec2 vTextureCoord;\n            uniform samplerExternalOES sTexture;\n            uniform float uDesaturation;\n            void main() {\n                vec4 color = texture2D(sTexture, vTextureCoord);\n                float gray = dot(color.rgb, vec3(0.299, 0.587, 0.114));\n                gl_FragColor = vec4(mix(color.rgb, vec3(gray), uDesaturation), color.a);\n            }\n        ";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String yuvFragmentShaderCode = "\n            precision mediump float;\n            varying vec2 vTextureCoord;\n            uniform sampler2D yTexture;\n            uniform sampler2D uTexture;\n            uniform sampler2D vTexture;\n            uniform float uDesaturation;\n            uniform float yTextureScaleX;\n            uniform float uTextureScaleX;\n            uniform float vTextureScaleX;\n            void main() {\n                float y = 1.164383 * (texture2D(yTexture, vec2(vTextureCoord.x * yTextureScaleX, vTextureCoord.y)).r - 0.0625);\n                float u = texture2D(uTexture, vec2(vTextureCoord.x * uTextureScaleX, vTextureCoord.y)).r - 0.5;\n                float v = texture2D(vTexture, vec2(vTextureCoord.x * vTextureScaleX, vTextureCoord.y)).r - 0.5;\n                vec3 rgb;\n                rgb.r = y + 1.792741 * v;\n                rgb.g = y - 0.213249 * u - 0.532909 * v;\n                rgb.b = y + 2.112402 * u;\n                rgb = clamp(rgb, 0.0, 1.0);\n                float gray = dot(rgb, vec3(0.299, 0.587, 0.114));\n                gl_FragColor = vec4(mix(rgb, vec3(gray), uDesaturation), 1.0);\n            }\n        ";
        @org.jetbrains.annotations.Nullable()
        private java.nio.FloatBuffer vertexBuffer;
        @org.jetbrains.annotations.NotNull()
        private final float[] squareCoords = {-1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F};
        @org.jetbrains.annotations.NotNull()
        private final float[] textureCoords = {0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F};
        @org.jetbrains.annotations.Nullable()
        private java.nio.FloatBuffer textureBuffer;
        @org.jetbrains.annotations.NotNull()
        private final float[] yuvTextureCoords = {0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F};
        @org.jetbrains.annotations.Nullable()
        private java.nio.FloatBuffer yuvTextureBuffer;
        private int maPositionHandle = 0;
        private int maTextureHandle = 0;
        private int muMVPMatrixHandle = 0;
        private int muSTMatrixHandle = 0;
        private int muDesaturationHandle = 0;
        private int yuvPositionHandle = 0;
        private int yuvTextureHandle = 0;
        private int yuvMVPMatrixHandle = 0;
        private int yuvSTMatrixHandle = 0;
        private int yuvDesaturationHandle = 0;
        private int yTextureHandle = 0;
        private int uTextureHandle = 0;
        private int vTextureHandle = 0;
        private int yTextureScaleHandle = 0;
        private int uTextureScaleHandle = 0;
        private int vTextureScaleHandle = 0;
        @kotlin.jvm.Volatile()
        private volatile float desaturation = 0.0F;
        @kotlin.jvm.Volatile()
        private volatile long lastFrameDrawnMs = 0L;
        @kotlin.jvm.Volatile()
        private volatile long longFrameEvents = 0L;
        private long prevDrawMs = 0L;
        private final long longFrameThresholdMs = 1200L;
        private boolean updateSurface = false;
        private boolean hasYuvFrame = false;
        private boolean pendingYuvFrame = false;
        
        /**
         * Which of the two frame sources produced something most recently.
         *
         * This renderer can be fed two ways: the decoder renders into [surfaceTexture] and the GL
         * thread samples it as an external texture, or the bundled software decoder hands over YUV
         * planes and the GL thread uploads them itself. [hasYuvFrame] used to latch true on the first
         * YUV frame and never clear, so once a single software-decoded frame had been drawn the
         * external-texture path was dead for the life of the renderer - and any later hardware output
         * went into the SurfaceTexture and was never sampled. Turning software decoding off without
         * reconnecting left a frozen or black picture.
         *
         * Comparing sequence numbers instead of latching a flag makes the choice self-healing: the
         * source that is actually producing frames wins, and a switch either way is corrected on the
         * next draw without anything having to tell the renderer it happened.
         */
        private long frameSequence = 0L;
        private long lastOesFrameSeq = 0L;
        private long lastYuvFrameSeq = 0L;
        
        /**
         * Set once the direct upload has missed its deadline, after which only the staged path is used.
         *
         * The direct path hands the codec's own buffers to the GL thread and waits up to
         * [directUploadTimeoutMs] for the upload to finish, which saves a CPU copy of three planes when
         * the GL thread is keeping up. When it is not, the caller - the decoder thread - pays the full
         * timeout *and then does the staged copy anyway*, which is the worst of both and was happening
         * per frame. A GL thread slow enough to miss the deadline once is not going to start making it,
         * so stop asking: the cost becomes one missed deadline a session instead of one per frame.
         */
        @kotlin.jvm.Volatile()
        private volatile boolean directUploadTimedOut = false;
        private int yuvWidth = 0;
        private int yuvHeight = 0;
        @org.jetbrains.annotations.NotNull()
        private final int[] uploadedPlaneWidths = null;
        @org.jetbrains.annotations.NotNull()
        private final int[] uploadedPlaneHeights = null;
        private float yTextureScaleX = 1.0F;
        private float uTextureScaleX = 1.0F;
        private float vTextureScaleX = 1.0F;
        @org.jetbrains.annotations.Nullable()
        private java.nio.ByteBuffer yPlaneBuffer;
        @org.jetbrains.annotations.Nullable()
        private java.nio.ByteBuffer uPlaneBuffer;
        @org.jetbrains.annotations.Nullable()
        private java.nio.ByteBuffer vPlaneBuffer;
        private boolean loggedFirstYuvFrame = false;
        private boolean loggedFirstDirectYuvFrame = false;
        private boolean loggedFirstYuvUpload = false;
        private boolean loggedFirstYuvDraw = false;
        private final int directPending = 0;
        private final int directRunning = 1;
        private final int directDone = 2;
        private final int directCancelled = 3;
        private final long directUploadTimeoutMs = 50L;
        
        public VideoRenderer() {
            super();
        }
        
        /**
         * Resizes the texture's default buffer, on the GL thread.
         *
         * Called from the main thread when the video dimensions change, and it used to touch the
         * SurfaceTexture straight from there while the GL thread was inside updateTexImage.
         */
        public final void updateBufferSize(int width, int height) {
        }
        
        public final void setScale(float x, float y) {
        }
        
        public final long getLastFrameDrawnMs() {
            return 0L;
        }
        
        public final void setLastFrameDrawnMs(long p0) {
        }
        
        public final long getLongFrameEvents() {
            return 0L;
        }
        
        public final void setLongFrameEvents(long p0) {
        }
        
        private final void markFrameDrawn() {
        }
        
        public final void setDesaturation(float value) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.view.Surface getSurface() {
            return null;
        }
        
        public final boolean queueYuv420Frame(int width, int height, @org.jetbrains.annotations.NotNull()
        java.nio.ByteBuffer yPlane, int yStride, @org.jetbrains.annotations.NotNull()
        java.nio.ByteBuffer uPlane, int uStride, @org.jetbrains.annotations.NotNull()
        java.nio.ByteBuffer vPlane, int vStride) {
            return false;
        }
        
        public final boolean renderYuv420FrameDirect(int width, int height, @org.jetbrains.annotations.NotNull()
        java.nio.ByteBuffer yPlane, int yStride, @org.jetbrains.annotations.NotNull()
        java.nio.ByteBuffer uPlane, int uStride, @org.jetbrains.annotations.NotNull()
        java.nio.ByteBuffer vPlane, int vStride) {
            return false;
        }
        
        private final void ensureYuvBuffers(int width, int height) {
        }
        
        private final void copyPlane(java.nio.ByteBuffer source, int sourceStride, java.nio.ByteBuffer dest, int width, int height) {
        }
        
        private final boolean hasPlaneCapacity(java.nio.ByteBuffer buffer, int stride, int height) {
            return false;
        }
        
        private final boolean uploadDirectYuvFrame(int width, int height, java.nio.ByteBuffer yPlane, int yStride, java.nio.ByteBuffer uPlane, int uStride, java.nio.ByteBuffer vPlane, int vStride) {
            return false;
        }
        
        /**
         * Tears the render target down, telling the decoder before the Surface is actually gone.
         *
         * The notification has to be posted to the main looper because that is where every other
         * surface callback is delivered from, and it used to be posted *and then* followed by two
         * synchronous release() calls - so for one looper turn the decoder still held a Surface that
         * had already been released. Releasing inside the same post closes that window; the fields are
         * cleared first so a second call cannot release twice.
         */
        public final void release() {
        }
        
        @java.lang.Override()
        public void onSurfaceCreated(@org.jetbrains.annotations.Nullable()
        javax.microedition.khronos.opengles.GL10 gl, @org.jetbrains.annotations.Nullable()
        javax.microedition.khronos.egl.EGLConfig config) {
        }
        
        @java.lang.Override()
        public void onSurfaceChanged(@org.jetbrains.annotations.Nullable()
        javax.microedition.khronos.opengles.GL10 gl, int width, int height) {
        }
        
        @java.lang.Override()
        public void onDrawFrame(@org.jetbrains.annotations.Nullable()
        javax.microedition.khronos.opengles.GL10 gl) {
        }
        
        private final void drawYuvFrame() {
        }
        
        private final void uploadYuvPlane(int index, int textureId, java.nio.ByteBuffer buffer, int width, int height) {
        }
        
        @java.lang.Override()
        public void onFrameAvailable(@org.jetbrains.annotations.Nullable()
        android.graphics.SurfaceTexture surfaceTexture) {
        }
        
        private final int loadShader(int type, java.lang.String shaderCode) {
            return 0;
        }
        
        private final void checkProgram(int programId, java.lang.String label) {
        }
    }
}