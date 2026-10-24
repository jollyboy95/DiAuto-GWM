package com.andrerinas.openheadunit.aap;

/**
 * What may and may not be flagged BUFFER_FLAG_CODEC_CONFIG.
 *
 * The case that matters is [a keyframe leading with its parameter sets is not configuration]: that
 * flag tells MediaCodec the buffer holds codec-specific data and nothing else, so a component may
 * consume it and return no picture. On the three chipset families that flagged every config packet,
 * the old first-NAL-only check answered "configuration" for exactly that unit.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0013H\u0007J\b\u0010\u0015\u001a\u00020\u0013H\u0007J\b\u0010\u0016\u001a\u00020\u0013H\u0007J\b\u0010\u0017\u001a\u00020\u0013H\u0007J\b\u0010\u0018\u001a\u00020\u0013H\u0007J\b\u0010\u0019\u001a\u00020\u0013H\u0007J\b\u0010\u001a\u001a\u00020\u0013H\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u0013H\u0007J\b\u0010!\u001a\u00020\u0013H\u0007J\b\u0010\"\u001a\u00020\u0013H\u0007J\b\u0010#\u001a\u00020\u0013H\u0007J\b\u0010$\u001a\u00020\u0013H\u0007J\b\u0010%\u001a\u00020\u0013H\u0007J\u001e\u0010&\u001a\u00020\u001e2\n\u0010\'\u001a\u00020(\"\u00020\u00042\b\b\u0002\u0010)\u001a\u00020*H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/andrerinas/openheadunit/aap/CodecConfigScannerTest;", "", "()V", "avcAud", "", "avcIdr", "avcNonIdr", "avcPps", "avcSei", "avcSps", "avcSpsExt", "hevcAud", "hevcIdr", "hevcPps", "hevcSei", "hevcSps", "hevcTrail", "hevcVps", "a keyframe leading with its parameter sets is not configuration", "", "a large frame is not walked past the byte bound", "a picture found after the parameter sets settles the answer immediately", "a real parameter-set unit finishes well inside the bound", "a unit too short to hold a NAL is not configuration", "an IDR with no parameter sets is still just a frame", "an ordinary frame carries no parameter sets", "bytes outside the offset and size are not read", "classifyAvc", "Lcom/andrerinas/openheadunit/aap/CodecConfigScanner$Content;", "data", "", "classifyHevc", "parameter sets are found behind a delimiter or an SEI", "parameter sets on their own are configuration", "stopping at the bound withholds the flag rather than guessing", "the H264 SPS extensions count as parameter sets", "the answer is read against the pinned codec, because the same byte means two things", "three-byte start codes are read too", "unit", "headerBytes", "", "threeByteStartCodes", "", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class CodecConfigScannerTest {
    private final int avcSps = 103;
    private final int avcPps = 104;
    private final int avcIdr = 101;
    private final int avcNonIdr = 65;
    private final int avcSei = 6;
    private final int avcAud = 9;
    private final int avcSpsExt = 109;
    private final int hevcVps = 64;
    private final int hevcSps = 66;
    private final int hevcPps = 68;
    private final int hevcIdr = 38;
    private final int hevcTrail = 2;
    private final int hevcAud = 70;
    private final int hevcSei = 78;
    
    public CodecConfigScannerTest() {
        super();
    }
    
    /**
     * An Annex B access unit: a 4-byte start code and some payload per NAL.
     */
    private final byte[] unit(int[] headerBytes, boolean threeByteStartCodes) {
        return null;
    }
    
    private final com.andrerinas.openheadunit.aap.CodecConfigScanner.Content classifyAvc(byte[] data) {
        return null;
    }
    
    private final com.andrerinas.openheadunit.aap.CodecConfigScanner.Content classifyHevc(byte[] data) {
        return null;
    }
}