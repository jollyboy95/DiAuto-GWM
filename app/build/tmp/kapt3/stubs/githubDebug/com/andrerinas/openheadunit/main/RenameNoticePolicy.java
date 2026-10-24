package com.andrerinas.openheadunit.main;

/**
 * Decides who sees the one-time rename notice.
 *
 * Existing users (installed before the rename went live) always get it once, even if they
 * update late. Brand-new installs only get it during a short window after the release, since
 * a rename notice means nothing to someone who never knew the old name.
 *
 * The decision is based only on the install time, which is recorded once at install and never
 * changes on updates. It does not read the current wall clock on purpose: many head units run
 * offline with a wrong or unset system clock, and existing users must still be reached. An
 * in-place update from the old app keeps the original (pre-release) install time, so upgraders
 * are reliably treated as existing users.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/andrerinas/openheadunit/main/RenameNoticePolicy;", "", "()V", "NEW_USER_WINDOW_MS", "", "RENAME_RELEASE_MS", "shouldOffer", "", "firstInstallTimeMs", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class RenameNoticePolicy {
    public static final long RENAME_RELEASE_MS = 1785542400000L;
    public static final long NEW_USER_WINDOW_MS = 2592000000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.main.RenameNoticePolicy INSTANCE = null;
    
    private RenameNoticePolicy() {
        super();
    }
    
    public final boolean shouldOffer(long firstInstallTimeMs) {
        return false;
    }
}