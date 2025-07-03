package com.lagradost.quicknovel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003 !\"B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J(\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J&\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0016\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017J&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00190\rj\b\u0012\u0004\u0012\u00020\u0019`\u000f2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0005J.\u0010\u001b\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u0005\u00a8\u0006#"}, d2 = {"Lcom/lagradost/quicknovel/TTSHelper;", "", "()V", "getNewLineLocations", "Ljava/util/Stack;", "", "unsegmented", "Landroid/text/Spanned;", "isValidSpeakOutMsg", "", "msg", "", "parseSpan", "Ljava/util/ArrayList;", "Lcom/lagradost/quicknovel/TextSpan;", "Lkotlin/collections/ArrayList;", "index", "parseTextToSpans", "render", "preParseHtml", "text", "html", "markwon", "Lio/noties/markwon/Markwon;", "ttsParseText", "Lcom/lagradost/quicknovel/TTSHelper$TTSLine;", "tag", "replaceAfterIndex", "oldValue", "newValue", "ignoreCase", "startIndex", "TTSActionType", "TTSLine", "TTSStatus", "app_debug"})
public final class TTSHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.TTSHelper INSTANCE = null;
    
    private TTSHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String replaceAfterIndex(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$replaceAfterIndex, @org.jetbrains.annotations.NotNull()
    java.lang.String oldValue, @org.jetbrains.annotations.NotNull()
    java.lang.String newValue, boolean ignoreCase, int startIndex) {
        return null;
    }
    
    private final java.util.ArrayList<com.lagradost.quicknovel.TextSpan> parseSpan(android.text.Spanned unsegmented, int index) {
        return null;
    }
    
    private final java.util.Stack<java.lang.Integer> getNewLineLocations(android.text.Spanned unsegmented) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String preParseHtml(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.Spanned render(@org.jetbrains.annotations.NotNull()
    java.lang.String html, @org.jetbrains.annotations.NotNull()
    io.noties.markwon.Markwon markwon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.lagradost.quicknovel.TextSpan> parseTextToSpans(@org.jetbrains.annotations.NotNull()
    android.text.Spanned render, int index) {
        return null;
    }
    
    private final boolean isValidSpeakOutMsg(java.lang.String msg) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.lagradost.quicknovel.TTSHelper.TTSLine> ttsParseText(@org.jetbrains.annotations.NotNull()
    java.lang.String text, int tag) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/lagradost/quicknovel/TTSHelper$TTSActionType;", "", "(Ljava/lang/String;I)V", "Pause", "Resume", "Stop", "Next", "app_debug"})
    public static enum TTSActionType {
        /*public static final*/ Pause /* = new Pause() */,
        /*public static final*/ Resume /* = new Resume() */,
        /*public static final*/ Stop /* = new Stop() */,
        /*public static final*/ Next /* = new Next() */;
        
        TTSActionType() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.lagradost.quicknovel.TTSHelper.TTSActionType> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/lagradost/quicknovel/TTSHelper$TTSLine;", "", "speakOutMsg", "", "startChar", "", "endChar", "index", "(Ljava/lang/String;III)V", "getEndChar", "()I", "getIndex", "getSpeakOutMsg", "()Ljava/lang/String;", "getStartChar", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class TTSLine {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String speakOutMsg = null;
        private final int startChar = 0;
        private final int endChar = 0;
        private final int index = 0;
        
        public TTSLine(@org.jetbrains.annotations.NotNull()
        java.lang.String speakOutMsg, int startChar, int endChar, int index) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSpeakOutMsg() {
            return null;
        }
        
        public final int getStartChar() {
            return 0;
        }
        
        public final int getEndChar() {
            return 0;
        }
        
        public final int getIndex() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.TTSHelper.TTSLine copy(@org.jetbrains.annotations.NotNull()
        java.lang.String speakOutMsg, int startChar, int endChar, int index) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/lagradost/quicknovel/TTSHelper$TTSStatus;", "", "(Ljava/lang/String;I)V", "IsRunning", "IsPaused", "IsStopped", "app_debug"})
    public static enum TTSStatus {
        /*public static final*/ IsRunning /* = new IsRunning() */,
        /*public static final*/ IsPaused /* = new IsPaused() */,
        /*public static final*/ IsStopped /* = new IsStopped() */;
        
        TTSStatus() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.lagradost.quicknovel.TTSHelper.TTSStatus> getEntries() {
            return null;
        }
    }
}