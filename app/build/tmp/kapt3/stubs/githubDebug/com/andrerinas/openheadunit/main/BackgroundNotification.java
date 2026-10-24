package com.andrerinas.openheadunit.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J.\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/main/BackgroundNotification;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cancel", "", "formatAsMmSs", "", "totalSeconds", "", "notify", "metadata", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaMetaData;", "playbackSeconds", "isPlaying", "", "albumArtBitmap", "Landroid/graphics/Bitmap;", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BackgroundNotification {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private static final int NOTIFICATION_MEDIA = 2;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String mediaChannel = "media_v2";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.main.BackgroundNotification.Companion Companion = null;
    
    public BackgroundNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void notify(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData metadata, long playbackSeconds, boolean isPlaying, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap albumArtBitmap) {
    }
    
    public final void cancel() {
    }
    
    private final java.lang.String formatAsMmSs(long totalSeconds) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/main/BackgroundNotification$Companion;", "", "()V", "NOTIFICATION_MEDIA", "", "mediaChannel", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}