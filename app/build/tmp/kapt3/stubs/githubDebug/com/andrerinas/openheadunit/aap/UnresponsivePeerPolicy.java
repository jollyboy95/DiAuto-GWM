package com.andrerinas.openheadunit.aap;

/**
 * How hard to keep retrying a peer that accepts the TCP connection and then says nothing.
 *
 * Android Auto's built-in head unit server (the "Start head unit server" developer option,
 * port 5277) binds itself to one connection and does not rebind for the life of its process.
 * Once something has claimed it — a connection we opened and abandoned, or a previous session
 * that died without a clean close — every later connection is accepted, never served and never
 * closed. It does not time out of that state: closing the offending connection does not recover
 * it, and neither does waiting. Only restarting the server on the phone does.
 *
 * So retrying at the normal cadence cannot succeed, and it is not free: each attempt strands
 * another socket on the phone, which never reaps them either.
 *
 * Back off instead, and say once what is actually wrong. Backing off rather than stopping
 * matters — the user can fix this from the phone at any moment, and an app that has given up
 * for good would not notice.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/aap/UnresponsivePeerPolicy;", "", "()V", "BACKOFF_RESCAN_MS", "", "NORMAL_RESCAN_MS", "SILENT_FAILURES_BEFORE_BACKOFF", "", "countAfterSilentFailure", "previousCount", "previousEndpoint", "", "endpoint", "rescanDelayMs", "consecutiveSilentFailures", "shouldExplain", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class UnresponsivePeerPolicy {
    
    /**
     * Consecutive silent failures against one endpoint before the retry cadence drops.
     */
    public static final int SILENT_FAILURES_BEFORE_BACKOFF = 3;
    
    /**
     * The ordinary re-scan delay, unchanged from before this policy existed.
     */
    public static final long NORMAL_RESCAN_MS = 10000L;
    
    /**
     * Slow enough to stop manufacturing stranded sockets, fast enough to notice a fix.
     */
    public static final long BACKOFF_RESCAN_MS = 60000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.UnresponsivePeerPolicy INSTANCE = null;
    
    private UnresponsivePeerPolicy() {
        super();
    }
    
    /**
     * Delay before the next discovery sweep, given how many times in a row the same endpoint
     * has accepted a connection and then not answered.
     */
    public final long rescanDelayMs(int consecutiveSilentFailures) {
        return 0L;
    }
    
    /**
     * True exactly once per episode, at the point the backoff engages, so the explanation goes
     * into the log once rather than on every cycle.
     */
    public final boolean shouldExplain(int consecutiveSilentFailures) {
        return false;
    }
    
    /**
     * The new streak length after a silent failure. A different endpoint is a different
     * server and starts its own count; the same one continues.
     */
    public final int countAfterSilentFailure(int previousCount, @org.jetbrains.annotations.Nullable()
    java.lang.String previousEndpoint, @org.jetbrains.annotations.Nullable()
    java.lang.String endpoint) {
        return 0;
    }
}