package com.andrerinas.openheadunit.aap;

/**
 * Message types of the WiFi Projection Protocol. See `wireless.proto` for the payload shapes.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppMessageType;", "", "()V", "CONNECT_STATUS", "", "INFO_REQUEST", "INFO_RESPONSE", "PING_REQUEST", "PING_RESPONSE", "SETUP_INFO", "START_REQUEST", "START_RESPONSE", "VERSION_REQUEST", "VERSION_RESPONSE", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class WppMessageType {
    
    /**
     * Head unit -> phone: where to open the projection session.
     */
    public static final int START_REQUEST = 1;
    
    /**
     * Phone -> head unit: asking for the network credentials.
     */
    public static final int INFO_REQUEST = 2;
    
    /**
     * Head unit -> phone: the credentials.
     */
    public static final int INFO_RESPONSE = 3;
    
    /**
     * Head unit -> phone: our protocol version, opening the modern handshake.
     */
    public static final int VERSION_REQUEST = 4;
    
    /**
     * Phone -> head unit: its protocol version.
     */
    public static final int VERSION_RESPONSE = 5;
    
    /**
     * Phone -> head unit: whether it managed to join our network.
     */
    public static final int CONNECT_STATUS = 6;
    
    /**
     * Phone -> head unit: acknowledges [START_REQUEST].
     */
    public static final int START_RESPONSE = 7;
    
    /**
     * Keepalive, either direction. A request is answered by echoing its payload back as a response.
     */
    public static final int PING_REQUEST = 8;
    public static final int PING_RESPONSE = 9;
    
    /**
     * Not sent; defined so a capture can be read.
     */
    public static final int SETUP_INFO = 11;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.WppMessageType INSTANCE = null;
    
    private WppMessageType() {
        super();
    }
}