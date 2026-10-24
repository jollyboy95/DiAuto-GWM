package com.andrerinas.openheadunit.aap;

/**
 * Where a [WppHandshakeSession] is in the exchange.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppStage;", "", "(Ljava/lang/String;I)V", "NEW", "AWAIT_VERSION", "AWAIT_CREDENTIALS", "AWAIT_INFO_REQUEST", "SETTLING", "DONE", "FAILED", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public enum WppStage {
    /*public static final*/ NEW /* = new NEW() */,
    /*public static final*/ AWAIT_VERSION /* = new AWAIT_VERSION() */,
    /*public static final*/ AWAIT_CREDENTIALS /* = new AWAIT_CREDENTIALS() */,
    /*public static final*/ AWAIT_INFO_REQUEST /* = new AWAIT_INFO_REQUEST() */,
    /*public static final*/ SETTLING /* = new SETTLING() */,
    /*public static final*/ DONE /* = new DONE() */,
    /*public static final*/ FAILED /* = new FAILED() */;
    
    WppStage() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.WppStage> getEntries() {
        return null;
    }
}