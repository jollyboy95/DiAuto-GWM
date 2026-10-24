package com.andrerinas.openheadunit.aap;

/**
 * Exclusive claim on the video-focus release/regain cycle.
 *
 * The cycle is the only thing in AAP that makes the phone produce a keyframe on demand, and it is
 * one operation split across a 400 ms gap: a release, then a regain. Two escalations spend it -
 * [KeyframeCycleEscalationPolicy], for a picture left corrupt by a shed frame, and
 * [WarmRelaunchKeyframePolicy], for a surface that has never shown one - each with its own budget
 * and its own handler.
 *
 * Their class comments assert the two can never overlap, and until now nothing enforced it. That was
 * tolerable while a decoder rebuild switched the first policy's clock off; it stopped being
 * tolerable the moment a rebuilt decoder started arming it instead, because a rebuild storm is
 * exactly when both policies see a surface with no picture at the same time.
 *
 * The cost of getting it wrong is not a wasted message. A second release issued between the first
 * cycle's two halves is answered with a second sink stop, and the single shared regain runnable that
 * each side keeps - replaced rather than tracked per cycle - can then complete only one of them. The
 * phone is left with its video sink down and nothing asking for it back: a permanent black screen
 * with audio still playing.
 *
 * So: whoever claims it owns it until it hands it back. A refused claim is not a failure - the cycle
 * already in flight brings the same keyframe both callers wanted - so the refused caller waits rather
 * than spending its own budget on a release it never sent.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/FocusCycleLever;", "", "()V", "held", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isHeld", "", "()Z", "release", "", "tryClaim", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class FocusCycleLever {
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.atomic.AtomicBoolean held = null;
    
    public FocusCycleLever() {
        super();
    }
    
    /**
     * Takes the lever for one cycle. False when somebody else already holds it.
     */
    public final boolean tryClaim() {
        return false;
    }
    
    /**
     * Hands it back.
     *
     * Idempotent on purpose: a cycle can be completed early by a settle path as well as by its own
     * delayed regain, and both must be safe to call.
     */
    public final void release() {
    }
    
    public final boolean isHeld() {
        return false;
    }
}