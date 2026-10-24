package com.andrerinas.openheadunit.aap;

/**
 * Rules for the Native AA wake poke: which of the phone's Bluetooth records it may reach for, when
 * it may connect at all, and which stored MACs are worth keeping.
 *
 * The poke raises an ACL connection so the phone notices a wireless-capable head unit. It is
 * load-bearing — some units never connect without it — so nothing here switches it off. What the
 * rules decide is when a poke would cost more than it gains.
 *
 * Pure and unit-tested; the sockets live in `NativeAaHandshakeManager`.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/andrerinas/openheadunit/aap/BluetoothWakePolicy;", "", "()V", "HFP_AG_UUID", "Ljava/util/UUID;", "getHFP_AG_UUID", "()Ljava/util/UUID;", "HSP_AG_UUID", "getHSP_AG_UUID", "POKE_TARGETS", "", "getPOKE_TARGETS", "()Ljava/util/List;", "mayPoke", "", "reading", "Lcom/andrerinas/openheadunit/aap/BluetoothWakePolicy$BondReading;", "profileName", "", "uuid", "shouldForget", "shouldPoke", "handsFreeLink", "Lcom/andrerinas/openheadunit/aap/BluetoothWakePolicy$HandsFreeLink;", "BondReading", "HandsFreeLink", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class BluetoothWakePolicy {
    
    /**
     * Handsfree Profile — Audio Gateway. The phone's hands-free side; a call rides on this.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.UUID HFP_AG_UUID = null;
    
    /**
     * Headset Profile — Audio Gateway. Long stored under the name `A2DP_SOURCE_UUID`, which it never
     * was: A2DP Source is `0000110a`. Both values are confirmed against
     * nisargjhaveri/WirelessAndroidAutoDongle and mossyhub/openautolink.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.UUID HSP_AG_UUID = null;
    
    /**
     * The records a poke tries, in order — openautolink's ConnectProfile fallback chain.
     *
     * Deliberately not a setting. A selectable HSP-AG-only mode was built and removed once the rig
     * measured a successful HSP-AG poke leaving this unit's hands-free link down for three minutes,
     * the same outcome as HFP-AG: a phone serves both records from one headset connection, so which
     * one is asked for was never the lever. [shouldPoke] is.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.util.UUID> POKE_TARGETS = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.BluetoothWakePolicy INSTANCE = null;
    
    private BluetoothWakePolicy() {
        super();
    }
    
    /**
     * Handsfree Profile — Audio Gateway. The phone's hands-free side; a call rides on this.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getHFP_AG_UUID() {
        return null;
    }
    
    /**
     * Headset Profile — Audio Gateway. Long stored under the name `A2DP_SOURCE_UUID`, which it never
     * was: A2DP Source is `0000110a`. Both values are confirmed against
     * nisargjhaveri/WirelessAndroidAutoDongle and mossyhub/openautolink.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getHSP_AG_UUID() {
        return null;
    }
    
    /**
     * The records a poke tries, in order — openautolink's ConnectProfile fallback chain.
     *
     * Deliberately not a setting. A selectable HSP-AG-only mode was built and removed once the rig
     * measured a successful HSP-AG poke leaving this unit's hands-free link down for three minutes,
     * the same outcome as HFP-AG: a phone serves both records from one headset connection, so which
     * one is asked for was never the lever. [shouldPoke] is.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.UUID> getPOKE_TARGETS() {
        return null;
    }
    
    /**
     * Reader-facing name for a target, so a log says what was touched rather than a UUID.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String profileName(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    /**
     * Whether the wake poke may run, given what this head unit's own hands-free link is doing.
     *
     * Measured, not theorised: a poke that connects takes the phone's single hands-free slot and
     * this unit's own client is dropped to make room. `HfpClientConnectionService` logged its
     * disconnect from the same peer 4 ms after `socket.connect()` returned, and the link stayed down
     * eight minutes until a Bluetooth adapter cycle. The user sees a head unit reporting Bluetooth
     * disconnected while the phone reports it connected, and calls coming out of the phone.
     *
     * Skipping costs nothing, because a live hands-free link *is* the ACL connection a poke exists
     * to create. Units where the poke is load-bearing have no such link to read, so they keep
     * today's behaviour — as does [HandsFreeLink.UNREADABLE], since an adapter that will not report
     * its profiles must not silently disable a mechanism some units cannot connect without.
     */
    public final boolean shouldPoke(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.BluetoothWakePolicy.HandsFreeLink handsFreeLink) {
        return false;
    }
    
    /**
     * Whether a poke may open a socket to a device in this state.
     *
     * Only a confirmed pairing. A poke is a raw RFCOMM `connect()` to a device we assume already
     * trusts us; against an unpaired one the OS starts a new pairing negotiation as a side effect,
     * which the user sees as the head unit asking to pair every time the phone's radio comes back.
     *
     * Strict where [shouldForget] is lenient: refusing to poke costs a retry seconds later.
     */
    public final boolean mayPoke(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.BluetoothWakePolicy.BondReading reading) {
        return false;
    }
    
    /**
     * Whether a stored MAC should be dropped from the Auto Start list.
     *
     * Only on evidence the device is genuinely gone. **Never on [BondReading.UNREADABLE]** —
     * `getBondState()` answers "not bonded" when the Bluetooth service is merely unavailable, so
     * treating that as unpaired would delete the user's configured device on any poke round that
     * landed while the adapter was off. This head unit's Bluetooth is known to cycle itself, so that
     * window is reachable, and the deletion is written straight through to device-protected storage
     * where nothing would restore it.
     *
     * Lenient where [mayPoke] is strict: a MAC kept one round too long costs nothing, because
     * [mayPoke] will not poke it.
     */
    public final boolean shouldForget(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.BluetoothWakePolicy.BondReading reading) {
        return false;
    }
    
    /**
     * What a stored Auto Start MAC's pairing state read as, when the poke went looking for it.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/aap/BluetoothWakePolicy$BondReading;", "", "(Ljava/lang/String;I)V", "BONDED", "NOT_BONDED", "MALFORMED", "UNREADABLE", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum BondReading {
        /*public static final*/ BONDED /* = new BONDED() */,
        /*public static final*/ NOT_BONDED /* = new NOT_BONDED() */,
        /*public static final*/ MALFORMED /* = new MALFORMED() */,
        /*public static final*/ UNREADABLE /* = new UNREADABLE() */;
        
        BondReading() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.BluetoothWakePolicy.BondReading> getEntries() {
            return null;
        }
    }
    
    /**
     * What this head unit's own Bluetooth stack says about its hands-free link.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/aap/BluetoothWakePolicy$HandsFreeLink;", "", "(Ljava/lang/String;I)V", "CONNECTED", "ABSENT", "UNREADABLE", "Companion", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum HandsFreeLink {
        /*public static final*/ CONNECTED /* = new CONNECTED() */,
        /*public static final*/ ABSENT /* = new ABSENT() */,
        /*public static final*/ UNREADABLE /* = new UNREADABLE() */;
        @org.jetbrains.annotations.NotNull()
        public static final com.andrerinas.openheadunit.aap.BluetoothWakePolicy.HandsFreeLink.Companion Companion = null;
        
        HandsFreeLink() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.BluetoothWakePolicy.HandsFreeLink> getEntries() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/BluetoothWakePolicy$HandsFreeLink$Companion;", "", "()V", "of", "Lcom/andrerinas/openheadunit/aap/BluetoothWakePolicy$HandsFreeLink;", "connected", "", "(Ljava/lang/Boolean;)Lcom/andrerinas/openheadunit/aap/BluetoothWakePolicy$HandsFreeLink;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            /**
             * Maps [com.andrerinas.openheadunit.utils.BluetoothHelper.handsFreeLinkState]'s
             * three-valued answer, so the null case is named rather than implied.
             */
            @org.jetbrains.annotations.NotNull()
            public final com.andrerinas.openheadunit.aap.BluetoothWakePolicy.HandsFreeLink of(@org.jetbrains.annotations.Nullable()
            java.lang.Boolean connected) {
                return null;
            }
        }
    }
}