package com.andrerinas.openheadunit.aap;

/**
 * The table is spelled out per read site because the four sites used to answer the same way -
 * "skip this message and carry on" - and that answer is only correct for one of them.
 *
 * The case that matters is a short read of a body: it leaves an unknown number of bytes consumed,
 * so nothing downstream can find the next header. A reporter's capture measured exactly that,
 * followed by 69 `WRONG FLAG` and 63 `SSL Decrypt failed` lines in half a second.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J\b\u0010\r\u001a\u00020\u0006H\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapReadRecoveryPolicyTest;", "", "()V", "headerSize", "", "a body that timed out reports zero but consumed an unknown amount", "", "a complete read of any field continues", "a declared length inside the buffer continues, including an empty body", "a declared length outside the buffer is a desync, not a big message", "a header that never arrived took no bytes, so only the socket gives up", "a partial header cannot be resumed", "a short fragment total is fatal even though the field is four bytes", "end of stream is an ordinary disconnect at every site", "no site answers CONTINUE once bytes have gone missing", "com.andrerinas.headunitrevived_0.3.12_githubDebugUnitTest"})
public final class AapReadRecoveryPolicyTest {
    private final int headerSize = 4;
    
    public AapReadRecoveryPolicyTest() {
        super();
    }
}