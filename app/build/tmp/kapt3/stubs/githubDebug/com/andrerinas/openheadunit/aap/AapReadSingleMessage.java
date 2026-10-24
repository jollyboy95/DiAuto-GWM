package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapReadSingleMessage;", "Lcom/andrerinas/openheadunit/aap/AapRead$Base;", "connection", "Lcom/andrerinas/openheadunit/connection/AccessoryConnection;", "ssl", "Lcom/andrerinas/openheadunit/aap/AapSsl;", "handler", "Lcom/andrerinas/openheadunit/aap/AapMessageHandler;", "onVideoRunHoled", "Lkotlin/Function0;", "", "faultInjector", "Lcom/andrerinas/openheadunit/aap/VideoFaultInjector;", "(Lcom/andrerinas/openheadunit/connection/AccessoryConnection;Lcom/andrerinas/openheadunit/aap/AapSsl;Lcom/andrerinas/openheadunit/aap/AapMessageHandler;Lkotlin/jvm/functions/Function0;Lcom/andrerinas/openheadunit/aap/VideoFaultInjector;)V", "fragmentSizeBuffer", "", "msgBuffer", "recvHeader", "Lcom/andrerinas/openheadunit/aap/AapMessageIncoming$EncryptedHeader;", "doRead", "", "isMagicGarbage", "", "buffer", "start", "length", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapReadSingleMessage extends com.andrerinas.openheadunit.aap.AapRead.Base {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapMessageIncoming.EncryptedHeader recvHeader = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] msgBuffer = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] fragmentSizeBuffer = null;
    
    public AapReadSingleMessage(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.connection.AccessoryConnection connection, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapSsl ssl, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapMessageHandler handler, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onVideoRunHoled, @org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.aap.VideoFaultInjector faultInjector) {
        super(null, null, null, null, null);
    }
    
    @java.lang.Override()
    protected int doRead(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.connection.AccessoryConnection connection) {
        return 0;
    }
    
    private final boolean isMagicGarbage(byte[] buffer, int start, int length) {
        return false;
    }
}