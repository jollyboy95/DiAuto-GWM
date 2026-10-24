package com.andrerinas.openheadunit.aap.protocol;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/andrerinas/openheadunit/aap/protocol/Channel;", "", "()V", "ID_AU1", "", "ID_AU2", "ID_AUD", "ID_BTH", "ID_CLUSTER_INP", "ID_CLUSTER_VID", "ID_CTR", "ID_INP", "ID_MIC", "ID_MPB", "ID_NAV", "ID_NOT", "ID_NOTI", "ID_PHONE", "ID_SEN", "ID_VID", "ID_WIFI", "isAudio", "", "chan", "name", "", "channel", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public final class Channel {
    public static final int ID_CTR = 0;
    public static final int ID_SEN = 1;
    public static final int ID_VID = 2;
    public static final int ID_INP = 3;
    public static final int ID_AUD = 6;
    public static final int ID_AU1 = 4;
    public static final int ID_AU2 = 5;
    public static final int ID_MIC = 7;
    public static final int ID_BTH = 8;
    public static final int ID_MPB = 9;
    public static final int ID_NAV = 10;
    public static final int ID_NOT = 11;
    public static final int ID_NOTI = 11;
    public static final int ID_PHONE = 12;
    public static final int ID_WIFI = 13;
    
    /**
     * Video of the instrument-cluster (dashboard) display; declared only when it is enabled.
     */
    public static final int ID_CLUSTER_VID = 14;
    
    /**
     * Input of the cluster display; declared with it.
     */
    public static final int ID_CLUSTER_INP = 15;
    @org.jetbrains.annotations.NotNull()
    public static final com.andrerinas.openheadunit.aap.protocol.Channel INSTANCE = null;
    
    private Channel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String name(int channel) {
        return null;
    }
    
    public final boolean isAudio(int chan) {
        return false;
    }
}