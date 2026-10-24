package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapControlService;", "Lcom/andrerinas/openheadunit/aap/AapControl;", "aapTransport", "Lcom/andrerinas/openheadunit/aap/AapTransport;", "aapAudio", "Lcom/andrerinas/openheadunit/aap/AapAudio;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "context", "Landroid/content/Context;", "(Lcom/andrerinas/openheadunit/aap/AapTransport;Lcom/andrerinas/openheadunit/aap/AapAudio;Lcom/andrerinas/openheadunit/utils/Settings;Landroid/content/Context;)V", "audioFocusRequest", "", "notification", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Control$AudioFocusRequestNotification;", "channel", "byebyeRequest", "request", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Control$ByeByeRequest;", "execute", "message", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "navigationFocusRequest", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Control$NavFocusRequestNotification;", "pingRequest", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Control$PingRequest;", "serviceDiscoveryRequest", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Control$ServiceDiscoveryRequest;", "voiceSessionNotification", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Control$VoiceSessionNotification;", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapControlService implements com.andrerinas.openheadunit.aap.AapControl {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapTransport aapTransport = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapAudio aapAudio = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.Integer, java.lang.String> systemFocusName = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<com.andrerinas.openheadunit.aap.protocol.proto.Control.AudioFocusRequestNotification.AudioFocusRequestType, com.andrerinas.openheadunit.aap.protocol.proto.Control.AudioFocusNotification.AudioFocusStateType> focusResponse = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AapControlService.Companion Companion = null;
    
    public AapControlService(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapTransport aapTransport, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapAudio aapAudio, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override()
    public int execute(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapMessage message) {
        return 0;
    }
    
    private final int serviceDiscoveryRequest(com.andrerinas.openheadunit.aap.protocol.proto.Control.ServiceDiscoveryRequest request) {
        return 0;
    }
    
    private final int pingRequest(com.andrerinas.openheadunit.aap.protocol.proto.Control.PingRequest request, int channel) {
        return 0;
    }
    
    private final int navigationFocusRequest(com.andrerinas.openheadunit.aap.protocol.proto.Control.NavFocusRequestNotification request, int channel) {
        return 0;
    }
    
    private final int byebyeRequest(com.andrerinas.openheadunit.aap.protocol.proto.Control.ByeByeRequest request, int channel) {
        return 0;
    }
    
    private final int voiceSessionNotification(com.andrerinas.openheadunit.aap.protocol.proto.Control.VoiceSessionNotification request) {
        return 0;
    }
    
    private final int audioFocusRequest(com.andrerinas.openheadunit.aap.protocol.proto.Control.AudioFocusRequestNotification notification, int channel) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapControlService$Companion;", "", "()V", "focusResponse", "", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Control$AudioFocusRequestNotification$AudioFocusRequestType;", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Control$AudioFocusNotification$AudioFocusStateType;", "systemFocusName", "", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}