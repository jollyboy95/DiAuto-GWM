package com.andrerinas.openheadunit.aap;

/**
 * When to tell the user that the link cannot carry the video stream they have asked for.
 *
 * The failure this exists to name, measured 2026-08-05 on a head unit hotspot: over a 2.4 GHz
 * access point at 1080p/60 the phone completed the Bluetooth handshake, joined the network, opened
 * the AAP session and the video channel — and then closed the socket 0.04–4.2 s later, having sent
 * **not one video frame**. Thirty-two times in under five minutes, each cycle looking like a fresh,
 * healthy connection right up to the moment it ended. On the same access point, same band, same
 * everything, an 800x480/30 stream held for as long as it was watched; and at 1080p/60 on 5 GHz it
 * held too. So this is a throughput ceiling, not a broken route — and the phone's own reason
 * (`GAL_SOCKET_CONNECTION_FAILED`) never reaches our log.
 *
 * We cannot read the band an access point is running on: `SoftApInfo`'s frequency needs
 * NETWORK_SETTINGS, which no ordinary app holds. What we can see is the shape — a session that
 * reached SSL and then died having rendered nothing, over and over. That is specific enough to act
 * on, and nothing else produces it: a phone that never joins never gets this far, and a decoder
 * that cannot handle the codec renders nothing but does not take the socket down with it.
 *
 * Deliberately a streak rather than a single occurrence. One starved session is ordinary — a phone
 * being unplugged mid-bring-up looks exactly like this once — and advice given on the strength of
 * one is advice that will sometimes be wrong.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/andrerinas/openheadunit/aap/VideoStarvationPolicy;", "", "()V", "ADVISE_AFTER_STARVED_SESSIONS", "", "nextStreak", "current", "reachedHandshake", "", "renderedAnyFrame", "shouldAdvise", "consecutiveStarvedSessions", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class VideoStarvationPolicy {
    
    /**
     * How many sessions in a row must end without a frame before the advice is worth giving.
     */
    public static final int ADVISE_AFTER_STARVED_SESSIONS = 3;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.VideoStarvationPolicy INSTANCE = null;
    
    private VideoStarvationPolicy() {
        super();
    }
    
    /**
     * Whether the session that just ended should produce the advice, given how many have now ended
     * in a row without rendering a frame.
     *
     * True on exactly the [ADVISE_AFTER_STARVED_SESSIONS]th, never after: the reconnect loop this
     * fires inside runs every few seconds, and a line repeated thirty times is one a reader learns
     * to scroll past. Say it once, and let the streak keep counting for anyone reading the numbers.
     */
    public final boolean shouldAdvise(int consecutiveStarvedSessions) {
        return false;
    }
    
    /**
     * The streak after a session that [reachedHandshake] and rendered frames or not.
     *
     * A session that never reached the handshake is not counted either way — it never had a chance
     * to carry video, so it neither proves starvation nor clears a run of it.
     */
    public final int nextStreak(int current, boolean reachedHandshake, boolean renderedAnyFrame) {
        return 0;
    }
}