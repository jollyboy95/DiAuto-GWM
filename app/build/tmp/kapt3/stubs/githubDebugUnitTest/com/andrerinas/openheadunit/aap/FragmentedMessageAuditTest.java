package com.andrerinas.openheadunit.aap;

/**
 * The cross-check that catches the one corruption mode nothing else can see.
 *
 * A missing *middle* fragment leaves the run looking intact to [VideoFragmentAssembler] - first,
 * middles, last, in order - so the frame is assembled with a hole in it and decoded as though it were
 * whole. The total size the first fragment declares is the only thing that disagrees.
 *
 * The numbers in the "measured" cases are the real fragment counts and deltas measured on a
 * UNISOC MT50. They are pinned here because the first version of this class
 * compared every run against the establishing run's *whole* difference, so every run with a
 * different fragment count reported - which then exhausted the print budget and left the check dead
 * for the rest of the session.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007J\b\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007J\b\u0010\u0011\u001a\u00020\fH\u0007J\b\u0010\u0012\u001a\u00020\fH\u0007J\b\u0010\u0013\u001a\u00020\fH\u0007J\b\u0010\u0014\u001a\u00020\fH\u0007J\b\u0010\u0015\u001a\u00020\fH\u0007J\b\u0010\u0016\u001a\u00020\fH\u0007J\b\u0010\u0017\u001a\u00020\fH\u0007J,\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u0004H\u0002J\b\u0010\u001f\u001a\u00020\fH\u0007J\b\u0010 \u001a\u00020\fH\u0007J\b\u0010!\u001a\u00020\fH\u0007J\b\u0010\"\u001a\u00020\fH\u0007J\b\u0010#\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/andrerinas/openheadunit/aap/FragmentedMessageAuditTest;", "", "()V", "aud", "", "encrypted", "first", "last", "middle", "single", "vid", "a convention that does not divide evenly still scales exactly", "", "a fragment with no run open is an orphan", "a healthy run reports once and then stays quiet", "a hole is still caught once the expectation scales", "a missing middle fragment is reported, and it is the case nothing else sees", "a run that never ends is reported when the next message starts", "a truncated run quotes the expectation for what it did see", "an orphan quotes no expectation, because there is nothing to expect", "an out of range channel is ignored rather than crashing", "an unfragmented message also ends an open run", "channels are audited independently because their runs interleave", "reset forgets both the open run and the learned convention", "run", "Lcom/andrerinas/openheadunit/aap/FragmentedMessageAudit$Result;", "audit", "Lcom/andrerinas/openheadunit/aap/FragmentedMessageAudit;", "fragments", "perFragment", "body", "the convention is learned, not assumed", "the learned convention scales with the fragment count", "the measured fragment counts and deltas from the rig report nothing", "the report carries the numbers a reader would need", "unfragmented messages on their own are never reported", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class FragmentedMessageAuditTest {
    private final int vid = 2;
    private final int aud = 6;
    private final int first = 1;
    private final int last = 2;
    private final int middle = 0;
    private final int single = 0;
    
    /**
     * Flags as they appear on the wire, with the encryption bit that every payload message carries.
     */
    private final int encrypted = 8;
    
    public FragmentedMessageAuditTest() {
        super();
    }
    
    /**
     * One complete run of [fragments] fragments whose declared total is short by [perFragment] per
     * fragment - the shape the rig measured. Returns whatever the audit made of it.
     */
    private final com.andrerinas.openheadunit.aap.FragmentedMessageAudit.Result run(com.andrerinas.openheadunit.aap.FragmentedMessageAudit audit, int fragments, int perFragment, int body) {
        return null;
    }
}