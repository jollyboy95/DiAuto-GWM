package com.andrerinas.openheadunit.decoder;

/**
 * The one distinction this class exists for: a keyframe that was fed against one that decoded.
 *
 * The timestamps below are microseconds, the units the decoder's synthetic monotonic PTS is in.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J\b\u0010\r\u001a\u00020\u0006H\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/KeyframeRepairTrackerTest;", "", "()V", "tracker", "Lcom/andrerinas/openheadunit/decoder/KeyframeRepairTracker;", "a decoder whose output timestamps say nothing still reports a repair", "", "a frame at or past the keyframe confirms it, once", "a newer keyframe replaces an older pending one", "a run of stale frames does not carry over to the next keyframe", "feeding a keyframe is not a repair", "output the codec already had queued does not confirm anything", "renders with nothing pending are not repairs", "reset drops a pending keyframe and the decoded flag", "the bound is far past any real reorder depth and far short of the starvation patience", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class KeyframeRepairTrackerTest {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.decoder.KeyframeRepairTracker tracker = null;
    
    public KeyframeRepairTrackerTest() {
        super();
    }
}