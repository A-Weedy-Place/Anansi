package com.lagradost.quicknovel.providers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0002\u0010\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lcom/lagradost/quicknovel/providers/WattpadProvider;", "Lcom/lagradost/quicknovel/MainAPI;", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "name", "getName", "load", "Lcom/lagradost/quicknovel/LoadResponse;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadHtml", "search", "", "Lcom/lagradost/quicknovel/SearchResponse;", "query", "Data", "Group", "MainData", "Metadata", "Parts", "TextUrl", "app_debug"})
public final class WattpadProvider extends com.lagradost.quicknovel.MainAPI {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mainUrl = "https://www.wattpad.com";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = "Wattpad";
    
    public WattpadProvider() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getMainUrl() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object search(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.lagradost.quicknovel.SearchResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.LoadResponse> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object loadHtml(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0011"}, d2 = {"Lcom/lagradost/quicknovel/providers/WattpadProvider$Data;", "", "textUrl", "Lcom/lagradost/quicknovel/providers/WattpadProvider$TextUrl;", "(Lcom/lagradost/quicknovel/providers/WattpadProvider$TextUrl;)V", "getTextUrl", "()Lcom/lagradost/quicknovel/providers/WattpadProvider$TextUrl;", "setTextUrl", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Data {
        @org.jetbrains.annotations.Nullable()
        private com.lagradost.quicknovel.providers.WattpadProvider.TextUrl textUrl;
        
        public Data(@com.fasterxml.jackson.annotation.JsonProperty(value = "text_url")
        @org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.providers.WattpadProvider.TextUrl textUrl) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.lagradost.quicknovel.providers.WattpadProvider.TextUrl getTextUrl() {
            return null;
        }
        
        public final void setTextUrl(@org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.providers.WattpadProvider.TextUrl p0) {
        }
        
        public Data() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.lagradost.quicknovel.providers.WattpadProvider.TextUrl component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.WattpadProvider.Data copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "text_url")
        @org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.providers.WattpadProvider.TextUrl textUrl) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0003J#\u0010\u000b\u001a\u00020\u00002\u0018\b\u0003\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/lagradost/quicknovel/providers/WattpadProvider$Group;", "", "parts", "Ljava/util/ArrayList;", "Lcom/lagradost/quicknovel/providers/WattpadProvider$Parts;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getParts", "()Ljava/util/ArrayList;", "setParts", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Group {
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<com.lagradost.quicknovel.providers.WattpadProvider.Parts> parts;
        
        public Group(@com.fasterxml.jackson.annotation.JsonProperty(value = "parts")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.lagradost.quicknovel.providers.WattpadProvider.Parts> parts) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.lagradost.quicknovel.providers.WattpadProvider.Parts> getParts() {
            return null;
        }
        
        public final void setParts(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.lagradost.quicknovel.providers.WattpadProvider.Parts> p0) {
        }
        
        public Group() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.lagradost.quicknovel.providers.WattpadProvider.Parts> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.WattpadProvider.Group copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "parts")
        @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.lagradost.quicknovel.providers.WattpadProvider.Parts> parts) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0011"}, d2 = {"Lcom/lagradost/quicknovel/providers/WattpadProvider$MainData;", "", "part", "Lcom/lagradost/quicknovel/providers/WattpadProvider$Metadata;", "(Lcom/lagradost/quicknovel/providers/WattpadProvider$Metadata;)V", "getPart", "()Lcom/lagradost/quicknovel/providers/WattpadProvider$Metadata;", "setPart", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class MainData {
        @org.jetbrains.annotations.Nullable()
        private com.lagradost.quicknovel.providers.WattpadProvider.Metadata part;
        
        public MainData(@org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.providers.WattpadProvider.Metadata part) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.lagradost.quicknovel.providers.WattpadProvider.Metadata getPart() {
            return null;
        }
        
        public final void setPart(@org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.providers.WattpadProvider.Metadata p0) {
        }
        
        public MainData() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.lagradost.quicknovel.providers.WattpadProvider.Metadata component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.WattpadProvider.MainData copy(@org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.providers.WattpadProvider.Metadata part) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0011"}, d2 = {"Lcom/lagradost/quicknovel/providers/WattpadProvider$Metadata;", "", "data", "Lcom/lagradost/quicknovel/providers/WattpadProvider$Data;", "(Lcom/lagradost/quicknovel/providers/WattpadProvider$Data;)V", "getData", "()Lcom/lagradost/quicknovel/providers/WattpadProvider$Data;", "setData", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Metadata {
        @org.jetbrains.annotations.Nullable()
        private com.lagradost.quicknovel.providers.WattpadProvider.Data data;
        
        public Metadata(@com.fasterxml.jackson.annotation.JsonProperty(value = "data")
        @org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.providers.WattpadProvider.Data data) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.lagradost.quicknovel.providers.WattpadProvider.Data getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.providers.WattpadProvider.Data p0) {
        }
        
        public Metadata() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.lagradost.quicknovel.providers.WattpadProvider.Data component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.WattpadProvider.Metadata copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "data")
        @org.jetbrains.annotations.Nullable()
        com.lagradost.quicknovel.providers.WattpadProvider.Data data) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J2\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/lagradost/quicknovel/providers/WattpadProvider$Parts;", "", "id", "", "title", "", "url", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getUrl", "setUrl", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/quicknovel/providers/WattpadProvider$Parts;", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class Parts {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String title;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String url;
        
        public Parts(@com.fasterxml.jackson.annotation.JsonProperty(value = "id")
        @org.jetbrains.annotations.Nullable()
        java.lang.Integer id, @com.fasterxml.jackson.annotation.JsonProperty(value = "title")
        @org.jetbrains.annotations.Nullable()
        java.lang.String title, @com.fasterxml.jackson.annotation.JsonProperty(value = "url")
        @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public final void setUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Parts() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.WattpadProvider.Parts copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "id")
        @org.jetbrains.annotations.Nullable()
        java.lang.Integer id, @com.fasterxml.jackson.annotation.JsonProperty(value = "title")
        @org.jetbrains.annotations.Nullable()
        java.lang.String title, @com.fasterxml.jackson.annotation.JsonProperty(value = "url")
        @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/lagradost/quicknovel/providers/WattpadProvider$TextUrl;", "", "text", "", "refreshToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getRefreshToken", "()Ljava/lang/String;", "setRefreshToken", "(Ljava/lang/String;)V", "getText", "setText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class TextUrl {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String text;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String refreshToken;
        
        public TextUrl(@com.fasterxml.jackson.annotation.JsonProperty(value = "text")
        @org.jetbrains.annotations.Nullable()
        java.lang.String text, @com.fasterxml.jackson.annotation.JsonProperty(value = "refresh_token")
        @org.jetbrains.annotations.Nullable()
        java.lang.String refreshToken) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getText() {
            return null;
        }
        
        public final void setText(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRefreshToken() {
            return null;
        }
        
        public final void setRefreshToken(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public TextUrl() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.providers.WattpadProvider.TextUrl copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "text")
        @org.jetbrains.annotations.Nullable()
        java.lang.String text, @com.fasterxml.jackson.annotation.JsonProperty(value = "refresh_token")
        @org.jetbrains.annotations.Nullable()
        java.lang.String refreshToken) {
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