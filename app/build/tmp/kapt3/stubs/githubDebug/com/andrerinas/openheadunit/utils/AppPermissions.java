package com.andrerinas.openheadunit.utils;

/**
 * Central, declarative registry of the runtime and special permissions the app surfaces to the
 * user (the setup wizard permissions step and the Settings > Permissions screen read from here).
 *
 * To support a future permission, add a single [Entry] to [ALL] plus its two strings (title +
 * help). The UI renders it automatically, with the correct SDK gating and grant flow. No wizard
 * or layout code needs to change.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/andrerinas/openheadunit/utils/AppPermissions;", "", "()V", "ALL", "", "Lcom/andrerinas/openheadunit/utils/AppPermissions$Entry;", "getALL", "()Ljava/util/List;", "grantedCount", "", "context", "Landroid/content/Context;", "isActuallyGranted", "", "opStr", "", "isOverlayGranted", "isWriteSettingsGranted", "missingNormalPermissions", "permissionMinSdk", "permission", "visible", "Entry", "Kind", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AppPermissions {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.andrerinas.openheadunit.utils.AppPermissions.Entry> ALL = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.AppPermissions INSTANCE = null;
    
    private AppPermissions() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.andrerinas.openheadunit.utils.AppPermissions.Entry> getALL() {
        return null;
    }
    
    /**
     * Registry entries relevant on the current device.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.andrerinas.openheadunit.utils.AppPermissions.Entry> visible() {
        return null;
    }
    
    /**
     * Every not-yet-granted normal permission across the visible entries, de-duplicated, so they
     * can be requested together in a single system dialog ("Enable all").
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> missingNormalPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Count of visible entries already granted (for the wizard summary).
     */
    public final int grantedCount(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    /**
     * Robust check for "Display over other apps" permission.
     */
    public final boolean isOverlayGranted(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Robust check for "Modify system settings" permission.
     */
    public final boolean isWriteSettingsGranted(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Fallback for some devices (especially headunits) where Settings#xx is unreliable
     */
    private final boolean isActuallyGranted(android.content.Context context, java.lang.String opStr) {
        return false;
    }
    
    /**
     * The API level at which a given manifest permission became requestable.
     */
    private final int permissionMinSdk(java.lang.String permission) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0006\u0010\u001d\u001a\u00020\u000eJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u000eH\u00c6\u0003J_\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010\'\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\u0005H\u00d6\u0001J\u000e\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020,J\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\nJ\t\u0010.\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011\u00a8\u0006/"}, d2 = {"Lcom/andrerinas/openheadunit/utils/AppPermissions$Entry;", "", "id", "", "titleRes", "", "helpRes", "kind", "Lcom/andrerinas/openheadunit/utils/AppPermissions$Kind;", "permissions", "", "minSdk", "maxSdk", "optional", "", "(Ljava/lang/String;IILcom/andrerinas/openheadunit/utils/AppPermissions$Kind;Ljava/util/List;IIZ)V", "getHelpRes", "()I", "getId", "()Ljava/lang/String;", "getKind", "()Lcom/andrerinas/openheadunit/utils/AppPermissions$Kind;", "getMaxSdk", "getMinSdk", "getOptional", "()Z", "getPermissions", "()Ljava/util/List;", "getTitleRes", "applies", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "isGranted", "context", "Landroid/content/Context;", "requestablePermissions", "toString", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class Entry {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        private final int titleRes = 0;
        private final int helpRes = 0;
        @org.jetbrains.annotations.NotNull()
        private final com.andrerinas.openheadunit.utils.AppPermissions.Kind kind = null;
        
        /**
         * Manifest permissions covered by this row (NORMAL only).
         */
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> permissions = null;
        
        /**
         * Lowest SDK where this row is relevant.
         */
        private final int minSdk = 0;
        
        /**
         * Highest SDK where this row is relevant (e.g. legacy storage tops out at API 29).
         */
        private final int maxSdk = 0;
        
        /**
         * Recommended rather than required; shown with an "(optional)" hint.
         */
        private final boolean optional = false;
        
        public Entry(@org.jetbrains.annotations.NotNull()
        java.lang.String id, int titleRes, int helpRes, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.utils.AppPermissions.Kind kind, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> permissions, int minSdk, int maxSdk, boolean optional) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        public final int getTitleRes() {
            return 0;
        }
        
        public final int getHelpRes() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.utils.AppPermissions.Kind getKind() {
            return null;
        }
        
        /**
         * Manifest permissions covered by this row (NORMAL only).
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getPermissions() {
            return null;
        }
        
        /**
         * Lowest SDK where this row is relevant.
         */
        public final int getMinSdk() {
            return 0;
        }
        
        /**
         * Highest SDK where this row is relevant (e.g. legacy storage tops out at API 29).
         */
        public final int getMaxSdk() {
            return 0;
        }
        
        /**
         * Recommended rather than required; shown with an "(optional)" hint.
         */
        public final boolean getOptional() {
            return false;
        }
        
        /**
         * True when this row is relevant on the current device.
         */
        public final boolean applies() {
            return false;
        }
        
        /**
         * Manifest permissions that actually exist to request on this API level.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> requestablePermissions() {
            return null;
        }
        
        public final boolean isGranted(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.utils.AppPermissions.Kind component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component5() {
            return null;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int component7() {
            return 0;
        }
        
        public final boolean component8() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.utils.AppPermissions.Entry copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, int titleRes, int helpRes, @org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.utils.AppPermissions.Kind kind, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> permissions, int minSdk, int maxSdk, boolean optional) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/utils/AppPermissions$Kind;", "", "(Ljava/lang/String;I)V", "NORMAL", "OVERLAY", "WRITE_SETTINGS", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Kind {
        /*public static final*/ NORMAL /* = new NORMAL() */,
        /*public static final*/ OVERLAY /* = new OVERLAY() */,
        /*public static final*/ WRITE_SETTINGS /* = new WRITE_SETTINGS() */;
        
        Kind() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.utils.AppPermissions.Kind> getEntries() {
            return null;
        }
    }
}