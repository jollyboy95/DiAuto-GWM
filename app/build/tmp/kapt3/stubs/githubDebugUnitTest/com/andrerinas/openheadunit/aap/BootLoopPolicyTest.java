package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\u0014\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00020\f\"\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\b\u0010\u000f\u001a\u00020\u0004H\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0007J\b\u0010\u0011\u001a\u00020\u0004H\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/aap/BootLoopPolicyTest;", "", "()V", "a corrupt or absent stored count starts a fresh run", "", "a run that survives clears the count", "a single bad boot between good ones is forgiven", "an ordinary run of short trips does not trip it", "strikes accumulate across runs that die young", "strikesAfter", "", "runLengthsMs", "", "", "the 3 2 1 log ends one cycle short of the guard", "the healthy threshold is a floor, not a target", "the reported crash loop pauses wireless on the fourth boot", "the third short run pauses wireless, the first two do not", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class BootLoopPolicyTest {
    
    public BootLoopPolicyTest() {
        super();
    }
    
    /**
     * Replays a run of boot-started lifetimes in milliseconds and returns the strike count left
     * behind, the way the receiver and the service between them maintain it: every boot-started run
     * takes a strike on the way in, and clears the count if it survives long enough.
     */
    private final int strikesAfter(long... runLengthsMs) {
        return 0;
    }
}