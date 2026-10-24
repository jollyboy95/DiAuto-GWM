package com.andrerinas.openheadunit.aap;

/**
 * The rules for turning a stream of AAP video messages back into whole access units.
 *
 * Video arrives either complete in one message (flags 11) or split across a run of them: 9 first,
 * 8 in the middle, 10 last. Reassembly is only correct while that run is intact, and the stream
 * gives us three ways for it not to be - a run that stops before its 10, a fragment that arrives
 * with no run open, and a first fragment whose payload does not begin with a start code at either
 * offset the protocol uses. All three end with the codec being handed something that is not a
 * decodable access unit, which is what a smeared or melting picture is.
 *
 * This object holds the ordering rules and nothing else: no buffer, no logging, no clock. That is
 * what makes it testable without a device, and the transition table in its test is the record of
 * what each of the ten reachable (flag, state) pairs is supposed to do. The I/O - the reassembly
 * buffer, the decoder call, the keyframe request and its throttle - stays in [AapVideo].
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0006J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u001c"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler;", "", "()V", "counts", "", "<set-?>", "", "isAssembling", "()Z", "isFrameCorrupt", "countOf", "", "anomaly", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Anomaly;", "hasAnomalies", "onMessage", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Decision;", "flags", "payloadStartsAt10", "payloadStartsAt2", "onOverflow", "reset", "", "resetCounts", "Action", "Anomaly", "Companion", "Decision", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class VideoFragmentAssembler {
    
    /**
     * Whether a run of fragments is open, i.e. a 9 has been seen and its 10 has not.
     */
    private boolean isAssembling = false;
    
    /**
     * Whether the frame being assembled is already known to be unusable.
     *
     * Scoped to the current frame only, deliberately. There is no lockout that holds every
     * subsequent P-frame back until a keyframe is positively identified - one existed, and because
     * nothing could reliably tell a keyframe from a P-frame for every codec the app negotiates, it
     * could latch for the rest of the session and freeze the picture with the connection still
     * healthy.
     */
    private boolean isFrameCorrupt = false;
    @org.jetbrains.annotations.NotNull()
    private final int[] counts = null;
    
    /**
     * A whole frame in one message.
     */
    public static final int FLAG_SINGLE = 11;
    
    /**
     * The first fragment of a frame.
     */
    public static final int FLAG_FIRST = 9;
    
    /**
     * A fragment that is neither the first nor the last.
     */
    public static final int FLAG_MIDDLE = 8;
    
    /**
     * The last fragment of a frame.
     */
    public static final int FLAG_LAST = 10;
    
    /**
     * Payload offset for a timestamp indication: 2 bytes of message type, 8 of timestamp.
     */
    public static final int OFFSET_TIMESTAMP_INDICATION = 10;
    
    /**
     * Payload offset for a media indication or a config message: 2 bytes of message type.
     */
    public static final int OFFSET_MEDIA_INDICATION = 2;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Companion Companion = null;
    
    public VideoFragmentAssembler() {
        super();
    }
    
    /**
     * Whether a run of fragments is open, i.e. a 9 has been seen and its 10 has not.
     */
    public final boolean isAssembling() {
        return false;
    }
    
    /**
     * Whether the frame being assembled is already known to be unusable.
     *
     * Scoped to the current frame only, deliberately. There is no lockout that holds every
     * subsequent P-frame back until a keyframe is positively identified - one existed, and because
     * nothing could reliably tell a keyframe from a P-frame for every codec the app negotiates, it
     * could latch for the rest of the session and freeze the picture with the connection still
     * healthy.
     */
    public final boolean isFrameCorrupt() {
        return false;
    }
    
    /**
     * Applies one video message to the state machine.
     *
     * [payloadStartsAt10] and [payloadStartsAt2] are the two offsets the protocol puts a frame at -
     * 10 for a timestamp indication, 2 for a media indication - and each is true only when a start
     * code is present there *and* there is payload behind it. The caller resolves them because it
     * owns the bytes; which one wins, and what happens when neither does, is decided here.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Decision onMessage(int flags, boolean payloadStartsAt10, boolean payloadStartsAt2) {
        return null;
    }
    
    /**
     * Records that the frame being assembled outgrew the reassembly buffer, and invalidates it.
     *
     * Separate from [onMessage] because it is only discovered once the caller tries to make room.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Anomaly onOverflow() {
        return null;
    }
    
    /**
     * How many times [anomaly] has been seen since the last [resetCounts].
     */
    public final int countOf(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Anomaly anomaly) {
        return 0;
    }
    
    /**
     * Whether anything at all has been counted since the last [resetCounts].
     */
    public final boolean hasAnomalies() {
        return false;
    }
    
    /**
     * Zeroes the counters, leaving the assembly state alone. For periodic reporting.
     */
    public final void resetCounts() {
    }
    
    /**
     * Returns the machine to its start state. For a new session.
     */
    public final void reset() {
    }
    
    /**
     * What [AapVideo] should do with the message just handed to [onMessage].
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action;", "", "()V", "Append", "AppendAndDecode", "BeginAssembly", "DecodeWhole", "Discard", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action$Append;", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action$AppendAndDecode;", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action$BeginAssembly;", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action$DecodeWhole;", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action$Discard;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static abstract class Action {
        
        private Action() {
            super();
        }
        
        /**
         * Append the whole message body to the assembly in progress.
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action$Append;", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Append extends com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action {
            @org.jetbrains.annotations.NotNull()
            public static final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action.Append INSTANCE = null;
            
            private Append() {
            }
        }
        
        /**
         * Append the whole message body, then hand the assembled frame to the decoder.
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action$AppendAndDecode;", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action;", "()V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class AppendAndDecode extends com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action {
            @org.jetbrains.annotations.NotNull()
            public static final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action.AppendAndDecode INSTANCE = null;
            
            private AppendAndDecode() {
            }
        }
        
        /**
         * Start a fresh assembly with the message body from [payloadOffset] onward.
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action$BeginAssembly;", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action;", "payloadOffset", "", "(I)V", "getPayloadOffset", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class BeginAssembly extends com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action {
            private final int payloadOffset = 0;
            
            public BeginAssembly(int payloadOffset) {
            }
            
            public final int getPayloadOffset() {
                return 0;
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action.BeginAssembly copy(int payloadOffset) {
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
        
        /**
         * Hand the message body to the decoder as-is, starting at [payloadOffset].
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action$DecodeWhole;", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action;", "payloadOffset", "", "(I)V", "getPayloadOffset", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class DecodeWhole extends com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action {
            private final int payloadOffset = 0;
            
            public DecodeWhole(int payloadOffset) {
            }
            
            public final int getPayloadOffset() {
                return 0;
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action.DecodeWhole copy(int payloadOffset) {
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
        
        /**
         * Throw this message away.
         *
         * [consumed] mirrors what `AapVideo.process` has always returned for the case, because the
         * caller uses it to decide whether to send a media ack and whether to try the other channel
         * handlers. Getting it wrong changes protocol behaviour, so it is carried explicitly rather
         * than inferred.
         */
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action$Discard;", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action;", "consumed", "", "(Z)V", "getConsumed", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Discard extends com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action {
            private final boolean consumed = false;
            
            public Discard(boolean consumed) {
            }
            
            public final boolean getConsumed() {
                return false;
            }
            
            public final boolean component1() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action.Discard copy(boolean consumed) {
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
    }
    
    /**
     * A way the stream broke. Every one of these means the picture is about to drift, so each is
     * counted and each asks for a keyframe - subject to [VideoRecoveryPolicy]'s throttle, applied
     * by the caller.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Anomaly;", "", "(Ljava/lang/String;I)V", "TRUNCATED_PREVIOUS", "ORPHANED_FRAGMENT", "HEADLESS_FIRST_FRAGMENT", "OVERFLOW", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Anomaly {
        /*public static final*/ TRUNCATED_PREVIOUS /* = new TRUNCATED_PREVIOUS() */,
        /*public static final*/ ORPHANED_FRAGMENT /* = new ORPHANED_FRAGMENT() */,
        /*public static final*/ HEADLESS_FIRST_FRAGMENT /* = new HEADLESS_FIRST_FRAGMENT() */,
        /*public static final*/ OVERFLOW /* = new OVERFLOW() */;
        
        Anomaly() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Anomaly> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Companion;", "", "()V", "FLAG_FIRST", "", "FLAG_LAST", "FLAG_MIDDLE", "FLAG_SINGLE", "OFFSET_MEDIA_INDICATION", "OFFSET_TIMESTAMP_INDICATION", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    /**
     * [Action] plus the anomaly, if any, that the caller should count and log.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Decision;", "", "action", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action;", "anomaly", "Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Anomaly;", "(Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action;Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Anomaly;)V", "getAction", "()Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Action;", "getAnomaly", "()Lcom/andrerinas/openheadunit/aap/VideoFragmentAssembler$Anomaly;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Decision {
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action action = null;
        @org.jetbrains.annotations.Nullable()
        private final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Anomaly anomaly = null;
        
        public Decision(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action action, @org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Anomaly anomaly) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action getAction() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Anomaly getAnomaly() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Anomaly component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Decision copy(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Action action, @org.jetbrains.annotations.Nullable()
        com.andrerinas.openheadunit.aap.VideoFragmentAssembler.Anomaly anomaly) {
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
}