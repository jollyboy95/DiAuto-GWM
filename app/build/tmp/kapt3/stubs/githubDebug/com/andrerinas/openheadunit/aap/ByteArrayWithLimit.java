package com.andrerinas.openheadunit.aap;

/**
 * A byte array plus how much of it is meaningful.
 *
 * [data] is mutable so the SSL layer can hand out one reused buffer per session instead of one
 * allocation per message - see `AapSslContext.plaintextBuffer`. **Read [limit], never `data.size`:**
 * the array is at least as long as the payload and usually longer.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/andrerinas/openheadunit/aap/ByteArrayWithLimit;", "", "data", "", "limit", "", "([BI)V", "getData", "()[B", "setData", "([B)V", "getLimit", "()I", "setLimit", "(I)V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class ByteArrayWithLimit {
    @org.jetbrains.annotations.NotNull()
    private byte[] data;
    private int limit;
    
    public ByteArrayWithLimit(@org.jetbrains.annotations.NotNull()
    byte[] data, int limit) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    byte[] p0) {
    }
    
    public final int getLimit() {
        return 0;
    }
    
    public final void setLimit(int p0) {
    }
}