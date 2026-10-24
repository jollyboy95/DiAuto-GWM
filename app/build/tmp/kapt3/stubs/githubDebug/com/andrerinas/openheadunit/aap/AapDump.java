package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ6\u0010\r\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\n\u0010\u0017\u001a\u00060\u0010j\u0002`\u0011J6\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0004J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0004J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapDump;", "", "()V", "HD_MW", "", "MAX_HEX_DUMP", "MSG_TYPE_32", "iaad_msg_type_str_get", "", "msg_type", "src", "", "len", "logHex", "message", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "prefix", "start", "buf", "", "length", "sb", "logd", "chan", "flags", "logvHex", "", "msg_type_enc_get", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapDump {
    private static final int MAX_HEX_DUMP = 64;
    private static final int HD_MW = 16;
    private static final int MSG_TYPE_32 = 32768;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AapDump INSTANCE = null;
    
    private AapDump() {
        super();
    }
    
    public final int logd(@org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @org.jetbrains.annotations.NotNull()
    java.lang.String src, int chan, int flags, @org.jetbrains.annotations.NotNull()
    byte[] buf, int len) {
        return 0;
    }
    
    private final java.lang.String iaad_msg_type_str_get(int msg_type, char src, int len) {
        return null;
    }
    
    private final java.lang.String msg_type_enc_get(int msg_type) {
        return null;
    }
    
    public final void logvHex(@org.jetbrains.annotations.NotNull()
    java.lang.String prefix, int start, @org.jetbrains.annotations.NotNull()
    byte[] buf, int len) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String logHex(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapMessage message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.StringBuilder logHex(@org.jetbrains.annotations.NotNull()
    java.lang.String prefix, int start, @org.jetbrains.annotations.NotNull()
    byte[] buf, int length, @org.jetbrains.annotations.NotNull()
    java.lang.StringBuilder sb) {
        return null;
    }
}