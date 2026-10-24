package com.andrerinas.openheadunit.aap;

/**
 * Whether to take system audio focus away from other players on the head unit, for both routes that
 * do it: [shouldAcquire] for the dynamic path, which holds focus while an AA audio channel plays,
 * and [shouldAcquirePermanent] for static mode, which holds it for the whole session.
 *
 * Taking focus exists so a *local* player — typically the car's FM radio — pauses while AA audio
 * plays and resumes when it stops. It backfires when the other player is the head unit's Bluetooth
 * A2DP sink: AOSP's `A2dpSinkStreamHandler` answers the focus loss with an AVRCP passthrough PAUSE
 * to the source device, and that source is the very phone feeding the AA stream. On the dynamic
 * path the phone pauses, Android Auto tears the audio sink down, we release focus, the phone
 * resumes, and the whole thing repeats every few seconds. Nothing in the focus API distinguishes
 * the two cases, so this decides it from context instead.
 *
 * The two entry points are exact complements on the `staticAudioFocus` axis: whichever route is
 * live, the other declines, so they can never both hold focus. A test asserts it.
 *
 * Pure and unit-tested; the I/O and the runtime bookkeeping live in [AapAudio] and [AapService].
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006J6\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bJ&\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/andrerinas/openheadunit/aap/PlaybackFocusPolicy;", "", "()V", "SELF_DEFEATING_LIMIT", "", "SELF_DEFEATING_WINDOW_MS", "", "countsAsSelfDefeating", "", "isMediaChannel", "msSinceAcquire", "shouldAcquire", "mode", "Lcom/andrerinas/openheadunit/aap/PlaybackFocusPolicy$Mode;", "staticAudioFocus", "audioSinkEnabled", "isAudioChannel", "btMediaLinkActive", "selfDefeatingLatched", "shouldAcquirePermanent", "Mode", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class PlaybackFocusPolicy {
    
    /**
     * Consecutive self-defeating stops before we stop taking focus for the rest of the session.
     */
    public static final int SELF_DEFEATING_LIMIT = 2;
    public static final long SELF_DEFEATING_WINDOW_MS = 5000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.PlaybackFocusPolicy INSTANCE = null;
    
    private PlaybackFocusPolicy() {
        super();
    }
    
    /**
     * @param isAudioChannel   the channel is one of AUDIO / AUDIO1 / AUDIO2.
     * @param staticAudioFocus static mode holds focus permanently and manages it elsewhere, so the
     *                        dynamic path must keep its hands off entirely.
     * @param btMediaLinkActive a Bluetooth media (A2DP) link to this head unit is up, so the
     *                         "other player" we would silence is very likely the phone itself.
     *                         Callers that cannot tell should pass `true`: a car radio playing over
     *                         AA is an annoyance, silence is a broken app.
     * @param selfDefeatingLatched we already observed the phone cut its own audio right after we
     *                         took focus, more than once this session.
     */
    public final boolean shouldAcquire(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.PlaybackFocusPolicy.Mode mode, boolean staticAudioFocus, boolean audioSinkEnabled, boolean isAudioChannel, boolean btMediaLinkActive, boolean selfDefeatingLatched) {
        return false;
    }
    
    /**
     * The static-mode counterpart of [shouldAcquire]: whether to take the permanent
     * `AUDIOFOCUS_GAIN` that static mode holds for a whole session, grabbed at connect time before
     * any audio exists.
     *
     * Same trigger as the dynamic path — an A2DP sink answers our focus loss by pausing the phone we
     * project — but a permanent `AUDIOFOCUS_LOSS` is not a `LOSS_TRANSIENT`: the sink pauses once and
     * does not resume when we abandon focus, so the failure is a session that starts silent rather
     * than one that cycles.
     *
     * There is no latch parameter because there is nothing here for the latch to observe. It counts
     * media channels closing shortly after a grab, and static mode grabs once, outside any channel's
     * lifetime. The Bluetooth probe is the only signal available on this path, which is why a unit
     * whose probe reads nothing needs [Mode.NEVER] set by hand.
     */
    public final boolean shouldAcquirePermanent(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.PlaybackFocusPolicy.Mode mode, boolean staticAudioFocus, boolean audioSinkEnabled, boolean btMediaLinkActive) {
        return false;
    }
    
    /**
     * Whether an audio channel that stopped this soon after we took focus should count towards the
     * latch. Measured on the reporting unit, the phone paused within 60-660 ms of the grant and
     * Android Auto dropped the sink 3.4-4.1 s later; a track a listener actually chose to stop
     * lasts far longer than the window.
     *
     * Only the media channel qualifies — speech and system-sound channels are short by nature, so
     * counting them would latch on a single navigation prompt.
     */
    public final boolean countsAsSelfDefeating(boolean isMediaChannel, long msSinceAcquire) {
        return false;
    }
    
    /**
     * User override for the automatic behaviour. Stored as an ordinal in settings.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/PlaybackFocusPolicy$Mode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "AUTO", "ALWAYS", "NEVER", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Mode {
        /*public static final*/ AUTO /* = new AUTO(0) */,
        /*public static final*/ ALWAYS /* = new ALWAYS(0) */,
        /*public static final*/ NEVER /* = new NEVER(0) */;
        private final int value = 0;
        @org.jetbrains.annotations.NotNull()
        private static final java.util.Map<java.lang.Integer, com.andrerinas.openheadunit.aap.PlaybackFocusPolicy.Mode> map = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.PlaybackFocusPolicy.Mode.Companion Companion = null;
        
        Mode(int value) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.PlaybackFocusPolicy.Mode> getEntries() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/aap/PlaybackFocusPolicy$Mode$Companion;", "", "()V", "map", "", "", "Lcom/andrerinas/openheadunit/aap/PlaybackFocusPolicy$Mode;", "fromInt", "value", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.andrerinas.openheadunit.aap.PlaybackFocusPolicy.Mode fromInt(int value) {
                return null;
            }
        }
    }
}