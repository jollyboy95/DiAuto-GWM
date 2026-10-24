package com.andrerinas.openheadunit.aap.protocol;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/protocol/MsgType;", "", "()V", "SIZE", "", "isControl", "", "type", "name", "", "channel", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class MsgType {
    public static final int SIZE = 2;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.protocol.MsgType INSTANCE = null;
    
    private MsgType() {
        super();
    }
    
    public final boolean isControl(int type) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String name(int type, int channel) {
        return null;
    }
}