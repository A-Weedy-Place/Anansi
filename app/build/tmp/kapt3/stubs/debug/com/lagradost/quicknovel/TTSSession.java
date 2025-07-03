package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0006\u0010!\u001a\u00020\u001aJ\u0006\u0010\"\u001a\u00020\u001aJ\u0010\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010%J0\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070+H\u0086@\u00a2\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020\u0007J\u0006\u0010.\u001a\u00020\u001aJ4\u0010/\u001a\u00020\u001a2\b\u00100\u001a\u0004\u0018\u00010\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070+2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a0+H\u0086@\u00a2\u0006\u0002\u00102R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/lagradost/quicknovel/TTSSession;", "Lcom/lagradost/quicknovel/services/AzureTTSListener;", "context", "Landroid/content/Context;", "event", "Lkotlin/Function1;", "Lcom/lagradost/quicknovel/TTSHelper$TTSActionType;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "azureTTSLineCompletedId", "", "azureTTSLineId", "azureTts", "Lcom/lagradost/quicknovel/services/AzureTTSService;", "getContext", "()Landroid/content/Context;", "focusRequest", "Landroid/media/AudioFocusRequest;", "intentFilter", "Landroid/content/IntentFilter;", "isRegistered", "myAudioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "myNoisyAudioStreamReceiver", "Lcom/lagradost/quicknovel/receivers/BecomingNoisyReceiver;", "interruptTTS", "", "onError", "error", "", "onStatusChanged", "status", "Lcom/lagradost/quicknovel/services/AzureTTSStatus;", "register", "release", "setVoice", "voice", "Landroid/speech/tts/Voice;", "speak", "line", "Lcom/lagradost/quicknovel/TTSHelper$TTSLine;", "next", "action", "Lkotlin/Function0;", "(Lcom/lagradost/quicknovel/TTSHelper$TTSLine;Lcom/lagradost/quicknovel/TTSHelper$TTSLine;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ttsInitialized", "unregister", "waitForOr", "id", "then", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TTSSession implements com.lagradost.quicknovel.services.AzureTTSListener {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.IntentFilter intentFilter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.receivers.BecomingNoisyReceiver myNoisyAudioStreamReceiver = null;
    @org.jetbrains.annotations.Nullable()
    private android.media.AudioFocusRequest focusRequest;
    @org.jetbrains.annotations.NotNull()
    private final android.media.AudioManager.OnAudioFocusChangeListener myAudioFocusListener = null;
    private boolean isRegistered = false;
    @org.jetbrains.annotations.NotNull()
    private final com.lagradost.quicknovel.services.AzureTTSService azureTts = null;
    private int azureTTSLineId = 0;
    private int azureTTSLineCompletedId = 0;
    
    public TTSSession(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.lagradost.quicknovel.TTSHelper.TTSActionType, java.lang.Boolean> event) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public void onStatusChanged(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.services.AzureTTSStatus status) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    public final void setVoice(@org.jetbrains.annotations.Nullable()
    android.speech.tts.Voice voice) {
    }
    
    public final void interruptTTS() {
    }
    
    public final boolean ttsInitialized() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object speak(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.TTSHelper.TTSLine line, @org.jetbrains.annotations.Nullable()
    com.lagradost.quicknovel.TTSHelper.TTSLine next, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> action, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object waitForOr(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> action, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> then, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void register() {
    }
    
    public final void release() {
    }
    
    public final void unregister() {
    }
}