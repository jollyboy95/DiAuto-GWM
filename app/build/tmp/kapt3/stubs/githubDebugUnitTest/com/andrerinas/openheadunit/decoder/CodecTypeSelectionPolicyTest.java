package com.andrerinas.openheadunit.decoder;

/**
 * The four inputs are named after what produces them on a device, so a case here maps onto a unit
 * you could hold: `hevcDetectable` is hardware HEVC, `hevcUsable` adds the explicitly selected
 * software decoder, and `detected` is what the first packet's parameter sets said.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J*\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0007J\b\u0010\u0011\u001a\u00020\u0004H\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/CodecTypeSelectionPolicyTest;", "", "()V", "H264 is never overridden into H265 by the setting alone when the stream disagrees", "", "a packet with no parameter set falls back to the setting", "a unit that cannot decode HEVC at all ignores an H265 setting", "an H264 stream gets an H264 decoder even when the setting says H265", "an H265 stream still gets an H265 decoder when the setting says H264", "select", "Lcom/andrerinas/openheadunit/decoder/VideoDecoder$CodecType;", "detected", "requested", "hevcDetectable", "", "hevcUsable", "software HEVC keeps the setting, because the sniff cannot see HEVC there", "the ordinary agreeing cases are unchanged", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class CodecTypeSelectionPolicyTest {
    
    public CodecTypeSelectionPolicyTest() {
        super();
    }
    
    private final com.andrerinas.openheadunit.decoder.VideoDecoder.CodecType select(com.andrerinas.openheadunit.decoder.VideoDecoder.CodecType detected, com.andrerinas.openheadunit.decoder.VideoDecoder.CodecType requested, boolean hevcDetectable, boolean hevcUsable) {
        return null;
    }
}