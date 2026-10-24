package com.andrerinas.openheadunit.aap.protocol.messages;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t0\b\u00a2\u0006\u0002\u0010\nB\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000eB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u000b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t0\b\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/aap/protocol/messages/TouchEvent;", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "timeStamp", "", "action", "", "actionIndex", "pointerData", "", "Lkotlin/Triple;", "(JIILjava/lang/Iterable;)V", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Input$TouchEvent$PointerAction;", "x", "y", "(JLcom/andrerinas/openheadunit/aap/protocol/proto/Input$TouchEvent$PointerAction;II)V", "(JLcom/andrerinas/openheadunit/aap/protocol/proto/Input$TouchEvent$PointerAction;ILjava/lang/Iterable;)V", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class TouchEvent extends com.andrerinas.openheadunit.aap.AapMessage {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.protocol.messages.TouchEvent.Companion Companion = null;
    
    public TouchEvent(long timeStamp, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.protocol.proto.Input.TouchEvent.PointerAction action, int actionIndex, @org.jetbrains.annotations.NotNull()
    java.lang.Iterable<kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer>> pointerData) {
        super(0, 0, 0, 0, 0, null);
    }
    
    public TouchEvent(long timeStamp, int action, int actionIndex, @org.jetbrains.annotations.NotNull()
    java.lang.Iterable<kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer>> pointerData) {
        super(0, 0, 0, 0, 0, null);
    }
    
    public TouchEvent(long timeStamp, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.protocol.proto.Input.TouchEvent.PointerAction action, int x, int y) {
        super(0, 0, 0, 0, 0, null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r0\fH\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/andrerinas/openheadunit/aap/protocol/messages/TouchEvent$Companion;", "", "()V", "makeProto", "Lcom/google/protobuf/Message;", "timeStamp", "", "action", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Input$TouchEvent$PointerAction;", "actionIndex", "", "pointerData", "", "Lkotlin/Triple;", "motionEventToAction", "event", "Landroid/view/MotionEvent;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.protocol.proto.Input.TouchEvent.PointerAction motionEventToAction(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event) {
            return null;
        }
        
        private final com.google.protobuf.Message makeProto(long timeStamp, com.andrerinas.openheadunit.aap.protocol.proto.Input.TouchEvent.PointerAction action, int actionIndex, java.lang.Iterable<kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer>> pointerData) {
            return null;
        }
    }
}