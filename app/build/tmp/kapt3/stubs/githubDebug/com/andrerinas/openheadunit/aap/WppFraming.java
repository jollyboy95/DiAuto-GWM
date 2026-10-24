package com.andrerinas.openheadunit.aap;

/**
 * The wire framing of the Android Auto WiFi Projection Protocol, as spoken over the RFCOMM channel
 * before the phone joins our network.
 *
 * Every message is four header bytes followed by the payload:
 *
 * ```
 *  0   1   2   3   4 ...
 * +---+---+---+---+--------------+
 * | payload len   |  message type | protobuf payload
 * |  uint16 BE    |   uint16 BE   |
 * +---+---+---+---+--------------+
 * ```
 *
 * Both fields are big-endian, byte-for-byte what aa-proxy-rs's dongle writes — the check that this
 * is the protocol and not one head unit's habits.
 *
 * Pure and tested because it is the one part of the exchange that can be wrong in a way no log
 * shows: a header we build by hand and the phone silently discards. Sizes above 255 exercise the
 * high byte; what we send stays well under it, what we receive is not ours to bound.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppFraming;", "", "()V", "HEADER_SIZE", "", "MAX_PAYLOAD_SIZE", "decodePayloadSize", "header", "", "decodeType", "encodeFrame", "payload", "type", "encodeHeader", "payloadSize", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class WppFraming {
    
    /**
     * Bytes of header in front of every payload.
     */
    public static final int HEADER_SIZE = 4;
    
    /**
     * Largest payload the length field can describe.
     */
    public static final int MAX_PAYLOAD_SIZE = 65535;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.WppFraming INSTANCE = null;
    
    private WppFraming() {
        super();
    }
    
    /**
     * The four header bytes for a [payloadSize]-byte payload of message type [type].
     *
     * @throws IllegalArgumentException if [payloadSize] will not fit. Loud rather than truncating:
     *  a wrapped length desynchronises the receiver permanently.
     */
    @org.jetbrains.annotations.NotNull()
    public final byte[] encodeHeader(int payloadSize, int type) {
        return null;
    }
    
    /**
     * A complete frame: header for [payload] of message type [type], then the payload itself.
     */
    @org.jetbrains.annotations.NotNull()
    public final byte[] encodeFrame(@org.jetbrains.annotations.NotNull()
    byte[] payload, int type) {
        return null;
    }
    
    /**
     * The payload length declared by a [HEADER_SIZE]-byte header.
     */
    public final int decodePayloadSize(@org.jetbrains.annotations.NotNull()
    byte[] header) {
        return 0;
    }
    
    /**
     * The message type declared by a [HEADER_SIZE]-byte header.
     */
    public final int decodeType(@org.jetbrains.annotations.NotNull()
    byte[] header) {
        return 0;
    }
}