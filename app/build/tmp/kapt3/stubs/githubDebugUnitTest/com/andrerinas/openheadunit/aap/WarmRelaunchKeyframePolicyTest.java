package com.andrerinas.openheadunit.aap;

/**
 * The gates are spelled out one at a time because each of them is what keeps a video-focus release
 * away from a stream that is working. A release across a healthy stream is a known way to drop one
 * to a few fps permanently, so the escalation is only ever correct in the one situation these
 * arguments describe together: a decoder rebuilt under a surface that has never shown a frame, on a
 * session that already proved itself, with the phone still on the link.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007JX\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u0016H\u0002\u00a8\u0006\u001b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WarmRelaunchKeyframePolicyTest;", "", "()V", "a cold start is left to the phone\'s own sink setup", "", "a fresh surface is given the healthy path\'s own worst case first", "a phone that has left the link is a disconnect, not a stall", "a phone that is silent on video but present on the link still gets the cycle", "a picture on screen is never disturbed", "a session with no link activity at all is never escalated", "a warm relaunch with no picture gets the focus cycle", "nothing is sent unless the transport is in its steady state", "the cycle is spent once per surface and degrades to the nudge", "the escalation window stays clear of the slowest unaided first frame", "the nudge respects the shared keyframe throttle", "warmRelaunch", "Lcom/andrerinas/openheadunit/aap/WarmRelaunchKeyframePolicy$Action;", "sessionHasRendered", "", "renderedSinceSurfaceSet", "transportStarted", "msSinceSurfaceSet", "", "msSinceLinkActivity", "linkQuietThresholdMs", "cycleAlreadySpent", "msSinceLastRequest", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class WarmRelaunchKeyframePolicyTest {
    
    public WarmRelaunchKeyframePolicyTest() {
        super();
    }
    
    /**
     * A relaunch that has gone 5s without a picture while the phone is on the link: the whole point.
     */
    private final com.andrerinas.openheadunit.aap.WarmRelaunchKeyframePolicy.Action warmRelaunch(boolean sessionHasRendered, boolean renderedSinceSurfaceSet, boolean transportStarted, long msSinceSurfaceSet, long msSinceLinkActivity, long linkQuietThresholdMs, boolean cycleAlreadySpent, long msSinceLastRequest) {
        return null;
    }
}