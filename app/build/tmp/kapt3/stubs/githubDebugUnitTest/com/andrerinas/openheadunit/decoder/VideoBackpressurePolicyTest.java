package com.andrerinas.openheadunit.decoder;

/**
 * The numbers in the "measured" cases come from a #219 reporter's Galaxy Tab S7 FE running
 * 2560x1440 HEVC on `c2.qti.hevc.decoder`. They are the reason the threshold is where it is, so
 * they are pinned here rather than described in a comment somewhere.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J\b\u0010\r\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/VideoBackpressurePolicyTest;", "", "()V", "window", "", "degenerate windows are never backpressure", "", "one window is not a verdict", "shedding while waiting a large share of the window is backpressure", "shedding with a small wait is not the codec", "the report is once per decoder session", "the required windows do not have to be consecutive", "the threshold is inclusive at exactly the share", "waiting without shedding is a decoder under load that is still keeping up", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class VideoBackpressurePolicyTest {
    private final long window = 5000L;
    
    public VideoBackpressurePolicyTest() {
        super();
    }
}