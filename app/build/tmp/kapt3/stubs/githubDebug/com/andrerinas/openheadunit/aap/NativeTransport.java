package com.andrerinas.openheadunit.aap;

/**
 * Which network the Native AA mode puts the phone on.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/aap/NativeTransport;", "", "(Ljava/lang/String;I)V", "WIFI_DIRECT", "HOTSPOT", "LOCAL_HOTSPOT", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public enum NativeTransport {
    /*public static final*/ WIFI_DIRECT /* = new WIFI_DIRECT() */,
    /*public static final*/ HOTSPOT /* = new HOTSPOT() */,
    /*public static final*/ LOCAL_HOTSPOT /* = new LOCAL_HOTSPOT() */;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.NativeTransport.Companion Companion = null;
    
    NativeTransport() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.NativeTransport> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/aap/NativeTransport$Companion;", "", "()V", "fromSetting", "Lcom/andrerinas/openheadunit/aap/NativeTransport;", "value", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * [Settings.nativeApTransport][com.andrerinas.openheadunit.utils.Settings.nativeApTransport]
         * as a transport, defaulting to [WIFI_DIRECT] for any value we do not recognise.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.NativeTransport fromSetting(int value) {
            return null;
        }
    }
}