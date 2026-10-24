package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0014\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00020\t\"\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\b\u0010\u000f\u001a\u00020\u0004H\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0007J\b\u0010\u0011\u001a\u00020\u0004H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\b\u0010\u0013\u001a\u00020\u0004H\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoKeyframeScannerTest;", "", "()V", "a keyframe buried past the header cap is not scanned for", "", "a truncated or empty access unit is not a keyframe", "accessUnit", "", "nals", "", "", "an h264 idr behind its parameter sets is still found", "an h264 idr slice is a keyframe", "an h264 non-idr slice is not a keyframe", "an hevc idr behind vps sps pps is still found", "an hevc trailing picture is not a keyframe", "an offset into a larger buffer is honoured", "hevc irap types are keyframes across the whole range", "parameter sets alone are not a keyframe", "reading an h264 idr as hevc can go either way, which is why the pinned type is passed", "scan", "", "data", "isHevc", "three byte start codes are recognised", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class VideoKeyframeScannerTest {
    
    public VideoKeyframeScannerTest() {
        super();
    }
    
    /**
     * Builds an access unit from (nalHeaderByte, payloadBytes) pairs, 4-byte start codes.
     */
    private final byte[] accessUnit(int... nals) {
        return null;
    }
    
    private final boolean scan(byte[] data, boolean isHevc) {
        return false;
    }
}