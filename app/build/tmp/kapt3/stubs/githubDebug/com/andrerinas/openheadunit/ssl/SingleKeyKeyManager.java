package com.andrerinas.openheadunit.ssl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ;\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0002\u0010\u0014J;\u0010\u0015\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016\u00a2\u0006\u0002\u0010\u0018J3\u0010\u0019\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0002\u0010\u001aJ\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0002\u0010\u001dJ/\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u000fH\u0016\u00a2\u0006\u0002\u0010\u001fJ\u0012\u0010 \u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\rH\u0016J/\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u000fH\u0016\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/andrerinas/openheadunit/ssl/SingleKeyKeyManager;", "Ljavax/net/ssl/X509ExtendedKeyManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "certificate", "Ljava/security/cert/X509Certificate;", "privateKey", "Ljava/security/PrivateKey;", "(Ljava/security/cert/X509Certificate;Ljava/security/PrivateKey;)V", "delegate", "Ljavax/net/ssl/X509KeyManager;", "chooseClientAlias", "", "keyType", "", "issuers", "Ljava/security/Principal;", "socket", "Ljava/net/Socket;", "([Ljava/lang/String;[Ljava/security/Principal;Ljava/net/Socket;)Ljava/lang/String;", "chooseEngineClientAlias", "engine", "Ljavax/net/ssl/SSLEngine;", "([Ljava/lang/String;[Ljava/security/Principal;Ljavax/net/ssl/SSLEngine;)Ljava/lang/String;", "chooseServerAlias", "(Ljava/lang/String;[Ljava/security/Principal;Ljava/net/Socket;)Ljava/lang/String;", "getCertificateChain", "alias", "(Ljava/lang/String;)[Ljava/security/cert/X509Certificate;", "getClientAliases", "(Ljava/lang/String;[Ljava/security/Principal;)[Ljava/lang/String;", "getPrivateKey", "getServerAliases", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class SingleKeyKeyManager extends javax.net.ssl.X509ExtendedKeyManager {
    @org.jetbrains.annotations.NotNull()
    private final javax.net.ssl.X509KeyManager delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DEFAULT_ALIAS = "defaultSingleKeyAlias";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.ssl.SingleKeyKeyManager.Companion Companion = null;
    
    public SingleKeyKeyManager(@org.jetbrains.annotations.NotNull()
    java.security.cert.X509Certificate certificate, @org.jetbrains.annotations.NotNull()
    java.security.PrivateKey privateKey) {
        super();
    }
    
    public SingleKeyKeyManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String[] getClientAliases(@org.jetbrains.annotations.Nullable()
    java.lang.String keyType, @org.jetbrains.annotations.Nullable()
    java.security.Principal[] issuers) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String[] getServerAliases(@org.jetbrains.annotations.Nullable()
    java.lang.String keyType, @org.jetbrains.annotations.Nullable()
    java.security.Principal[] issuers) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String chooseServerAlias(@org.jetbrains.annotations.Nullable()
    java.lang.String keyType, @org.jetbrains.annotations.Nullable()
    java.security.Principal[] issuers, @org.jetbrains.annotations.Nullable()
    java.net.Socket socket) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.security.cert.X509Certificate[] getCertificateChain(@org.jetbrains.annotations.Nullable()
    java.lang.String alias) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.security.PrivateKey getPrivateKey(@org.jetbrains.annotations.Nullable()
    java.lang.String alias) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String chooseClientAlias(@org.jetbrains.annotations.Nullable()
    java.lang.String[] keyType, @org.jetbrains.annotations.Nullable()
    java.security.Principal[] issuers, @org.jetbrains.annotations.Nullable()
    java.net.Socket socket) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String chooseEngineClientAlias(@org.jetbrains.annotations.Nullable()
    java.lang.String[] keyType, @org.jetbrains.annotations.Nullable()
    java.security.Principal[] issuers, @org.jetbrains.annotations.Nullable()
    javax.net.ssl.SSLEngine engine) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/ssl/SingleKeyKeyManager$Companion;", "", "()V", "DEFAULT_ALIAS", "", "createCertificate", "Ljava/security/cert/X509Certificate;", "context", "Landroid/content/Context;", "createPrivateKey", "Ljava/security/PrivateKey;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final java.security.cert.X509Certificate createCertificate(android.content.Context context) {
            return null;
        }
        
        private final java.security.PrivateKey createPrivateKey(android.content.Context context) {
            return null;
        }
    }
}