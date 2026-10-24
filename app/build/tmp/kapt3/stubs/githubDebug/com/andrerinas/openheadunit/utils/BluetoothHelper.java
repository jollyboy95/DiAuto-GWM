package com.andrerinas.openheadunit.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\'B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0016\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0007J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0007J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0012J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0015\u0010 \u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0007H\u0002J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u001aJ\u0010\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006("}, d2 = {"Lcom/andrerinas/openheadunit/utils/BluetoothHelper;", "", "()V", "PROFILE_A2DP_SINK", "", "PROFILE_HEADSET_CLIENT", "externalBtEvidence", "", "getExternalBtEvidence", "()Ljava/lang/String;", "externalBtEvidence$delegate", "Lkotlin/Lazy;", "a2dpMediaLinkState", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Boolean;", "adapterForService", "Landroid/bluetooth/BluetoothAdapter;", "serviceName", "findServiceNameByInterfaceDescriptor", "descriptor", "getAdapterDescription", "getAdapterHandleForService", "Lcom/andrerinas/openheadunit/utils/BluetoothHelper$BluetoothAdapterHandle;", "getAllBluetoothAdapterHandles", "", "getAllBluetoothAdapters", "getBluetoothAdapter", "getBluetoothMacAddress", "adapter", "getDefaultAdapter", "handsFreeLinkState", "isA2dpMediaLinkActive", "isValidMacAddress", "mac", "listBluetoothServices", "serviceExists", "name", "BluetoothAdapterHandle", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BluetoothHelper {
    
    /**
     * `BluetoothProfile.HEADSET_CLIENT`. Hidden from the SDK, but
     * [BluetoothAdapter.getProfileConnectionState] takes a plain profile int and answers for it, and
     * this is the hands-free role a head unit plays: the phone is the audio gateway, the unit is the
     * hands-free device that carries the call.
     */
    private static final int PROFILE_HEADSET_CLIENT = 16;
    
    /**
     * `BluetoothProfile.A2DP_SINK`. Hidden from the SDK, but [BluetoothAdapter.getProfileConnectionState]
     * takes a plain profile int and answers for it, and the sink role is the one a head unit plays:
     * the phone is the source, we render its audio.
     */
    private static final int PROFILE_A2DP_SINK = 11;
    
    /**
     * Evidence that this head unit's Bluetooth is an external module on a serial link rather than
     * the radio behind `android.bluetooth`, or null when it is a normal built-in radio. See
     * [ExternalBtPolicy] for what the evidence means and why it decides whether Bluetooth-based
     * wireless can work here at all.
     *
     * Cached: the answer is a property of the hardware and cannot change within a process, and
     * this is consulted on every handshake start.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy externalBtEvidence$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.BluetoothHelper INSTANCE = null;
    
    private BluetoothHelper() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.bluetooth.BluetoothAdapter getBluetoothAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final android.bluetooth.BluetoothAdapter getDefaultAdapter(android.content.Context context) {
        return null;
    }
    
    /**
     * Instantiate the BluetoothAdapter backed by a specific system bluetooth service (reflection).
     */
    private final android.bluetooth.BluetoothAdapter adapterForService(android.content.Context context, java.lang.String serviceName) {
        return null;
    }
    
    /**
     * All distinct, enabled Bluetooth adapters exposed by the system, paired with the system
     * service name each is backed by. Usually just the default radio; some head units expose a
     * second Bluetooth chip as an extra service. Best-effort: bogus/non-adapter services resolve
     * to null and are skipped.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.andrerinas.openheadunit.utils.BluetoothHelper.BluetoothAdapterHandle> getAllBluetoothAdapterHandles(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * All distinct, enabled Bluetooth adapters exposed by the system. See [getAllBluetoothAdapterHandles].
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<android.bluetooth.BluetoothAdapter> getAllBluetoothAdapters(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Whether this head unit currently holds a Bluetooth hands-free link, in either role.
     *
     * Null when the adapter will not say. Callers must treat that as "no link known" rather than
     * "no link", because the only decision hanging off this is whether to skip an action that is
     * load-bearing elsewhere.
     *
     * Both roles are read. `HEADSET_CLIENT` is the one a head unit normally plays and the one the
     * wake poke was measured destroying; `HEADSET` is checked too because some OEM stacks report a
     * hands-free connection under the gateway role instead, and for this decision a false "yes" only
     * costs a skipped poke while a false "no" costs the user their calls.
     *
     * Profile-wide, not per-device: `getProfileConnectionState` answers for the adapter, and the
     * per-device equivalents are system-only. On a head unit paired with one phone that distinction
     * does not arise; where it does, this errs toward reporting a link.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean handsFreeLinkState(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Whether a Bluetooth media link to this head unit is up, in either role.
     *
     * Used to decide against taking system audio focus for Android Auto playback: when the phone is
     * also our A2DP source, the sink service answers our focus grab with an AVRCP pause aimed at
     * that same phone, which stops the stream we are trying to play. Callers treat an unknown
     * answer as "a link may be up", so this returns true when the state cannot be read — a car
     * radio playing over AA is an annoyance, silence is a broken app.
     */
    public final boolean isA2dpMediaLinkActive(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * The same probe as [isA2dpMediaLinkActive], but saying so when it does not know: null means no
     * profile state could be read at all, rather than "no link".
     *
     * The two callers want opposite things from that answer. Audio focus treats unknown as a link
     * being up, because a car radio playing over Android Auto is an annoyance and silence is a
     * broken app. Media-key routing treats unknown as no link, because a doubled track skip is an
     * annoyance and buttons that quietly do nothing are a broken app. Neither default is right for
     * both, so the resolution belongs to the caller.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean a2dpMediaLinkState(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Resolve a single, arbitrary system service name to a BluetoothAdapterHandle, if it backs a
     * real, enabled adapter. Used for the manual secondary-radio override in Settings, where the
     * user supplies a service name automatic discovery (listBluetoothServices()) didn't find.
     * Forgiving of the AIDL interface descriptor `adb shell service list` prints in brackets
     * (e.g. "com.qf.btsdk.IBTBinderPool") in place of the actual service name before the colon
     * (e.g. "btBinderPool"): users copy the bracketed part, it being the more distinctive-looking
     * of the two.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.andrerinas.openheadunit.utils.BluetoothHelper.BluetoothAdapterHandle getAdapterHandleForService(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String serviceName) {
        return null;
    }
    
    private final boolean serviceExists(java.lang.String name) {
        return false;
    }
    
    /**
     * Reverse-looks-up a system service by its AIDL interface descriptor (the bracketed part of
     * `adb shell service list` output) instead of its name (the part before the colon).
     * IBinder.getInterfaceDescriptor() is a standard, side-effect-free query safe to call on any
     * service, unlike actually invoking interface methods on a mismatched proxy - so this is safe
     * to run across every registered service, not just ones already known to be Bluetooth-shaped.
     */
    private final java.lang.String findServiceNameByInterfaceDescriptor(java.lang.String descriptor) {
        return null;
    }
    
    /**
     * Resolves the real Bluetooth MAC address of the headunit's Bluetooth chip.
     * On Android 6+ (API 23+), adapter.address returns dummy "02:00:00:00:00:00".
     * We fall back to reflection and Chinese OEM SystemProperties to find the true hardware BDADDR.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBluetoothMacAddress(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothAdapter adapter) {
        return null;
    }
    
    /**
     * Evidence that this head unit's Bluetooth is an external module on a serial link rather than
     * the radio behind `android.bluetooth`, or null when it is a normal built-in radio. See
     * [ExternalBtPolicy] for what the evidence means and why it decides whether Bluetooth-based
     * wireless can work here at all.
     *
     * Cached: the answer is a property of the hardware and cannot change within a process, and
     * this is consulted on every handshake start.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExternalBtEvidence() {
        return null;
    }
    
    private final boolean isValidMacAddress(java.lang.String mac) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> listBluetoothServices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAdapterDescription(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String serviceName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/andrerinas/openheadunit/utils/BluetoothHelper$BluetoothAdapterHandle;", "", "serviceName", "", "adapter", "Landroid/bluetooth/BluetoothAdapter;", "(Ljava/lang/String;Landroid/bluetooth/BluetoothAdapter;)V", "getAdapter", "()Landroid/bluetooth/BluetoothAdapter;", "getServiceName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class BluetoothAdapterHandle {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.bluetooth.BluetoothAdapter adapter = null;
        
        public BluetoothAdapterHandle(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        android.bluetooth.BluetoothAdapter adapter) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.bluetooth.BluetoothAdapter getAdapter() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.bluetooth.BluetoothAdapter component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.utils.BluetoothHelper.BluetoothAdapterHandle copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        android.bluetooth.BluetoothAdapter adapter) {
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