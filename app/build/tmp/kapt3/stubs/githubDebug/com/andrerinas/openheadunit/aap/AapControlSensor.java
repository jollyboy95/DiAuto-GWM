package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapControlSensor;", "Lcom/andrerinas/openheadunit/aap/AapControl;", "aapTransport", "Lcom/andrerinas/openheadunit/aap/AapTransport;", "context", "Landroid/content/Context;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "(Lcom/andrerinas/openheadunit/aap/AapTransport;Landroid/content/Context;Lcom/andrerinas/openheadunit/utils/Settings;)V", "execute", "", "message", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "sensorStartRequest", "request", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Sensors$SensorRequest;", "channel", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapControlSensor implements com.andrerinas.openheadunit.aap.AapControl {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapTransport aapTransport = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    
    public AapControlSensor(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapTransport aapTransport, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings) {
        super();
    }
    
    @java.lang.Override()
    public int execute(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapMessage message) {
        return 0;
    }
    
    private final int sensorStartRequest(com.andrerinas.openheadunit.aap.protocol.proto.Sensors.SensorRequest request, int channel) {
        return 0;
    }
}