package com.lagradost.quicknovel.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001 B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/lagradost/quicknovel/util/SubtitleHelper;", "", "()V", "ISO_639_1Map", "Ljava/util/HashMap;", "", "asciiOffset", "", "flagOffset", "flagRegex", "Lkotlin/text/Regex;", "flags", "", "languages", "", "Lcom/lagradost/quicknovel/util/SubtitleHelper$Language639;", "getLanguages", "()Ljava/util/List;", "offset", "fromLanguageToThreeLetters", "input", "fromLanguageToTwoLetters", "looseCheck", "", "fromThreeLettersToLanguage", "fromTwoLettersToLanguage", "getFlagFromIso", "inp", "getFlagFromIsoShort", "flagAscii", "initISO6391Map", "", "Language639", "app_debug"})
public final class SubtitleHelper {
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.lang.String, java.lang.String> ISO_639_1Map;
    private static final int flagOffset = 127462;
    private static final int asciiOffset = 65;
    private static final int offset = 127397;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.text.Regex flagRegex = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, java.lang.String> flags = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.lagradost.quicknovel.util.SubtitleHelper.Language639> languages = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.util.SubtitleHelper INSTANCE = null;
    
    private SubtitleHelper() {
        super();
    }
    
    /**
     * lang -> ISO_639_1
     * @param looseCheck will use .contains in addition to .equals
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromLanguageToTwoLetters(@org.jetbrains.annotations.NotNull()
    java.lang.String input, boolean looseCheck) {
        return null;
    }
    
    private final void initISO6391Map() {
    }
    
    /**
     * ISO_639_1 -> lang
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromTwoLettersToLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return null;
    }
    
    /**
     * ISO_639_2_B or ISO_639_2_T or ISO_639_3-> lang
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromThreeLettersToLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return null;
    }
    
    /**
     * lang -> ISO_639_2_T
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromLanguageToThreeLetters(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFlagFromIso(@org.jetbrains.annotations.Nullable()
    java.lang.String inp) {
        return null;
    }
    
    private final java.lang.String getFlagFromIsoShort(java.lang.String flagAscii) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.lagradost.quicknovel.util.SubtitleHelper.Language639> getLanguages() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/lagradost/quicknovel/util/SubtitleHelper$Language639;", "", "languageName", "", "nativeName", "ISO_639_1", "ISO_639_2_T", "ISO_639_2_B", "ISO_639_3", "ISO_639_6", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getISO_639_1", "()Ljava/lang/String;", "getISO_639_2_B", "getISO_639_2_T", "getISO_639_3", "getISO_639_6", "getLanguageName", "getNativeName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Language639 {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String languageName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String nativeName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ISO_639_1 = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ISO_639_2_T = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ISO_639_2_B = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ISO_639_3 = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ISO_639_6 = null;
        
        public Language639(@org.jetbrains.annotations.NotNull()
        java.lang.String languageName, @org.jetbrains.annotations.NotNull()
        java.lang.String nativeName, @org.jetbrains.annotations.NotNull()
        java.lang.String ISO_639_1, @org.jetbrains.annotations.NotNull()
        java.lang.String ISO_639_2_T, @org.jetbrains.annotations.NotNull()
        java.lang.String ISO_639_2_B, @org.jetbrains.annotations.NotNull()
        java.lang.String ISO_639_3, @org.jetbrains.annotations.NotNull()
        java.lang.String ISO_639_6) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLanguageName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNativeName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getISO_639_1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getISO_639_2_T() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getISO_639_2_B() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getISO_639_3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getISO_639_6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.util.SubtitleHelper.Language639 copy(@org.jetbrains.annotations.NotNull()
        java.lang.String languageName, @org.jetbrains.annotations.NotNull()
        java.lang.String nativeName, @org.jetbrains.annotations.NotNull()
        java.lang.String ISO_639_1, @org.jetbrains.annotations.NotNull()
        java.lang.String ISO_639_2_T, @org.jetbrains.annotations.NotNull()
        java.lang.String ISO_639_2_B, @org.jetbrains.annotations.NotNull()
        java.lang.String ISO_639_3, @org.jetbrains.annotations.NotNull()
        java.lang.String ISO_639_6) {
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
}