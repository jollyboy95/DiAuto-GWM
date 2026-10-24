package com.andrerinas.openheadunit.aap;

/**
 * Checks a run of message fragments against the total size the first one declared.
 *
 * Every fragmented AAP message begins with a first fragment carrying a 4-byte total size, which both
 * readers have always read and thrown away - one into a field called `fragmentSizeBuffer`, the other
 * into one called `skipBuffer`. That number is the only cross-check the protocol offers, and without
 * it one corruption mode is completely invisible: a *middle* fragment that never arrives leaves the
 * run looking intact to [VideoFragmentAssembler] - a first, some middles, a last, in order - so the
 * frame is assembled with a hole in it and handed to the decoder as though it were whole. There is
 * no log, no keyframe request, and nothing to see afterwards except a smeared picture.
 *
 * What the declared total is counted in is not documented anywhere we can check, and it need not be:
 * this class learns the convention from the stream.
 *
 * ### The convention is per fragment, not per run
 *
 * The difference between the declared total and the sum of the fragment lengths scales with the
 * number of fragments, because each fragment carries its own framing and encryption overhead in the
 * `encLen` this class is given. Hardware measured it at a flat **29 bytes per fragment**:
 *
 * ```
 * fragments=2 -> delta=-58    fragments=5 -> delta=-145
 * fragments=3 -> delta=-87    fragments=7 -> delta=-203
 * fragments=4 -> delta=-116   fragments=8 -> delta=-232
 * ```
 *
 * — exact in all 20+ observations of a hardware round, across two codecs, two sessions and two
 * channels (VIDEO and MUSIC_PLAYBACK carried the same 29). An earlier version of this class learned
 * the *whole-run* difference instead and compared every later run against it, so every message whose
 * fragment count differed from the establishing message's tripped the warning: 10 false
 * `DELTA_CHANGED` lines in the first 200ms of every session on that rig, which then exhausted the
 * report budget and left the check silent for the rest of it. The one instrument that can see a
 * missing middle fragment was therefore muted during exactly the windows an artifact was visible.
 *
 * So the expectation is scaled to each run's own fragment count. The comparison is done by
 * cross-multiplication rather than division, so it stays exact whatever the convention turns out to
 * be - including one that does not divide evenly, which the measured 29 does but a future stream
 * might not.
 *
 * A missing fragment moves the difference by that fragment's own length, which no amount of scaling
 * explains away, and that is the deviation worth a line in a log.
 *
 * Per-channel, because video, audio and control messages interleave on one connection and a run on
 * one channel says nothing about a run on another.
 *
 * Pure: no clock, no logging, no allocation on the healthy path. How often a report may be *printed*
 * is [AuditReportPolicy]'s decision, not this class's.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001a\u001b\u001cB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002\u00a2\u0006\u0002\u0010\u0010J(\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002\u00a2\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/andrerinas/openheadunit/aap/FragmentedMessageAudit;", "", "channelCount", "", "(I)V", "declared", "", "establishedDelta", "establishedFragments", "fragments", "observed", "open", "", "expectedFor", "channel", "runFragments", "(II)Ljava/lang/Integer;", "onMessage", "Lcom/andrerinas/openheadunit/aap/FragmentedMessageAudit$Result;", "flags", "encLen", "declaredTotal", "perFragmentFor", "(I)Ljava/lang/Integer;", "reset", "", "Companion", "Outcome", "Result", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class FragmentedMessageAudit {
    @org.jetbrains.annotations.NotNull()
    private final boolean[] open = null;
    @org.jetbrains.annotations.NotNull()
    private final int[] declared = null;
    @org.jetbrains.annotations.NotNull()
    private final int[] observed = null;
    @org.jetbrains.annotations.NotNull()
    private final int[] fragments = null;
    
    /**
     * The establishing run's difference and fragment count, per channel.
     *
     * Kept as the pair rather than as a ratio so the comparison can cross-multiply and stay exact.
     * A completed fragmented run always has at least two fragments, so a zero here means "this
     * channel has not settled yet" and cannot collide with a real observation.
     */
    @org.jetbrains.annotations.NotNull()
    private final int[] establishedDelta = null;
    @org.jetbrains.annotations.NotNull()
    private final int[] establishedFragments = null;
    
    /**
     * Channel ids run 0..13 (see `protocol/Channel`); a little headroom costs nothing.
     */
    public static final int DEFAULT_CHANNEL_COUNT = 16;
    
    /**
     * Header flags bit marking the first fragment of a message.
     */
    public static final int FLAG_BIT_FIRST = 1;
    
    /**
     * Header flags bit marking the last fragment of a message.
     */
    public static final int FLAG_BIT_LAST = 2;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.FragmentedMessageAudit.Companion Companion = null;
    
    public FragmentedMessageAudit(int channelCount) {
        super();
    }
    
    /**
     * Applies one message.
     *
     * [flags] is the raw header flags byte: bit 0 marks a first fragment, bit 1 a last one, so an
     * unfragmented message has both and a middle fragment has neither. [encLen] is the message's own
     * encrypted body length, and [declaredTotal] is the 4-byte total that accompanies a first
     * fragment - ignored for every other kind.
     *
     * Returns null when there is nothing to report, which is the overwhelming majority of calls.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.aap.FragmentedMessageAudit.Result onMessage(int channel, int flags, int encLen, int declaredTotal) {
        return null;
    }
    
    /**
     * What a run of [runFragments] fragments should have shown on this channel, or null if the
     * channel has not settled.
     *
     * Truncating division, and for display only - every decision is made by the exact
     * cross-multiplication above.
     */
    private final java.lang.Integer expectedFor(int channel, int runFragments) {
        return null;
    }
    
    /**
     * The learned per-fragment constant, or null when the establishing run did not divide evenly.
     */
    private final java.lang.Integer perFragmentFor(int channel) {
        return null;
    }
    
    /**
     * Forgets every channel's run and learned convention. For a new session.
     */
    public final void reset() {
    }
    
    public FragmentedMessageAudit() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/aap/FragmentedMessageAudit$Companion;", "", "()V", "DEFAULT_CHANNEL_COUNT", "", "FLAG_BIT_FIRST", "FLAG_BIT_LAST", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    /**
     * Why a run is worth reporting. Runs that match the established convention are not reported.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/aap/FragmentedMessageAudit$Outcome;", "", "(Ljava/lang/String;I)V", "FIRST_OBSERVATION", "DELTA_CHANGED", "ORPHANED_FRAGMENT", "TRUNCATED_RUN", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Outcome {
        /*public static final*/ FIRST_OBSERVATION /* = new FIRST_OBSERVATION() */,
        /*public static final*/ DELTA_CHANGED /* = new DELTA_CHANGED() */,
        /*public static final*/ ORPHANED_FRAGMENT /* = new ORPHANED_FRAGMENT() */,
        /*public static final*/ TRUNCATED_RUN /* = new TRUNCATED_RUN() */;
        
        Outcome() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.FragmentedMessageAudit.Outcome> getEntries() {
            return null;
        }
    }
    
    /**
     * A run worth reporting.
     *
     * [delta] is `declaredTotal - observedTotal`. [expectedDelta] is what a run of *this* fragment
     * count should have shown, scaled from the establishing run, or null if the channel has not
     * settled yet or there is nothing to expect. [perFragmentDelta] is the learned constant behind
     * that expectation, present only when the establishing run divided evenly - it is the number a
     * human can sanity-check at a glance, and the reason it may be absent is that nothing here
     * requires the convention to divide.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012Jb\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\b\u0010\'\u001a\u00020(H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0012\u00a8\u0006)"}, d2 = {"Lcom/andrerinas/openheadunit/aap/FragmentedMessageAudit$Result;", "", "channel", "", "outcome", "Lcom/andrerinas/openheadunit/aap/FragmentedMessageAudit$Outcome;", "declaredTotal", "observedTotal", "fragments", "delta", "expectedDelta", "perFragmentDelta", "(ILcom/andrerinas/openheadunit/aap/FragmentedMessageAudit$Outcome;IIIILjava/lang/Integer;Ljava/lang/Integer;)V", "getChannel", "()I", "getDeclaredTotal", "getDelta", "getExpectedDelta", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFragments", "getObservedTotal", "getOutcome", "()Lcom/andrerinas/openheadunit/aap/FragmentedMessageAudit$Outcome;", "getPerFragmentDelta", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILcom/andrerinas/openheadunit/aap/FragmentedMessageAudit$Outcome;IIIILjava/lang/Integer;Ljava/lang/Integer;)Lcom/andrerinas/openheadunit/aap/FragmentedMessageAudit$Result;", "equals", "", "other", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Result {
        private final int channel = 0;
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.aap.FragmentedMessageAudit.Outcome outcome = null;
        private final int declaredTotal = 0;
        private final int observedTotal = 0;
        private final int fragments = 0;
        private final int delta = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer expectedDelta = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer perFragmentDelta = null;
        
        public Result(int channel, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.FragmentedMessageAudit.Outcome outcome, int declaredTotal, int observedTotal, int fragments, int delta, @org.jetbrains.annotations.Nullable()
        java.lang.Integer expectedDelta, @org.jetbrains.annotations.Nullable()
        java.lang.Integer perFragmentDelta) {
            super();
        }
        
        public final int getChannel() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.FragmentedMessageAudit.Outcome getOutcome() {
            return null;
        }
        
        public final int getDeclaredTotal() {
            return 0;
        }
        
        public final int getObservedTotal() {
            return 0;
        }
        
        public final int getFragments() {
            return 0;
        }
        
        public final int getDelta() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getExpectedDelta() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPerFragmentDelta() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.FragmentedMessageAudit.Outcome component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final int component6() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.FragmentedMessageAudit.Result copy(int channel, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.FragmentedMessageAudit.Outcome outcome, int declaredTotal, int observedTotal, int fragments, int delta, @org.jetbrains.annotations.Nullable()
        java.lang.Integer expectedDelta, @org.jetbrains.annotations.Nullable()
        java.lang.Integer perFragmentDelta) {
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
    }
}