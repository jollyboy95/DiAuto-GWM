package com.andrerinas.openheadunit.aap;

/**
 * Which of the several deliveries of one physical button press actually reaches Android Auto.
 *
 * A single press arrives at `CommManager.sendKey` more than once: during projection the OEM hands
 * the foreground activity a raw `KeyEvent` *and* broadcasts a media button, and the car-key
 * receivers add their own copies on top. Every extra delivery that gets through is an extra action
 * on the phone.
 *
 * The discriminator is the event's own identity. `KeyEvent.getDownTime()` is stamped when the
 * gesture began, so every redelivery of one press carries the same value and two real presses never
 * do — which is exact, needs no tuning, and lets a deliberate fast double-press through. The
 * time window survives only for the proprietary OEM broadcasts that carry no `KeyEvent` at all;
 * there, guessing from elapsed time is still all there is.
 *
 * Deciding a press means deciding the whole click, both edges. Releasing a key we never pressed is
 * as wrong as pressing it twice: Android Auto reads a stray release as the end of a gesture it does
 * not have, and a press whose release goes missing leaves the key held down forever.
 *
 * Pure and unit-tested; `CommManager` holds the per-key state and does the sending.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J5\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0010J/\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy;", "", "()V", "DEFAULT_WINDOW_MS", "", "MEDIA_WINDOW_MS", "STUCK_PRESS_MS", "decide", "Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$Result;", "state", "Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$KeyState;", "isPress", "", "downTime", "isMediaKey", "now", "(Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$KeyState;ZLjava/lang/Long;ZJ)Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$Result;", "decidePress", "id", "(Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$KeyState;Ljava/lang/Long;ZJ)Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$Result;", "decideRelease", "KeyState", "Result", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class KeyDebouncePolicy {
    
    /**
     * Fallback windows for deliveries with no event identity, carried over unchanged from the
     * original inline debounce: media keys are the ones OEM head units fan out most.
     */
    public static final long MEDIA_WINDOW_MS = 600L;
    public static final long DEFAULT_WINDOW_MS = 300L;
    
    /**
     * How long a key may stay held before the next press is treated as a new one rather than a
     * duplicate of the one still down. Without this, a delivery path that sends a press and never
     * its release latches the key: every later press matches the held state and is dropped, and
     * nothing clears it short of a disconnect. Long enough not to break a genuine press-and-hold,
     * short enough that a user who presses again has their second press work.
     */
    public static final long STUCK_PRESS_MS = 2000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.KeyDebouncePolicy INSTANCE = null;
    
    private KeyDebouncePolicy() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.KeyDebouncePolicy.Result decide(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.KeyDebouncePolicy.KeyState state, boolean isPress, @org.jetbrains.annotations.Nullable()
    java.lang.Long downTime, boolean isMediaKey, long now) {
        return null;
    }
    
    private final com.andrerinas.openheadunit.aap.KeyDebouncePolicy.Result decidePress(com.andrerinas.openheadunit.aap.KeyDebouncePolicy.KeyState state, java.lang.Long id, boolean isMediaKey, long now) {
        return null;
    }
    
    private final com.andrerinas.openheadunit.aap.KeyDebouncePolicy.Result decideRelease(com.andrerinas.openheadunit.aap.KeyDebouncePolicy.KeyState state) {
        return null;
    }
    
    /**
     * Per logical key. Owned by the caller, replaced wholesale by each [decide].
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b\u00a8\u0006 "}, d2 = {"Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$KeyState;", "", "down", "", "downAt", "", "lastForwardedPressAt", "lastForwardedDownTime", "pressDropped", "(ZJLjava/lang/Long;Ljava/lang/Long;Z)V", "getDown", "()Z", "getDownAt", "()J", "getLastForwardedDownTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLastForwardedPressAt", "getPressDropped", "component1", "component2", "component3", "component4", "component5", "copy", "(ZJLjava/lang/Long;Ljava/lang/Long;Z)Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$KeyState;", "equals", "other", "hashCode", "", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class KeyState {
        
        /**
         * A press has been forwarded and its release has not.
         */
        private final boolean down = false;
        
        /**
         * When the held press was forwarded, for [STUCK_PRESS_MS].
         */
        private final long downAt = 0L;
        
        /**
         * When the last press was forwarded, for the fallback window. Null until there is one.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long lastForwardedPressAt = null;
        
        /**
         * Identity of the last forwarded press, or null if that delivery carried none.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long lastForwardedDownTime = null;
        
        /**
         * The press of the click in flight was dropped, so its release must be dropped too.
         */
        private final boolean pressDropped = false;
        
        public KeyState(boolean down, long downAt, @org.jetbrains.annotations.Nullable()
        java.lang.Long lastForwardedPressAt, @org.jetbrains.annotations.Nullable()
        java.lang.Long lastForwardedDownTime, boolean pressDropped) {
            super();
        }
        
        /**
         * A press has been forwarded and its release has not.
         */
        public final boolean getDown() {
            return false;
        }
        
        /**
         * When the held press was forwarded, for [STUCK_PRESS_MS].
         */
        public final long getDownAt() {
            return 0L;
        }
        
        /**
         * When the last press was forwarded, for the fallback window. Null until there is one.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getLastForwardedPressAt() {
            return null;
        }
        
        /**
         * Identity of the last forwarded press, or null if that delivery carried none.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getLastForwardedDownTime() {
            return null;
        }
        
        /**
         * The press of the click in flight was dropped, so its release must be dropped too.
         */
        public final boolean getPressDropped() {
            return false;
        }
        
        public KeyState() {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final long component2() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component4() {
            return null;
        }
        
        public final boolean component5() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.KeyDebouncePolicy.KeyState copy(boolean down, long downAt, @org.jetbrains.annotations.Nullable()
        java.lang.Long lastForwardedPressAt, @org.jetbrains.annotations.Nullable()
        java.lang.Long lastForwardedDownTime, boolean pressDropped) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$Result;", "", "forward", "", "releaseFirst", "dropReason", "", "state", "Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$KeyState;", "(ZZLjava/lang/String;Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$KeyState;)V", "getDropReason", "()Ljava/lang/String;", "getForward", "()Z", "getReleaseFirst", "getState", "()Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$KeyState;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Result {
        private final boolean forward = false;
        
        /**
         * Send a release for the previously held press before this one. Only set for a press that
         * arrives while a stale press is still held: the phone is owed the release of the gesture
         * it was told about.
         */
        private final boolean releaseFirst = false;
        
        /**
         * Why this delivery was dropped, for the log. Null when it was forwarded.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String dropReason = null;
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.aap.KeyDebouncePolicy.KeyState state = null;
        
        public Result(boolean forward, boolean releaseFirst, @org.jetbrains.annotations.Nullable()
        java.lang.String dropReason, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.KeyDebouncePolicy.KeyState state) {
            super();
        }
        
        public final boolean getForward() {
            return false;
        }
        
        /**
         * Send a release for the previously held press before this one. Only set for a press that
         * arrives while a stale press is still held: the phone is owed the release of the gesture
         * it was told about.
         */
        public final boolean getReleaseFirst() {
            return false;
        }
        
        /**
         * Why this delivery was dropped, for the log. Null when it was forwarded.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDropReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.KeyDebouncePolicy.KeyState getState() {
            return null;
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.KeyDebouncePolicy.KeyState component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.KeyDebouncePolicy.Result copy(boolean forward, boolean releaseFirst, @org.jetbrains.annotations.Nullable()
        java.lang.String dropReason, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.KeyDebouncePolicy.KeyState state) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}