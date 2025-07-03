package com.lagradost.quicknovel.services;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0017H\u0002J\u0006\u0010\u001c\u001a\u00020\u0017J\u001a\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/lagradost/quicknovel/services/AzureTTSService;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "listener", "Lcom/lagradost/quicknovel/services/AzureTTSListener;", "getListener", "()Lcom/lagradost/quicknovel/services/AzureTTSListener;", "setListener", "(Lcom/lagradost/quicknovel/services/AzureTTSListener;)V", "speechConfig", "Lcom/microsoft/cognitiveservices/speech/SpeechConfig;", "value", "Lcom/lagradost/quicknovel/services/AzureTTSStatus;", "status", "getStatus", "()Lcom/lagradost/quicknovel/services/AzureTTSStatus;", "setStatus", "(Lcom/lagradost/quicknovel/services/AzureTTSStatus;)V", "synthesizer", "Lcom/microsoft/cognitiveservices/speech/SpeechSynthesizer;", "initialize", "", "interrupt", "isInitialized", "", "reinitialize", "release", "setVoiceAndLanguage", "voiceName", "", "locale", "Ljava/util/Locale;", "speak", "line", "Lcom/lagradost/quicknovel/TTSHelper$TTSLine;", "app_debug"})
public final class AzureTTSService {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private com.microsoft.cognitiveservices.speech.SpeechSynthesizer synthesizer;
    @org.jetbrains.annotations.NotNull()
    private final com.microsoft.cognitiveservices.speech.SpeechConfig speechConfig = null;
    @org.jetbrains.annotations.Nullable()
    private com.lagradost.quicknovel.services.AzureTTSListener listener;
    @org.jetbrains.annotations.NotNull()
    private com.lagradost.quicknovel.services.AzureTTSStatus status = com.lagradost.quicknovel.services.AzureTTSStatus.Idle;
    
    public AzureTTSService(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.lagradost.quicknovel.services.AzureTTSListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.lagradost.quicknovel.services.AzureTTSListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lagradost.quicknovel.services.AzureTTSStatus getStatus() {
        return null;
    }
    
    private final void setStatus(com.lagradost.quicknovel.services.AzureTTSStatus value) {
    }
    
    public final void initialize() {
    }
    
    public final void speak(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.TTSHelper.TTSLine line) {
    }
    
    public final void setVoiceAndLanguage(@org.jetbrains.annotations.Nullable()
    java.lang.String voiceName, @org.jetbrains.annotations.Nullable()
    java.util.Locale locale) {
    }
    
    public final void interrupt() {
    }
    
    public final void release() {
    }
    
    private final void reinitialize() {
    }
    
    public final boolean isInitialized() {
        return false;
    }
}