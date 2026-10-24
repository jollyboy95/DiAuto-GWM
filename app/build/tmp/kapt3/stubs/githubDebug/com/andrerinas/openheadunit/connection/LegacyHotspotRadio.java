package com.andrerinas.openheadunit.connection;

/**
 * Read-only, ordinary-UID fallback for drivers with Wireless Extensions (not an AP setter).
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c0\u0002\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/connection/LegacyHotspotRadio;", "", "()V", "decodeFrequency", "", "mantissa", "exponent", "band", "", "(IILjava/lang/String;)Ljava/lang/Integer;", "read", "Lcom/andrerinas/openheadunit/connection/LegacyHotspotRadio$Reading;", "interfaceName", "Reading", "Settled", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class LegacyHotspotRadio {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.connection.LegacyHotspotRadio INSTANCE = null;
    
    private LegacyHotspotRadio() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.connection.LegacyHotspotRadio.Reading read(@org.jetbrains.annotations.NotNull()
    java.lang.String interfaceName, @org.jetbrains.annotations.Nullable()
    java.lang.String band) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer decodeFrequency(int mantissa, int exponent, @org.jetbrains.annotations.Nullable()
    java.lang.String band) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/andrerinas/openheadunit/connection/LegacyHotspotRadio$Reading;", "", "frequencyMHz", "", "error", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getFrequencyMHz", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/andrerinas/openheadunit/connection/LegacyHotspotRadio$Reading;", "equals", "", "other", "hashCode", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Reading {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer frequencyMHz = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String error = null;
        
        public Reading(@org.jetbrains.annotations.Nullable()
        java.lang.Integer frequencyMHz, @org.jetbrains.annotations.Nullable()
        java.lang.String error) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getFrequencyMHz() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.connection.LegacyHotspotRadio.Reading copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer frequencyMHz, @org.jetbrains.annotations.Nullable()
        java.lang.String error) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/andrerinas/openheadunit/connection/LegacyHotspotRadio$Settled;", "", "()V", "frequency", "", "Ljava/lang/Integer;", "since", "", "observe", "value", "nowMs", "(Ljava/lang/Integer;J)Ljava/lang/Integer;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Settled {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer frequency;
        private long since = 0L;
        
        public Settled() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer observe(@org.jetbrains.annotations.Nullable()
        java.lang.Integer value, long nowMs) {
            return null;
        }
    }
}