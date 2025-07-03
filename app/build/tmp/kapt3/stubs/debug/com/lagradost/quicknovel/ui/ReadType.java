package com.lagradost.quicknovel.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/lagradost/quicknovel/ui/ReadType;", "", "prefValue", "", "stringRes", "(Ljava/lang/String;III)V", "getPrefValue", "()I", "getStringRes", "NONE", "PLAN_TO_READ", "DROPPED", "COMPLETED", "ON_HOLD", "READING", "Companion", "app_debug"})
public enum ReadType {
    /*public static final*/ NONE /* = new NONE(0, 0) */,
    /*public static final*/ PLAN_TO_READ /* = new PLAN_TO_READ(0, 0) */,
    /*public static final*/ DROPPED /* = new DROPPED(0, 0) */,
    /*public static final*/ COMPLETED /* = new COMPLETED(0, 0) */,
    /*public static final*/ ON_HOLD /* = new ON_HOLD(0, 0) */,
    /*public static final*/ READING /* = new READING(0, 0) */;
    private final int prefValue = 0;
    private final int stringRes = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.ui.ReadType.Companion Companion = null;
    
    ReadType(int prefValue, @androidx.annotation.StringRes()
    int stringRes) {
    }
    
    public final int getPrefValue() {
        return 0;
    }
    
    public final int getStringRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.lagradost.quicknovel.ui.ReadType> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/lagradost/quicknovel/ui/ReadType$Companion;", "", "()V", "fromSpinner", "Lcom/lagradost/quicknovel/ui/ReadType;", "position", "", "(Ljava/lang/Integer;)Lcom/lagradost/quicknovel/ui/ReadType;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.ui.ReadType fromSpinner(@org.jetbrains.annotations.Nullable()
        java.lang.Integer position) {
            return null;
        }
    }
}