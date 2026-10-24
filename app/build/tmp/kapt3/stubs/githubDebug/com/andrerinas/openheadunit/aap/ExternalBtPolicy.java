package com.andrerinas.openheadunit.aap;

/**
 * Whether this head unit's Bluetooth is an *external module* — a separate chip on a serial link,
 * driven by the vendor's own daemon — rather than the radio behind `android.bluetooth`.
 *
 * The four signals are the ones the reference head unit software uses to decide the same thing,
 * and they were confirmed against a unit whose own vendor log reports `bttype:extra` while its
 * Bluetooth module answers to a different name (`CAR8032`) and a different MAC than the Android
 * adapter reports. On that unit the vendor software routes Android Auto entirely through the
 * external module and never opens an RFCOMM server on the Android radio.
 *
 * These signals are a marker for that class of hardware, not a diagnosis of a specific fault. What
 * is measured on the one such unit examined closely: the phone opens an RFCOMM channel to the
 * Android radio, flow control stays open, and the radio then transmits no payload at all — writes
 * succeed, `flush()` returns, the log looks healthy, and not one byte goes on the air. Whether
 * every unit carrying these signals fails the same way is not established; what is established is
 * that the vendor does not use this path on them, so it is not a path to recommend.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J2\u0010\b\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nJ0\u0010\r\u001a\u00020\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/andrerinas/openheadunit/aap/ExternalBtPolicy;", "", "()V", "DEVICE_NODES", "", "", "EXTERNAL_VALUE", "PROPERTY_KEYS", "detect", "nodeExists", "Lkotlin/Function1;", "", "property", "isExternal", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ExternalBtPolicy {
    
    /**
     * Serial device nodes that only exist when a discrete Bluetooth module is wired to a UART.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> DEVICE_NODES = null;
    
    /**
     * Vendor properties that name the Bluetooth topology outright.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> PROPERTY_KEYS = null;
    
    /**
     * The value those properties carry on units whose Bluetooth is the external module.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTERNAL_VALUE = "extra";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.ExternalBtPolicy INSTANCE = null;
    
    private ExternalBtPolicy() {
        super();
    }
    
    /**
     * The first piece of evidence that this unit's Bluetooth is external, or null if none of the
     * signals fire.
     *
     * Returns the evidence rather than a bare boolean so the caller can name it: "external
     * Bluetooth module detected" is not actionable in a bug report, "/dev/rf_serial exists" is.
     *
     * @param nodeExists whether a given absolute path exists on the filesystem
     * @param property   the value of a given system property, or null/empty when unset
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String detect(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> nodeExists, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> property) {
        return null;
    }
    
    /**
     * Convenience over [detect] for callers that only need the yes/no.
     */
    public final boolean isExternal(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> nodeExists, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> property) {
        return false;
    }
}