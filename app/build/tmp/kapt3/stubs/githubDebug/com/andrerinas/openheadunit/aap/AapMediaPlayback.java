package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B1\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapMediaPlayback;", "", "onAaMediaMetadata", "Lkotlin/Function1;", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaMetaData;", "", "onAaPlaybackStatus", "Lcom/andrerinas/openheadunit/aap/protocol/proto/MediaPlayback$MediaPlaybackStatus;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "messageBuffer", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "started", "", "notifyRequest", "request", "process", "message", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "processMetadataPacket", "flags", "", "processStatusPacket", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapMediaPlayback {
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function1<com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData, kotlin.Unit> onAaMediaMetadata = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function1<com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaPlaybackStatus, kotlin.Unit> onAaPlaybackStatus = null;
    private final java.nio.ByteBuffer messageBuffer = null;
    private boolean started = false;
    @java.lang.Deprecated()
    public static final int MSG_MEDIA_PLAYBACK_STATUS = 32769;
    @java.lang.Deprecated()
    public static final int MSG_MEDIA_PLAYBACK_INPUT = 32770;
    @java.lang.Deprecated()
    public static final int MSG_MEDIA_PLAYBACK_METADATA = 32771;
    @java.lang.Deprecated()
    public static final int FLAG_FIRST_FRAGMENT = 9;
    @java.lang.Deprecated()
    public static final int FLAG_MIDDLE_FRAGMENT = 8;
    @java.lang.Deprecated()
    public static final int FLAG_LAST_FRAGMENT = 10;
    @org.jetbrains.annotations.NotNull()
    private static final com.andrerinas.openheadunit.aap.AapMediaPlayback.Companion Companion = null;
    
    public AapMediaPlayback(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData, kotlin.Unit> onAaMediaMetadata, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaPlaybackStatus, kotlin.Unit> onAaPlaybackStatus) {
        super();
    }
    
    public final void process(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapMessage message) {
    }
    
    private final void processStatusPacket(com.andrerinas.openheadunit.aap.AapMessage message) {
    }
    
    private final void processMetadataPacket(com.andrerinas.openheadunit.aap.AapMessage message, int flags) {
    }
    
    private final void notifyRequest(com.andrerinas.openheadunit.aap.protocol.proto.MediaPlayback.MediaMetaData request) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapMediaPlayback$Companion;", "", "()V", "FLAG_FIRST_FRAGMENT", "", "FLAG_LAST_FRAGMENT", "FLAG_MIDDLE_FRAGMENT", "MSG_MEDIA_PLAYBACK_INPUT", "MSG_MEDIA_PLAYBACK_METADATA", "MSG_MEDIA_PLAYBACK_STATUS", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}