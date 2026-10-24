package com.andrerinas.openheadunit.aap;

/**
 * Whether a physical media button should be forwarded to Android Auto, or left to the Bluetooth
 * side that may already be acting on the same press.
 *
 * A head unit can end up with two consumers for one button. The OEM key handler delivers the press
 * to us *and* the Bluetooth media stack acts on it independently: AOSP's
 * `BluetoothMediaBrowserService` publishes a real media session whose skip-to-next issues an AVRCP
 * passthrough FORWARD to the source device — the same phone that is projecting to us. Both
 * consumers reach the same media app, so one press skips two tracks.
 *
 * Only the cumulative commands show it. Play/pause is a state-specific passthrough (PLAY or PAUSE
 * depending on the sink's own playback state), so two consumers converge on one result and the user
 * sees nothing wrong; next/previous add up. That asymmetry is the fingerprint of this failure, and
 * it is what rules out "the key is sent twice" faults inside this app, which would double both.
 *
 * Nothing in the platform arbitrates the two: the Bluetooth profile calls that would deactivate the
 * other consumer are `BLUETOOTH_PRIVILEGED`, aborting the broadcast does not work because the
 * framework's media-button route is single-target rather than an ordered fan-out, and taking audio
 * focus to deactivate the sink's session is exactly the behaviour [PlaybackFocusPolicy] exists to
 * avoid. So the lever is which consumer *we* leave the key to.
 *
 * Pure and unit-tested; the Bluetooth probe and the send live in `CommManager`.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/MediaKeyRoutingPolicy;", "", "()V", "shouldForward", "", "mode", "Lcom/andrerinas/openheadunit/aap/MediaKeyRoutingPolicy$Mode;", "isMediaKey", "btMediaLinkActive", "(Lcom/andrerinas/openheadunit/aap/MediaKeyRoutingPolicy$Mode;ZLjava/lang/Boolean;)Z", "Mode", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class MediaKeyRoutingPolicy {
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.MediaKeyRoutingPolicy INSTANCE = null;
    
    private MediaKeyRoutingPolicy() {
        super();
    }
    
    /**
     * @param isMediaKey       the key is one of the transport controls. Everything else — the rotary
     *                        controller, D-pad, Back, Enter — is always forwarded, whatever the
     *                        mode: those have no Bluetooth consumer competing for them, and a
     *                        setting about media buttons that quietly disabled the controller would
     *                        be a worse bug than the one it fixes.
     * @param btMediaLinkActive whether a Bluetooth media (A2DP) link to this head unit is up, or
     *                        `null` when the adapter would not say. Unknown forwards: a doubled
     *                        skip is an annoyance, media buttons that silently do nothing read as a
     *                        broken app. Note this is the opposite resolution to
     *                        [PlaybackFocusPolicy], where an unreadable state means "assume a link
     *                        is up" — there the cautious answer is to leave focus alone.
     */
    public final boolean shouldForward(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.MediaKeyRoutingPolicy.Mode mode, boolean isMediaKey, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean btMediaLinkActive) {
        return false;
    }
    
    /**
     * User choice for who owns the media buttons. Stored as an ordinal in settings.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/MediaKeyRoutingPolicy$Mode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ALWAYS", "AUTO", "NEVER", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Mode {
        /*public static final*/ ALWAYS /* = new ALWAYS(0) */,
        /*public static final*/ AUTO /* = new AUTO(0) */,
        /*public static final*/ NEVER /* = new NEVER(0) */;
        private final int value = 0;
        @org.jetbrains.annotations.NotNull()
        private static final java.util.Map<java.lang.Integer, com.andrerinas.openheadunit.aap.MediaKeyRoutingPolicy.Mode> map = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.MediaKeyRoutingPolicy.Mode.Companion Companion = null;
        
        Mode(int value) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.MediaKeyRoutingPolicy.Mode> getEntries() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/aap/MediaKeyRoutingPolicy$Mode$Companion;", "", "()V", "map", "", "", "Lcom/andrerinas/openheadunit/aap/MediaKeyRoutingPolicy$Mode;", "fromInt", "value", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.andrerinas.openheadunit.aap.MediaKeyRoutingPolicy.Mode fromInt(int value) {
                return null;
            }
        }
    }
}