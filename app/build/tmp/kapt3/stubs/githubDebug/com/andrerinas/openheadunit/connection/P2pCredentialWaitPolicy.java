package com.andrerinas.openheadunit.connection;

/**
 * A plausible cached/device MAC does not prove that the current group is ready.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/connection/P2pCredentialWaitPolicy;", "", "()V", "INTERFACE_GRACE_MILLIS", "", "ready", "", "ipReady", "owner", "staticOverride", "fromCurrentInterface", "maskedBssid", "elapsedMillis", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class P2pCredentialWaitPolicy {
    public static final long INTERFACE_GRACE_MILLIS = 3000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.P2pCredentialWaitPolicy INSTANCE = null;
    
    private P2pCredentialWaitPolicy() {
        super();
    }
    
    public final boolean ready(boolean ipReady, boolean owner, boolean staticOverride, boolean fromCurrentInterface, boolean maskedBssid, long elapsedMillis) {
        return false;
    }
}