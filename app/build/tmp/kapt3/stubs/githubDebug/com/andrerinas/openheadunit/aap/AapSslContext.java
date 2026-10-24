package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\"\u0010\u001a\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0002J \u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0017H\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010\u000b2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010\'\u001a\u00020$H\u0016J\b\u0010(\u001a\u00020$H\u0002J\u0018\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0013H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapSslContext;", "Lcom/andrerinas/openheadunit/aap/AapSsl;", "keyManager", "Lcom/andrerinas/openheadunit/ssl/SingleKeyKeyManager;", "(Lcom/andrerinas/openheadunit/ssl/SingleKeyKeyManager;)V", "isUserDisconnect", "", "()Z", "setUserDisconnect", "(Z)V", "plaintextBuffer", "", "plaintextHolder", "Lcom/andrerinas/openheadunit/aap/ByteArrayWithLimit;", "rxBuffer", "Ljava/nio/ByteBuffer;", "sslContext", "Ljavax/net/ssl/SSLContext;", "sslEngine", "Ljavax/net/ssl/SSLEngine;", "txBuffer", "decrypt", "start", "", "length", "buffer", "encrypt", "offset", "getHandshakeStatus", "Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;", "handshakeRead", "handshakeWrite", "performHandshake", "connection", "Lcom/andrerinas/openheadunit/connection/AccessoryConnection;", "postHandshakeReset", "", "prepare", "readAapMessage", "release", "runDelegatedTasks", "result", "Ljavax/net/ssl/SSLEngineResult;", "engine", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapSslContext implements com.andrerinas.openheadunit.aap.AapSsl {
    @org.jetbrains.annotations.NotNull()
    private final javax.net.ssl.SSLContext sslContext = null;
    private javax.net.ssl.SSLEngine sslEngine;
    private java.nio.ByteBuffer txBuffer;
    private java.nio.ByteBuffer rxBuffer;
    @kotlin.jvm.Volatile()
    private volatile boolean isUserDisconnect = false;
    
    /**
     * Plaintext of the message currently being handled, reused across messages.
     *
     * This used to be `ByteArray(result.bytesProduced())` per call, and the call is per AAP *message*
     * - so per video *fragment*, not per frame. At 50fps with two or three fragments a frame that is
     * 150-250 short-lived arrays a second, each tens of kilobytes, which is large enough to land in
     * the large-object space. It is the churn behind #839's collector running every five to ten
     * seconds, freeing 84-208 large objects a cycle and once pausing for 1.4 seconds on a unit whose
     * decoder was keeping up the whole time.
     *
     * Reusing it is only safe because every consumer of the returned array finishes with it before
     * the next message is decrypted: the poll thread reads, decrypts, dispatches and returns, all
     * synchronously, and the three paths that could have outlived that all copy first - the video
     * feed queue arraycopies into a pooled frame, the audio path arraycopies into its own pooled
     * chunk, and protobuf parsing copies. Every consumer also bounds its reads by the message's
     * `size` field rather than by `data.size`, which is what makes a buffer larger than the payload
     * safe; that was checked call site by call site, and the one place that did not - the short-payload
     * guard in AapMessageIncoming - is fixed alongside this.
     *
     * If anything is ever added that hands `AapMessage.data` to another thread without copying, this
     * is the field that makes it a corruption bug rather than a slow one.
     */
    private byte[] plaintextBuffer;
    
    /**
     * Reused wrapper, so the per-message allocation is zero rather than one small object.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.ByteArrayWithLimit plaintextHolder = null;
    private static final long SSL_HANDSHAKE_TIMEOUT_MS = 15000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AapSslContext.Companion Companion = null;
    
    public AapSslContext(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.ssl.SingleKeyKeyManager keyManager) {
        super();
    }
    
    public final boolean isUserDisconnect() {
        return false;
    }
    
    public final void setUserDisconnect(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean performHandshake(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.connection.AccessoryConnection connection) {
        return false;
    }
    
    /**
     * Reads a single complete AAP message from the connection.
     * This ensures that we always respect AAP framing boundaries.
     */
    private final byte[] readAapMessage(com.andrerinas.openheadunit.connection.AccessoryConnection connection) {
        return null;
    }
    
    private final int prepare() {
        return 0;
    }
    
    @java.lang.Override()
    public void postHandshakeReset() {
    }
    
    @java.lang.Override()
    public void release() {
    }
    
    private final javax.net.ssl.SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        return null;
    }
    
    private final void runDelegatedTasks() {
    }
    
    private final byte[] handshakeRead() {
        return null;
    }
    
    private final int handshakeWrite(int start, int length, byte[] buffer) {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.andrerinas.openheadunit.aap.ByteArrayWithLimit decrypt(int start, int length, @org.jetbrains.annotations.NotNull()
    byte[] buffer) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.andrerinas.openheadunit.aap.ByteArrayWithLimit encrypt(int offset, int length, @org.jetbrains.annotations.NotNull()
    byte[] buffer) {
        return null;
    }
    
    private final void runDelegatedTasks(javax.net.ssl.SSLEngineResult result, javax.net.ssl.SSLEngine engine) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapSslContext$Companion;", "", "()V", "SSL_HANDSHAKE_TIMEOUT_MS", "", "createSslContext", "Ljavax/net/ssl/SSLContext;", "keyManager", "Lcom/andrerinas/openheadunit/ssl/SingleKeyKeyManager;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final javax.net.ssl.SSLContext createSslContext(com.andrerinas.openheadunit.ssl.SingleKeyKeyManager keyManager) {
            return null;
        }
    }
}