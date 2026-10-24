package com.andrerinas.openheadunit.aap;

/**
 * The log an active [VideoFaultInjector] owes its reader.
 *
 * Three lines, all of them load on a hardware round: the announcement that the stream is being
 * broken on purpose, the per-fault line, and a periodic summary. A fourth, the budget-spent line,
 * marks the moment the injector stops - which is where a recovery measurement is timed from.
 *
 * This exists as its own class because the injector is now applied at two stages
 * ([VideoFaultInjector.Stage]) and both need identical lines. Two copies would be two chances for
 * the wording to drift, and every brief and results document on this thread greps these strings:
 * `FAULT INJECTED`, `fault injection - `, `fault injection budget spent after`. They are an
 * interface, not prose, and changing one silently invalidates the rounds that quoted it.
 *
 * [prefix] names the site, so a capture says where a fault was injected as well as that it was.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFaultReporter;", "", "prefix", "", "(Ljava/lang/String;)V", "lastSummaryMs", "", "reportedBudgetSpent", "", "announce", "", "injector", "Lcom/andrerinas/openheadunit/aap/VideoFaultInjector;", "onMessage", "effect", "Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Effect;", "flags", "", "len", "reportBudgetSpentOnce", "reportProgress", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class VideoFaultReporter {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String prefix = null;
    
    /**
     * Stamped at construction so the first summary is one interval in, not on the first message.
     */
    private long lastSummaryMs;
    
    /**
     * The budget-spent line is a moment, not a state, so it is said once.
     */
    private boolean reportedBudgetSpent = false;
    
    public VideoFaultReporter(@org.jetbrains.annotations.NotNull()
    java.lang.String prefix) {
        super();
    }
    
    /**
     * Says the injector is on, at construction of the injector rather than on its first fault.
     *
     * A run that injects nothing is the interesting failure, and it has to be distinguishable from a
     * run where the setting never took. This line is the half of that answer that does not depend on
     * the stream fragmenting at all.
     */
    public final void announce(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.VideoFaultInjector injector) {
    }
    
    /**
     * Reports one injected fault, then the summary lines that give it context.
     *
     * Called for every message the injector was asked about, faulted or not, because the summary and
     * the budget-spent line are about the stream going by rather than about any one message.
     */
    public final void onMessage(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.VideoFaultInjector injector, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.VideoFaultInjector.Effect effect, int flags, int len) {
    }
    
    /**
     * Marks the moment the injector stops breaking the stream.
     *
     * A bounded run is two measurements and this line is the boundary: everything before it is the
     * damage, everything after it is how long the picture took to come back. It lands immediately
     * after the last `FAULT INJECTED` line and exists to say that that one *was* the last - which a
     * reader counting faults against a setting cannot otherwise know until the capture ends.
     */
    private final void reportBudgetSpentOnce(com.andrerinas.openheadunit.aap.VideoFaultInjector injector) {
    }
    
    /**
     * Says periodically what the injector has had to work with, so a run that injects nothing says
     * so rather than looking like a run where the setting never took.
     *
     * See [VideoFaultInjector.describe] for why the candidate count matters as much as the fault
     * count: how often a frame fragments at all is a property of what the phone is projecting, and
     * two rounds at the same rate have differed by a factor of forty-five because of it.
     */
    private final void reportProgress(com.andrerinas.openheadunit.aap.VideoFaultInjector injector) {
    }
}