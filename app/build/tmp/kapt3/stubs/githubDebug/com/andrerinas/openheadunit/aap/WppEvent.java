package com.andrerinas.openheadunit.aap;

/**
 * Something that happened to a handshake. Fed to [WppHandshakeSession.on].
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppEvent;", "", "()V", "CredentialsReady", "CredentialsUnavailable", "MessageReceived", "SettleTimeout", "SocketReady", "StageTimeout", "TcpSessionUp", "Lcom/andrerinas/openheadunit/aap/WppEvent$CredentialsReady;", "Lcom/andrerinas/openheadunit/aap/WppEvent$CredentialsUnavailable;", "Lcom/andrerinas/openheadunit/aap/WppEvent$MessageReceived;", "Lcom/andrerinas/openheadunit/aap/WppEvent$SettleTimeout;", "Lcom/andrerinas/openheadunit/aap/WppEvent$SocketReady;", "Lcom/andrerinas/openheadunit/aap/WppEvent$StageTimeout;", "Lcom/andrerinas/openheadunit/aap/WppEvent$TcpSessionUp;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public abstract class WppEvent {
    
    private WppEvent() {
        super();
    }
    
    /**
     * This head unit's SSID/PSK/IP are known.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppEvent$CredentialsReady;", "Lcom/andrerinas/openheadunit/aap/WppEvent;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class CredentialsReady extends com.andrerinas.openheadunit.aap.WppEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.WppEvent.CredentialsReady INSTANCE = null;
        
        private CredentialsReady() {
        }
    }
    
    /**
     * They never became available, and waiting longer will not help.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppEvent$CredentialsUnavailable;", "Lcom/andrerinas/openheadunit/aap/WppEvent;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class CredentialsUnavailable extends com.andrerinas.openheadunit.aap.WppEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.WppEvent.CredentialsUnavailable INSTANCE = null;
        
        private CredentialsUnavailable() {
        }
    }
    
    /**
     * A message arrived from the phone. [status] is the parsed status field for the types that
     * carry one (5, 6, 7), or null when the message has no status or could not be parsed — an
     * unparseable message is never read as a failure report.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppEvent$MessageReceived;", "Lcom/andrerinas/openheadunit/aap/WppEvent;", "type", "", "status", "(ILjava/lang/Integer;)V", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()I", "component1", "component2", "copy", "(ILjava/lang/Integer;)Lcom/andrerinas/openheadunit/aap/WppEvent$MessageReceived;", "equals", "", "other", "", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class MessageReceived extends com.andrerinas.openheadunit.aap.WppEvent {
        private final int type = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer status = null;
        
        public MessageReceived(int type, @org.jetbrains.annotations.Nullable()
        java.lang.Integer status) {
        }
        
        public final int getType() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getStatus() {
            return null;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.WppEvent.MessageReceived copy(int type, @org.jetbrains.annotations.Nullable()
        java.lang.Integer status) {
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
     * The settling window elapsed with no session.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppEvent$SettleTimeout;", "Lcom/andrerinas/openheadunit/aap/WppEvent;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class SettleTimeout extends com.andrerinas.openheadunit.aap.WppEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.WppEvent.SettleTimeout INSTANCE = null;
        
        private SettleTimeout() {
        }
    }
    
    /**
     * The Bluetooth channel is up and has had its settle delay.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppEvent$SocketReady;", "Lcom/andrerinas/openheadunit/aap/WppEvent;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class SocketReady extends com.andrerinas.openheadunit.aap.WppEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.WppEvent.SocketReady INSTANCE = null;
        
        private SocketReady() {
        }
    }
    
    /**
     * The current stage's deadline ([WppHandshakeSession.currentStageTimeoutMs]) elapsed.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppEvent$StageTimeout;", "Lcom/andrerinas/openheadunit/aap/WppEvent;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class StageTimeout extends com.andrerinas.openheadunit.aap.WppEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.WppEvent.StageTimeout INSTANCE = null;
        
        private StageTimeout() {
        }
    }
    
    /**
     * The phone's projection session reached us over WiFi.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppEvent$TcpSessionUp;", "Lcom/andrerinas/openheadunit/aap/WppEvent;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class TcpSessionUp extends com.andrerinas.openheadunit.aap.WppEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.WppEvent.TcpSessionUp INSTANCE = null;
        
        private TcpSessionUp() {
        }
    }
}