package com.andrerinas.openheadunit.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000eJ\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00182\u0006\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\u001a\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/andrerinas/openheadunit/utils/LocaleHelper;", "", "()V", "KEY", "", "MIGRATED", "SYSTEM_DEFAULT", "applyLocale", "Landroid/content/Context;", "context", "settings", "Lcom/andrerinas/openheadunit/utils/Settings;", "getAvailableLocales", "", "Ljava/util/Locale;", "getDisplayName", "locale", "localeToString", "migrate", "", "parseLocale", "localeString", "preference", "preferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "save", "language", "stringToLocale", "wrapContext", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class LocaleHelper {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SYSTEM_DEFAULT = "";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY = "app-language";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MIGRATED = "app-language-platform-migrated";
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.utils.LocaleHelper INSTANCE = null;
    
    private LocaleHelper() {
        super();
    }
    
    /**
     * Gets available locales that the app has translations for.
     *
     * The list is determined at build time by scanning the res/values-* directories
     * for those containing strings.xml files. This is stored in BuildConfig.AVAILABLE_LOCALES
     * so new translations are automatically included when contributors add values-XX folders.
     *
     * English is always included as it's the default language in the base "values/" folder.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.Locale> getAvailableLocales(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Parse a locale string like "es", "pt-rBR", "zh-rTW" into a Locale object.
     * Handles Android resource qualifier format where region is prefixed with 'r'.
     */
    private final java.util.Locale parseLocale(java.lang.String localeString) {
        return null;
    }
    
    /**
     * Converts a Locale to a storage string format.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String localeToString(@org.jetbrains.annotations.Nullable()
    java.util.Locale locale) {
        return null;
    }
    
    /**
     * Converts a stored string back to a Locale.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Locale stringToLocale(@org.jetbrains.annotations.NotNull()
    java.lang.String localeString) {
        return null;
    }
    
    /**
     * Gets the display name for a locale in its own language.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName(@org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    private final android.content.SharedPreferences preferences(android.content.Context context) {
        return null;
    }
    
    /**
     * Android 13 settings and the in-app picker share the same source of truth.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String preference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String language) {
    }
    
    @androidx.annotation.RequiresApi(value = 33)
    private final void migrate(android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context applyLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.utils.Settings settings) {
        return null;
    }
    
    /**
     * Updates the configuration for the given context.
     * Use this in attachBaseContext of Activities.
     */
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context wrapContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}