package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\tH\u0007J\b\u0010\u000f\u001a\u00020\tH\u0007J\b\u0010\u0010\u001a\u00020\tH\u0007J\b\u0010\u0011\u001a\u00020\tH\u0007J\b\u0010\u0012\u001a\u00020\tH\u0007J\b\u0010\u0013\u001a\u00020\tH\u0007J\b\u0010\u0014\u001a\u00020\tH\u0007J\b\u0010\u0015\u001a\u00020\tH\u0007J\b\u0010\u0016\u001a\u00020\tH\u0007J\b\u0010\u0017\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/andrerinas/openheadunit/aap/BluetoothWakePolicyTest;", "", "()V", "BONDED", "Lcom/andrerinas/openheadunit/aap/BluetoothWakePolicy$BondReading;", "MALFORMED", "NOT_BONDED", "UNREADABLE", "a live hands-free link is never poked", "", "a malformed address is forgotten", "a paired device is never forgotten", "a positive not-paired answer is forgotten", "an unknown uuid still prints as itself", "an unreadable adapter still pokes", "an unreadable state is never forgotten", "hands-free is tried first, headset second, and neither is ever dropped", "no hands-free link means there is nothing to destroy, so poke", "nothing pokeable is ever forgotten", "only a confirmed pairing may be poked", "only a connected link suppresses the poke", "targets are named for a log reader", "the poke targets are the assigned audio gateway service classes", "the three-valued profile read maps onto the three states", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class BluetoothWakePolicyTest {
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.BluetoothWakePolicy.BondReading BONDED = com.andrerinas.openheadunit.aap.BluetoothWakePolicy.BondReading.BONDED;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.BluetoothWakePolicy.BondReading NOT_BONDED = com.andrerinas.openheadunit.aap.BluetoothWakePolicy.BondReading.NOT_BONDED;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.BluetoothWakePolicy.BondReading MALFORMED = com.andrerinas.openheadunit.aap.BluetoothWakePolicy.BondReading.MALFORMED;
    @org.jetbrains.annotations.NotNull()
    private final com.andrerinas.openheadunit.aap.BluetoothWakePolicy.BondReading UNREADABLE = com.andrerinas.openheadunit.aap.BluetoothWakePolicy.BondReading.UNREADABLE;
    
    public BluetoothWakePolicyTest() {
        super();
    }
}