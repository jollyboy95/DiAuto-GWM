package com.andrerinas.openheadunit.aap;

/**
 * Deliberately breaks the video fragment stream, so the reassembler's failure paths can be exercised
 * on a head unit that is working correctly.
 *
 * The artifact reports this exists for - a melting or smearing picture - come from units we do not
 * have, and the conditions that cause it are properties of the link rather than of the app: a
 * fragment that never arrives, or a first fragment whose payload does not start where the protocol
 * says it should. A healthy rig produces none of them, which is why three rounds of hardware testing
 * on the decoder measured `dropped=0` and never reproduced the bug at all.
 *
 * This turns that around. Injecting the exact loss pattern reproduces each failure mode on any unit,
 * deterministically, so "the fix works" becomes something that can be measured rather than inferred
 * from a reporter's next drive.
 *
 * Deterministic on purpose: every Nth matching message rather than a random draw, so two builds
 * given the same stream see the same faults and an A/B comparison means something.
 *
 * Off unless explicitly enabled. When it is on, every injected fault is logged, so a log that has
 * been captured with this left on can never be mistaken for a log of a real fault.
 *
 * ### Where a mode is injected decides what can see it
 *
 * [Stage.ASSEMBLER] modes run in [AapVideo.process], which is **downstream of
 * [FragmentedMessageAudit]** - that check runs in the readers, on the header, before decryption
 * ([AapReadSingleMessage] and [AapReadMultipleMessages] both call `auditFragment` there). Every
 * message such a mode pretends never arrived has already been counted by the audit as arriving, so
 * no assembler-stage mode can produce a framing-audit outcome. Hardware measured it: **449 faults
 * injected across the three drop modes, and not one `AapRead:` line attributable to any of them.**
 * Only [VideoFragmentAssembler]'s counters - `headless=`, `orphan=`, `truncated=` - respond to them.
 *
 * [Stage.READER] modes exist because that made one fault untestable. A middle fragment missing from a
 * run is invisible to [VideoFragmentAssembler] by construction, so the audit is the only thing that
 * can see it - and an assembler-stage drop cannot exercise the audit, because the audit has already
 * counted the fragment. A reader-stage mode drops the message before `auditFragment` is called, so
 * the run really is short of the bytes its first fragment declared. A hardware round measured the
 * cost of not having one: 37 and 59 injected middle-fragment faults produced zero keyframe requests
 * and zero escalation activity, because nothing downstream of the reader could tell anything was
 * missing.
 *
 * What that reproduces is a fragment that **never reaches the reassembler**, not one lost in transit.
 * Nothing can be silently lost in transit here: AAP runs TLS over TCP, and a record that goes missing
 * takes the session with it rather than leaving a hole - which a round found out by writing this mode
 * to skip the decrypt as well as the delivery. The distinction matters because the effect on
 * everything downstream is identical, and the cause is not.
 *
 * A mode belongs to exactly one stage and [isActiveAt] is how each site asks. Neither call site
 * re-derives the condition - two that did drifted apart once already, elsewhere in this package.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0004 !\"#B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\t\u00a8\u0006$"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFaultInjector;", "", "mode", "Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Mode;", "rate", "", "budget", "(Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Mode;II)V", "getBudget", "()I", "budgetSpent", "", "getBudgetSpent", "()Z", "injected", "", "injectedCount", "getInjectedCount", "()J", "isActive", "matching", "matchingCount", "getMatchingCount", "getRate", "describe", "", "effectFor", "Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Effect;", "flags", "isActiveAt", "stage", "Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Stage;", "Companion", "Effect", "Mode", "Stage", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class VideoFaultInjector {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.VideoFaultInjector.Mode mode = null;
    
    /**
     * Faults are applied to one in this many matching messages.
     */
    private final int rate = 0;
    
    /**
     * How many faults this injector will inject before it stops, or [UNLIMITED_BUDGET] for no limit.
     *
     * Continuous injection measures one thing: that a stream still being broken stays broken. It
     * cannot measure the thing that matters more, which is whether the picture comes back once the
     * loss stops - and every recovery lever in the app is bounded per session, so a run with no end
     * to the faults spends them all and ends wedged whatever the code does. A budget puts both in
     * one capture: the damage, then the repair, with the moment between them in the log.
     */
    private final int budget = 0;
    private long matching = 0L;
    private long injected = 0L;
    
    /**
     * How often [describe] is worth repeating while a mode is active.
     */
    public static final long SUMMARY_INTERVAL_MS = 15000L;
    
    /**
     * No limit on how many faults are injected: the injector runs for the whole session.
     */
    public static final int UNLIMITED_BUDGET = 0;
    
    /**
     * One in one would break every frame and never reach a picture at all.
     */
    public static final int MIN_RATE = 2;
    public static final int MAX_RATE = 100000;
    
    /**
     * One in 300, which at the ~50 messages per second a healthy link carries is a fault every
     * few seconds - often enough to measure in a five-minute run, rare enough that the picture
     * in between is a fair sample of normal behaviour.
     */
    public static final int DEFAULT_RATE = 300;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.VideoFaultInjector.Companion Companion = null;
    
    public VideoFaultInjector(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.VideoFaultInjector.Mode mode, int rate, int budget) {
        super();
    }
    
    /**
     * Faults are applied to one in this many matching messages.
     */
    public final int getRate() {
        return 0;
    }
    
    /**
     * How many faults this injector will inject before it stops, or [UNLIMITED_BUDGET] for no limit.
     *
     * Continuous injection measures one thing: that a stream still being broken stays broken. It
     * cannot measure the thing that matters more, which is whether the picture comes back once the
     * loss stops - and every recovery lever in the app is bounded per session, so a run with no end
     * to the faults spends them all and ends wedged whatever the code does. A budget puts both in
     * one capture: the damage, then the repair, with the moment between them in the log.
     */
    public final int getBudget() {
        return 0;
    }
    
    public final long getInjectedCount() {
        return 0L;
    }
    
    public final boolean getBudgetSpent() {
        return false;
    }
    
    public final long getMatchingCount() {
        return 0L;
    }
    
    /**
     * One line saying what the injector is set to and what it has actually managed to do.
     *
     * Worth printing periodically rather than only per fault, because the interesting failure is the
     * one where nothing is injected: [rate] counts the messages carrying the flag this mode attacks,
     * and how often a frame fragments at all is a property of what the phone happens to be
     * projecting. A five-minute run at one in twenty produced zero faults on a rig where an earlier
     * run at one in three produced ten in ninety seconds - same code, same setting, different
     * screen. Without the candidate count that reads as "the setting did not take" rather than "the
     * stream did not fragment", and the only way to tell was to read this file.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String describe() {
        return null;
    }
    
    public final boolean isActive() {
        return false;
    }
    
    /**
     * Whether this injector acts at [stage].
     *
     * Both injection sites ask this rather than comparing modes themselves, so a mode can never be
     * applied twice - once in the reader and again in the assembler - or added to one site and
     * forgotten at the other.
     */
    public final boolean isActiveAt(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.VideoFaultInjector.Stage stage) {
        return false;
    }
    
    /**
     * Decides what to do with a message carrying [flags].
     *
     * Counts only the messages the current mode targets, so the rate means "one in N of the flag we
     * are attacking" rather than one in N of all video traffic - at three fragments per frame the
     * two differ by a factor of three, and the brief has to be able to say how often a fault lands.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.VideoFaultInjector.Effect effectFor(int flags) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Companion;", "", "()V", "DEFAULT_RATE", "", "MAX_RATE", "MIN_RATE", "SUMMARY_INTERVAL_MS", "", "UNLIMITED_BUDGET", "targetFlag", "mode", "Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Mode;", "(Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Mode;)Ljava/lang/Integer;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Which fragment flag a mode attacks, or null if it attacks nothing.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer targetFlag(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.VideoFaultInjector.Mode mode) {
            return null;
        }
    }
    
    /**
     * What the caller should do with the message it just asked about.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Effect;", "", "(Ljava/lang/String;I)V", "NONE", "DROP", "HIDE_START_CODE", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Effect {
        /*public static final*/ NONE /* = new NONE() */,
        /*public static final*/ DROP /* = new DROP() */,
        /*public static final*/ HIDE_START_CODE /* = new HIDE_START_CODE() */;
        
        Effect() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.VideoFaultInjector.Effect> getEntries() {
            return null;
        }
    }
    
    /**
     * What the injector does to the stream.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Mode;", "", "value", "", "stage", "Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Stage;", "(Ljava/lang/String;IILcom/andrerinas/openheadunit/aap/VideoFaultInjector$Stage;)V", "getStage", "()Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Stage;", "getValue", "()I", "OFF", "DROP_FIRST_FRAGMENT", "DROP_MIDDLE_FRAGMENT", "DROP_LAST_FRAGMENT", "HIDE_START_CODE", "DROP_MIDDLE_FRAGMENT_IN_READER", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Mode {
        /*public static final*/ OFF /* = new OFF(0, null) */,
        /*public static final*/ DROP_FIRST_FRAGMENT /* = new DROP_FIRST_FRAGMENT(0, null) */,
        /*public static final*/ DROP_MIDDLE_FRAGMENT /* = new DROP_MIDDLE_FRAGMENT(0, null) */,
        /*public static final*/ DROP_LAST_FRAGMENT /* = new DROP_LAST_FRAGMENT(0, null) */,
        /*public static final*/ HIDE_START_CODE /* = new HIDE_START_CODE(0, null) */,
        /*public static final*/ DROP_MIDDLE_FRAGMENT_IN_READER /* = new DROP_MIDDLE_FRAGMENT_IN_READER(0, null) */;
        private final int value = 0;
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.aap.VideoFaultInjector.Stage stage = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.VideoFaultInjector.Mode.Companion Companion = null;
        
        Mode(int value, com.andrerinas.openheadunit.aap.VideoFaultInjector.Stage stage) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.VideoFaultInjector.Stage getStage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.VideoFaultInjector.Mode> getEntries() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Mode$Companion;", "", "()V", "fromInt", "Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Mode;", "value", "", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.andrerinas.openheadunit.aap.VideoFaultInjector.Mode fromInt(int value) {
                return null;
            }
        }
    }
    
    /**
     * Where in the receive path a mode is applied, which decides what can observe the fault.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFaultInjector$Stage;", "", "(Ljava/lang/String;I)V", "ASSEMBLER", "READER", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Stage {
        /*public static final*/ ASSEMBLER /* = new ASSEMBLER() */,
        /*public static final*/ READER /* = new READER() */;
        
        Stage() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.VideoFaultInjector.Stage> getEntries() {
            return null;
        }
    }
}