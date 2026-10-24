package com.andrerinas.openheadunit.aap;

/**
 * How long the inbound AAP link goes completely silent, and how often.
 *
 * Two reporters on Android 8.1 head units describe the same thing in the same words - the music
 * cuts in and out - and on both the fault is neither the audio path nor the decoder. The whole
 * link stops, on every channel at once, on a fixed cadence, and then resumes. One capture measured
 * 1.59 s of silence every 11.57 s; another, on different hardware, 5-6 s every 10-11 s with the
 * picture and the sound dying together.
 *
 * Neither was readable from what the app prints. The only instrument that could see it was an
 * offline script over `RECV:` lines, which exist solely at VERBOSE - so recognising the first case
 * took a 151,366-line export, and the second could not be diagnosed at all, because the reporter
 * had been asked for INFO. A fault this distinctive should not need a special capture to notice.
 *
 * So the same measurement runs in the app, at INFO, reporting the fields the script reports so a
 * log line and a rig run can be compared directly.
 *
 * **Diagnostic only - nothing reads the report.** The [GAP_THRESHOLD_MS] below rests on one
 * observed phone behaviour rather than on anything in the protocol, which is reason enough not to
 * hang recovery off it. The line says what was measured and leaves the conclusion to the reader.
 *
 * Pure and clock-free: the caller passes the time in, so both measured waveforms are replayable in
 * a unit test.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/andrerinas/openheadunit/aap/LinkGapMonitor;", "", "()V", "deadMs", "", "gapCount", "", "gapStarts", "Ljava/util/ArrayList;", "gapThresholdMs", "lastMessageMs", "longestMs", "started", "", "windowMs", "windowStartMs", "medianPeriodMs", "()Ljava/lang/Long;", "onMessage", "Lcom/andrerinas/openheadunit/aap/LinkGapMonitor$Report;", "nowMs", "reset", "", "Companion", "Report", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class LinkGapMonitor {
    
    /**
     * Silence longer than this counts as a gap.
     *
     * The phone sends a `CONTROL Ping Request` once a second for the life of the session, so a full
     * second in which *no* channel says anything is already outside what a working link does. The
     * value matches the offline script's default, which is what makes the two comparable.
     */
    private final long gapThresholdMs = 1200L;
    
    /**
     * How much link time one report covers.
     */
    private final long windowMs = 30000L;
    
    /**
     * Whether any message has been seen since the last [reset]. A separate flag rather than a
     * sentinel value of [lastMessageMs], because zero is a timestamp a monotonic clock can legally
     * produce and overloading it makes the very first interval of a session unmeasurable.
     */
    private boolean started = false;
    private long lastMessageMs = 0L;
    private long windowStartMs = 0L;
    private int gapCount = 0;
    private long deadMs = 0L;
    private long longestMs = 0L;
    
    /**
     * When each gap in this window began, for the start-to-start interval. Bounded because a link
     * that is more gap than traffic would otherwise grow this without limit; the counters above stay
     * exact regardless, and only the interval degrades.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.Long> gapStarts = null;
    
    /**
     * Silence longer than this is a gap. See [gapThresholdMs].
     */
    public static final long GAP_THRESHOLD_MS = 1200L;
    
    /**
     * How much link time one report covers.
     *
     * Long enough to hold about three cycles of either measured waveform, so a period can be
     * read off a single line, and clear of the decoder's own five-second throughput cadence so
     * the two do not interleave into noise.
     */
    public static final long WINDOW_MS = 30000L;
    
    /**
     * Cap on remembered gap starts. See [gapStarts].
     */
    public static final int MAX_TRACKED_STARTS = 256;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.LinkGapMonitor.Companion Companion = null;
    
    public LinkGapMonitor() {
        super();
    }
    
    /**
     * Feed one inbound message and get a report when a window closes with something to say.
     *
     * [nowMs] is a monotonic clock reading - `SystemClock.elapsedRealtime` at the call site.
     *
     * Returns `null` for every message that does not close a window, and for every window that had
     * no gaps in it. A healthy session therefore prints nothing at all, which is the property that
     * makes a line worth reading.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.aap.LinkGapMonitor.Report onMessage(long nowMs) {
        return null;
    }
    
    /**
     * Forget the previous session.
     *
     * The transport outlives a session and is re-armed for the next one, so a stamp left by the
     * previous phone would otherwise be measured as this session's first gap.
     */
    public final void reset() {
    }
    
    /**
     * Median start-to-start interval between consecutive gaps, or `null` with fewer than two.
     *
     * The interval is the field that separates a periodic fault from an unlucky patch of traffic:
     * both measured waveforms hold theirs to within a second across an entire session, which is not
     * something congestion does.
     *
     * It is the interval between *gaps*, not between cycles, and on a link whose outages arrive in
     * pairs - one long, one short - it reports the spacing inside the pair rather than the cycle
     * length. That is the honest answer to what was asked, but it is not the number a reader
     * eyeballing the cycle would predict, so read it alongside the count.
     */
    private final java.lang.Long medianPeriodMs() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/LinkGapMonitor$Companion;", "", "()V", "GAP_THRESHOLD_MS", "", "MAX_TRACKED_STARTS", "", "WINDOW_MS", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    /**
     * One window's worth of silence, in the offline script's fields.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012JB\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\b\u0010 \u001a\u00020!H\u0016R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000b\u00a8\u0006\""}, d2 = {"Lcom/andrerinas/openheadunit/aap/LinkGapMonitor$Report;", "", "gaps", "", "windowMs", "", "deadMs", "longestMs", "medianPeriodMs", "(IJJJLjava/lang/Long;)V", "getDeadMs", "()J", "deadPercent", "getDeadPercent", "()I", "getGaps", "getLongestMs", "getMedianPeriodMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getWindowMs", "component1", "component2", "component3", "component4", "component5", "copy", "(IJJJLjava/lang/Long;)Lcom/andrerinas/openheadunit/aap/LinkGapMonitor$Report;", "equals", "", "other", "hashCode", "toString", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Report {
        private final int gaps = 0;
        private final long windowMs = 0L;
        private final long deadMs = 0L;
        private final long longestMs = 0L;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long medianPeriodMs = null;
        
        public Report(int gaps, long windowMs, long deadMs, long longestMs, @org.jetbrains.annotations.Nullable()
        java.lang.Long medianPeriodMs) {
            super();
        }
        
        public final int getGaps() {
            return 0;
        }
        
        public final long getWindowMs() {
            return 0L;
        }
        
        public final long getDeadMs() {
            return 0L;
        }
        
        public final long getLongestMs() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getMedianPeriodMs() {
            return null;
        }
        
        public final int getDeadPercent() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long component4() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.LinkGapMonitor.Report copy(int gaps, long windowMs, long deadMs, long longestMs, @org.jetbrains.annotations.Nullable()
        java.lang.Long medianPeriodMs) {
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