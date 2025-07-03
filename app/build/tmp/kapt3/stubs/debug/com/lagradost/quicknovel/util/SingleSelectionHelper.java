package com.lagradost.quicknovel.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JR\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0011Jn\u0010\u0012\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0004\u0012\u00020\u00040\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fJR\u0010\u0012\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0011JV\u0010\u0016\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0004\u0012\u00020\u00040\u0011\u00a8\u0006\u0017"}, d2 = {"Lcom/lagradost/quicknovel/util/SingleSelectionHelper;", "", "()V", "showBottomDialog", "", "Landroid/content/Context;", "items", "", "", "selectedIndex", "", "name", "showApply", "", "dismissCallback", "Lkotlin/Function0;", "callback", "Lkotlin/Function1;", "showDialog", "dialog", "Landroid/app/Dialog;", "isMultiSelect", "showMultiDialog", "app_debug"})
public final class SingleSelectionHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.util.SingleSelectionHelper INSTANCE = null;
    
    private SingleSelectionHelper() {
        super();
    }
    
    public final void showDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showDialog, @org.jetbrains.annotations.NotNull()
    android.app.Dialog dialog, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> items, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> selectedIndex, @org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean showApply, boolean isMultiSelect, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<java.lang.Integer>, kotlin.Unit> callback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> dismissCallback) {
    }
    
    public final void showMultiDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showMultiDialog, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> items, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> selectedIndex, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> dismissCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<java.lang.Integer>, kotlin.Unit> callback) {
    }
    
    public final void showDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showDialog, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> items, int selectedIndex, @org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean showApply, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> dismissCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    /**
     * Only for a low amount of items
     */
    public final void showBottomDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showBottomDialog, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> items, int selectedIndex, @org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean showApply, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> dismissCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
}