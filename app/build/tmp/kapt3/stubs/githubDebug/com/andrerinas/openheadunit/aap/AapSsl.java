package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\"\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0010H&\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapSsl;", "", "decrypt", "Lcom/andrerinas/openheadunit/aap/ByteArrayWithLimit;", "start", "", "length", "buffer", "", "encrypt", "offset", "performHandshake", "", "connection", "Lcom/andrerinas/openheadunit/connection/AccessoryConnection;", "postHandshakeReset", "", "release", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public abstract interface AapSsl {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.andrerinas.openheadunit.aap.ByteArrayWithLimit decrypt(int start, int length, @org.jetbrains.annotations.NotNull()
    byte[] buffer);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.andrerinas.openheadunit.aap.ByteArrayWithLimit encrypt(int offset, int length, @org.jetbrains.annotations.NotNull()
    byte[] buffer);
    
    public abstract void postHandshakeReset();
    
    public abstract boolean performHandshake(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.connection.AccessoryConnection connection);
    
    public abstract void release();
}