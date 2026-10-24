package com.andrerinas.openheadunit.aap.protocol.messages;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/aap/protocol/messages/VideoFocusEvent;", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "gain", "", "unsolicited", "channel", "", "(ZZI)V", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class VideoFocusEvent extends com.andrerinas.openheadunit.aap.AapMessage {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.protocol.messages.VideoFocusEvent.Companion Companion = null;
    
    public VideoFocusEvent(boolean gain, boolean unsolicited, int channel) {
        super(0, 0, 0, 0, 0, null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a8\u0006\b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/protocol/messages/VideoFocusEvent$Companion;", "", "()V", "makeProto", "Lcom/google/protobuf/Message;", "gain", "", "unsolicited", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.google.protobuf.Message makeProto(boolean gain, boolean unsolicited) {
            return null;
        }
    }
}