package com.andrerinas.openheadunit.decoder;

/**
 * The buffer request that decides how much graphics memory a decoder's input port takes.
 *
 * The measurement this exists for: a 2 MB request at 1280x720 was answered with eight buffers of
 * that size - 16 MB - on a unit with a 12-20 MB Java heap.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\tH\u0007J\b\u0010\u000f\u001a\u00020\tH\u0007J\b\u0010\u0010\u001a\u00020\tH\u0007J\b\u0010\u0011\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/CodecInputSizePolicyTest;", "", "()V", "h264LegacyCap", "", "h265Cap", "h265CapAbove1080p", "mb", "1080p stays inside the tier and still saves", "", "4K needs most of its tier, which is why the tier exists", "720p asks for well under the tier it used to take", "800x480 saves too, and the floor does not bind there", "a tiny picture still gets a usable buffer", "the cap is never exceeded, whatever the resolution claims", "the floor cannot push a request past its cap", "the request never grows with resolution beyond its cap and never shrinks with it", "unknown dimensions leave the cap alone", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class CodecInputSizePolicyTest {
    private final int mb = 1048576;
    private final int h265Cap = 0;
    private final int h265CapAbove1080p = 0;
    private final int h264LegacyCap = 0;
    
    public CodecInputSizePolicyTest() {
        super();
    }
}