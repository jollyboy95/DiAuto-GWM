package com.andrerinas.openheadunit.aap;

/**
 * How often one repeating diagnostic line may be printed.
 *
 * Written for a [FragmentedMessageAudit] outcome, which is the case the rest of this describes, and
 * since reused for [AapTransport]'s held-cycle line - a check that repeats every two seconds and can
 * hold for minutes. Callers keep their own counters, so two of them never share a budget.
 *
 * The first version of this was a hard cap: ten lines per outcome per session, then silence. It was
 * meant to stop a broken link filling the log with one line per frame, and on a healthy link it
 * would never have been reached. Hardware reached it in **200 milliseconds** - a
 * scaling bug in the audit produced ten false `DELTA_CHANGED` lines at connect - and the check was
 * then dead for the remaining five minutes, including both windows in which a reporter's artifact
 * was visible on screen. The audit read clean because it had been switched off, and that absence was
 * very nearly written up as evidence.
 *
 * A cap that can be exhausted is a cap that will be exhausted by whichever bug is noisiest, and the
 * quiet fault it was hiding is always the one worth having. So the budget refills: the first
 * [BURST_REPORTS] print in full, and after that one line per [SUMMARY_INTERVAL_MS] carries however
 * many were suppressed since. The log stays bounded at roughly one line a minute per outcome, and
 * something that starts going wrong in minute nine still says so.
 *
 * Pure, so the interaction that failed in the field is testable without a device or a clock: the
 * caller passes the time in.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AuditReportPolicy;", "", "()V", "BURST_REPORTS", "", "SUMMARY_INTERVAL_MS", "", "shouldReport", "", "reportsSoFar", "lastReportMs", "nowMs", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AuditReportPolicy {
    
    /**
     * Reports printed in full before the periodic summary takes over.
     */
    public static final int BURST_REPORTS = 10;
    
    /**
     * Smallest gap between reports once the burst is spent.
     */
    public static final long SUMMARY_INTERVAL_MS = 60000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AuditReportPolicy INSTANCE = null;
    
    private AuditReportPolicy() {
        super();
    }
    
    /**
     * Whether this occurrence should be printed.
     *
     * [reportsSoFar] counts what has already been printed for this outcome, [lastReportMs] is when
     * the most recent one was, and [nowMs] is a monotonic clock reading - `SystemClock.elapsedRealtime`
     * at the call site. Anything not printed is expected to be counted by the caller and named in
     * the next line that is.
     */
    public final boolean shouldReport(int reportsSoFar, long lastReportMs, long nowMs) {
        return false;
    }
}