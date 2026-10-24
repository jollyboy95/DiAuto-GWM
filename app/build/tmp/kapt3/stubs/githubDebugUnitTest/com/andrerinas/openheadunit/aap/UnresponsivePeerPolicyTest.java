package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\t\u001a\u00020\u0007H\u0007J\b\u0010\n\u001a\u00020\u0007H\u0007J\b\u0010\u000b\u001a\u00020\u0007H\u0007J\b\u0010\f\u001a\u00020\u0007H\u0007J\b\u0010\r\u001a\u00020\u0007H\u0007J\b\u0010\u000e\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/aap/UnresponsivePeerPolicyTest;", "", "()V", "otherPhone", "", "phone", "a different endpoint is a different server and starts its own count", "", "a streak against one endpoint accumulates", "an unknown endpoint does not inherit a previous streak", "backing off never becomes giving up", "the cadence drops at the threshold and stays down", "the explanation goes out once, at the point the backoff engages", "the first failure counts as one even with nothing recorded before it", "the ordinary cadence is unchanged below the threshold", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class UnresponsivePeerPolicyTest {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String phone = "192.168.41.113:5277";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String otherPhone = "192.168.41.200:5277";
    
    public UnresponsivePeerPolicyTest() {
        super();
    }
}