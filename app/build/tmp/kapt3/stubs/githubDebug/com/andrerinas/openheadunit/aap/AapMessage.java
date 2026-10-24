package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 -2\u00020\u0001:\u0001-B)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001f\u001a\u00020\u0003H\u0016J!\u0010 \u001a\u0002H!\"\b\b\u0000\u0010!*\u00020\"2\u0006\u0010#\u001a\u0002H!H\u0000\u00a2\u0006\u0004\b$\u0010%J(\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003H\u0002J\b\u0010+\u001a\u00020,H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\f\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\r\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011\u00a8\u0006."}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapMessage;", "", "channel", "", "type", "proto", "Lcom/google/protobuf/Message;", "buf", "", "(IILcom/google/protobuf/Message;[B)V", "flags", "", "dataOffset", "size", "data", "(IBIII[B)V", "getChannel$com_andrerinas_headunitrevived_0_3_12_githubDebug", "()I", "getData", "()[B", "getDataOffset$com_andrerinas_headunitrevived_0_3_12_githubDebug", "getFlags$com_andrerinas_headunitrevived_0_3_12_githubDebug", "()B", "isAudio", "", "()Z", "isVideo", "getSize$com_andrerinas_headunitrevived_0_3_12_githubDebug", "getType$com_andrerinas_headunitrevived_0_3_12_githubDebug", "equals", "other", "hashCode", "parse", "T", "Lcom/google/protobuf/Message$Builder;", "builder", "parse$com_andrerinas_headunitrevived_0_3_12_githubDebug", "(Lcom/google/protobuf/Message$Builder;)Lcom/google/protobuf/Message$Builder;", "toByteArray", "", "msg", "offset", "length", "toString", "", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public class AapMessage {
    private final int channel = 0;
    private final byte flags = 0;
    private final int type = 0;
    private final int dataOffset = 0;
    private final int size = 0;
    @org.jetbrains.annotations.NotNull()
    private final byte[] data = null;
    public static final int HEADER_SIZE = 4;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AapMessage.Companion Companion = null;
    
    public AapMessage(int channel, byte flags, int type, int dataOffset, int size, @org.jetbrains.annotations.NotNull()
    byte[] data) {
        super();
    }
    
    public final int getChannel$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
        return 0;
    }
    
    public final byte getFlags$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
        return 0;
    }
    
    public final int getType$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
        return 0;
    }
    
    public final int getDataOffset$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
        return 0;
    }
    
    public final int getSize$com_andrerinas_headunitrevived_0_3_12_githubDebug() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getData() {
        return null;
    }
    
    @kotlin.jvm.JvmOverloads()
    public AapMessage(int channel, int type, @org.jetbrains.annotations.NotNull()
    com.google.protobuf.Message proto, @org.jetbrains.annotations.NotNull()
    byte[] buf) {
        super();
    }
    
    public final boolean isAudio() {
        return false;
    }
    
    public final boolean isVideo() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends com.google.protobuf.Message.Builder>T parse$com_andrerinas_headunitrevived_0_3_12_githubDebug(@org.jetbrains.annotations.NotNull()
    T builder) {
        return null;
    }
    
    private final void toByteArray(com.google.protobuf.Message msg, byte[] data, int offset, int length) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public AapMessage(int channel, int type, @org.jetbrains.annotations.NotNull()
    com.google.protobuf.Message proto) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapMessage$Companion;", "", "()V", "HEADER_SIZE", "", "flags", "", "channel", "type", "size", "proto", "Lcom/google/protobuf/Message;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final int size(com.google.protobuf.Message proto) {
            return 0;
        }
        
        private final byte flags(int channel, int type) {
            return 0;
        }
    }
}