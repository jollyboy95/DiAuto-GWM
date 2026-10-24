package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapControlGateway;", "Lcom/andrerinas/openheadunit/aap/AapControl;", "aapTransport", "Lcom/andrerinas/openheadunit/aap/AapTransport;", "micRecorder", "Lcom/andrerinas/openheadunit/decoder/MicRecorder;", "aapAudio", "Lcom/andrerinas/openheadunit/aap/AapAudio;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "context", "Landroid/content/Context;", "(Lcom/andrerinas/openheadunit/aap/AapTransport;Lcom/andrerinas/openheadunit/decoder/MicRecorder;Lcom/andrerinas/openheadunit/aap/AapAudio;Lcom/andrerinas/openheadunit/utils/Settings;Landroid/content/Context;)V", "serviceControl", "mediaControl", "touchControl", "sensorControl", "(Lcom/andrerinas/openheadunit/aap/AapTransport;Lcom/andrerinas/openheadunit/aap/AapControl;Lcom/andrerinas/openheadunit/aap/AapControl;Lcom/andrerinas/openheadunit/aap/AapControl;Lcom/andrerinas/openheadunit/aap/AapControl;)V", "channelOpenRequest", "", "request", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Control$ChannelOpenRequest;", "channel", "execute", "message", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapControlGateway implements com.andrerinas.openheadunit.aap.AapControl {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapTransport aapTransport = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapControl serviceControl = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapControl mediaControl = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapControl touchControl = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapControl sensorControl = null;
    
    public AapControlGateway(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapTransport aapTransport, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapControl serviceControl, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapControl mediaControl, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapControl touchControl, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapControl sensorControl) {
        super();
    }
    
    public AapControlGateway(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapTransport aapTransport, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.decoder.MicRecorder micRecorder, @org.jetbrains.annotations.NotNull()
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
    
    private final int channelOpenRequest(com.andrerinas.openheadunit.aap.protocol.proto.Control.ChannelOpenRequest request, int channel) {
        return 0;
    }
}