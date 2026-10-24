package com.andrerinas.openheadunit.aap;

/**
 * The case these exist for: a reporter whose head unit hosted its network, woke the phone, handed
 * out credentials, and then aborted every handshake with "nothing is listening on port 5288",
 * repeatedly, for as long as the capture ran. The server object was assigned and not listening, and
 * the old guard read "assigned" as "running".
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\t\u001a\u00020\u0007H\u0007J\b\u0010\n\u001a\u00020\u0007H\u0007J\b\u0010\u000b\u001a\u00020\u0007H\u0007J\b\u0010\f\u001a\u00020\u0007H\u0007J\b\u0010\r\u001a\u00020\u0007H\u0007J\b\u0010\u000e\u001a\u00020\u0007H\u0007J\b\u0010\u000f\u001a\u00020\u0007H\u0007J\b\u0010\u0010\u001a\u00020\u0007H\u0007J\b\u0010\u0011\u001a\u00020\u0007H\u0007J\b\u0010\u0012\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WirelessServerRestartPolicyTest;", "", "()V", "never", "", "now", "a first ever rebuild is not held back by an unset timestamp", "", "a handshake retrying every few seconds cannot drive a rebuild per attempt", "a listening server is left alone", "a live session is never disturbed", "a port that will never bind stops being retried", "a server still binding is waited for, never torn down", "a unit that fails once an hour is never talked out of trying", "assigned but not listening is the whole bug, and it rebuilds", "counting inside one window accumulates rather than resetting", "every action says why, because that is the point of the change", "every state maps to exactly one action, and none is left undecided", "nothing assigned yet means start, not rebuild", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class WirelessServerRestartPolicyTest {
    private final long now = 1000000L;
    private final long never = 0L;
    
    public WirelessServerRestartPolicyTest() {
        super();
    }
}