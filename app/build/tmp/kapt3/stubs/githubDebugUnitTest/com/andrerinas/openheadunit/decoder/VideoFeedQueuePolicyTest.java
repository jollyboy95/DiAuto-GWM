package com.andrerinas.openheadunit.decoder;

/**
 * The queue between the transport and the codec has to hold more video than the feed thread in front
 * of it is willing to wait. Issue #830 is what happens when it does not: the queue sheds reference
 * frames the feed thread has not given up on, and the picture drifts until the phone's next keyframe
 * some ~69s later.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\bH\u0007J\b\u0010\r\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/VideoFeedQueuePolicyTest;", "", "()V", "highestNegotiatedRate", "", "realWorldRates", "", "a high frame rate cap cannot grow the queue past the memory ceiling", "", "a low frame rate cap cannot produce a queue below the floor", "a nonsense frame rate degrades instead of dividing by zero", "the memory ceiling is where the patience guarantee runs out", "the queue always holds more video than the feed thread waits for", "the queue depth is the configured window at the rates Android Auto negotiates", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class VideoFeedQueuePolicyTest {
    
    /**
     * The rates Android Auto actually negotiates, and the highest of them.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> realWorldRates = null;
    private final int highestNegotiatedRate = 60;
    
    public VideoFeedQueuePolicyTest() {
        super();
    }
}