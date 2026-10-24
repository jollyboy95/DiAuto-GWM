package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\b\u0010\u000f\u001a\u00020\u0004H\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicyTest;", "", "()V", "a dropped press drops its release too", "", "a duplicate with no identity is still dropped by the window", "a genuine press and hold is not broken up", "a press whose release never arrives does not swallow the next press", "a press with identity following one without falls back to the window", "a release with no outstanding press is never sent", "identity is ignored when it cannot be trusted", "non-media keys use the shorter window", "one press one click", "the same key event arriving twice is one click - activity first", "the same key event arriving twice is one click - broadcast first", "the very first press is never treated as a duplicate", "two deliberate presses inside the old window both get through when they carry identity", "Key", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class KeyDebouncePolicyTest {
    
    public KeyDebouncePolicyTest() {
        super();
    }
    
    /**
     * Feeds deliveries through the policy the way CommManager does, and records what would have
     * reached the phone. A "delivery" is one call to sendKey.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicyTest$Key;", "", "isMediaKey", "", "(Z)V", "sent", "", "Lkotlin/Pair;", "", "getSent", "()Ljava/util/List;", "state", "Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$KeyState;", "getState", "()Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$KeyState;", "setState", "(Lcom/andrerinas/openheadunit/aap/KeyDebouncePolicy$KeyState;)V", "deliver", "", "isPress", "now", "downTime", "(ZJLjava/lang/Long;)V", "edges", "", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
    static final class Key {
        private final boolean isMediaKey = false;
        @org.jetbrains.annotations.NotNull()
        private com.andrerinas.openheadunit.aap.KeyDebouncePolicy.KeyState state;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<kotlin.Pair<java.lang.Boolean, java.lang.Long>> sent = null;
        
        public Key(boolean isMediaKey) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.andrerinas.openheadunit.aap.KeyDebouncePolicy.KeyState getState() {
            return null;
        }
        
        public final void setState(@org.jetbrains.annotations.NotNull()
        com.andrerinas.openheadunit.aap.KeyDebouncePolicy.KeyState p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<kotlin.Pair<java.lang.Boolean, java.lang.Long>> getSent() {
            return null;
        }
        
        public final void deliver(boolean isPress, long now, @org.jetbrains.annotations.Nullable()
        java.lang.Long downTime) {
        }
        
        /**
         * The press/release sequence that reached the phone.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Boolean> edges() {
            return null;
        }
        
        public Key() {
            super();
        }
    }
}