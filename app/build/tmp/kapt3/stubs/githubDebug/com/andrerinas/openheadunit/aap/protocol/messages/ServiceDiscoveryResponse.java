package com.andrerinas.openheadunit.aap.protocol.messages;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/aap/protocol/messages/ServiceDiscoveryResponse;", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ServiceDiscoveryResponse extends com.andrerinas.openheadunit.aap.AapMessage {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.protocol.messages.ServiceDiscoveryResponse.Companion Companion = null;
    
    public ServiceDiscoveryResponse(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(0, 0, 0, 0, 0, null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/aap/protocol/messages/ServiceDiscoveryResponse$Companion;", "", "()V", "logNegotiatedCodecCapability", "", "codec", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Media$MediaCodecType;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "makeProto", "Lcom/google/protobuf/Message;", "context", "Landroid/content/Context;", "makeSensorType", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Control$Service$SensorSourceService$Sensor;", "type", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Sensors$SensorType;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.google.protobuf.Message makeProto(android.content.Context context) {
            return null;
        }
        
        /**
         * Records whether a decoder on this device claims it can carry the profile we are about to
         * ask the phone for.
         *
         * Nothing acts on the answer. It exists because this is the one place where the codec is
         * decided - the 1440p rule above overrides the user's own choice - and until now nothing in
         * the app asked a decoder anything before making it. A #219 reporter's Galaxy Tab S7 FE runs
         * the resulting 2560x1440 HEVC on `c2.qti.hevc.decoder` and sheds frames in bursts, with the
         * shedding confined to windows that also spent up to 2019ms of 5000 waiting for an input
         * buffer. No log has ever said what that component claimed beforehand.
         *
         * A WARN here from a unit that reports artifacts is what would justify revisiting the rule.
         */
        private final void logNegotiatedCodecCapability(com.andrerinas.openheadunit.aap.protocol.proto.Media.MediaCodecType codec, com.andrerinas.openheadunit.utils.Settings settings) {
        }
        
        private final com.andrerinas.openheadunit.aap.protocol.proto.Control.Service.SensorSourceService.Sensor makeSensorType(com.andrerinas.openheadunit.aap.protocol.proto.Sensors.SensorType type) {
            return null;
        }
    }
}