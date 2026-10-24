package com.andrerinas.openheadunit.aap;

/**
 * The full state table is spelled out because the watchdog's original inline check accepted only
 * HandshakeComplete — a state the session passes through once, briefly — and returned without
 * re-posting, so it died on the first tick of every session. TransportStarted being live is the
 * regression this table pins.
 *
 * The overlay and recovery tables pin the other half of that history. Reviving the watchdog made its
 * frame-only criterion reachable for the first time, and it promptly called an idle Android Auto
 * screen a lost connection (issue #852). The two decisions were split rather than retuned, so the
 * cases that matter are the asymmetric ones: a stopped picture on a live link must produce recovery
 * and no overlay, and neither signal alone is enough for the overlay.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J0\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0007J\b\u0010\u0016\u001a\u00020\u0004H\u0007J\b\u0010\u0017\u001a\u00020\u0004H\u0007J\b\u0010\u0018\u001a\u00020\u0004H\u0007J\b\u0010\u0019\u001a\u00020\u0004H\u0007\u00a8\u0006\u001a"}, d2 = {"Lcom/andrerinas/openheadunit/aap/ProjectionWatchdogPolicyTest;", "", "()V", "a dead session is not nudged", "", "a picture on the current surface ends the loop", "a picture that stops while the link keeps talking is not a lost connection", "a silent link alone is not enough while frames are arriving", "a stopped picture on a silent link is a lost connection", "a surface that has never shown a picture is nudged for", "both thresholds are exclusive at the boundary", "every state outside a live session stops the watchdog", "never having heard from the phone reads as silent, and still needs a frame gap", "no request while the picture is still arriving", "nothing is asked for before there is a surface to ask about", "nudge", "", "sessionLive", "surfaceSet", "renderedSinceSurfaceSet", "warmRelaunchCycleSpent", "recovery still fires on a stopped picture with a live link", "requests are paced by the keyframe throttle", "the escalation taking over ends the loop", "the loop is decided by the picture, never by what is drawn over it", "the session is live through the handshake window and the whole projection", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class ProjectionWatchdogPolicyTest {
    
    public ProjectionWatchdogPolicyTest() {
        super();
    }
    
    private final boolean nudge(boolean sessionLive, boolean surfaceSet, boolean renderedSinceSurfaceSet, boolean warmRelaunchCycleSpent) {
        return false;
    }
}