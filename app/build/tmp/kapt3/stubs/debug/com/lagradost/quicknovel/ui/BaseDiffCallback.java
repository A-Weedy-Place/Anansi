package com.lagradost.quicknovel.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B=\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0012R#\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/lagradost/quicknovel/ui/BaseDiffCallback;", "T", "", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "itemSame", "Lkotlin/Function2;", "", "contentSame", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getContentSame", "()Lkotlin/jvm/functions/Function2;", "getItemSame", "areContentsTheSame", "oldItem", "newItem", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areItemsTheSame", "getChangePayload", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "app_debug"})
public final class BaseDiffCallback<T extends java.lang.Object> extends androidx.recyclerview.widget.DiffUtil.ItemCallback<T> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<T, T, java.lang.Boolean> itemSame = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<T, T, java.lang.Boolean> contentSame = null;
    
    public BaseDiffCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> itemSame, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> contentSame) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<T, T, java.lang.Boolean> getItemSame() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<T, T, java.lang.Boolean> getContentSame() {
        return null;
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    T oldItem, @org.jetbrains.annotations.NotNull()
    T newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    T oldItem, @org.jetbrains.annotations.NotNull()
    T newItem) {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Object getChangePayload(@org.jetbrains.annotations.NotNull()
    T oldItem, @org.jetbrains.annotations.NotNull()
    T newItem) {
        return null;
    }
    
    public BaseDiffCallback() {
        super();
    }
}