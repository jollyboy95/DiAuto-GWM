package com.andrerinas.openheadunit.aap;

/**
 * One network interface, reduced to the four things that decide whether it is the head unit's
 * access point. Built from `java.net.NetworkInterface` by the caller so the choice itself stays
 * testable without a device.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/andrerinas/openheadunit/aap/ApInterfaceCandidate;", "", "name", "", "isLoopback", "", "isUp", "siteLocalIpv4", "(Ljava/lang/String;ZZLjava/lang/String;)V", "()Z", "getName", "()Ljava/lang/String;", "getSiteLocalIpv4", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ApInterfaceCandidate {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final boolean isLoopback = false;
    private final boolean isUp = false;
    
    /**
     * The interface's own site-local IPv4 address, or null if it has none.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String siteLocalIpv4 = null;
    
    public ApInterfaceCandidate(@org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean isLoopback, boolean isUp, @org.jetbrains.annotations.Nullable()
    java.lang.String siteLocalIpv4) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final boolean isLoopback() {
        return false;
    }
    
    public final boolean isUp() {
        return false;
    }
    
    /**
     * The interface's own site-local IPv4 address, or null if it has none.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSiteLocalIpv4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.ApInterfaceCandidate copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean isLoopback, boolean isUp, @org.jetbrains.annotations.Nullable()
    java.lang.String siteLocalIpv4) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}