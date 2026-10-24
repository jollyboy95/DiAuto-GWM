package com.andrerinas.openheadunit.decoder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\u0018\u0000 F2\u00020\u0001:\u0002EFBk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0003H\u0002J\u0010\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\u0003H\u0002J\b\u00100\u001a\u00020+H\u0002J0\u00101\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u0003H\u0002J\u0018\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0003H\u0002J\b\u00105\u001a\u00020+H\u0002J\u0010\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0003H\u0002J\u0018\u00108\u001a\u00020+2\u0006\u00107\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0003H\u0002J\u0018\u0010:\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010;\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0003H\u0002J\u0018\u0010<\u001a\u00020+2\u0006\u00104\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0003H\u0002J\u0010\u0010=\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0014H\u0002J\b\u0010>\u001a\u00020+H\u0016J\u000e\u0010?\u001a\u00020+2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010@\u001a\u00020+2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010A\u001a\u00020+J\u001e\u0010B\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00142\u0006\u0010C\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003J\u0010\u0010D\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0014H\u0002J\u0018\u0010D\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0003H\u0002R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n \'*\u0004\u0018\u00010&0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/AudioTrackWrapper;", "Ljava/lang/Thread;", "stream", "", "sampleRateInHz", "bitDepth", "channelCount", "isAac", "", "gain", "", "audioLatencyMultiplier", "audioQueueCapacity", "mixer", "Lcom/andrerinas/openheadunit/decoder/AudioMixer;", "channelId", "attachHwDspEqualizer", "(IIIIZFIILcom/andrerinas/openheadunit/decoder/AudioMixer;IZ)V", "audioBufferPool", "Ljava/util/concurrent/LinkedBlockingQueue;", "", "audioTrack", "Landroid/media/AudioTrack;", "bytesPerFrame", "codecHandlerThread", "Landroid/os/HandlerThread;", "currentGain", "dataQueue", "Lcom/andrerinas/openheadunit/decoder/AudioTrackWrapper$AudioChunk;", "decoder", "Landroid/media/MediaCodec;", "equalizer", "Landroid/media/audiofx/Equalizer;", "framesWritten", "", "freeInputBuffers", "isRunning", "writeExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "writeSemaphore", "Ljava/util/concurrent/Semaphore;", "applyGain", "", "buffer", "size", "attachHwDspEqualizerQuietly", "sessionId", "cleanup", "createAudioTrack", "multiplier", "decodeSync", "inputData", "drainQueuedAudio", "getFrequencyIndex", "sampleRate", "initDecoder", "channels", "makeAacCsd", "obtainAudioBuffer", "queueInput", "recycleAudioBuffer", "run", "setGain", "setVolume", "stopPlayback", "write", "offset", "writeToTrack", "AudioChunk", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AudioTrackWrapper extends java.lang.Thread {
    private final boolean isAac = false;
    private final int audioLatencyMultiplier = 0;
    private final int audioQueueCapacity = 0;
    @org.jetbrains.annotations.Nullable()
    private final com.andrerinas.openheadunit.decoder.AudioMixer mixer = null;
    private final int channelId = 0;
    private final boolean attachHwDspEqualizer = false;
    private static final int AUDIO_BUFFER_POOL_LIMIT = 16;
    private static final int MIN_POOLED_AUDIO_BUFFER_SIZE = 4096;
    @org.jetbrains.annotations.Nullable()
    private final android.media.AudioTrack audioTrack = null;
    @org.jetbrains.annotations.Nullable()
    private android.media.MediaCodec decoder;
    @org.jetbrains.annotations.Nullable()
    private android.os.HandlerThread codecHandlerThread;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.LinkedBlockingQueue<java.lang.Integer> freeInputBuffers = null;
    private final java.util.concurrent.ExecutorService writeExecutor = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.Semaphore writeSemaphore = null;
    @org.jetbrains.annotations.Nullable()
    private android.media.audiofx.Equalizer equalizer;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.LinkedBlockingQueue<com.andrerinas.openheadunit.decoder.AudioTrackWrapper.AudioChunk> dataQueue = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.LinkedBlockingQueue<byte[]> audioBufferPool = null;
    @kotlin.jvm.Volatile()
    private volatile boolean isRunning = true;
    @kotlin.jvm.Volatile()
    private volatile float currentGain;
    private long framesWritten = 0L;
    private final int bytesPerFrame = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.AudioTrackWrapper.Companion Companion = null;
    
    public AudioTrackWrapper(int stream, int sampleRateInHz, int bitDepth, int channelCount, boolean isAac, float gain, int audioLatencyMultiplier, int audioQueueCapacity, @org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.decoder.AudioMixer mixer, int channelId, boolean attachHwDspEqualizer) {
        super();
    }
    
    public final void setVolume(float gain) {
    }
    
    private final void applyGain(byte[] buffer, int size) {
    }
    
    private final void initDecoder(int sampleRate, int channels) {
    }
    
    private final void writeToTrack(byte[] buffer) {
    }
    
    private final void writeToTrack(byte[] buffer, int size) {
    }
    
    @java.lang.Override()
    public void run() {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final void decodeSync(byte[] inputData, int size) {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.InterruptedException.class})
    private final void queueInput(byte[] inputData, int size) throws java.lang.InterruptedException {
    }
    
    private final byte[] makeAacCsd(int sampleRate, int channelCount) {
        return null;
    }
    
    private final int getFrequencyIndex(int sampleRate) {
        return 0;
    }
    
    private final android.media.AudioTrack createAudioTrack(int stream, int sampleRateInHz, int bitDepth, int channelCount, int multiplier) {
        return null;
    }
    
    private final void attachHwDspEqualizerQuietly(int sessionId) {
    }
    
    public final void write(@org.jetbrains.annotations.NotNull()
    byte[] buffer, int offset, int size) {
    }
    
    public final void setGain(float gain) {
    }
    
    public final void stopPlayback() {
    }
    
    private final void cleanup() {
    }
    
    private final byte[] obtainAudioBuffer(int size) {
        return null;
    }
    
    private final void recycleAudioBuffer(byte[] buffer) {
    }
    
    private final void drainQueuedAudio() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/AudioTrackWrapper$AudioChunk;", "", "data", "", "size", "", "([BI)V", "getData", "()[B", "getSize", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class AudioChunk {
        @org.jetbrains.annotations.NotNull()
        private final byte[] data = null;
        private final int size = 0;
        
        public AudioChunk(@org.jetbrains.annotations.NotNull()
        byte[] data, int size) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] getData() {
            return null;
        }
        
        public final int getSize() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.decoder.AudioTrackWrapper.AudioChunk copy(@org.jetbrains.annotations.NotNull()
        byte[] data, int size) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/AudioTrackWrapper$Companion;", "", "()V", "AUDIO_BUFFER_POOL_LIMIT", "", "MIN_POOLED_AUDIO_BUFFER_SIZE", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}