package com.lagradost.quicknovel.ui.roundedbg;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0012\u0010\u0007\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0012\u0010\b\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0012\u0010\t\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"DEFAULT_LINESPACING_EXTRA", "", "DEFAULT_LINESPACING_MULTIPLIER", "getLineBottomWithoutPadding", "", "Landroid/text/Layout;", "line", "getLineBottomWithoutSpacing", "getLineHeight", "getLineTopWithoutPadding", "app_debug"})
public final class LayoutExtensionsKt {
    
    /**
     * Android system default line spacing extra
     */
    private static final float DEFAULT_LINESPACING_EXTRA = 0.0F;
    
    /**
     * Android system default line spacing multiplier
     */
    private static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0F;
    
    /**
     * Get the line bottom discarding the line spacing added.
     */
    public static final int getLineBottomWithoutSpacing(@org.jetbrains.annotations.NotNull()
    android.text.Layout $this$getLineBottomWithoutSpacing, int line) {
        return 0;
    }
    
    /**
     * Get the line height of a line.
     */
    public static final int getLineHeight(@org.jetbrains.annotations.NotNull()
    android.text.Layout $this$getLineHeight, int line) {
        return 0;
    }
    
    /**
     * Returns the top of the Layout after removing the extra padding applied by  the Layout.
     */
    public static final int getLineTopWithoutPadding(@org.jetbrains.annotations.NotNull()
    android.text.Layout $this$getLineTopWithoutPadding, int line) {
        return 0;
    }
    
    /**
     * Returns the bottom of the Layout after removing the extra padding applied by the Layout.
     */
    public static final int getLineBottomWithoutPadding(@org.jetbrains.annotations.NotNull()
    android.text.Layout $this$getLineBottomWithoutPadding, int line) {
        return 0;
    }
}