package com.andrerinas.openheadunit.decoder;

/**
 * Decides which codec to build for the first packet of a session, given what the stream looks like
 * and what the user asked for.
 *
 * The two inputs disagree more often than they look like they should, because the codec setting is
 * a *preference* everywhere except here. `ServiceDiscoveryResponse`
 * announces H.265 only when an HEVC decoder actually exists and quietly announces H.264 otherwise,
 * so a unit with no HEVC support set to "H.265" is told H.264 by us, is sent H.264 by the phone -
 * and used to build an HEVC decoder for it anyway, because the setting was treated as a command and
 * the stream sniff was thrown away. That produces a codec that errors on every access unit, which is
 * the `ERROR(0x80001005)` storm read off a reporter capture: 52 rebuilds in 275s on a stream the
 * decoder could never have played.
 *
 * The phone can also simply send H.264 on a session where we asked for H.265, which is the same
 * failure from the other direction and needs no misconfiguration at all.
 *
 * Why the setting cannot just be ignored in favour of the sniff: `VideoDecoder.detectCodecType` is
 * asymmetric. It recognises HEVC parameter sets only when [VideoDecoder.isHevcSupported] is true, so
 * on a unit without hardware HEVC it walks past the VPS/SPS/PPS of a real H.265 stream and can then
 * read an HEVC IDR_N_LP header (NAL 20, byte 0x28) as an H.264 PPS, because `0x28 and 0x1F` is 8.
 * On such a unit the sniff's "H.264" answer is not evidence, and the explicit setting is the only
 * thing that knows the stream is H.265 - which is exactly the software-HEVC case.
 *
 * So the sniff is trusted when it is symmetric, the setting is trusted when it is not, and a unit
 * that cannot decode HEVC by any route gets H.264 regardless of what its setting says, because that
 * is what we told the phone to send.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u00a8\u0006\n"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/CodecTypeSelectionPolicy;", "", "()V", "select", "Lcom/andrerinas/openheadunit/decoder/VideoDecoder$CodecType;", "detected", "requested", "hevcDetectable", "", "hevcUsable", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class CodecTypeSelectionPolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.CodecTypeSelectionPolicy INSTANCE = null;
    
    private CodecTypeSelectionPolicy() {
        super();
    }
    
    /**
     * @param detected what `VideoDecoder.detectCodecType` made of the first packet, or null when it
     *  found no parameter set it recognised.
     * @param requested the codec type implied by `Settings.videoCodec`.
     * @param hevcDetectable true when the sniff can positively identify HEVC, i.e.
     *  [VideoDecoder.isHevcSupported]. When false the sniff's H.264 answer may be a misread H.265
     *  stream and carries no information.
     * @param hevcUsable true when an HEVC decoder exists by some route - hardware, or an explicitly
     *  selected software one. Mirrors `hevcAvailableForUserChoice` in the announcement, which is
     *  what decided the codec the phone is actually sending.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.decoder.VideoDecoder.CodecType select(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.decoder.VideoDecoder.CodecType detected, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.decoder.VideoDecoder.CodecType requested, boolean hevcDetectable, boolean hevcUsable) {
        return null;
    }
}