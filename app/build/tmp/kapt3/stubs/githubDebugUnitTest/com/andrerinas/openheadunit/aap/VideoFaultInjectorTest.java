package com.andrerinas.openheadunit.aap;

/**
 * The test tool that makes the reassembly fixes measurable on a unit that is working correctly.
 *
 * Its own correctness matters as much as the code it exercises: a brief that says "a fault every six
 * seconds" has to be true, or the results cannot be compared between builds.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\tH\u0007J\b\u0010\u000f\u001a\u00020\tH\u0007J\b\u0010\u0010\u001a\u00020\tH\u0007J\b\u0010\u0011\u001a\u00020\tH\u0007J\b\u0010\u0012\u001a\u00020\tH\u0007J\b\u0010\u0013\u001a\u00020\tH\u0007J\b\u0010\u0014\u001a\u00020\tH\u0007J\b\u0010\u0015\u001a\u00020\tH\u0007J\b\u0010\u0016\u001a\u00020\tH\u0007J\b\u0010\u0017\u001a\u00020\tH\u0007J\b\u0010\u0018\u001a\u00020\tH\u0007J\b\u0010\u0019\u001a\u00020\tH\u0007J\b\u0010\u001a\u001a\u00020\tH\u0007J\b\u0010\u001b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoFaultInjectorTest;", "", "()V", "first", "", "lastFlag", "middleFlag", "single", "a budget stops injection at exactly N faults", "", "a spent budget still counts candidates", "each mode attacks the flag it says it does", "each mode belongs to exactly one stage, and only one site applies it", "every Nth targeted message is faulted, and nothing else is touched", "every mode round-trips through the value stored in settings", "hiding the start code is not a drop", "no budget means the whole session, and a negative one is not a budget", "off does nothing to anything", "only the reader mode runs in the reader", "the candidate count follows the targeted flag and nothing else", "the default rate is rare enough to leave a fair sample of normal behaviour", "the rate counts only the flag being attacked", "the rate is clamped to something that can still produce a picture", "the reader mode attacks middle fragments, like the assembler-stage mode it mirrors", "the reader mode honours the rate and the budget like every other", "the reader mode leaves every other flag alone", "the summary carries the setting and both counts", "the summary says how much of a budget is left", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class VideoFaultInjectorTest {
    private final int first = 9;
    private final int middleFlag = 8;
    private final int lastFlag = 10;
    private final int single = 11;
    
    public VideoFaultInjectorTest() {
        super();
    }
}