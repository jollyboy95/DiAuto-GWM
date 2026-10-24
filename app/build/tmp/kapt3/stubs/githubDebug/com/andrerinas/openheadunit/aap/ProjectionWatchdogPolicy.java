package com.andrerinas.openheadunit.aap;

/**
 * Decides when the projection activity's recovery watchdog keeps running, when a stopped picture is
 * worth telling the user about, and when it is worth asking the phone for video again.
 *
 * The last two used to be one decision, and separating them is the point of this object: a picture
 * that has stopped is always worth a recovery request and only sometimes worth an overlay.
 *
 * Extracted because the previous inline check cost the watchdog its life on the first tick of
 * every session: it accepted only [CommManager.ConnectionState.HandshakeComplete], but that state
 * is a brief window before video starts - the steady state for the whole drive is
 * [CommManager.ConnectionState.TransportStarted] - and the runnable returned without re-posting
 * itself. Everything hanging off it (the reconnecting overlay, display-stall recovery, the
 * renderer-confirm offer) was unreachable in a normal session, so a video stream that died
 * mid-session stayed black with nothing ever asking for it back.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ&\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007J\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/andrerinas/openheadunit/aap/ProjectionWatchdogPolicy;", "", "()V", "FRAME_GAP_MS", "", "LINK_QUIET_MS", "isSessionLive", "", "state", "Lcom/andrerinas/openheadunit/connection/CommManager$ConnectionState;", "shouldNudgeForFirstFrame", "sessionLive", "surfaceSet", "renderedSinceSurfaceSet", "warmRelaunchCycleSpent", "shouldRequestVideoFocus", "pictureStopped", "nowMs", "lastRequestMs", "shouldShowReconnecting", "frameGapMs", "linkQuietMs", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ProjectionWatchdogPolicy {
    
    /**
     * How long without a rendered frame before the picture stopping is worth reacting to.
     */
    public static final long FRAME_GAP_MS = 10000L;
    
    /**
     * How long the whole AAP link must *also* have been silent before a stopped picture is called a
     * lost connection.
     *
     * Android Auto's idle cadence has never been recorded - the phone's `PingRequest` is answered in
     * `AapControl` without logging anything - so this number is a judgement rather than a
     * measurement. It is a safe one because the gate is monotonic: if the real cadence is faster
     * than this the false positive disappears, and if it is slower the behaviour is exactly what
     * shipped before the gate existed. It can remove a false positive; it cannot add one. The
     * watchdog logs both gaps so a reporter's next capture replaces the judgement with a number.
     */
    public static final long LINK_QUIET_MS = 10000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.ProjectionWatchdogPolicy INSTANCE = null;
    
    private ProjectionWatchdogPolicy() {
        super();
    }
    
    /**
     * True while the projection session is live: [CommManager.ConnectionState.HandshakeComplete]
     * is the brief window before video starts, [CommManager.ConnectionState.TransportStarted] the
     * steady state after. The watchdog must keep ticking through both.
     */
    public final boolean isSessionLive(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.connection.CommManager.ConnectionState state) {
        return false;
    }
    
    /**
     * Whether a stopped picture should be shown to the user as a lost connection.
     *
     * The overlay says "Connection lost", so the connection is what has to be measured. Frames alone
     * cannot carry that claim: Android Auto stops sending video whenever nothing on screen animates,
     * which made a paused full-screen music player identical to a dead socket and covered the
     * projection every 15-30s (issue #852). A real disconnect does not depend on this path at all -
     * `AapProjectionActivity` shows the same overlay immediately from
     * [CommManager.ConnectionState.Disconnected] - so what is left here is the narrow case of a
     * socket that is still up while the phone has gone silent.
     *
     * [linkQuietMs] is how long ago the phone last sent anything on any channel; pass
     * [Long.MAX_VALUE] when it has not sent anything yet, so a session that never started cannot
     * read as one that stopped.
     */
    public final boolean shouldShowReconnecting(long frameGapMs, long linkQuietMs) {
        return false;
    }
    
    /**
     * Whether a black mid-session picture warrants asking the phone for video focus again.
     *
     * Gated on the picture having stopped, **not** on the overlay being up. The two were the same
     * condition until the overlay learned to check the link as well, and tying recovery to the
     * overlay after that would have made an idle-looking stream unrecoverable - which is the exact
     * failure the watchdog was revived to fix. Asking for video that had simply paused costs one
     * throttled message and nothing else; not asking for video that really stopped costs the rest of
     * the session. Paced by [VideoRecoveryPolicy] so a stuck session asks about once per throttle
     * window rather than on every tick.
     */
    public final boolean shouldRequestVideoFocus(boolean pictureStopped, long nowMs, long lastRequestMs) {
        return false;
    }
    
    /**
     * Whether the surface the decoder was just handed still has no picture, and is worth nudging for.
     *
     * The nudge loop this drives used to be gated on the loading overlay being visible, which made a
     * cosmetic state decide whether recovery ran at all - and one relaunch in two hid that overlay
     * before the loop's first tick, because the overlay decision reads a rendered-frame stamp that
     * the surface handoff zeroes a moment later. The loop does not re-post when it declines, so a
     * single silent tick ended it for that instance. Measured on a reporter's capture: four
     * relaunches, alternating, two of them silent for 11.8s and 23s with a black screen and nothing
     * asking for video.
     *
     * The same reasoning as [shouldRequestVideoFocus], which was moved off the overlay for the same
     * reason. What decides recovery is the picture, not what is drawn over it.
     *
     * [warmRelaunchCycleSpent] is the bound. The overlay used to supply one incidentally, being up
     * only before a session's first frame; without it this would nudge every window forever on a
     * screen that simply has nothing to draw. Once the escalation has spent its cycle,
     * [WarmRelaunchKeyframePolicy]'s own throttled nudge takes over and this steps back.
     *
     * @param sessionLive see [isSessionLive].
     * @param surfaceSet whether the decoder has been handed a surface at all yet.
     * @param renderedSinceSurfaceSet whether any frame has reached the screen on that surface.
     */
    public final boolean shouldNudgeForFirstFrame(boolean sessionLive, boolean surfaceSet, boolean renderedSinceSurfaceSet, boolean warmRelaunchCycleSpent) {
        return false;
    }
}