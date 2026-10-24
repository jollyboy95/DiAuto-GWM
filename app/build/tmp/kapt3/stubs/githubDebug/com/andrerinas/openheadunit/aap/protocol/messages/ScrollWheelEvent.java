package com.andrerinas.openheadunit.aap.protocol.messages;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/protocol/messages/ScrollWheelEvent;", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "timeStamp", "", "delta", "", "(JI)V", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ScrollWheelEvent extends com.andrerinas.openheadunit.aap.AapMessage {
    public static final int KEYCODE_SCROLL_WHEEL = 65536;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.protocol.messages.ScrollWheelEvent.Companion Companion = null;
    
    public ScrollWheelEvent(long timeStamp, int delta) {
        super(0, 0, 0, 0, 0, null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/andrerinas/openheadunit/aap/protocol/messages/ScrollWheelEvent$Companion;", "", "()V", "KEYCODE_SCROLL_WHEEL", "", "makeProto", "Lcom/google/protobuf/Message;", "timeStamp", "", "delta", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.google.protobuf.Message makeProto(long timeStamp, int delta) {
            return null;
        }
    }
}