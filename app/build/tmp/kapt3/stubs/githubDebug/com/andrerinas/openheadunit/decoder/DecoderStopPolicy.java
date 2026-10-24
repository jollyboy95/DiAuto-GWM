package com.andrerinas.openheadunit.decoder;

/**
 * Decides whether a [VideoDecoder.stop] call ends the projection session or only tears the decoder
 * down while the phone keeps streaming.
 *
 * The distinction matters because some of the decoder's state describes the *stream* rather than
 * the decoder instance - the pinned codec type above all - and throwing it away while the stream is
 * still running forces a re-detection on whatever mid-stream packet happens to arrive next. That
 * heuristic cannot tell an ordinary H.264 P-slice header (0x41) from an HEVC VPS, so the re-detect
 * can hand an H.264 stream an HEVC decoder.
 *
 * Anything not listed here ends the session, so an unrecognised reason keeps the old behaviour of
 * resetting everything.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DecoderStopPolicy;", "", "()V", "REASON_DETACHED_FROM_WINDOW", "", "REASON_NEW_SURFACE", "REASON_PROJECTION_VIEW_RECREATE", "REASON_SURFACE_DESTROYED", "RESTART_PREFIX", "SURFACE_LIFECYCLE_REASONS", "", "endsSession", "", "reason", "isDecoderRestart", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class DecoderStopPolicy {
    
    /**
     * The projection surface went away; the AAP session is untouched.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REASON_SURFACE_DESTROYED = "surfaceDestroyed";
    
    /**
     * The projection view left the window hierarchy; the AAP session is untouched.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REASON_DETACHED_FROM_WINDOW = "onDetachedFromWindow";
    
    /**
     * The projection view is being swapped for another backend; the AAP session is untouched.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REASON_PROJECTION_VIEW_RECREATE = "projectionViewRecreate";
    
    /**
     * A new surface replaced the old one; the AAP session is untouched.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REASON_NEW_SURFACE = "New surface";
    
    /**
     * Prefix used by the decoder's own recovery restarts, which have never ended the session.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String RESTART_PREFIX = "restart";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<java.lang.String> SURFACE_LIFECYCLE_REASONS = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.DecoderStopPolicy INSTANCE = null;
    
    private DecoderStopPolicy() {
        super();
    }
    
    /**
     * True when the decoder is tearing itself down to come straight back up.
     */
    public final boolean isDecoderRestart(@org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
        return false;
    }
    
    /**
     * True when [reason] means the phone has gone away and every piece of session state should be
     * reset. False for the decoder's own restarts and for the surface lifecycle, where the stream
     * outlives the decoder.
     */
    public final boolean endsSession(@org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
        return false;
    }
}