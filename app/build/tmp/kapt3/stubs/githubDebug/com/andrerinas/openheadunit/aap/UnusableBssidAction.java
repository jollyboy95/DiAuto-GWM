package com.andrerinas.openheadunit.aap;

/**
 * What to do when the credentials we are about to send carry no usable BSSID.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/andrerinas/openheadunit/aap/UnusableBssidAction;", "", "(Ljava/lang/String;I)V", "ABORT", "SEND_WITH_EMPTY_BSSID", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public enum UnusableBssidAction {
    /*public static final*/ ABORT /* = new ABORT() */,
    /*public static final*/ SEND_WITH_EMPTY_BSSID /* = new SEND_WITH_EMPTY_BSSID() */;
    
    UnusableBssidAction() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.UnusableBssidAction> getEntries() {
        return null;
    }
}