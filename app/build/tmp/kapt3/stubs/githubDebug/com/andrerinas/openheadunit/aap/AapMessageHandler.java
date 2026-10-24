package com.andrerinas.openheadunit.aap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapMessageHandler;", "", "handle", "", "message", "Lcom/andrerinas/openheadunit/aap/AapMessage;", "HandleException", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
public abstract interface AapMessageHandler {
    
    @kotlin.jvm.Throws(exceptionClasses = {com.andrerinas.openheadunit.aap.AapMessageHandler.HandleException.class})
    public abstract void handle(@org.jetbrains.annotations.NotNull()
    com.andrerinas.openheadunit.aap.AapMessage message) throws com.andrerinas.openheadunit.aap.AapMessageHandler.HandleException;
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/andrerinas/openheadunit/aap/AapMessageHandler$HandleException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", "(Ljava/lang/Throwable;)V", "com.andrerinas.headunitrevived_0.3.12_githubDebug"})
    public static final class HandleException extends java.lang.Exception {
        
        public HandleException(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable cause) {
            super();
        }
    }
}