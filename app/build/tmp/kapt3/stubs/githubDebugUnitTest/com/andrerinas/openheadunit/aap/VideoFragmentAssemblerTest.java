package com.andrerinas.openheadunit.aap;

/**
 * The transition table for video fragment reassembly.
 *
 * Issue #219 - the melting/smearing picture - is what reaching the codec with something that is not
 * a whole access unit looks like, and the three ways the stream can produce that are all in here.
 * The case worth naming is `a first fragment with no start code`: it used to leave the run open and
 * silently assemble the frame without its own beginning.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\u000bH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0007J\b\u0010\u000f\u001a\u00020\u000bH\u0007J\b\u0010\u0010\u001a\u00020\u000bH\u0007J\b\u0010\u0011\u001a\u00020\u000bH\u0007J\b\u0010\u0012\u001a\u00020\u000bH\u0007J\b\u0010\u0013\u001a\u00020\u000bH\u0007J\b\u0010\u0014\u001a\u00020\u000bH\u0007J\b\u0010\u0015\u001a\u00020\u000bH\u0007J\b\u0010\u0016\u001a\u00020\u000bH\u0007J\b\u0010\u0017\u001a\u00020\u000bH\u0007J\b\u0010\u0018\u001a\u00020\u000bH\u0007J\b\u0010\u0019\u001a\u00020\u000bH\u0007J\b\u0010\u001a\u001a\u00020\u000bH\u0007J\b\u0010\u001b\u001a\u00020\u000bH\u0007J\b\u0010\u001c\u001a\u00020\u000bH\u0007J\b\u0010\u001d\u001a\u00020\u000bH\u0007J\b\u0010\u001e\u001a\u00020\u000bH\u0007J\b\u0010\u001f\u001a\u00020\u000bH\u0007J\u0014\u0010 \u001a\u00020!*\u00020\"2\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0014\u0010$\u001a\u00020!*\u00020\"2\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0014\u0010%\u001a\u00020!*\u00020\"2\u0006\u0010#\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFragmentAssemblerTest;", "", "()V", "atMedia", "", "atTimestamp", "first", "last", "middle", "single", "a complete frame decodes from the media offset when there is nothing at ten", "", "a complete frame decodes from the timestamp offset", "a complete frame during an open run reports the previous frame truncated", "a complete frame with no start code is dropped without asking for a keyframe", "a first fragment during an open run reports the previous frame truncated", "a first fragment with no start code is discarded, not assembled headless", "a headless first fragment does not consume the message", "a headless first fragment during an open run counts both anomalies", "a last fragment with no run open is an orphan and closes nothing", "a long frame appends every middle fragment", "a middle fragment does not itself count as truncation", "a middle fragment with no run open is an orphan and is discarded", "a two-fragment frame assembles and decodes", "an unhandled flag is passed on without touching the run", "back to back frames leave no state behind", "every anomaly is counted and the counters reset independently of the state", "overflow marks the frame corrupt so the rest of it is skipped", "reset returns the machine to its start state", "the followers of a headless first fragment never reach the decoder", "the rest of a corrupt frame is discarded, and the next frame recovers", "the timestamp offset wins when both offsets look like a start code", "continuation", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Decision;", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler;", "flags", "mediaIndication", "timestampIndication", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class VideoFragmentAssemblerTest {
    private final int single = 11;
    private final int first = 9;
    private final int middle = 8;
    private final int last = 10;
    private final int atTimestamp = 10;
    private final int atMedia = 2;
    
    public VideoFragmentAssemblerTest() {
        super();
    }
    
    /**
     * A message whose payload begins at offset 10.
     */
    private final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Decision timestampIndication(com.andrerinas.openheadunit.aap.VideoFragmentAssembler $this$timestampIndication, int flags) {
        return null;
    }
    
    /**
     * A message whose payload begins at offset 2.
     */
    private final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Decision mediaIndication(com.andrerinas.openheadunit.aap.VideoFragmentAssembler $this$mediaIndication, int flags) {
        return null;
    }
    
    /**
     * A continuation fragment: no start code is expected anywhere in it.
     */
    private final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Decision continuation(com.andrerinas.openheadunit.aap.VideoFragmentAssembler $this$continuation, int flags) {
        return null;
    }
}