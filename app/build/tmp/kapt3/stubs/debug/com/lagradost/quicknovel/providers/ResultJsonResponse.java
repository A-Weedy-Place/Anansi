package com.lagradost.quicknovel.providers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0013\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0016"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse;", "", "()V", "Data", "Data2", "Data3", "LastChapter", "Name", "PageProps", "Props", "Query", "Ranks", "Raw", "Raw2", "Raw3", "Raw4", "Recommendation", "Root", "Serie", "SerieData", "Series", "Tag", "app_debug"})
public final class ResultJsonResponse {
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.providers.ResultJsonResponse INSTANCE = null;
    
    private ResultJsonResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Data;", "", "title", "", "author", "description", "fromUser", "raw", "Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Raw;", "image", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Raw;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getDescription", "getFromUser", "getImage", "getRaw", "()Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Raw;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Data {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String author = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fromUser = null;
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.providers.ResultJsonResponse.Raw raw = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String image = null;
        
        public Data(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @com.fasterxml.jackson.annotation.JsonProperty(value = "from_user")
        @org.jetbrains.annotations.NotNull()
        java.lang.String fromUser, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Raw raw, @org.jetbrains.annotations.NotNull()
        java.lang.String image) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFromUser() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Raw getRaw() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImage() {
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
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Raw component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Data copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @com.fasterxml.jackson.annotation.JsonProperty(value = "from_user")
        @org.jetbrains.annotations.NotNull()
        java.lang.String fromUser, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Raw raw, @org.jetbrains.annotations.NotNull()
        java.lang.String image) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Data2;", "", "title", "", "author", "description", "fromUser", "raw", "Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Raw2;", "image", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Raw2;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getDescription", "getFromUser", "getImage", "getRaw", "()Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Raw2;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Data2 {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String author = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String fromUser = null;
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.providers.ResultJsonResponse.Raw2 raw = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String image = null;
        
        public Data2(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @com.fasterxml.jackson.annotation.JsonProperty(value = "from_user")
        @org.jetbrains.annotations.Nullable()
        java.lang.String fromUser, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Raw2 raw, @org.jetbrains.annotations.NotNull()
        java.lang.String image) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFromUser() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Raw2 getRaw() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImage() {
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Raw2 component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Data2 copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @com.fasterxml.jackson.annotation.JsonProperty(value = "from_user")
        @org.jetbrains.annotations.Nullable()
        java.lang.String fromUser, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Raw2 raw, @org.jetbrains.annotations.NotNull()
        java.lang.String image) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Data3;", "", "title", "", "author", "description", "fromUser", "raw", "Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Raw4;", "image", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Raw4;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getDescription", "getFromUser", "getImage", "getRaw", "()Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Raw4;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Data3 {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String author = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fromUser = null;
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.providers.ResultJsonResponse.Raw4 raw = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String image = null;
        
