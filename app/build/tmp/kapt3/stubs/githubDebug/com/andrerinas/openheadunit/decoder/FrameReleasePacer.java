package com.andrerinas.openheadunit.decoder;

/**
 * Spaces short decode bursts without accumulating a delayed presentation queue.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/FrameReleasePacer;", "", "refreshRate", "", "(F)V", "interval", "", "next", "schedule", "now", "(J)Ljava/lang/Long;", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class FrameReleasePacer {
    private final long interval = 0L;
    private long next = 0L;
    
    public FrameReleasePacer(float refreshRate) {
        super();
    }
    
    /**
     * null means the surface already has two refresh intervals of scheduled work.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long schedule(long now) {
        return null;
    }
}