package com.andrerinas.openheadunit.decoder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 12\u00020\u0001:\u000212B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0003H\u0002J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u0003H\u0002J\u0006\u0010-\u001a\u00020\u0003J\u0010\u0010.\u001a\u00020$2\u0006\u0010)\u001a\u00020\u0003H\u0002J\b\u0010/\u001a\u00020$H\u0002J\u0006\u00100\u001a\u00020$R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/MicRecorder;", "", "micSampleRate", "", "context", "Landroid/content/Context;", "(ILandroid/content/Context;)V", "aec", "Landroid/media/audiofx/AcousticEchoCanceler;", "agc", "Landroid/media/audiofx/AutomaticGainControl;", "audioRecord", "Landroid/media/AudioRecord;", "bluetoothScoStarted", "", "isAvailable", "()Z", "listener", "Lcom/andrerinas/openheadunit/decoder/MicRecorder$Listener;", "getListener", "()Lcom/andrerinas/openheadunit/decoder/MicRecorder$Listener;", "setListener", "(Lcom/andrerinas/openheadunit/decoder/MicRecorder$Listener;)V", "micAudioBuf", "", "micBufferSize", "ns", "Landroid/media/audiofx/NoiseSuppressor;", "scoReceiver", "Landroid/content/BroadcastReceiver;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "threadMicAudio", "Ljava/lang/Thread;", "threadMicAudioActive", "cleanupSco", "", "getAudioSource", "index", "getAudioSourceName", "", "source", "micAudioRead", "aud_buf", "max_len", "start", "startRecording", "startScoAndRecord", "stop", "Companion", "Listener", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class MicRecorder {
    private final int micSampleRate = 0;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private android.media.AudioRecord audioRecord;
    @org.jetbrains.annotations.Nullable()
    private android.media.audiofx.AcousticEchoCanceler aec;
    @org.jetbrains.annotations.Nullable()
    private android.media.audiofx.NoiseSuppressor ns;
    @org.jetbrains.annotations.Nullable()
    private android.media.audiofx.AutomaticGainControl agc;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.utils.Settings settings = null;
    private final int micBufferSize = 0;
    @org.jetbrains.annotations.NotNull()
    private byte[] micAudioBuf;
    private final boolean isAvailable = false;
    private boolean threadMicAudioActive = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Thread threadMicAudio;
    @org.jetbrains.annotations.Nullable()
    private com.andrerinas.openheadunit.decoder.MicRecorder.Listener listener;
    private boolean bluetoothScoStarted = false;
    @org.jetbrains.annotations.Nullable()
    private android.content.BroadcastReceiver scoReceiver;
    public static final int SOURCE_BLUETOOTH_SCO = 100;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.decoder.MicRecorder.Companion Companion = null;
    
    public MicRecorder(int micSampleRate, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final boolean isAvailable() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.decoder.MicRecorder.Listener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.andrerinas.openheadunit.decoder.MicRecorder.Listener p0) {
    }
    
    public final void stop() {
    }
    
    private final void cleanupSco() {
    }
    
    private final int micAudioRead(byte[] aud_buf, int max_len) {
        return 0;
    }
    
    private final int getAudioSource(int index) {
        return 0;
    }
    
    public final int start() {
        return 0;
    }
    
    private final void startScoAndRecord() {
    }
    
    private final void startRecording(int source) {
    }
    
    private final java.lang.String getAudioSourceName(int source) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/MicRecorder$Companion;", "", "()V", "SOURCE_BLUETOOTH_SCO", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/MicRecorder$Listener;", "", "onMicDataAvailable", "", "mic_buf", "", "mic_audio_len", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static abstract interface Listener {
        
        public abstract void onMicDataAvailable(@org.jetbrains.annotations.NotNull()
        byte[] mic_buf, int mic_audio_len);
    }
}