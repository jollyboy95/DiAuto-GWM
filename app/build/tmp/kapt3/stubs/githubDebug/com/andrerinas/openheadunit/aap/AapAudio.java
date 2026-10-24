package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 K2\u00020\u0001:\u0001KB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ(\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\rH\u0002J\b\u00103\u001a\u00020-H\u0002J\b\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020-2\u0006\u0010.\u001a\u00020\rH\u0002J\u0010\u00107\u001a\u00020-2\u0006\u0010.\u001a\u00020\rH\u0002J\u0010\u00108\u001a\u00020-2\u0006\u0010.\u001a\u00020\rH\u0002J\u000e\u00109\u001a\u00020-2\u0006\u0010.\u001a\u00020\rJ\u000e\u0010:\u001a\u00020\u00102\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020-J\b\u0010>\u001a\u00020-H\u0002J\u001e\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020\r2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u001dJ\b\u0010C\u001a\u00020-H\u0002J\u0006\u0010D\u001a\u00020-J\u000e\u0010E\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u0010J\u0010\u0010G\u001a\u00020-2\u0006\u0010.\u001a\u00020\rH\u0002J\u000e\u0010H\u001a\u00020-2\u0006\u0010.\u001a\u00020\rJ\b\u0010I\u001a\u00020-H\u0002J\u0006\u0010J\u001a\u00020-R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006L"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapAudio;", "", "audioDecoder", "Lcom/andrerinas/openheadunit/decoder/AudioDecoder;", "audioManager", "Landroid/media/AudioManager;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "context", "Landroid/content/Context;", "(Lcom/andrerinas/openheadunit/decoder/AudioDecoder;Landroid/media/AudioManager;Lcom/andrerinas/openheadunit/utils/Settings;Landroid/content/Context;)V", "activeAudioChannels", "", "", "assistantVolumeOffset", "attachHwDspEqualizer", "", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "audioLatencyMultiplier", "audioQueueCapacity", "enableAudioSink", "focusAcquiredAtMs", "", "handler", "Landroid/os/Handler;", "holdingPlaybackFocus", "isDucked", "legacyFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "legacyPlaybackFocusListener", "mediaVolumeOffset", "navigationVolumeOffset", "playbackFocusListener", "playbackFocusMode", "Lcom/andrerinas/openheadunit/aap/PlaybackFocusPolicy$Mode;", "playbackFocusRequest", "selfDefeatingLatched", "selfDefeatingStops", "separateAudioStreams", "staticAudioFocus", "unduckRunnable", "Ljava/lang/Runnable;", "useAacAudio", "decode", "", "channel", "start", "buf", "", "len", "duckMedia", "getMediaGain", "", "noteStopWhileHoldingFocus", "onAudioPlaybackStarted", "onAudioPlaybackStopped", "precreateAudioTrack", "process", "message", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "releaseAllFocus", "releasePlaybackFocus", "requestFocusChange", "stream", "focusRequest", "callback", "requestPlaybackFocus", "restartAudio", "shouldHonourProtocolFocusRequest", "isRelease", "startAudioTrack", "stopAudio", "unduckMedia", "updateGains", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapAudio {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.decoder.AudioDecoder audioDecoder = null;
    @org.jetbrains.annotations.NotNull()
    private final android.media.AudioManager audioManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final boolean staticAudioFocus = false;
    private final boolean separateAudioStreams = false;
    private final int mediaVolumeOffset = 0;
    private final int assistantVolumeOffset = 0;
    private final int navigationVolumeOffset = 0;
    private final int audioLatencyMultiplier = 0;
    private final boolean useAacAudio = false;
    private final int audioQueueCapacity = 0;
    private final boolean enableAudioSink = false;
    private final boolean attachHwDspEqualizer = false;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.PlaybackFocusPolicy.Mode playbackFocusMode = null;
    @org.jetbrains.annotations.Nullable()
    private android.media.AudioFocusRequest audioFocusRequest;
    @org.jetbrains.annotations.Nullable()
    private android.media.AudioManager.OnAudioFocusChangeListener legacyFocusListener;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile android.media.AudioFocusRequest playbackFocusRequest;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile android.media.AudioManager.OnAudioFocusChangeListener legacyPlaybackFocusListener;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.Integer> activeAudioChannels = null;
    @org.jetbrains.annotations.NotNull()
    private final android.media.AudioManager.OnAudioFocusChangeListener playbackFocusListener = null;
    @kotlin.jvm.Volatile()
    private volatile boolean holdingPlaybackFocus = false;
    @kotlin.jvm.Volatile()
    private volatile long focusAcquiredAtMs = 0L;
    @kotlin.jvm.Volatile()
    private volatile int selfDefeatingStops = 0;
    @kotlin.jvm.Volatile()
    private volatile boolean selfDefeatingLatched = false;
    @kotlin.jvm.Volatile()
    private volatile boolean isDucked = false;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable unduckRunnable = null;
    private static final int AUDIO_BUFS_SIZE = 262144;
    private static final float DUCK_VOLUME_FACTOR = 0.4F;
    private static final long UNDUCK_DELAY_MS = 1500L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AapAudio.Companion Companion = null;
    
    public AapAudio(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.decoder.AudioDecoder audioDecoder, @org.jetbrains.annotations.NotNull()
    android.media.AudioManager audioManager, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final void duckMedia() {
    }
    
    private final void unduckMedia() {
    }
    
    private final float getMediaGain() {
        return 0.0F;
    }
    
    /**
     * Whether a focus request the phone asked for over the protocol should reach the system.
     *
     * [AapControl] answers every AudioFocusRequestNotification with an always-grant reply, which is
     * what keeps AA routing audio to us; separately it asks the system for the focus the phone
     * wanted, so other apps on the head unit duck. That second half is the same act that makes an
     * A2DP sink AVRCP-pause the phone we project, and it honours GAIN as a *permanent* grab, so it
     * needs the same rule as the playback path.
     *
     * RELEASE is never gated: abandoning focus must always work, or a grab from before the link
     * came up would be stranded for the rest of the session.
     *
     * The latch does not extend here — it is armed in [onAudioPlaybackStopped], which only runs
     * while the playback path holds focus. On a unit whose Bluetooth probe reads nothing, this path
     * has no automatic backstop and needs the mode set to NEVER by hand.
     */
    public final boolean shouldHonourProtocolFocusRequest(boolean isRelease) {
        return false;
    }
    
    public final int requestFocusChange(int stream, int focusRequest, @org.jetbrains.annotations.NotNull()
    android.media.AudioManager.OnAudioFocusChangeListener callback) {
        return 0;
    }
    
    private final void requestPlaybackFocus() {
    }
    
    private final void releasePlaybackFocus() {
    }
    
    public final void releaseAllFocus() {
    }
    
    /**
     * Processes a message as an audio stream packet.
     * Returns true if the packet was identified and processed as audio data, false otherwise.
     */
    public final boolean process(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapMessage message) {
        return false;
    }
    
    private final void startAudioTrack(int channel) {
    }
    
    private final void onAudioPlaybackStarted(int channel) {
    }
    
    /**
     * Releases system audio focus once the last active AA audio channel stops (dynamic mode),
     * letting other local sources (e.g. the car radio) resume.
     */
    private final void onAudioPlaybackStopped(int channel) {
    }
    
    /**
     * Watches for the pathology the Bluetooth probe is meant to pre-empt, for the units where it
     * cannot see the link: the media channel closing again almost as soon as we took focus, because
     * the phone stopped its own playback in response. Two of those in a row and we stop asking for
     * focus, so the session settles instead of cycling every few seconds.
     */
    private final void noteStopWhileHoldingFocus(int channel) {
    }
    
    public final void precreateAudioTrack(int channel) {
    }
    
    private final void decode(int channel, int start, byte[] buf, int len) {
    }
    
    public final void updateGains() {
    }
    
    public final void restartAudio() {
    }
    
    public final void stopAudio(int channel) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapAudio$Companion;", "", "()V", "AUDIO_BUFS_SIZE", "", "DUCK_VOLUME_FACTOR", "", "UNDUCK_DELAY_MS", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}