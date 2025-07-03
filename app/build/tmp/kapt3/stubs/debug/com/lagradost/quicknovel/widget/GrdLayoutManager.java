package com.lagradost.quicknovel.widget;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J.\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00052\n\u0010\u0017\u001a\u00060\u0018R\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0005H\u0016J*\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/lagradost/quicknovel/widget/GrdLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "context", "Landroid/content/Context;", "spanCoun", "", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "getSpanCoun", "()I", "calcOffsetToNextView", "direction", "getNextViewPos", "fromPos", "hitBorder", "", "from", "offset", "onFocusSearchFailed", "Landroid/view/View;", "focused", "focusDirection", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onInterceptFocusSearch", "onRequestChildFocus", "parent", "child", "app_debug"})
public final class GrdLayoutManager extends androidx.recyclerview.widget.GridLayoutManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final int spanCoun = 0;
    
    public GrdLayoutManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int spanCoun) {
        super(null, null, 0, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final int getSpanCoun() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onFocusSearchFailed(@org.jetbrains.annotations.NotNull()
    android.view.View focused, int focusDirection, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Recycler recycler, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onRequestChildFocus(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state, @org.jetbrains.annotations.NotNull()
    android.view.View child, @org.jetbrains.annotations.Nullable()
    android.view.View focused) {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onInterceptFocusSearch(@org.jetbrains.annotations.NotNull()
    android.view.View focused, int direction) {
        return null;
    }
    
    private final int getNextViewPos(int fromPos, int direction) {
        return 0;
    }
    
    private final int calcOffsetToNextView(int direction) {
        return 0;
    }
    
    private final boolean hitBorder(int from, int offset) {
        return false;
    }
}