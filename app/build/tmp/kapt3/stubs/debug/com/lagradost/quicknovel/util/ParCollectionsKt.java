package com.lagradost.quicknovel.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aN\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u00012\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0086@\u00a2\u0006\u0002\u0010\b\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u00012\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u00a2\u0006\u0002\u0010\n\u001aJ\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\r0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\f0\u0014\u00a8\u0006\u0015"}, d2 = {"amap", "", "B", "A", "f", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apmap", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "pmap", "R", "T", "", "numThreads", "", "exec", "Ljava/util/concurrent/ExecutorService;", "transform", "Lkotlin/Function1;", "app_debug"})
public final class ParCollectionsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, R extends java.lang.Object>java.util.List<R> pmap(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends T> $this$pmap, int numThreads, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.ExecutorService exec, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> transform) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <A extends java.lang.Object, B extends java.lang.Object>java.util.List<B> apmap(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends A> $this$apmap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> f) {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.DelicateCoroutinesApi.class})
    @org.jetbrains.annotations.Nullable()
    public static final <A extends java.lang.Object, B extends java.lang.Object>java.lang.Object amap(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends A> $this$amap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> f, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends B>> $completion) {
        return null;
    }
}