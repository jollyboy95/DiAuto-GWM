package com.andrerinas.openheadunit.aap;

/**
 * The framing audit was built as an instrument and wired like one: it computed its finding, the
 * reader printed it, and nothing acted on it. This is the rule that decides which of its findings
 * are worth more than a log line.
 *
 * The cost of getting it wrong runs both ways. Too narrow and the one corruption mode nothing else
 * can see goes on being seen and ignored - a hardware round measured 37 and 59 injected
 * middle-fragment faults producing zero keyframe requests. Too broad and a fault that already has a
 * reporter gets asked about twice, which also stamps the corruption clock twice and makes one lost
 * fragment look like a wire that is still breaking.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AuditRecoveryPolicyTest;", "", "()V", "a hole in a video run is asked about, because nothing else will", "", "a hole in another channel\'s run is real but not repairable this way", "no outcome on a non-video channel ever asks", "the first run on a channel is a baseline, not a fault", "the outcomes the reassembler already reports are left to it", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class AuditRecoveryPolicyTest {
    
    public AuditRecoveryPolicyTest() {
        super();
    }
}