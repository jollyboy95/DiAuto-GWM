package com.andrerinas.openheadunit.aap;

/**
 * Whether the TCP server the phone is told to dial should be started, left alone, or rebuilt.
 *
 * The server is one object held in a field, and the bind happens asynchronously inside a coroutine
 * it launches. That split is where the bug lives: a bind that throws, or an accept loop that exits,
 * leaves the object assigned to the field with its listening flag false. The old guard was
 * `if (wirelessServer != null) return`, which reads that as "already running" and returns. Nothing
 * rebinds after that, and the only thing that clears the field is a full mode re-initialisation.
 *
 * What the user sees is the whole of the failure: the head unit hosts its network, wakes the phone
 * over Bluetooth, hands out credentials, and the phone joins and finds nothing on the port. The
 * handshake aborts, the phone is woken again seconds later, and it repeats until someone changes a
 * setting.
 *
 * So "assigned" and "working" have to be separate questions, and the answer to a dead server has to
 * be a rebuild. The rebuild then needs a bound, because the caller is a handshake that retries about
 * every four seconds: without one, a port that cannot be bound at all turns into a rebuild loop that
 * is worse than the stall it replaces.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JH\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\u001e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004J\u0016\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WirelessServerRestartPolicy;", "", "()V", "MAX_REBUILDS_PER_WINDOW", "", "REBUILD_COOLDOWN_MS", "", "REBUILD_WINDOW_MS", "decide", "Lcom/andrerinas/openheadunit/aap/WirelessServerRestartPolicy$Action;", "assigned", "", "alive", "listening", "nowMs", "sessionBusy", "lastRebuildAtMs", "rebuildsInWindow", "windowStartedAtMs", "describe", "", "action", "nextRebuildCount", "nextWindowStart", "windowIsOpen", "Action", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class WirelessServerRestartPolicy {
    
    /**
     * How long to wait before another rebuild after one has been attempted.
     *
     * Above the handshake's own retry cadence on purpose. A phone that keeps arriving must not be
     * able to drive one rebuild per arrival; the point of a rebuild is to recover from a transient
     * bind failure, and a transient failure clears on the first or second attempt.
     */
    public static final long REBUILD_COOLDOWN_MS = 10000L;
    
    /**
     * Rebuilds allowed in one window before the answer becomes "this is not going to work".
     */
    public static final int MAX_REBUILDS_PER_WINDOW = 3;
    
    /**
     * The window those rebuilds are counted in. Cleared whenever a bind succeeds.
     */
    public static final long REBUILD_WINDOW_MS = 60000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.WirelessServerRestartPolicy INSTANCE = null;
    
    private WirelessServerRestartPolicy() {
        super();
    }
    
    /**
     * @param assigned whether the server field currently holds an instance.
     * @param alive whether that instance's coroutine is still running (`job?.isActive`). This is
     *  what separates a bind in progress from one that died, which the listening flag alone
     *  cannot do, and it is the reason the old guard could never self-heal.
     * @param listening whether that instance reports its port bound.
     * @param nowMs monotonic clock, `SystemClock.elapsedRealtime()` at the call site.
     * @param sessionBusy whether a projection session is already up. A live session arrived over
     *  this very socket, so replacing it can only do harm.
     * @param lastRebuildAtMs when a rebuild was last attempted, or 0 if never.
     * @param rebuildsInWindow how many rebuilds have been attempted since the window opened.
     * @param windowStartedAtMs when the current window opened, or 0 if none is open.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.WirelessServerRestartPolicy.Action decide(boolean assigned, boolean alive, boolean listening, long nowMs, boolean sessionBusy, long lastRebuildAtMs, int rebuildsInWindow, long windowStartedAtMs) {
        return null;
    }
    
    /**
     * True while [windowStartedAtMs] is recent enough for its rebuild count to still apply.
     */
    public final boolean windowIsOpen(long nowMs, long windowStartedAtMs) {
        return false;
    }
    
    /**
     * The rebuild count to carry forward after an attempt at [nowMs].
     *
     * A window that has aged out restarts at one rather than continuing to climb, so a unit that
     * fails once an hour is never talked out of trying again.
     */
    public final int nextRebuildCount(long nowMs, long windowStartedAtMs, int rebuildsInWindow) {
        return 0;
    }
    
    /**
     * The window start to carry forward after an attempt at [nowMs].
     */
    public final long nextWindowStart(long nowMs, long windowStartedAtMs) {
        return 0L;
    }
    
    /**
     * Why a decision came out the way it did, for the log.
     *
     * The reason is the point of this whole change. Before it, a server that was never started and
     * one that was started and silently skipped produced identical logs, which is to say no log at
     * all, and two complete reporter captures could not be told apart.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String describe(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.WirelessServerRestartPolicy.Action action, boolean assigned, boolean listening) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WirelessServerRestartPolicy$Action;", "", "(Ljava/lang/String;I)V", "NO_OP", "START", "AWAIT", "REBUILD", "BACKOFF", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Action {
        /*public static final*/ NO_OP /* = new NO_OP() */,
        /*public static final*/ START /* = new START() */,
        /*public static final*/ AWAIT /* = new AWAIT() */,
        /*public static final*/ REBUILD /* = new REBUILD() */,
        /*public static final*/ BACKOFF /* = new BACKOFF() */;
        
        Action() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.WirelessServerRestartPolicy.Action> getEntries() {
            return null;
        }
    }
}