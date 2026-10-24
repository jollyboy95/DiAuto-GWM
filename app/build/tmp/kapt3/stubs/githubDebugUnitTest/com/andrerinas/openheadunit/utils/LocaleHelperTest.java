package com.andrerinas.openheadunit.utils;

@org.robolectric.annotation.ConscryptMode(value = org.robolectric.annotation.ConscryptMode.Mode.OFF)
@org.junit.runner.RunWith(value = org.robolectric.RobolectricTestRunner.class)
@org.robolectric.annotation.Config(application = android.app.Application.class, sdk = {33}, manifest = "--none")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0007J\b\u0010\u0013\u001a\u00020\u0011H\u0007J\b\u0010\u0014\u001a\u00020\u0011H\u0007J\b\u0010\u0015\u001a\u00020\u0011H\u0007J\b\u0010\u0016\u001a\u00020\u0011H\u0007R\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\r0\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/andrerinas/openheadunit/utils/LocaleHelperTest;", "", "()V", "context", "Landroid/app/Application;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/app/Application;", "manager", "Landroid/app/LocaleManager;", "getManager", "()Landroid/app/LocaleManager;", "prefs", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "backupUsesThePlatformChoiceInsteadOfTheRemovedLegacyKey", "", "legacyChoiceMigratesOnceAndSystemChangesStayAuthoritative", "migrationDoesNotOverwriteAnAndroidSettingsChoice", "olderAndroidSwitchesResourcesAndRtlWithoutChangingTheProcessDefault", "pickerUpdatesPlatformAndCanRestoreSystemDefault", "reset", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class LocaleHelperTest {
    
    public LocaleHelperTest() {
        super();
    }
    
    private final android.app.Application getContext() {
        return null;
    }
    
    private final android.content.SharedPreferences getPrefs() {
        return null;
    }
    
    private final android.app.LocaleManager getManager() {
        return null;
    }
    
    @org.junit.Before()
    public final void reset() {
    }
    
    @org.junit.Test()
    public final void legacyChoiceMigratesOnceAndSystemChangesStayAuthoritative() {
    }
    
    @org.junit.Test()
    public final void migrationDoesNotOverwriteAnAndroidSettingsChoice() {
    }
    
    @org.junit.Test()
    public final void pickerUpdatesPlatformAndCanRestoreSystemDefault() {
    }
    
    @org.junit.Test()
    public final void backupUsesThePlatformChoiceInsteadOfTheRemovedLegacyKey() {
    }
    
    @org.junit.Test()
    @org.robolectric.annotation.Config(sdk = {29}, qualifiers = "en")
    public final void olderAndroidSwitchesResourcesAndRtlWithoutChangingTheProcessDefault() {
    }
}