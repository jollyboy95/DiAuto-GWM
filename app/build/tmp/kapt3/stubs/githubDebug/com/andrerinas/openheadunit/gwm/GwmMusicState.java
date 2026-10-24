package com.andrerinas.openheadunit.gwm;

/**
 * Now-playing for the GWM cluster music card, taken from Android Auto's own media playback
 * channel (MediaMetaData and MediaPlaybackStatus), not from Android media sessions. It is fed
 * whatever the "sync media session" setting says, so the card does not depend on it.
 *
 * Artwork is the album_art bytes the phone sends, decoded once per track and scaled down.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001$B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u0012J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmMusicState;", "", "()V", "ARTWORK_PX", "", "<set-?>", "Lcom/andrerinas/openheadunit/gwm/GwmMusicState$Snapshot;", "current", "getCurrent", "()Lcom/andrerinas/openheadunit/gwm/GwmMusicState$Snapshot;", "decoder", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "generation", "main", "Landroid/os/Handler;", "observers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lkotlin/Function1;", "", "clear", "decodeArtwork", "Landroid/graphics/Bitmap;", "bytes", "", "observe", "Lkotlin/Function0;", "observer", "onMetadata", "meta", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaMetaData;", "onStatus", "status", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaPlaybackStatus;", "publish", "next", "Snapshot", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class GwmMusicState {
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.NotNull()
    private static volatile com.andrerinas.openheadunit.gwm.GwmMusicState.Snapshot current;
    @org.jetbrains.annotations.NotNull()
    private static final android.os.Handler main = null;
    private static final java.util.concurrent.ExecutorService decoder = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.CopyOnWriteArraySet<kotlin.jvm.functions.Function1<com.andrerinas.openheadunit.gwm.GwmMusicState.Snapshot, kotlin.Unit>> observers = null;
    @kotlin.jvm.Volatile()
    private static volatile int generation = 0;
    
    /**
     * The music card shows artwork at roughly 100 px on a 720 px tall cluster.
     */
    private static final int ARTWORK_PX = 192;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.gwm.GwmMusicState INSTANCE = null;
    
    private GwmMusicState() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.gwm.GwmMusicState.Snapshot getCurrent() {
        return null;
    }
    
    /**
     * Observers run on the main thread. Returns a function that stops observing.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> observe(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.gwm.GwmMusicState.Snapshot, kotlin.Unit> observer) {
        return null;
    }
    
    public final void onMetadata(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData meta) {
    }
    
    public final void onStatus(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaPlaybackStatus status) {
    }
    
    /**
     * The phone disconnected: nothing it reported still applies.
     */
    public final void clear() {
    }
    
    private final void publish(com.andrerinas.openheadunit.gwm.GwmMusicState.Snapshot next) {
    }
    
    private final android.graphics.Bitmap decodeArtwork(byte[] bytes) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010$\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010%\u001a\u00020\fH\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003Jj\u0010\'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\u0017\u0010-\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010.\u001a\u00020\t\u00a2\u0006\u0002\u0010/J\t\u00100\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\r\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0010\u00a8\u00061"}, d2 = {"Lcom/andrerinas/openheadunit/gwm/GwmMusicState$Snapshot;", "", "title", "", "artist", "album", "artwork", "Landroid/graphics/Bitmap;", "durationMillis", "", "positionMillis", "playing", "", "positionAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/Long;Ljava/lang/Long;ZJ)V", "getAlbum", "()Ljava/lang/String;", "getArtist", "getArtwork", "()Landroid/graphics/Bitmap;", "getDurationMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "hasTrack", "getHasTrack", "()Z", "getPlaying", "getPositionAt", "()J", "getPositionMillis", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/Long;Ljava/lang/Long;ZJ)Lcom/andrerinas/openheadunit/gwm/GwmMusicState$Snapshot;", "equals", "other", "hashCode", "", "positionNow", "now", "(J)Ljava/lang/Long;", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Snapshot {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String artist = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String album = null;
        @org.jetbrains.annotations.Nullable()
        private final android.graphics.Bitmap artwork = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long durationMillis = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long positionMillis = null;
        private final boolean playing = false;
        
        /**
         * elapsedRealtime of the last position report, for advancing the bar between reports.
         */
        private final long positionAt = 0L;
        
        public Snapshot(@org.jetbrains.annotations.Nullable()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String artist, @org.jetbrains.annotations.Nullable()
        java.lang.String album, @org.jetbrains.annotations.Nullable()
        android.graphics.Bitmap artwork, @org.jetbrains.annotations.Nullable()
        java.lang.Long durationMillis, @org.jetbrains.annotations.Nullable()
        java.lang.Long positionMillis, boolean playing, long positionAt) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getArtist() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAlbum() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.Bitmap getArtwork() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getDurationMillis() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getPositionMillis() {
            return null;
        }
        
        public final boolean getPlaying() {
            return false;
        }
        
        /**
         * elapsedRealtime of the last position report, for advancing the bar between reports.
         */
        public final long getPositionAt() {
            return 0L;
        }
        
        public final boolean getHasTrack() {
            return false;
        }
        
        /**
         * Position now, advanced from the last report while playing, never beyond the duration.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long positionNow(long now) {
            return null;
        }
        
        public Snapshot() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.Bitmap component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component6() {
            return null;
        }
        
        public final boolean component7() {
            return false;
        }
        
        public final long component8() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.gwm.GwmMusicState.Snapshot copy(@org.jetbrains.annotations.Nullable()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String artist, @org.jetbrains.annotations.Nullable()
        java.lang.String album, @org.jetbrains.annotations.Nullable()
        android.graphics.Bitmap artwork, @org.jetbrains.annotations.Nullable()
        java.lang.Long durationMillis, @org.jetbrains.annotations.Nullable()
        java.lang.Long positionMillis, boolean playing, long positionAt) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}