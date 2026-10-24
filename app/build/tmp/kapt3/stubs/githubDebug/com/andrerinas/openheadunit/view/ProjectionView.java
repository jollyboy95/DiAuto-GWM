package com.andrerinas.openheadunit.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0014J(\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0014J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0018\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0016J\u0018\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0016J(\u0010&\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0016J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020(H\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/andrerinas/openheadunit/view/ProjectionView;", "Landroid/view/SurfaceView;", "Lcom/andrerinas/openheadunit/view/IProjectionView;", "Landroid/view/SurfaceHolder$Callback;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "callbacks", "", "Lcom/andrerinas/openheadunit/view/IProjectionView$Callbacks;", "videoDecoder", "Lcom/andrerinas/openheadunit/decoder/VideoDecoder;", "videoHeight", "videoWidth", "addCallback", "", "callback", "lastFrameDrawnMs", "", "longFrameEvents", "onDetachedFromWindow", "onSizeChanged", "w", "h", "oldw", "oldh", "removeCallback", "setVideoScale", "scaleX", "", "scaleY", "setVideoSize", "width", "height", "surfaceChanged", "holder", "Landroid/view/SurfaceHolder;", "format", "surfaceCreated", "surfaceDestroyed", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ProjectionView extends android.view.SurfaceView implements com.andrerinas.openheadunit.view.IProjectionView, android.view.SurfaceHolder.Callback {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.andrerinas.openheadunit.view.IProjectionView.Callbacks> callbacks = null;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.decoder.VideoDecoder videoDecoder;
    private int videoWidth = 0;
    private int videoHeight = 0;
    
    @kotlin.jvm.JvmOverloads()
    public ProjectionView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override()
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    @java.lang.Override()
    public void surfaceCreated(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder holder) {
    }
    
    @java.lang.Override()
    public void surfaceChanged(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder holder, int format, int width, int height) {
    }
    
    @java.lang.Override()
    public void surfaceDestroyed(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder holder) {
    }
    
    @java.lang.Override()
    public void addCallback(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.view.IProjectionView.Callbacks callback) {
    }
    
    @java.lang.Override()
    public void removeCallback(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.view.IProjectionView.Callbacks callback) {
    }
    
    @java.lang.Override()
    public void setVideoSize(int width, int height) {
    }
    
    @java.lang.Override()
    public void setVideoScale(float scaleX, float scaleY) {
    }
    
    @java.lang.Override()
    public long lastFrameDrawnMs() {
        return 0L;
    }
    
    @java.lang.Override()
    public long longFrameEvents() {
        return 0L;
    }
    
    @kotlin.jvm.JvmOverloads()
    public ProjectionView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ProjectionView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
}