        public Data3(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @com.fasterxml.jackson.annotation.JsonProperty(value = "from_user")
        @org.jetbrains.annotations.NotNull()
        java.lang.String fromUser, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Raw4 raw, @org.jetbrains.annotations.NotNull()
        java.lang.String image) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFromUser() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Raw4 getRaw() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImage() {
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
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Raw4 component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Data3 copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @com.fasterxml.jackson.annotation.JsonProperty(value = "from_user")
        @org.jetbrains.annotations.NotNull()
        java.lang.String fromUser, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Raw4 raw, @org.jetbrains.annotations.NotNull()
        java.lang.String image) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$LastChapter;", "", "order", "", "title", "", "updatedAt", "(JLjava/lang/String;Ljava/lang/String;)V", "getOrder", "()J", "getTitle", "()Ljava/lang/String;", "getUpdatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class LastChapter {
        private final long order = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String updatedAt = null;
        
        public LastChapter(long order, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @com.fasterxml.jackson.annotation.JsonProperty(value = "updated_at")
        @org.jetbrains.annotations.Nullable()
        java.lang.String updatedAt) {
            super();
        }
        
        public final long getOrder() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUpdatedAt() {
            return null;
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.LastChapter copy(long order, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @com.fasterxml.jackson.annotation.JsonProperty(value = "updated_at")
        @org.jetbrains.annotations.Nullable()
        java.lang.String updatedAt) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Name;", "", "title", "", "rawTitle", "(Ljava/lang/String;Ljava/lang/String;)V", "getRawTitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Name {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String rawTitle = null;
        
        public Name(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @com.fasterxml.jackson.annotation.JsonProperty(value = "raw_title")
        @org.jetbrains.annotations.NotNull()
        java.lang.String rawTitle) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRawTitle() {
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
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Name copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @com.fasterxml.jackson.annotation.JsonProperty(value = "raw_title")
        @org.jetbrains.annotations.NotNull()
        java.lang.String rawTitle) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$PageProps;", "", "serie", "Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Serie;", "(Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Serie;)V", "getSerie", "()Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Serie;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class PageProps {
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.providers.ResultJsonResponse.Serie serie = null;
        
        public PageProps(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Serie serie) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Serie getSerie() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Serie component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.PageProps copy(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Serie serie) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Props;", "", "pageProps", "Lcom/lagradost/quicknovel/providers/ResultJsonResponse$PageProps;", "(Lcom/lagradost/quicknovel/providers/ResultJsonResponse$PageProps;)V", "getPageProps", "()Lcom/lagradost/quicknovel/providers/ResultJsonResponse$PageProps;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Props {
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.providers.ResultJsonResponse.PageProps pageProps = null;
        
        public Props(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.PageProps pageProps) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.PageProps getPageProps() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.PageProps component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Props copy(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.PageProps pageProps) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Query;", "", "sid", "", "serieSlug", "(Ljava/lang/String;Ljava/lang/String;)V", "getSerieSlug", "()Ljava/lang/String;", "getSid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Query {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String sid = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serieSlug = null;
        
        public Query(@org.jetbrains.annotations.NotNull()
        java.lang.String sid, @com.fasterxml.jackson.annotation.JsonProperty(value = "serie_slug")
        @org.jetbrains.annotations.NotNull()
        java.lang.String serieSlug) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSid() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSerieSlug() {
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
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Query copy(@org.jetbrains.annotations.NotNull()
        java.lang.String sid, @com.fasterxml.jackson.annotation.JsonProperty(value = "serie_slug")
        @org.jetbrains.annotations.NotNull()
        java.lang.String serieSlug) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Ranks;", "", "week", "month", "all", "", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "getAll", "()Ljava/lang/String;", "getMonth", "()Ljava/lang/Object;", "getWeek", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Ranks {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object week = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object month = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String all = null;
        
        public Ranks(@org.jetbrains.annotations.Nullable()
        java.lang.Object week, @org.jetbrains.annotations.Nullable()
        java.lang.Object month, @org.jetbrains.annotations.NotNull()
        java.lang.String all) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getWeek() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getMonth() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAll() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Ranks copy(@org.jetbrains.annotations.Nullable()
        java.lang.Object week, @org.jetbrains.annotations.Nullable()
        java.lang.Object month, @org.jetbrains.annotations.NotNull()
        java.lang.String all) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Raw;", "", "title", "", "author", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getDescription", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Raw {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String author = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = null;
        
        public Raw(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.NotNull()
        java.lang.String description) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
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
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Raw copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.NotNull()
        java.lang.String description) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Raw2;", "", "title", "", "author", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getDescription", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Raw2 {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String author = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = null;
        
        public Raw2(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.NotNull()
        java.lang.String description) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
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
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Raw2 copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.NotNull()
        java.lang.String description) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Raw3;", "", "id", "", "chapterCount", "view", "slug", "", "createdAt", "default", "", "verified", "(JJJLjava/lang/String;Ljava/lang/String;ZZ)V", "getChapterCount", "()J", "getCreatedAt", "()Ljava/lang/String;", "getDefault", "()Z", "getId", "getSlug", "getVerified", "getView", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Raw3 {
        private final long id = 0L;
        private final long chapterCount = 0L;
        private final long view = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String slug = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String createdAt = null;
        private final boolean verified = false;
        
        public Raw3(long id, @com.fasterxml.jackson.annotation.JsonProperty(value = "chapter_count")
        long chapterCount, long view, @org.jetbrains.annotations.NotNull()
        java.lang.String slug, @com.fasterxml.jackson.annotation.JsonProperty(value = "created_at")
        @org.jetbrains.annotations.NotNull()
        java.lang.String createdAt, boolean p5_772401952, boolean verified) {
            super();
        }
        
        public final long getId() {
            return 0L;
        }
        
        public final long getChapterCount() {
            return 0L;
        }
        
        public final long getView() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSlug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCreatedAt() {
            return null;
        }
        
        public final boolean getDefault() {
            return false;
        }
        
        public final boolean getVerified() {
            return false;
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean component7() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Raw3 copy(long id, @com.fasterxml.jackson.annotation.JsonProperty(value = "chapter_count")
        long chapterCount, long view, @org.jetbrains.annotations.NotNull()
        java.lang.String slug, @com.fasterxml.jackson.annotation.JsonProperty(value = "created_at")
        @org.jetbrains.annotations.NotNull()
        java.lang.String createdAt, boolean p5_772401952, boolean verified) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Raw4;", "", "title", "", "author", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getDescription", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Raw4 {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String author = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = null;
        
        public Raw4(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.NotNull()
        java.lang.String description) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
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
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Raw4 copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @org.jetbrains.annotations.NotNull()
        java.lang.String description) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b<\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00cf\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0018\u00a2\u0006\u0002\u0010\u001dJ\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\bH\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010,J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0018H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\bH\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0018H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\bH\u00c6\u0003J\t\u0010L\u001a\u00020\bH\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\fH\u00c6\u0003J\t\u0010O\u001a\u00020\bH\u00c6\u0003J\u00ee\u0001\u0010P\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\b2\b\b\u0003\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0003\u0010\u001b\u001a\u00020\u00032\b\b\u0003\u0010\u001c\u001a\u00020\u0018H\u00c6\u0001\u00a2\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020\u00182\b\u0010S\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010T\u001a\u00020UH\u00d6\u0001J\t\u0010V\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u001c\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010!R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010#\u00a8\u0006W"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Recommendation;", "", "serieId", "", "recommendationId", "score", "id", "slug", "", "searchText", "status", "data", "Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Data2;", "createdAt", "updatedAt", "view", "inLibrary", "rating", "", "chapterCount", "power", "totalRate", "userStatus", "verified", "", "from", "author", "rawId", "aiEnabled", "(JJJJLjava/lang/String;Ljava/lang/String;JLcom/lagradost/quicknovel/providers/ResultJsonResponse$Data2;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Double;JJJJZLjava/lang/String;Ljava/lang/String;JZ)V", "getAiEnabled", "()Z", "getAuthor", "()Ljava/lang/String;", "getChapterCount", "()J", "getCreatedAt", "getData", "()Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Data2;", "getFrom", "getId", "getInLibrary", "getPower", "getRating", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRawId", "getRecommendationId", "getScore", "getSearchText", "getSerieId", "getSlug", "getStatus", "getTotalRate", "getUpdatedAt", "getUserStatus", "getVerified", "getView", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJJJLjava/lang/String;Ljava/lang/String;JLcom/lagradost/quicknovel/providers/ResultJsonResponse$Data2;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Double;JJJJZLjava/lang/String;Ljava/lang/String;JZ)Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Recommendation;", "equals", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Recommendation {
        private final long serieId = 0L;
        private final long recommendationId = 0L;
        private final long score = 0L;
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String slug = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String searchText = null;
        private final long status = 0L;
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.providers.ResultJsonResponse.Data2 data = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String createdAt = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String updatedAt = null;
        private final long view = 0L;
        private final long inLibrary = 0L;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double rating = null;
        private final long chapterCount = 0L;
        private final long power = 0L;
        private final long totalRate = 0L;
        private final long userStatus = 0L;
        private final boolean verified = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String from = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String author = null;
        private final long rawId = 0L;
        private final boolean aiEnabled = false;
        
        public Recommendation(@com.fasterxml.jackson.annotation.JsonProperty(value = "serie_id")
        long serieId, @com.fasterxml.jackson.annotation.JsonProperty(value = "recommendation_id")
        long recommendationId, long score, long id, @org.jetbrains.annotations.NotNull()
        java.lang.String slug, @com.fasterxml.jackson.annotation.JsonProperty(value = "search_text")
        @org.jetbrains.annotations.NotNull()
        java.lang.String searchText, long status, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Data2 data, @com.fasterxml.jackson.annotation.JsonProperty(value = "created_at")
        @org.jetbrains.annotations.NotNull()
        java.lang.String createdAt, @com.fasterxml.jackson.annotation.JsonProperty(value = "updated_at")
        @org.jetbrains.annotations.NotNull()
        java.lang.String updatedAt, long view, @com.fasterxml.jackson.annotation.JsonProperty(value = "in_library")
        long inLibrary, @org.jetbrains.annotations.Nullable()
        java.lang.Double rating, @com.fasterxml.jackson.annotation.JsonProperty(value = "chapter_count")
        long chapterCount, long power, @com.fasterxml.jackson.annotation.JsonProperty(value = "total_rate")
        long totalRate, @com.fasterxml.jackson.annotation.JsonProperty(value = "user_status")
        long userStatus, boolean verified, @org.jetbrains.annotations.Nullable()
        java.lang.String from, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @com.fasterxml.jackson.annotation.JsonProperty(value = "raw_id")
        long rawId, @com.fasterxml.jackson.annotation.JsonProperty(value = "ai_enabled")
        boolean aiEnabled) {
            super();
        }
        
        public final long getSerieId() {
            return 0L;
        }
        
        public final long getRecommendationId() {
            return 0L;
        }
        
        public final long getScore() {
            return 0L;
        }
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSlug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSearchText() {
            return null;
        }
        
        public final long getStatus() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Data2 getData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCreatedAt() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUpdatedAt() {
            return null;
        }
        
        public final long getView() {
            return 0L;
        }
        
        public final long getInLibrary() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getRating() {
            return null;
        }
        
        public final long getChapterCount() {
            return 0L;
        }
        
        public final long getPower() {
            return 0L;
        }
        
        public final long getTotalRate() {
            return 0L;
        }
        
        public final long getUserStatus() {
            return 0L;
        }
        
        public final boolean getVerified() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFrom() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        public final long getRawId() {
            return 0L;
        }
        
        public final boolean getAiEnabled() {
            return false;
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component10() {
            return null;
        }
        
        public final long component11() {
            return 0L;
        }
        
        public final long component12() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component13() {
            return null;
        }
        
        public final long component14() {
            return 0L;
        }
        
        public final long component15() {
            return 0L;
        }
        
        public final long component16() {
            return 0L;
        }
        
        public final long component17() {
            return 0L;
        }
        
        public final boolean component18() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component19() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component20() {
            return null;
        }
        
        public final long component21() {
            return 0L;
        }
        
        public final boolean component22() {
            return false;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long component4() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        public final long component7() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Data2 component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Recommendation copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "serie_id")
        long serieId, @com.fasterxml.jackson.annotation.JsonProperty(value = "recommendation_id")
        long recommendationId, long score, long id, @org.jetbrains.annotations.NotNull()
        java.lang.String slug, @com.fasterxml.jackson.annotation.JsonProperty(value = "search_text")
        @org.jetbrains.annotations.NotNull()
        java.lang.String searchText, long status, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Data2 data, @com.fasterxml.jackson.annotation.JsonProperty(value = "created_at")
        @org.jetbrains.annotations.NotNull()
        java.lang.String createdAt, @com.fasterxml.jackson.annotation.JsonProperty(value = "updated_at")
        @org.jetbrains.annotations.NotNull()
        java.lang.String updatedAt, long view, @com.fasterxml.jackson.annotation.JsonProperty(value = "in_library")
        long inLibrary, @org.jetbrains.annotations.Nullable()
        java.lang.Double rating, @com.fasterxml.jackson.annotation.JsonProperty(value = "chapter_count")
        long chapterCount, long power, @com.fasterxml.jackson.annotation.JsonProperty(value = "total_rate")
        long totalRate, @com.fasterxml.jackson.annotation.JsonProperty(value = "user_status")
        long userStatus, boolean verified, @org.jetbrains.annotations.Nullable()
        java.lang.String from, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @com.fasterxml.jackson.annotation.JsonProperty(value = "raw_id")
        long rawId, @com.fasterxml.jackson.annotation.JsonProperty(value = "ai_enabled")
        boolean aiEnabled) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Root;", "", "props", "Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Props;", "(Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Props;)V", "getProps", "()Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Props;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Root {
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.providers.ResultJsonResponse.Props props = null;
        
        public Root(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Props props) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Props getProps() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Props component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Root copy(@org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Props props) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Serie;", "", "lastChapters", "", "Lcom/lagradost/quicknovel/providers/ResultJsonResponse$LastChapter;", "(Ljava/util/List;)V", "getLastChapters", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Serie {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.lagradost.quicknovel.providers.ResultJsonResponse.LastChapter> lastChapters = null;
        
        public Serie(@com.fasterxml.jackson.annotation.JsonProperty(value = "last_chapters")
        @org.jetbrains.annotations.NotNull()
        java.util.List<com.lagradost.quicknovel.providers.ResultJsonResponse.LastChapter> lastChapters) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.lagradost.quicknovel.providers.ResultJsonResponse.LastChapter> getLastChapters() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.lagradost.quicknovel.providers.ResultJsonResponse.LastChapter> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Serie copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "last_chapters")
        @org.jetbrains.annotations.NotNull()
        java.util.List<com.lagradost.quicknovel.providers.ResultJsonResponse.LastChapter> lastChapters) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\bH\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0003\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u0005\u0012\b\b\u0001\u0010 \u001a\u00020\u0005\u0012\b\b\u0001\u0010!\u001a\u00020\u0005\u0012\b\b\u0001\u0010\"\u001a\u00020\u0003\u00a2\u0006\u0002\u0010#J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0014H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0014H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dH\u00c6\u0003J\t\u0010V\u001a\u00020\u0014H\u00c6\u0003J\t\u0010W\u001a\u00020\u0005H\u00c6\u0003J\t\u0010X\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\tH\u00c6\u0003J\t\u0010^\u001a\u00020\u0005H\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\u00ab\u0002\u0010b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0003\u0010\u0017\u001a\u00020\u00032\b\b\u0003\u0010\u0018\u001a\u00020\u00142\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\b\b\u0003\u0010\u001e\u001a\u00020\u00142\b\b\u0003\u0010\u001f\u001a\u00020\u00052\b\b\u0003\u0010 \u001a\u00020\u00052\b\b\u0003\u0010!\u001a\u00020\u00052\b\b\u0003\u0010\"\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010c\u001a\u00020\u00142\b\u0010d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010e\u001a\u00020fH\u00d6\u0001J\t\u0010g\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0018\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\'R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\'R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010)R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0011\u0010\u001e\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00104R\u0011\u0010\u001f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\'R\u0011\u0010 \u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\'R\u0011\u0010!\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\'R\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\'R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\'R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010)R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010)R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\'R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010)R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010%R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010)\u00a8\u0006h"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$SerieData;", "", "id", "", "slug", "", "searchText", "status", "data", "Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Data;", "createdAt", "updatedAt", "view", "inLibrary", "rating", "chapterCount", "power", "totalRate", "userStatus", "verified", "", "from", "author", "rawId", "aiEnabled", "releasedBy", "rawStatus", "rawChapterCount", "genres", "", "rawVerified", "requestedBy", "requestedByName", "requestedMember", "requestedRole", "(JLjava/lang/String;Ljava/lang/String;JLcom/lagradost/quicknovel/providers/ResultJsonResponse$Data;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Object;JJJJZLjava/lang/String;Ljava/lang/String;JZLjava/lang/Object;JJLjava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getAiEnabled", "()Z", "getAuthor", "()Ljava/lang/String;", "getChapterCount", "()J", "getCreatedAt", "getData", "()Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Data;", "getFrom", "getGenres", "()Ljava/util/List;", "getId", "getInLibrary", "getPower", "getRating", "()Ljava/lang/Object;", "getRawChapterCount", "getRawId", "getRawStatus", "getRawVerified", "getReleasedBy", "getRequestedBy", "getRequestedByName", "getRequestedMember", "getRequestedRole", "getSearchText", "getSlug", "getStatus", "getTotalRate", "getUpdatedAt", "getUserStatus", "getVerified", "getView", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
    public static final class SerieData {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String slug = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String searchText = null;
        private final long status = 0L;
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.providers.ResultJsonResponse.Data data = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String createdAt = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String updatedAt = null;
        private final long view = 0L;
        private final long inLibrary = 0L;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object rating = null;
        private final long chapterCount = 0L;
        private final long power = 0L;
        private final long totalRate = 0L;
        private final long userStatus = 0L;
        private final boolean verified = false;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String from = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String author = null;
        private final long rawId = 0L;
        private final boolean aiEnabled = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object releasedBy = null;
        private final long rawStatus = 0L;
        private final long rawChapterCount = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Long> genres = null;
        private final boolean rawVerified = false;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String requestedBy = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String requestedByName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String requestedMember = null;
        private final long requestedRole = 0L;
        
        public SerieData(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String slug, @com.fasterxml.jackson.annotation.JsonProperty(value = "search_text")
        @org.jetbrains.annotations.NotNull()
        java.lang.String searchText, long status, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Data data, @com.fasterxml.jackson.annotation.JsonProperty(value = "created_at")
        @org.jetbrains.annotations.NotNull()
        java.lang.String createdAt, @com.fasterxml.jackson.annotation.JsonProperty(value = "updated_at")
        @org.jetbrains.annotations.NotNull()
        java.lang.String updatedAt, long view, @com.fasterxml.jackson.annotation.JsonProperty(value = "in_library")
        long inLibrary, @org.jetbrains.annotations.Nullable()
        java.lang.Object rating, @com.fasterxml.jackson.annotation.JsonProperty(value = "chapter_count")
        long chapterCount, long power, @com.fasterxml.jackson.annotation.JsonProperty(value = "total_rate")
        long totalRate, @com.fasterxml.jackson.annotation.JsonProperty(value = "user_status")
        long userStatus, boolean verified, @org.jetbrains.annotations.NotNull()
        java.lang.String from, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @com.fasterxml.jackson.annotation.JsonProperty(value = "raw_id")
        long rawId, @com.fasterxml.jackson.annotation.JsonProperty(value = "ai_enabled")
        boolean aiEnabled, @com.fasterxml.jackson.annotation.JsonProperty(value = "released_by")
        @org.jetbrains.annotations.Nullable()
        java.lang.Object releasedBy, @com.fasterxml.jackson.annotation.JsonProperty(value = "raw_status")
        long rawStatus, @com.fasterxml.jackson.annotation.JsonProperty(value = "raw_chapter_count")
        long rawChapterCount, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> genres, @com.fasterxml.jackson.annotation.JsonProperty(value = "raw_verified")
        boolean rawVerified, @com.fasterxml.jackson.annotation.JsonProperty(value = "requested_by")
        @org.jetbrains.annotations.NotNull()
        java.lang.String requestedBy, @com.fasterxml.jackson.annotation.JsonProperty(value = "requested_by_name")
        @org.jetbrains.annotations.NotNull()
        java.lang.String requestedByName, @com.fasterxml.jackson.annotation.JsonProperty(value = "requested_member")
        @org.jetbrains.annotations.NotNull()
        java.lang.String requestedMember, @com.fasterxml.jackson.annotation.JsonProperty(value = "requested_role")
        long requestedRole) {
            super();
        }
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSlug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSearchText() {
            return null;
        }
        
        public final long getStatus() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Data getData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCreatedAt() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUpdatedAt() {
            return null;
        }
        
        public final long getView() {
            return 0L;
        }
        
        public final long getInLibrary() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getRating() {
            return null;
        }
        
        public final long getChapterCount() {
            return 0L;
        }
        
        public final long getPower() {
            return 0L;
        }
        
        public final long getTotalRate() {
            return 0L;
        }
        
        public final long getUserStatus() {
            return 0L;
        }
        
        public final boolean getVerified() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFrom() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        public final long getRawId() {
            return 0L;
        }
        
        public final boolean getAiEnabled() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getReleasedBy() {
            return null;
        }
        
        public final long getRawStatus() {
            return 0L;
        }
        
        public final long getRawChapterCount() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> getGenres() {
            return null;
        }
        
        public final boolean getRawVerified() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRequestedBy() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRequestedByName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRequestedMember() {
            return null;
        }
        
        public final long getRequestedRole() {
            return 0L;
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component10() {
            return null;
        }
        
        public final long component11() {
            return 0L;
        }
        
        public final long component12() {
            return 0L;
        }
        
        public final long component13() {
            return 0L;
        }
        
        public final long component14() {
            return 0L;
        }
        
        public final boolean component15() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component16() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component17() {
            return null;
        }
        
        public final long component18() {
            return 0L;
        }
        
        public final boolean component19() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component20() {
            return null;
        }
        
        public final long component21() {
            return 0L;
        }
        
        public final long component22() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> component23() {
            return null;
        }
        
        public final boolean component24() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component25() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component26() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component27() {
            return null;
        }
        
        public final long component28() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        public final long component4() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Data component5() {
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
        
        public final long component8() {
            return 0L;
        }
        
        public final long component9() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.SerieData copy(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String slug, @com.fasterxml.jackson.annotation.JsonProperty(value = "search_text")
        @org.jetbrains.annotations.NotNull()
        java.lang.String searchText, long status, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Data data, @com.fasterxml.jackson.annotation.JsonProperty(value = "created_at")
        @org.jetbrains.annotations.NotNull()
        java.lang.String createdAt, @com.fasterxml.jackson.annotation.JsonProperty(value = "updated_at")
        @org.jetbrains.annotations.NotNull()
        java.lang.String updatedAt, long view, @com.fasterxml.jackson.annotation.JsonProperty(value = "in_library")
        long inLibrary, @org.jetbrains.annotations.Nullable()
        java.lang.Object rating, @com.fasterxml.jackson.annotation.JsonProperty(value = "chapter_count")
        long chapterCount, long power, @com.fasterxml.jackson.annotation.JsonProperty(value = "total_rate")
        long totalRate, @com.fasterxml.jackson.annotation.JsonProperty(value = "user_status")
        long userStatus, boolean verified, @org.jetbrains.annotations.NotNull()
        java.lang.String from, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @com.fasterxml.jackson.annotation.JsonProperty(value = "raw_id")
        long rawId, @com.fasterxml.jackson.annotation.JsonProperty(value = "ai_enabled")
        boolean aiEnabled, @com.fasterxml.jackson.annotation.JsonProperty(value = "released_by")
        @org.jetbrains.annotations.Nullable()
        java.lang.Object releasedBy, @com.fasterxml.jackson.annotation.JsonProperty(value = "raw_status")
        long rawStatus, @com.fasterxml.jackson.annotation.JsonProperty(value = "raw_chapter_count")
        long rawChapterCount, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> genres, @com.fasterxml.jackson.annotation.JsonProperty(value = "raw_verified")
        boolean rawVerified, @com.fasterxml.jackson.annotation.JsonProperty(value = "requested_by")
        @org.jetbrains.annotations.NotNull()
        java.lang.String requestedBy, @com.fasterxml.jackson.annotation.JsonProperty(value = "requested_by_name")
        @org.jetbrains.annotations.NotNull()
        java.lang.String requestedByName, @com.fasterxml.jackson.annotation.JsonProperty(value = "requested_member")
        @org.jetbrains.annotations.NotNull()
        java.lang.String requestedMember, @com.fasterxml.jackson.annotation.JsonProperty(value = "requested_role")
        long requestedRole) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00a5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u000fH\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0015H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\tH\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\u00bd\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0003\u0010\u0018\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010D\u001a\u00020\u00152\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020GH\u00d6\u0001J\t\u0010H\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001d\u00a8\u0006I"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Series;", "", "id", "", "slug", "", "searchText", "status", "data", "Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Data3;", "createdAt", "updatedAt", "view", "inLibrary", "rating", "", "chapterCount", "power", "totalRate", "userStatus", "verified", "", "from", "author", "rawId", "(JLjava/lang/String;Ljava/lang/String;JLcom/lagradost/quicknovel/providers/ResultJsonResponse$Data3;Ljava/lang/String;Ljava/lang/String;JJDJJJJZLjava/lang/String;Ljava/lang/String;J)V", "getAuthor", "()Ljava/lang/String;", "getChapterCount", "()J", "getCreatedAt", "getData", "()Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Data3;", "getFrom", "getId", "getInLibrary", "getPower", "getRating", "()D", "getRawId", "getSearchText", "getSlug", "getStatus", "getTotalRate", "getUpdatedAt", "getUserStatus", "getVerified", "()Z", "getView", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Series {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String slug = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String searchText = null;
        private final long status = 0L;
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.providers.ResultJsonResponse.Data3 data = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String createdAt = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String updatedAt = null;
        private final long view = 0L;
        private final long inLibrary = 0L;
        private final double rating = 0.0;
        private final long chapterCount = 0L;
        private final long power = 0L;
        private final long totalRate = 0L;
        private final long userStatus = 0L;
        private final boolean verified = false;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String from = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String author = null;
        private final long rawId = 0L;
        
        public Series(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String slug, @com.fasterxml.jackson.annotation.JsonProperty(value = "search_text")
        @org.jetbrains.annotations.NotNull()
        java.lang.String searchText, long status, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Data3 data, @com.fasterxml.jackson.annotation.JsonProperty(value = "created_at")
        @org.jetbrains.annotations.NotNull()
        java.lang.String createdAt, @com.fasterxml.jackson.annotation.JsonProperty(value = "updated_at")
        @org.jetbrains.annotations.NotNull()
        java.lang.String updatedAt, long view, @com.fasterxml.jackson.annotation.JsonProperty(value = "in_library")
        long inLibrary, double rating, @com.fasterxml.jackson.annotation.JsonProperty(value = "chapter_count")
        long chapterCount, long power, @com.fasterxml.jackson.annotation.JsonProperty(value = "total_rate")
        long totalRate, @com.fasterxml.jackson.annotation.JsonProperty(value = "user_status")
        long userStatus, boolean verified, @org.jetbrains.annotations.NotNull()
        java.lang.String from, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @com.fasterxml.jackson.annotation.JsonProperty(value = "raw_id")
        long rawId) {
            super();
        }
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSlug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSearchText() {
            return null;
        }
        
        public final long getStatus() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Data3 getData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCreatedAt() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUpdatedAt() {
            return null;
        }
        
        public final long getView() {
            return 0L;
        }
        
        public final long getInLibrary() {
            return 0L;
        }
        
        public final double getRating() {
            return 0.0;
        }
        
        public final long getChapterCount() {
            return 0L;
        }
        
        public final long getPower() {
            return 0L;
        }
        
        public final long getTotalRate() {
            return 0L;
        }
        
        public final long getUserStatus() {
            return 0L;
        }
        
        public final boolean getVerified() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFrom() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAuthor() {
            return null;
        }
        
        public final long getRawId() {
            return 0L;
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final double component10() {
            return 0.0;
        }
        
        public final long component11() {
            return 0L;
        }
        
        public final long component12() {
            return 0L;
        }
        
        public final long component13() {
            return 0L;
        }
        
        public final long component14() {
            return 0L;
        }
        
        public final boolean component15() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component16() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component17() {
            return null;
        }
        
        public final long component18() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        public final long component4() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Data3 component5() {
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
        
        public final long component8() {
            return 0L;
        }
        
        public final long component9() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Series copy(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String slug, @com.fasterxml.jackson.annotation.JsonProperty(value = "search_text")
        @org.jetbrains.annotations.NotNull()
        java.lang.String searchText, long status, @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.providers.ResultJsonResponse.Data3 data, @com.fasterxml.jackson.annotation.JsonProperty(value = "created_at")
        @org.jetbrains.annotations.NotNull()
        java.lang.String createdAt, @com.fasterxml.jackson.annotation.JsonProperty(value = "updated_at")
        @org.jetbrains.annotations.NotNull()
        java.lang.String updatedAt, long view, @com.fasterxml.jackson.annotation.JsonProperty(value = "in_library")
        long inLibrary, double rating, @com.fasterxml.jackson.annotation.JsonProperty(value = "chapter_count")
        long chapterCount, long power, @com.fasterxml.jackson.annotation.JsonProperty(value = "total_rate")
        long totalRate, @com.fasterxml.jackson.annotation.JsonProperty(value = "user_status")
        long userStatus, boolean verified, @org.jetbrains.annotations.NotNull()
        java.lang.String from, @org.jetbrains.annotations.NotNull()
        java.lang.String author, @com.fasterxml.jackson.annotation.JsonProperty(value = "raw_id")
        long rawId) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/lagradost/quicknovel/providers/ResultJsonResponse$Tag;", "", "id", "", "title", "", "slug", "(JLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getSlug", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Tag {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String slug = null;
        
        public Tag(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String slug) {
            super();
        }
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSlug() {
            return null;
        }
        
        public final long component1() {
            return 0L;
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
        public final com.lagradost.quicknovel.providers.ResultJsonResponse.Tag copy(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String slug) {
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