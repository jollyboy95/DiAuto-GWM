package com.andrerinas.openheadunit.aap;

/**
 * When to stop bringing wireless up automatically because doing so appears to be crashing the
 * device.
 *
 * Auto-start on boot turns a single system-level crash into an endless cycle: the system dies, the
 * head unit soft-reboots, `LOCKED_BOOT_COMPLETED` arrives, we start, we bring up the wireless mode,
 * and it dies again. Measured on a reporter's MT8163 unit at a 20–26 s period across seven
 * consecutive processes in two separate logs, with nothing in between to break it.
 *
 * The app cannot see why the system died — the log ends mid-frame with no stack — so this counts
 * the only thing it can observe: boot-started runs that did not last. Three in a row and wireless
 * bring-up is skipped, leaving the rest of the app (USB especially) working and the user with a
 * notice explaining what to do.
 *
 * Pure so the counting rules are testable without Android; the persistence and the notice live in
 * [com.andrerinas.openheadunit.app.BootCompleteReceiver] and
 * [com.andrerinas.openheadunit.aap.AapService].
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/aap/BootLoopPolicy;", "", "()V", "HEALTHY_RUN_MS", "", "STRIKES_BEFORE_PAUSE", "", "clearsStrikes", "", "runMs", "nextStrikes", "current", "shouldPauseWireless", "strikes", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BootLoopPolicy {
    
    /**
     * Boot-started runs that must fail in a row before wireless bring-up is paused.
     */
    public static final int STRIKES_BEFORE_PAUSE = 3;
    
    /**
     * How long a boot-started run must survive to count as healthy.
     *
     * Chosen against the measured lifetimes: the crash-loop processes lived 8, 9, 10 and 15 s,
     * while the two runs that reached a real session lived 48 s and 173 s. Short enough that an
     * ordinary trip clears it, long enough that a unit dying on connect never does.
     */
    public static final long HEALTHY_RUN_MS = 30000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.BootLoopPolicy INSTANCE = null;
    
    private BootLoopPolicy() {
        super();
    }
    
    /**
     * The strike count after another boot-started run begins.
     */
    public final int nextStrikes(int current) {
        return 0;
    }
    
    /**
     * Whether to skip wireless bring-up on this run.
     */
    public final boolean shouldPauseWireless(int strikes) {
        return false;
    }
    
    /**
     * Whether a run that lasted [runMs] counts as healthy, clearing the strikes.
     *
     * Deliberately not "did a session connect": on the reporter's unit one cycle reached a complete
     * projection session with audio playing and died anyway, so a session-based signal would reset
     * the count on every pass and the guard would never trip.
     */
    public final boolean clearsStrikes(long runMs) {
        return false;
    }
}