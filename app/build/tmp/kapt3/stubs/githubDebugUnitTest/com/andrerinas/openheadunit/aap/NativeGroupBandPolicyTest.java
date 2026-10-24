package com.andrerinas.openheadunit.aap;

/**
 * The frequencies are real ones: 2437 and 2462 are the 2.4 GHz channels this rig's groups have come
 * up on, 5180 and 5745 the 5 GHz ones.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/aap/NativeGroupBandPolicyTest;", "", "()V", "a 5GHz request that came up on 2_4GHz is remade", "", "a 5GHz request that came up on 5GHz is left alone", "a group deliberately put on 2_4GHz is never remade - the round would measure nothing otherwise", "a standard-fallback group is never remade - nobody asked for a band", "an unknown frequency is not a mismatch", "the default is unchanged - 5GHz is what Native AA asks for", "the labels are the ones the log and the briefs grep for", "the override asks for 2_4GHz", "the retry budget still bounds it", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class NativeGroupBandPolicyTest {
    
    public NativeGroupBandPolicyTest() {
        super();
    }
}