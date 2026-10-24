package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapMessageHandlerType;", "Lcom/andrerinas/openheadunit/aap/AapMessageHandler;", "transport", "Lcom/andrerinas/openheadunit/aap/AapTransport;", "recorder", "Lcom/andrerinas/openheadunit/decoder/MicRecorder;", "aapAudio", "Lcom/andrerinas/openheadunit/aap/AapAudio;", "aapVideo", "Lcom/andrerinas/openheadunit/aap/AapVideo;", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "context", "Landroid/content/Context;", "onAaMediaMetadata", "Lkotlin/Function1;", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaMetaData;", "", "onAaPlaybackStatus", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaPlaybackStatus;", "(Lcom/andrerinas/openheadunit/aap/AapTransport;Lcom/andrerinas/openheadunit/decoder/MicRecorder;Lcom/andrerinas/openheadunit/aap/AapAudio;Lcom/andrerinas/openheadunit/aap/AapVideo;Lcom/andrerinas/openheadunit/utils/Settings;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "aapControl", "Lcom/andrerinas/openheadunit/aap/AapControl;", "aapNavigation", "Lcom/andrerinas/openheadunit/aap/AapNavigation;", "mediaPlayback", "Lcom/andrerinas/openheadunit/aap/AapMediaPlayback;", "handle", "message", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapMessageHandlerType implements com.andrerinas.openheadunit.aap.AapMessageHandler {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapTransport transport = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapAudio aapAudio = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapVideo aapVideo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapControl aapControl = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapMediaPlayback mediaPlayback = null;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.AapNavigation aapNavigation = null;
    
    public AapMessageHandlerType(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapTransport transport, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.decoder.MicRecorder recorder, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapAudio aapAudio, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapVideo aapVideo, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData, kotlin.Unit> onAaMediaMetadata, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaPlaybackStatus, kotlin.Unit> onAaPlaybackStatus) {
        super();
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {com.andrerinas.openheadunit.aap.AapMessageHandler.HandleException.class})
    public void handle(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapMessage message) throws com.andrerinas.openheadunit.aap.AapMessageHandler.HandleException {
    }
}