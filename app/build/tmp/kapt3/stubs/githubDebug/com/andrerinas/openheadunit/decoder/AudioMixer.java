package com.andrerinas.openheadunit.decoder;

/**
 * AudioMixer — Single-AudioTrack mixer for Static Audio Focus mode.
 *
 * When enabled, ALL audio channels (AUDIO/media, AUDIO1/assistant, AUDIO2/navigation)
 * are mixed in software and written to a single AudioTrack (48kHz, 16-bit, stereo).
 *
 * This prevents Chinese head unit firmware from reacting to the creation/destruction
 * of multiple AudioTrack instances, which causes volume routing bugs.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\b\u0018\u0000 72\u00020\u0001:\u0003678B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003J\u000e\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0003J\u0010\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010\'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0003H\u0002J\u000e\u0010(\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0003J\u0006\u0010)\u001a\u00020\u0005J\b\u0010*\u001a\u00020\u001eH\u0002J\u001e\u0010+\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003J\u0016\u0010.\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u000fJ\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0003H\u0002J\u0006\u00103\u001a\u00020\u001eJ\u0006\u00104\u001a\u00020\u001eJ\u000e\u00105\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/AudioMixer;", "", "stream", "", "attachHwDspEqualizer", "", "(IZ)V", "audioTrack", "Landroid/media/AudioTrack;", "channelBuffers", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/andrerinas/openheadunit/decoder/AudioMixer$ShortCircularBuffer;", "channelConfigs", "Lcom/andrerinas/openheadunit/decoder/AudioMixer$ChannelConfig;", "channelGains", "", "channelPreRolling", "feedInputBuffer", "Ljava/lang/ThreadLocal;", "", "feedOutputBuffer", "mixBuffer", "", "mixThread", "Ljava/lang/Thread;", "outputBuffer", "running", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tempChannelBuffer", "feed", "", "channel", "data", "", "offset", "length", "getChannelGain", "getFeedInputBuffer", "minSize", "getFeedOutputBuffer", "hasChannel", "isRunning", "mixLoop", "registerChannel", "sampleRate", "channelCount", "setChannelGain", "gain", "softClip", "", "s", "start", "stop", "unregisterChannel", "ChannelConfig", "Companion", "ShortCircularBuffer", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AudioMixer {
    private final int stream = 0;
    private final boolean attachHwDspEqualizer = false;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "AudioMixer";
    public static final int OUTPUT_SAMPLE_RATE = 48000;
    public static final int OUTPUT_CHANNELS = 2;
    public static final int OUTPUT_BIT_DEPTH = 16;
    private static final long MIX_INTERVAL_MS = 20L;
    private static final int SAMPLES_PER_CYCLE = 960;
    private static final int FRAMES_PER_CYCLE = 1920;
    private static final int BUFFER_MULTIPLIER = 8;
    @org.jetbrains.annotations.Nullable()
    private android.media.AudioTrack audioTrack;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.andrerinas.openheadunit.decoder.AudioMixer.ChannelConfig> channelConfigs = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.andrerinas.openheadunit.decoder.AudioMixer.ShortCircularBuffer> channelBuffers = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Boolean> channelPreRolling = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Float> channelGains = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Thread mixThread;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.atomic.AtomicBoolean running = null;
    @org.jetbrains.annotations.NotNull()
    private final int[] mixBuffer = null;
    @org.jetbrains.annotations.NotNull()
    private final short[] tempChannelBuffer = null;
    @org.jetbrains.annotations.NotNull()
    private final short[] outputBuffer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.ThreadLocal<short[]> feedInputBuffer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.ThreadLocal<short[]> feedOutputBuffer = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.AudioMixer.Companion Companion = null;
    
    public AudioMixer(int stream, boolean attachHwDspEqualizer) {
        super();
    }
    
    private final short[] getFeedInputBuffer(int minSize) {
        return null;
    }
    
    private final short[] getFeedOutputBuffer(int minSize) {
        return null;
    }
    
    /**
     * Start the mixer — creates the AudioTrack and starts the mixing thread.
     */
    public final void start() {
    }
    
    /**
     * Stop the mixer — stops the mixing thread and releases the AudioTrack.
     */
    public final void stop() {
    }
    
    /**
     * Register a channel with its audio parameters.
     */
    public final void registerChannel(int channel, int sampleRate, int channelCount) {
    }
    
    /**
     * Unregister a channel (e.g. on session end).
     */
    public final void unregisterChannel(int channel) {
    }
    
    /**
     * Feed raw PCM data for a channel. Called from the wrapper/decoder thread.
     * Data format: 16-bit signed little-endian PCM.
     * Resamples to 48kHz stereo directly on the caller thread to offload calculations.
     */
    public final void feed(int channel, @org.jetbrains.annotations.NotNull()
    byte[] data, int offset, int length) {
    }
    
    /**
     * Set per-channel gain (for ducking).
     * @param gain 0.0 = silence, 1.0 = full volume
     */
    public final void setChannelGain(int channel, float gain) {
    }
    
    /**
     * Get current gain for a channel.
     */
    public final float getChannelGain(int channel) {
        return 0.0F;
    }
    
    /**
     * Check if the mixer is currently running.
     */
    public final boolean isRunning() {
        return false;
    }
    
    /**
     * Check if a channel is registered.
     */
    public final boolean hasChannel(int channel) {
        return false;
    }
    
    /**
     * Soft-clipping function to prevent digital distortion (hard clipping) when 
     * multiple channels are mixed together. Compresses signals exceeding ~ -4dB (20480).
     */
    private final short softClip(int s) {
        return 0;
    }
    
    /**
     * Main mixing loop — runs on the dedicated thread.
     * Every MIX_INTERVAL_MS, drains all channel circular buffers,
     * mixes into a single buffer, and writes to the AudioTrack.
     */
    private final void mixLoop() {
    }
    
    public AudioMixer() {
        super();
    }
    
    /**
     * Per-channel configuration and state.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/AudioMixer$ChannelConfig;", "", "sampleRate", "", "channelCount", "(II)V", "getChannelCount", "()I", "getSampleRate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class ChannelConfig {
        private final int sampleRate = 0;
        private final int channelCount = 0;
        
        public ChannelConfig(int sampleRate, int channelCount) {
            super();
        }
        
        public final int getSampleRate() {
            return 0;
        }
        
        public final int getChannelCount() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.decoder.AudioMixer.ChannelConfig copy(int sampleRate, int channelCount) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/AudioMixer$Companion;", "", "()V", "BUFFER_MULTIPLIER", "", "FRAMES_PER_CYCLE", "MIX_INTERVAL_MS", "", "OUTPUT_BIT_DEPTH", "OUTPUT_CHANNELS", "OUTPUT_SAMPLE_RATE", "SAMPLES_PER_CYCLE", "TAG", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    /**
     * Thread-safe, garbage-free circular buffer for Short audio samples.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0003J\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/AudioMixer$ShortCircularBuffer;", "", "capacity", "", "(I)V", "buffer", "", "head", "size", "tail", "clear", "", "read", "out", "offset", "length", "write", "data", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class ShortCircularBuffer {
        @org.jetbrains.annotations.NotNull()
        private final short[] buffer = null;
        private int head = 0;
        private int tail = 0;
        private int size = 0;
        
        public ShortCircularBuffer(int capacity) {
            super();
        }
        
        @kotlin.jvm.Synchronized()
        public final synchronized int write(@org.jetbrains.annotations.NotNull()
        short[] data, int length) {
            return 0;
        }
        
        @kotlin.jvm.Synchronized()
        public final synchronized int read(@org.jetbrains.annotations.NotNull()
        short[] out, int offset, int length) {
            return 0;
        }
        
        @kotlin.jvm.Synchronized()
        public final synchronized int size() {
            return 0;
        }
        
        @kotlin.jvm.Synchronized()
        public final synchronized void clear() {
        }
    }
}