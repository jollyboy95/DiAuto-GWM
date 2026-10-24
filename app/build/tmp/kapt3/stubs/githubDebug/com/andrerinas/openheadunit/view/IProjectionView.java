package com.andrerinas.openheadunit.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&\u00a8\u0006\u0013"}, d2 = {"Lcom/andrerinas/openheadunit/view/IProjectionView;", "", "addCallback", "", "callback", "Lcom/andrerinas/openheadunit/view/IProjectionView$Callbacks;", "lastFrameDrawnMs", "", "longFrameEvents", "removeCallback", "setVideoScale", "scaleX", "", "scaleY", "setVideoSize", "width", "", "height", "Callbacks", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public abstract interface IProjectionView {
    
    public abstract void addCallback(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.view.IProjectionView.Callbacks callback);
    
    public abstract void removeCallback(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.view.IProjectionView.Callbacks callback);
    
    public abstract void setVideoSize(int width, int height);
    
    public abstract void setVideoScale(float scaleX, float scaleY);
    
    /**
     * elapsedRealtime() of the last frame this view's display consumer actually drew,
     * or 0 if none yet. Returns -1 when the backend cannot report it (a plain SurfaceView
     * is composited by SurfaceFlinger with no draw callback). The projection watchdog uses
     * this to detect a frozen display while the decoder keeps producing frames (issue #650):
     * decoder still releasing frames but consumer not drawing means the picture is stuck.
     */
    public abstract long lastFrameDrawnMs();
    
    /**
     * Monotonic count of abnormally long gaps between consecutive drawn frames since this view
     * was created. On MediaTek/GLES the consumer does not fully stop but collapses to a few fps
     * with single frames taking up to ~2s, so a plain "no frame for N seconds" check misses it;
     * this counter lets the watchdog catch that throughput collapse (issue #650). Returns 0 for
     * backends that cannot observe per-frame draws (SurfaceView).
     */
    public abstract long longFrameEvents();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/view/IProjectionView$Callbacks;", "", "onSurfaceChanged", "", "surface", "Landroid/view/Surface;", "width", "", "height", "onSurfaceCreated", "onSurfaceDestroyed", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static abstract interface Callbacks {
        
        public abstract void onSurfaceCreated(@org.jetbrains.annotations.NotNull()
        android.view.Surface surface);
        
        public abstract void onSurfaceDestroyed(@org.jetbrains.annotations.NotNull()
        android.view.Surface surface);
        
        public abstract void onSurfaceChanged(@org.jetbrains.annotations.NotNull()
        android.view.Surface surface, int width, int height);
    }
}