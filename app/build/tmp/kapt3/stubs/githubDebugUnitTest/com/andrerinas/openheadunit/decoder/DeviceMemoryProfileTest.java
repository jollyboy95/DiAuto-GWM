package com.andrerinas.openheadunit.decoder;

/**
 * The classification that decides how much memory the video pipeline is allowed to hold.
 *
 * The two anchors worth naming: the 1 GB MediaTek unit from #839 has to come out CONSTRAINED, and
 * the tablets this app is tested on must not - shrinking the pipeline on a device that was fine is
 * how a fix for one report becomes a regression for everyone else.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/andrerinas/openheadunit/decoder/DeviceMemoryProfileTest;", "", "()V", "a mid-range unit is normal, which is today\'s behaviour", "", "a modern tablet is ample and its buffers are left alone", "a small heap ceiling is constraining whatever the total RAM says", "ample needs both numbers, not one", "an unreadable number is unknown rather than constraining", "the 1GB head unit this exists for is constrained", "the boundaries fall on the documented side", "the low-RAM flag is believed when it is set", "the reading carries every input it decided from", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class DeviceMemoryProfileTest {
    
    public DeviceMemoryProfileTest() {
        super();
    }
}