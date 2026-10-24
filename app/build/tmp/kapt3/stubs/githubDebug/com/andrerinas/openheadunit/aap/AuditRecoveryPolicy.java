package com.andrerinas.openheadunit.aap;

/**
 * Which [FragmentedMessageAudit] findings are worth a keyframe request rather than only a log line.
 *
 * The audit was written as an instrument and wired like one: it computes its outcome, `AapRead`
 * prints it, and nothing else happens. That left the app able to *see* the one corruption mode
 * nothing else can see, and unable to *do* anything about it. A hardware round measured the cost -
 * 37 and 59 injected middle-fragment faults, zero keyframe requests, zero escalation activity, and a
 * recovery time indistinguishable from the round before the recovery work landed.
 *
 * ### Why only DELTA_CHANGED
 *
 * A run whose fragment count cannot explain its own byte delta is missing a fragment, and a *middle*
 * fragment going missing is invisible everywhere else: [VideoFragmentAssembler] still sees a first,
 * some middles and a last in order, so it assembles the frame and hands the decoder a hole. This is
 * the only outcome with no second reporter.
 *
 * The other three are deliberately excluded:
 *
 * - [FragmentedMessageAudit.Outcome.TRUNCATED_RUN] and
 *  [FragmentedMessageAudit.Outcome.ORPHANED_FRAGMENT] are already seen downstream as
 *  [VideoFragmentAssembler.Anomaly.TRUNCATED_PREVIOUS] and
 *  [VideoFragmentAssembler.Anomaly.ORPHANED_FRAGMENT], which already ask. Asking here too would
 *  double-ask for one fault - and, since the ask is also what stamps the corruption clock
 *  [KeyframeCycleEscalationPolicy] reads, would make one lost fragment look like a wire that is
 *  still breaking.
 * - [FragmentedMessageAudit.Outcome.FIRST_OBSERVATION] is the baseline the channel's convention is
 *  learned from. It is not a fault and fires once per channel per session.
 *
 * ### Why only video
 *
 * The audit runs per channel, and a holed run on `MUSIC_PLAYBACK` is real but a video keyframe
 * cannot repair it. There is no equivalent ask for audio in the protocol.
 *
 * Pure: no clock, no logging. Throttling the ask stays with [VideoRecoveryPolicy], which every other
 * keyframe request in the app is already held to.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AuditRecoveryPolicy;", "", "()V", "shouldRequestKeyframe", "", "outcome", "Lcom/andrerinas/openheadunit/aap/FragmentedMessageAudit$Outcome;", "channel", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AuditRecoveryPolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AuditRecoveryPolicy INSTANCE = null;
    
    private AuditRecoveryPolicy() {
        super();
    }
    
    /**
     * @param outcome what [FragmentedMessageAudit.onMessage] returned.
     * @param channel the AAP channel the run was on.
     */
    public final boolean shouldRequestKeyframe(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.FragmentedMessageAudit.Outcome outcome, int channel) {
        return false;
    }
}