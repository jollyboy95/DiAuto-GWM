package com.andrerinas.openheadunit.aap;

/**
 * What the caller should do about it. The session performs no I/O of its own — that is the whole
 * point of it being pure — so every effect leaves as one of these.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppAction;", "", "()V", "CompleteSuccess", "ExtendSettle", "Fail", "ResumePoke", "SendInfoResponse", "SendPingResponse", "SendStartRequest", "SendVersionRequest", "Lcom/andrerinas/openheadunit/aap/WppAction$CompleteSuccess;", "Lcom/andrerinas/openheadunit/aap/WppAction$ExtendSettle;", "Lcom/andrerinas/openheadunit/aap/WppAction$Fail;", "Lcom/andrerinas/openheadunit/aap/WppAction$ResumePoke;", "Lcom/andrerinas/openheadunit/aap/WppAction$SendInfoResponse;", "Lcom/andrerinas/openheadunit/aap/WppAction$SendPingResponse;", "Lcom/andrerinas/openheadunit/aap/WppAction$SendStartRequest;", "Lcom/andrerinas/openheadunit/aap/WppAction$SendVersionRequest;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public abstract class WppAction {
    
    private WppAction() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppAction$CompleteSuccess;", "Lcom/andrerinas/openheadunit/aap/WppAction;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class CompleteSuccess extends com.andrerinas.openheadunit.aap.WppAction {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.WppAction.CompleteSuccess INSTANCE = null;
        
        private CompleteSuccess() {
        }
    }
    
    /**
     * The phone is still working on it — push the settling deadline out.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppAction$ExtendSettle;", "Lcom/andrerinas/openheadunit/aap/WppAction;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class ExtendSettle extends com.andrerinas.openheadunit.aap.WppAction {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.WppAction.ExtendSettle INSTANCE = null;
        
        private ExtendSettle() {
        }
    }
    
    /**
     * [phoneWasSilent] is true when the phone never sent a single message — the signature of a
     * head unit whose Bluetooth stack drops our writes, not of a phone-side problem. It is what
     * the handshake backoff counts.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppAction$Fail;", "Lcom/andrerinas/openheadunit/aap/WppAction;", "reason", "", "phoneWasSilent", "", "wifiJoinFailed", "(Ljava/lang/String;ZZ)V", "getPhoneWasSilent", "()Z", "getReason", "()Ljava/lang/String;", "getWifiJoinFailed", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Fail extends com.andrerinas.openheadunit.aap.WppAction {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        private final boolean phoneWasSilent = false;
        private final boolean wifiJoinFailed = false;
        
        public Fail(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, boolean phoneWasSilent, boolean wifiJoinFailed) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final boolean getPhoneWasSilent() {
            return false;
        }
        
        public final boolean getWifiJoinFailed() {
            return false;
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
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.WppAction.Fail copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, boolean phoneWasSilent, boolean wifiJoinFailed) {
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
    
    /**
     * Restart the wake poke. Only ever emitted once the phone has given up on this handoff.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppAction$ResumePoke;", "Lcom/andrerinas/openheadunit/aap/WppAction;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class ResumePoke extends com.andrerinas.openheadunit.aap.WppAction {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.WppAction.ResumePoke INSTANCE = null;
        
        private ResumePoke() {
        }
    }
    
    /**
     * Send the credentials. In [WppStage.SETTLING] this is a re-send of the same ones.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppAction$SendInfoResponse;", "Lcom/andrerinas/openheadunit/aap/WppAction;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class SendInfoResponse extends com.andrerinas.openheadunit.aap.WppAction {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.WppAction.SendInfoResponse INSTANCE = null;
        
        private SendInfoResponse() {
        }
    }
    
    /**
     * Echo the payload of the ping that produced this action back as a
     * [WppMessageType.PING_RESPONSE]. Raw bytes, so the reply cannot be wrong.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppAction$SendPingResponse;", "Lcom/andrerinas/openheadunit/aap/WppAction;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class SendPingResponse extends com.andrerinas.openheadunit.aap.WppAction {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.WppAction.SendPingResponse INSTANCE = null;
        
        private SendPingResponse() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppAction$SendStartRequest;", "Lcom/andrerinas/openheadunit/aap/WppAction;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class SendStartRequest extends com.andrerinas.openheadunit.aap.WppAction {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.WppAction.SendStartRequest INSTANCE = null;
        
        private SendStartRequest() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppAction$SendVersionRequest;", "Lcom/andrerinas/openheadunit/aap/WppAction;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class SendVersionRequest extends com.andrerinas.openheadunit.aap.WppAction {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.WppAction.SendVersionRequest INSTANCE = null;
        
        private SendVersionRequest() {
        }
    }
}