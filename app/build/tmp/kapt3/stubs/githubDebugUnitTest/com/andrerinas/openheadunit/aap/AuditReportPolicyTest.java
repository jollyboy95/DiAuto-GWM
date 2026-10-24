package com.andrerinas.openheadunit.aap;

/**
 * The rule that failed in the field: the audit spent its whole ten-line budget in 200ms on
 * false positives and was silent for the remaining five minutes, including both windows in which a
 * reporter's artifact was on screen.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AuditReportPolicyTest;", "", "()V", "burst", "", "interval", "", "a fault that starts in minute nine is still reported", "", "a storm is bounded to roughly one line per interval", "the budget refills instead of running out", "the first reports print immediately, however fast they arrive", "the interval is not so long that a report is lost in the noise of a drive", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class AuditReportPolicyTest {
    private final int burst = 10;
    private final long interval = 60000L;
    
    public AuditReportPolicyTest() {
        super();
    }
}