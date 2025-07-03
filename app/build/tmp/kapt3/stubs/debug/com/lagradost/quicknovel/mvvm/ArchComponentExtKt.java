package com.lagradost.quicknovel.mvvm;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\b\u00f8\u0001\u0000\u001a\u001a\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\b\u00f8\u0001\u0000\u001a(\u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\b\u00f8\u0001\u0000\u001a\u001a\u0010\t\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\b\u00f8\u0001\u0000\u001a\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f\u001a!\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0005\u00a2\u0006\u0002\u0010\u0010\u001a8\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0012\"\u0004\b\u0000\u0010\u000e2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0016\u001a4\u0010\u0017\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0016\u001a\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0012\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000b\u001a\u00020\f\u001a*\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u001a\"\n\b\u0000\u0010\u000e\u0018\u0001*\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u0001H\u000eH\u0086\b\u00a2\u0006\u0002\u0010\u001c\u001a4\u0010\u001d\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0016\u001aL\u0010\u001e\u001a\u00020\u001f*\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\'\u0010%\u001a#\b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150&\u00a2\u0006\u0002\b\'\u00a2\u0006\u0002\u0010(\u001a9\u0010)\u001a\u0004\u0018\u0001H*\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010**\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u00122\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H*0\u0013\u00a2\u0006\u0002\u0010,\u001aN\u0010-\u001a\b\u0012\u0004\u0012\u0002H*0\u0012\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010**\b\u0012\u0004\u0012\u0002H\u000e0\u00122\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150&H\u0086@\u00a2\u0006\u0002\u0010.\u001aA\u0010/\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u000e*\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u0002H\u000e022!\u00103\u001a\u001d\u0012\u0013\u0012\u0011H\u000e\u00a2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00030\u0013\u001aA\u00107\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u000e*\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u0002H\u000e022!\u00103\u001a\u001d\u0012\u0013\u0012\u0011H\u000e\u00a2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00030\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u00068"}, d2 = {"DEBUG_EXCEPTION", "", "debugAssert", "", "assert", "Lkotlin/Function0;", "", "message", "debugException", "debugWarning", "logError", "throwable", "", "safe", "T", "apiCall", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "safeApiCall", "Lcom/lagradost/quicknovel/mvvm/Resource;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeAsync", "safeFail", "some", "Lcom/lagradost/quicknovel/mvvm/Some;", "value", "(Ljava/lang/Object;)Lcom/lagradost/quicknovel/mvvm/Some;", "suspendSafeApiCall", "launchSafe", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "start", "Lkotlinx/coroutines/CoroutineStart;", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "letInner", "V", "transform", "(Lcom/lagradost/quicknovel/mvvm/Resource;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "map", "(Lcom/lagradost/quicknovel/mvvm/Resource;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observe", "Landroidx/lifecycle/LifecycleOwner;", "liveData", "Landroidx/lifecycle/LiveData;", "action", "Lkotlin/ParameterName;", "name", "t", "observeNullable", "app_debug"})
public final class ArchComponentExtKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_EXCEPTION = "THIS IS A DEBUG EXCEPTION!";
    
    public static final void debugException(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> message) {
    }
    
    public static final void debugWarning(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> message) {
    }
    
    public static final void debugAssert(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> p0_1443379619, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> message) {
    }
    
    public static final void debugWarning(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> p0_1443379619, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> message) {
    }
    
    public static final <T extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner $this$observe, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> liveData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> action) {
    }
    
    public static final <T extends java.lang.Object>void observeNullable(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner $this$observeNullable, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> liveData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> action) {
    }
    
    public static final void logError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>T safe(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> apiCall) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object safeAsync(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object suspendSafeApiCall(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>com.lagradost.quicknovel.mvvm.Resource<T> safeFail(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlinx.coroutines.Job launchSafe(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope $this$launchSafe, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext context, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineStart start, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object, V extends java.lang.Object>java.lang.Object map(@org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.mvvm.Resource<? extends T> $this$map, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super V>, ? extends java.lang.Object> transform, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.mvvm.Resource<? extends V>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object, V extends java.lang.Object>V letInner(@org.jetbrains.annotations.Nullable()
    com.lagradost.quicknovel.mvvm.Resource<? extends T> $this$letInner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends V> transform) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object safeApiCall(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.mvvm.Resource<? extends T>> $completion) {
        return null;
    }
}