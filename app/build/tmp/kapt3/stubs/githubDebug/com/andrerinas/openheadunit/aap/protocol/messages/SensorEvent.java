package com.andrerinas.openheadunit.aap.protocol.messages;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/aap/protocol/messages/SensorEvent;", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "sensorType", "", "proto", "Lcom/google/protobuf/Message;", "(ILcom/google/protobuf/Message;)V", "getSensorType", "()I", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public class SensorEvent extends com.andrerinas.openheadunit.aap.AapMessage {
    private final int sensorType = 0;
    
    public SensorEvent(int sensorType, @org.jetbrains.annotations.NotNull()
    com.google.protobuf.Message proto) {
        super(0, 0, 0, 0, 0, null);
    }
    
    public final int getSensorType() {
        return 0;
    }
}