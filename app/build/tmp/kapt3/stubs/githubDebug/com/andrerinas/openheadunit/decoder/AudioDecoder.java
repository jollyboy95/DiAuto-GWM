package com.andrerinas.openheadunit.decoder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\tJ\u0016\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017Jj\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u0010!\u001a\u00020\u0013J\u0006\u0010\"\u001a\u00020\tJ\u000e\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/AudioDecoder;", "", "()V", "audioTracks", "Landroid/util/SparseArray;", "Lcom/andrerinas/openheadunit/decoder/AudioTrackWrapper;", "mixer", "Lcom/andrerinas/openheadunit/decoder/AudioMixer;", "decode", "", "channel", "", "buffer", "", "offset", "size", "getMixer", "getTrack", "hasMixer", "", "releaseMixer", "setGain", "gain", "", "start", "stream", "sampleRate", "numberOfBits", "numberOfChannels", "isAac", "audioLatencyMultiplier", "audioQueueCapacity", "staticAudioFocus", "attachHwDspEqualizer", "stop", "chan", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AudioDecoder {
    @org.jetbrains.annotations.NotNull()
    private final android.util.SparseArray<com.andrerinas.openheadunit.decoder.AudioTrackWrapper> audioTracks = null;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.decoder.AudioMixer mixer;
    public static final int SAMPLE_RATE_HZ_48 = 48000;
    public static final int SAMPLE_RATE_HZ_16 = 16000;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.AudioDecoder.Companion Companion = null;
    
    public AudioDecoder() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.decoder.AudioTrackWrapper getTrack(int channel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.decoder.AudioMixer getMixer() {
        return null;
    }
    
    public final boolean hasMixer() {
        return false;
    }
    
    public final void decode(int channel, @org.jetbrains.annotations.NotNull()
    byte[] buffer, int offset, int size) {
    }
    
    public final void stop() {
    }
    
    public final void stop(int chan) {
    }
    
    public final void releaseMixer() {
    }
    
    public final void start(int channel, int stream, int sampleRate, int numberOfBits, int numberOfChannels, boolean isAac, float gain, int audioLatencyMultiplier, int audioQueueCapacity, boolean staticAudioFocus, boolean attachHwDspEqualizer) {
    }
    
    public final void setGain(int channel, float gain) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/AudioDecoder$Companion;", "", "()V", "SAMPLE_RATE_HZ_16", "", "SAMPLE_RATE_HZ_48", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}