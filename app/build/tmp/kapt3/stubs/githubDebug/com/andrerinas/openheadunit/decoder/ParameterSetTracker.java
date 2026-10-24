package com.andrerinas.openheadunit.decoder;

/**
 * Notices when the stream's parameter sets stop being the ones the codec was configured from.
 *
 * `VideoDecoder` reads VPS/SPS/PPS exactly once, while it is deciding how to configure the codec,
 * and then stops looking: the scan is inside `if (codec == null)` and gated on `!codecConfigured`.
 * Every parameter set after the first is discarded unread. Both reference implementations do the
 * opposite - VLC stores them by id, compares the bytes and bumps a config version on a genuine
 * difference; Moonlight resubmits CSD - and neither could tell you whether it matters here, because
 * no log this project has ever collected carries the answer.
 *
 * So this measures it and nothing else. It does not touch the stored CSD, the configured size or the
 * codec: a mid-session reconfiguration is a behaviour change to make once there is evidence one
 * happens, and this is the evidence.
 *
 * ### Why the change is latched
 *
 * Parameter sets are re-sent with every keyframe, so "the sets arrived again" is the ordinary case
 * and says nothing. Only a difference counts, and a difference counts once: VLC latches its version
 * on read for exactly this reason. Without that, one genuine change would be re-reported on every
 * keyframe for the rest of the session.
 *
 * One slot per kind rather than VLC's by-id table. A stream that alternates parameter-set ids would
 * defeat this, and Android Auto is not known to send one; if a capture ever shows a change reported
 * on every keyframe with the bytes flipping between two values, that is what it means.
 *
 * Pure: no clock, no logging, no Android. Copies what it stores, because the caller's buffer is
 * reused.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/ParameterSetTracker;", "", "()V", "changesReported", "", "pending", "Ljava/util/LinkedHashSet;", "Lcom/andrerinas/openheadunit/decoder/ParameterSetTracker$Kind;", "stored", "", "", "[[B", "offer", "", "kind", "data", "offset", "length", "reset", "", "takeChange", "Lcom/andrerinas/openheadunit/decoder/ParameterSetTracker$Change;", "Change", "Kind", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ParameterSetTracker {
    @org.jetbrains.annotations.NotNull()
    private final byte[][] stored = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.LinkedHashSet<com.andrerinas.openheadunit.decoder.ParameterSetTracker.Kind> pending = null;
    private int changesReported = 0;
    
    public ParameterSetTracker() {
        super();
    }
    
    /**
     * Offers one parameter set.
     *
     * Returns true when it differs from the one held for that kind. The first of each kind is not a
     * change - there was nothing to differ from - which is what keeps a fresh session silent.
     */
    public final boolean offer(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.decoder.ParameterSetTracker.Kind kind, @org.jetbrains.annotations.NotNull()
    byte[] data, int offset, int length) {
        return false;
    }
    
    /**
     * The change since the last call, or null.
     *
     * Reading clears it. That is the whole reason a caller can run this on every access unit that
     * carries parameter sets without a change being reported on every keyframe that follows it.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.decoder.ParameterSetTracker.Change takeChange() {
        return null;
    }
    
    /**
     * Forgets everything. For a new session, not for a codec restart - the stream is unchanged.
     */
    public final void reset() {
    }
    
    /**
     * A genuine difference, reported once.
     *
     * [ordinal] counts changes on this tracker, so a log line can say which one it is rather than
     * leaving a reader to count lines. [kinds] is what actually differed, in VPS/SPS/PPS order.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/ParameterSetTracker$Change;", "", "ordinal", "", "kinds", "", "Lcom/andrerinas/openheadunit/decoder/ParameterSetTracker$Kind;", "(ILjava/util/List;)V", "getKinds", "()Ljava/util/List;", "getOrdinal", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Change {
        private final int ordinal = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.andrerinas.openheadunit.decoder.ParameterSetTracker.Kind> kinds = null;
        
        public Change(int ordinal, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.andrerinas.openheadunit.decoder.ParameterSetTracker.Kind> kinds) {
            super();
        }
        
        public final int getOrdinal() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.andrerinas.openheadunit.decoder.ParameterSetTracker.Kind> getKinds() {
            return null;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.andrerinas.openheadunit.decoder.ParameterSetTracker.Kind> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.decoder.ParameterSetTracker.Change copy(int ordinal, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.andrerinas.openheadunit.decoder.ParameterSetTracker.Kind> kinds) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/ParameterSetTracker$Kind;", "", "(Ljava/lang/String;I)V", "VPS", "SPS", "PPS", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Kind {
        /*public static final*/ VPS /* = new VPS() */,
        /*public static final*/ SPS /* = new SPS() */,
        /*public static final*/ PPS /* = new PPS() */;
        
        Kind() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.decoder.ParameterSetTracker.Kind> getEntries() {
            return null;
        }
    }
}