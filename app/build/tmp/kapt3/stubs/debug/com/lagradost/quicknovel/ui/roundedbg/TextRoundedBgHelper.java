package com.lagradost.quicknovel.ui.roundedbg;

/**
 * Helper class to draw multi-line rounded background to certain parts of a text. The start/end
 * positions of the backgrounds are annotated with [android.text.Annotation] class. Each annotation
 * should have the annotation key set to **rounded**.
 *
 * i.e.:
 * ```
 *   <!--without the quotes at the begining and end Android strips the whitespace and also starts
 *       the annotation at the wrong position-->
 *   <string name="ltr">"this is <annotation key="rounded">a regular</annotation> paragraph."</string>
 * ```
 *
 * **Note:** BiDi text is not supported.
 *
 * @param horizontalPadding the padding to be applied to left & right of the background
 * @param verticalPadding the padding to be applied to top & bottom of the background
 * @param drawable the drawable used to draw the background
 * @param drawableLeft the drawable used to draw left edge of the background
 * @param drawableMid the drawable used to draw for whole line
 * @param drawableRight the drawable used to draw right edge of the background
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/lagradost/quicknovel/ui/roundedbg/TextRoundedBgHelper;", "", "horizontalPadding", "", "verticalPadding", "drawable", "Landroid/graphics/drawable/Drawable;", "drawableLeft", "drawableMid", "drawableRight", "(IILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "getHorizontalPadding", "()I", "multiLineRenderer", "Lcom/lagradost/quicknovel/ui/roundedbg/TextRoundedBgRenderer;", "getMultiLineRenderer", "()Lcom/lagradost/quicknovel/ui/roundedbg/TextRoundedBgRenderer;", "multiLineRenderer$delegate", "Lkotlin/Lazy;", "singleLineRenderer", "getSingleLineRenderer", "singleLineRenderer$delegate", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "Landroid/text/Spanned;", "layout", "Landroid/text/Layout;", "app_debug"})
public final class TextRoundedBgHelper {
    private final int horizontalPadding = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy singleLineRenderer$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy multiLineRenderer$delegate = null;
    
    public TextRoundedBgHelper(int horizontalPadding, int verticalPadding, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawable, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawableLeft, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawableMid, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawableRight) {
        super();
    }
    
    public final int getHorizontalPadding() {
        return 0;
    }
    
    private final com.lagradost.quicknovel.ui.roundedbg.TextRoundedBgRenderer getSingleLineRenderer() {
        return null;
    }
    
    private final com.lagradost.quicknovel.ui.roundedbg.TextRoundedBgRenderer getMultiLineRenderer() {
        return null;
    }
    
    /**
     * Call this function during onDraw of another widget such as TextView.
     *
     * @param canvas Canvas to draw onto
     * @param text
     * @param layout Layout that contains the text
     */
    public final void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    android.text.Spanned text, @org.jetbrains.annotations.NotNull()
    android.text.Layout layout) {
    }
}