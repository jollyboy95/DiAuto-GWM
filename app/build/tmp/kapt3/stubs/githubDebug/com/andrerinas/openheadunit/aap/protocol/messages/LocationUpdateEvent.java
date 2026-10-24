package com.andrerinas.openheadunit.aap.protocol.messages;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/aap/protocol/messages/LocationUpdateEvent;", "Lcom/andrerinas/openheadunit/aap/protocol/messages/SensorEvent;", "location", "Landroid/location/Location;", "(Landroid/location/Location;)V", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class LocationUpdateEvent extends com.andrerinas.openheadunit.aap.protocol.messages.SensorEvent {
    
    /**
     * Stand-in for a fix that reports no accuracy: 100 m, in the field's millimetres.
     */
    private static final int UNKNOWN_ACCURACY_MM = 100000;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.protocol.messages.LocationUpdateEvent.Companion Companion = null;
    
    public LocationUpdateEvent(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
        super(0, null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/aap/protocol/messages/LocationUpdateEvent$Companion;", "", "()V", "UNKNOWN_ACCURACY_MM", "", "makeProto", "Lcom/google/protobuf/Message;", "location", "Landroid/location/Location;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.google.protobuf.Message makeProto(android.location.Location location) {
            return null;
        }
    }
}