package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapControlMedia;", "Lcom/andrerinas/openheadunit/aap/AapControl;", "aapTransport", "Lcom/andrerinas/openheadunit/aap/AapTransport;", "micRecorder", "Lcom/andrerinas/openheadunit/decoder/MicRecorder;", "aapAudio", "Lcom/andrerinas/openheadunit/aap/AapAudio;", "(Lcom/andrerinas/openheadunit/aap/AapTransport;Lcom/andrerinas/openheadunit/decoder/MicRecorder;Lcom/andrerinas/openheadunit/aap/AapAudio;)V", "lastNativeFocusRequestTime", "", "nativeFocusRequestCount", "", "execute", "message", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "maxUnackedFor", "channel", "mediaSinkSetupRequest", "request", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Media$MediaSetupRequest;", "mediaSinkStopRequest", "mediaStartRequest", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Media$Start;", "micRequest", "Lcom/andrerinas/openheadunit/aap/protocol/proto/Media$MicrophoneRequest;", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapControlMedia implements com.andrerinas.openheadunit.aap.AapControl {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapTransport aapTransport = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.decoder.MicRecorder micRecorder = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapAudio aapAudio = null;
    private long lastNativeFocusRequestTime = 0L;
    private int nativeFocusRequestCount = 0;
    
    /**
     * Time window for counting consecutive VIDEO_FOCUS_NATIVE requests.
     */
    private static final long NATIVE_FOCUS_DEBOUNCE_MS = 5000L;
    
    /**
     * Number of NATIVE focus requests within the debounce window before stopping.
     */
    private static final int MAX_NATIVE_FOCUS_RETRIES = 3;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AapControlMedia.Companion Companion = null;
    
    public AapControlMedia(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapTransport aapTransport, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.decoder.MicRecorder micRecorder, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapAudio aapAudio) {
        super();
    }
    
    @java.lang.Override()
    public int execute(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapMessage message) {
        return 0;
    }
    
    private final int mediaStartRequest(com.andrerinas.openheadunit.aap.protocol.proto.Media.Start request, int channel) {
        return 0;
    }
    
    private final int mediaSinkSetupRequest(com.andrerinas.openheadunit.aap.protocol.proto.Media.MediaSetupRequest request, int channel) {
        return 0;
    }
    
    private final int maxUnackedFor(int channel) {
        return 0;
    }
    
    private final int mediaSinkStopRequest(int channel) {
        return 0;
    }
    
    private final int micRequest(com.andrerinas.openheadunit.aap.protocol.proto.Media.MicrophoneRequest micRequest) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapControlMedia$Companion;", "", "()V", "MAX_NATIVE_FOCUS_RETRIES", "", "NATIVE_FOCUS_DEBOUNCE_MS", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}