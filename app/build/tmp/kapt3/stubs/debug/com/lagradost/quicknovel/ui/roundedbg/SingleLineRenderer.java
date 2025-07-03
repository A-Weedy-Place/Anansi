package com.lagradost.quicknovel.ui.roundedbg;

/**
 * Draws the background for text that starts and ends on the same line.
 *
 * @param horizontalPadding the padding to be applied to left & right of the background
 * @param verticalPadding the padding to be applied to top & bottom of the background
 * @param drawable the drawable used to draw the background
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J8\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/lagradost/quicknovel/ui/roundedbg/SingleLineRenderer;", "Lcom/lagradost/quicknovel/ui/roundedbg/TextRoundedBgRenderer;", "horizontalPadding", "", "verticalPadding", "drawable", "Landroid/graphics/drawable/Drawable;", "(IILandroid/graphics/drawable/Drawable;)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "layout", "Landroid/text/Layout;", "startLine", "endLine", "startOffset", "endOffset", "app_debug"})
public final class SingleLineRenderer extends com.lagradost.quicknovel.ui.roundedbg.TextRoundedBgRenderer {
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.drawable.Drawable drawable = null;
    
    public SingleLineRenderer(int horizontalPadding, int verticalPadding, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawable) {
        super(0, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable getDrawable() {
        return null;
    }
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    android.text.Layout layout, int startLine, int endLine, int startOffset, int endOffset) {
    }
}