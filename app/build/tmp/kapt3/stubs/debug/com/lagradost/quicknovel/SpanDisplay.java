package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H$R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/lagradost/quicknovel/SpanDisplay;", "", "()V", "id", "", "getId", "()J", "id$delegate", "Lkotlin/Lazy;", "index", "", "getIndex", "()I", "innerIndex", "getInnerIndex", "app_debug"})
public abstract class SpanDisplay {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy id$delegate = null;
    
    public SpanDisplay() {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public abstract int getIndex();
    
    public abstract int getInnerIndex();
    
    protected abstract long id();
}