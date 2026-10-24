package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapMessageIncoming;", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "header", "Lcom/andrerinas/openheadunit/aap/AapMessageIncoming$EncryptedHeader;", "ba", "Lcom/andrerinas/openheadunit/aap/ByteArrayWithLimit;", "(Lcom/andrerinas/openheadunit/aap/AapMessageIncoming$EncryptedHeader;Lcom/andrerinas/openheadunit/aap/ByteArrayWithLimit;)V", "Companion", "EncryptedHeader", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapMessageIncoming extends com.andrerinas.openheadunit.aap.AapMessage {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AapMessageIncoming.Companion Companion = null;
    
    public AapMessageIncoming(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapMessageIncoming.EncryptedHeader header, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.ByteArrayWithLimit ba) {
        super(0, 0, 0, 0, 0, null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J(\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapMessageIncoming$Companion;", "", "()V", "calcOffset", "", "header", "Lcom/andrerinas/openheadunit/aap/AapMessageIncoming$EncryptedHeader;", "decrypt", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "offset", "buf", "", "ssl", "Lcom/andrerinas/openheadunit/aap/AapSsl;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.AapMessage decrypt(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.AapMessageIncoming.EncryptedHeader header, int offset, @org.jetbrains.annotations.NotNull()
        byte[] buf, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.AapSsl ssl) {
            return null;
        }
        
        public final int calcOffset(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.AapMessageIncoming.EncryptedHeader header) {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapMessageIncoming$EncryptedHeader;", "", "()V", "buf", "", "getBuf", "()[B", "setBuf", "([B)V", "chan", "", "getChan", "()I", "setChan", "(I)V", "enc_len", "getEnc_len", "setEnc_len", "flags", "getFlags", "setFlags", "msg_type", "getMsg_type", "setMsg_type", "decode", "", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class EncryptedHeader {
        private int chan = 0;
        private int flags = 0;
        private int enc_len = 0;
        private int msg_type = 0;
        @org.jetbrains.annotations.NotNull()
        private byte[] buf;
        public static final int SIZE = 4;
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.AapMessageIncoming.EncryptedHeader.Companion Companion = null;
        
        public EncryptedHeader() {
            super();
        }
        
        public final int getChan() {
            return 0;
        }
        
        public final void setChan(int p0) {
        }
        
        public final int getFlags() {
            return 0;
        }
        
        public final void setFlags(int p0) {
        }
        
        public final int getEnc_len() {
            return 0;
        }
        
        public final void setEnc_len(int p0) {
        }
        
        public final int getMsg_type() {
            return 0;
        }
        
        public final void setMsg_type(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] getBuf() {
            return null;
        }
        
        public final void setBuf(@org.jetbrains.annotations.NotNull()
        byte[] p0) {
        }
        
        public final void decode() {
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapMessageIncoming$EncryptedHeader$Companion;", "", "()V", "SIZE", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}