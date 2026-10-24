package com.andrerinas.openheadunit.aap;

/**
 * Decides, for each way a read can come up short, whether the byte stream can still be framed.
 *
 * AAP over a socket is a continuous byte stream with no resynchronisation mechanism: a message is
 * found only by having read exactly the bytes of every message before it. So the question after a
 * failed read is not "was this message important" but "do we still know where the next one starts".
 *
 * Every one of these sites used to answer "carry on" ([Outcome.CONTINUE]) - which reads as the
 * conservative choice and is the opposite. Measured on a reporter's capture: a body read that timed
 * out at 12:12:42 was followed within four seconds by 69 `WRONG FLAG` lines with channel numbers
 * like -120 and flags like 0xffffffc7, and 63 `SSL Decrypt failed / Unable to parse TLS packet
 * header`, until the socket finally closed. Nothing after that point was ever going to decode. A
 * reconnect costs seconds; carrying on costs the session.
 *
 * The sibling reader already knows this. `AapReadMultipleMessages` keeps its unread bytes in a FIFO
 * and rewinds with `mark()`/`reset()` rather than skipping, and says why in a comment: *"Do NOT
 * clear the FIFO because USB/TCP is reliable and no bytes were lost. Discarding FIFO would
 * desynchronize the stream."* The socket reader had no equivalent, and the socket path is the one
 * every wireless user is on.
 *
 * ### Why a short read means an *unknown* number of bytes were consumed
 *
 * `SocketAccessoryConnection.recvBlocking` calls `DataInputStream.readFully` and returns `0` from
 * its `SocketTimeoutException` catch. `readFully` loops internally until the buffer is full, so a
 * timeout partway through an 8 KB body has already taken an unknown number of bytes off the socket.
 * The `0` is the catch block's value, not a count. That is why [afterBodyRead] cannot subtract and
 * resume: there is no number to subtract.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u001e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapReadRecoveryPolicy;", "", "()V", "END_OF_STREAM", "", "NOTHING_READ", "afterBodyRead", "Lcom/andrerinas/openheadunit/aap/AapReadRecoveryPolicy$Outcome;", "bytesRead", "expected", "afterDeclaredLength", "declaredLength", "bufferCapacity", "afterFragmentTotalRead", "afterHeaderRead", "isSocketTransport", "", "Outcome", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class AapReadRecoveryPolicy {
    
    /**
     * Return value of a read that hit end of stream.
     */
    public static final int END_OF_STREAM = -1;
    
    /**
     * Return value of a read that timed out having taken nothing.
     */
    public static final int NOTHING_READ = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.AapReadRecoveryPolicy INSTANCE = null;
    
    private AapReadRecoveryPolicy() {
        super();
    }
    
    /**
     * The fixed-size message header.
     *
     * [isSocketTransport] separates the two transports' idle rules rather than their alignment
     * rules: USB tolerates a quiet bus and keeps polling, a socket does not.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.AapReadRecoveryPolicy.Outcome afterHeaderRead(int bytesRead, int expected, boolean isSocketTransport) {
        return null;
    }
    
    /**
     * The 4-byte total that accompanies a first fragment.
     *
     * Short here is as bad as short anywhere else even though the field is tiny: the header before
     * it is already gone, so continuing would read the body as though it were the next header.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.AapReadRecoveryPolicy.Outcome afterFragmentTotalRead(int bytesRead, int expected) {
        return null;
    }
    
    /**
     * The length the header declared, before any of the body has been read.
     *
     * A length outside the buffer is nearly always a symptom of a desync that already happened -
     * garbage bytes read as a header - rather than a real message we cannot hold. Either way the
     * body cannot be consumed, so the alignment is lost from here on and skipping compounds it.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.AapReadRecoveryPolicy.Outcome afterDeclaredLength(int declaredLength, int bufferCapacity) {
        return null;
    }
    
    /**
     * The message body. See the class KDoc for why a short read here is unrecoverable.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.andrerinas.openheadunit.aap.AapReadRecoveryPolicy.Outcome afterBodyRead(int bytesRead, int expected) {
        return null;
    }
    
    /**
     * What the reader should do next.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapReadRecoveryPolicy$Outcome;", "", "(Ljava/lang/String;I)V", "CONTINUE", "DISCONNECT_EOF", "DISCONNECT_IDLE", "DISCONNECT_DESYNC", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static enum Outcome {
        /*public static final*/ CONTINUE /* = new CONTINUE() */,
        /*public static final*/ DISCONNECT_EOF /* = new DISCONNECT_EOF() */,
        /*public static final*/ DISCONNECT_IDLE /* = new DISCONNECT_IDLE() */,
        /*public static final*/ DISCONNECT_DESYNC /* = new DISCONNECT_DESYNC() */;
        
        Outcome() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.andrerinas.openheadunit.aap.AapReadRecoveryPolicy.Outcome> getEntries() {
            return null;
        }
    }
}