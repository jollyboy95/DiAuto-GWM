package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\b\u0010\u000f\u001a\u00020\u0004H\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0007J\b\u0010\u0011\u001a\u00020\u0004H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\b\u0010\u0013\u001a\u00020\u0004H\u0007J\b\u0010\u0014\u001a\u00020\u0004H\u0007J\b\u0010\u0015\u001a\u00020\u0004H\u0007J\b\u0010\u0016\u001a\u00020\u0004H\u0007J\b\u0010\u0017\u001a\u00020\u0004H\u0007J\b\u0010\u0018\u001a\u00020\u0004H\u0007J\b\u0010\u0019\u001a\u00020\u0004H\u0007J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002\u00a2\u0006\u0002\u0010\u001fJ\u0012\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#H\u0002J\u0012\u0010$\u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020\u0004H\u0007J\b\u0010&\u001a\u00020\u0004H\u0007J\b\u0010\'\u001a\u00020\u0004H\u0007J\b\u0010(\u001a\u00020\u0004H\u0007\u00a8\u0006)"}, d2 = {"Lcom/andrerinas/openheadunit/aap/WppHandshakeSessionTest;", "", "()V", "a failed session cannot be revived by a late success", "", "a failed start response is treated the same way while settling", "a finished session ignores everything, repeatedly", "a phone reporting it could not join fails fast and lets the poke resume", "a phone still joining buys itself more time", "a phone that answered something is not recorded as silent", "a phone that asks for credentials early is answered as soon as they exist", "a phone that asks for credentials twice gets them twice", "a phone that ignores type 4 does not fail the handshake, it just carries on", "a phone that never asks for credentials fails, and is recorded as silent", "a ping is echoed in every live stage and never changes the stage", "a start response we could not parse is never read as a failure", "a successful start response is informational in both stages it can arrive in", "an early type 2 during the credentials wait is latched too", "an inbound ping response is a keepalive and is ignored", "credentials arriving mid-version-exchange do not jump the queue", "credentials held across the version timeout are sent when it expires", "credentials that never arrive fail the handshake", "each stage carries the deadline the caller should hold it to", "every message the phone sends is counted, whatever it was", "extensions stop at the cap so a phone that never arrives cannot hold us forever", "message types we do not model are ignored rather than fatal", "msg", "Lcom/andrerinas/openheadunit/aap/WppEvent$MessageReceived;", "type", "", "status", "(ILjava/lang/Integer;)Lcom/andrerinas/openheadunit/aap/WppEvent$MessageReceived;", "session", "Lcom/andrerinas/openheadunit/aap/WppHandshakeSession;", "versionExchange", "", "settledSession", "the projection session landing completes the handshake", "the settle timeout resumes the poke and leaves the listeners alone", "with the version exchange off the wire behaviour is the one that shipped", "with the version exchange on, type 4 goes out before anything else", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class WppHandshakeSessionTest {
    
    public WppHandshakeSessionTest() {
        super();
    }
    
    private final com.andrerinas.openheadunit.aap.WppHandshakeSession session(boolean versionExchange) {
        return null;
    }
    
    private final com.andrerinas.openheadunit.aap.WppEvent.MessageReceived msg(int type, java.lang.Integer status) {
        return null;
    }
    
    /**
     * Drives a session to [WppStage.SETTLING] the ordinary way and returns it.
     */
    private final com.andrerinas.openheadunit.aap.WppHandshakeSession settledSession(boolean versionExchange) {
        return null;
    }
}