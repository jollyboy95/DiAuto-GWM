package com.andrerinas.openheadunit.aap;

/**
 * The monitor exists because two reporters' captures said the same thing and only one of them could
 * be read. Both waveforms are replayed here in the numbers their captures produced, so that what the
 * app prints can be checked against what the offline script printed for the same link.
 *
 * The tests that matter most are the ones asserting silence. An instrument that speaks on a healthy
 * session gets ignored on an unhealthy one, and that is not hypothetical here: it is what happened
 * to the framing audit, which spent its whole print budget on false positives in the first 200 ms
 * and was then switched off for the five minutes that mattered.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\b\u0010\u0013\u001a\u00020\u0004H\u0007J\b\u0010\u0014\u001a\u00020\u0004H\u0007J\b\u0010\u0015\u001a\u00020\u0004H\u0007J\b\u0010\u0016\u001a\u00020\u0004H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/andrerinas/openheadunit/aap/LinkGapMonitorTest;", "", "()V", "a gap spanning a window boundary is counted once", "", "a healthy link says nothing at all", "only the window holding a gap speaks", "stream", "", "monitor", "Lcom/andrerinas/openheadunit/aap/LinkGapMonitor;", "startMs", "durationMs", "fps", "", "reports", "", "Lcom/andrerinas/openheadunit/aap/LinkGapMonitor$Report;", "the first message after a reset opens no gap", "the report reads as the offline script\'s fields", "the threshold is exclusive", "the waveform one reporter\'s verbose capture measured", "the waveform the second reporter\'s capture measured", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class LinkGapMonitorTest {
    
    public LinkGapMonitorTest() {
        super();
    }
    
    /**
     * Feed traffic at [fps] for [durationMs] starting at [startMs], collecting any reports.
     * Returns the timestamp of the last message sent.
     */
    private final long stream(com.andrerinas.openheadunit.aap.LinkGapMonitor monitor, long startMs, long durationMs, int fps, java.util.List<com.andrerinas.openheadunit.aap.LinkGapMonitor.Report> reports) {
        return 0L;
    }
}