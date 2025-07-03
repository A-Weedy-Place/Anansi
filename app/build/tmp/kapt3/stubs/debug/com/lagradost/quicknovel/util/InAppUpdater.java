package com.lagradost.quicknovel.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/lagradost/quicknovel/util/InAppUpdater;", "", "()V", "Companion", "app_debug"})
public final class InAppUpdater {
    private static final com.fasterxml.jackson.databind.json.JsonMapper mapper = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.util.InAppUpdater.Companion Companion = null;
    
    public InAppUpdater() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\f*\u00020\bH\u0082@\u00a2\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0002\u0010\u0010R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/lagradost/quicknovel/util/InAppUpdater$Companion;", "", "()V", "mapper", "Lcom/fasterxml/jackson/databind/json/JsonMapper;", "kotlin.jvm.PlatformType", "downloadUpdate", "", "Landroid/app/Activity;", "url", "", "getAppUpdate", "Lcom/lagradost/quicknovel/util/InAppUpdater$Companion$Update;", "(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runAutoUpdate", "checkAutoUpdate", "(Landroid/app/Activity;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GithubAsset", "GithubRelease", "Update", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final java.lang.Object getAppUpdate(android.app.Activity $this$getAppUpdate, kotlin.coroutines.Continuation<? super com.lagradost.quicknovel.util.InAppUpdater.Companion.Update> $completion) {
            return null;
        }
        
        private final boolean downloadUpdate(android.app.Activity $this$downloadUpdate, java.lang.String url) {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object runAutoUpdate(@org.jetbrains.annotations.NotNull()
        android.app.Activity $this$runAutoUpdate, boolean checkAutoUpdate, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/lagradost/quicknovel/util/InAppUpdater$Companion$GithubAsset;", "", "name", "", "size", "", "browser_download_url", "content_type", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getBrowser_download_url", "()Ljava/lang/String;", "getContent_type", "getName", "getSize", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
        public static final class GithubAsset {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String name = null;
            private final int size = 0;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String browser_download_url = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String content_type = null;
            
            public GithubAsset(@com.fasterxml.jackson.annotation.JsonProperty(value = "name")
            @org.jetbrains.annotations.NotNull()
            java.lang.String name, @com.fasterxml.jackson.annotation.JsonProperty(value = "size")
            int size, @com.fasterxml.jackson.annotation.JsonProperty(value = "browser_download_url")
            @org.jetbrains.annotations.NotNull()
            java.lang.String browser_download_url, @com.fasterxml.jackson.annotation.JsonProperty(value = "content_type")
            @org.jetbrains.annotations.NotNull()
            java.lang.String content_type) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getName() {
                return null;
            }
            
            public final int getSize() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getBrowser_download_url() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getContent_type() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            public final int component2() {
                return 0;
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
            public final com.lagradost.quicknovel.util.InAppUpdater.Companion.GithubAsset copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "name")
            @org.jetbrains.annotations.NotNull()
            java.lang.String name, @com.fasterxml.jackson.annotation.JsonProperty(value = "size")
            int size, @com.fasterxml.jackson.annotation.JsonProperty(value = "browser_download_url")
            @org.jetbrains.annotations.NotNull()
            java.lang.String browser_download_url, @com.fasterxml.jackson.annotation.JsonProperty(value = "content_type")
            @org.jetbrains.annotations.NotNull()
            java.lang.String content_type) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/lagradost/quicknovel/util/InAppUpdater$Companion$GithubRelease;", "", "tag_name", "", "body", "assets", "", "Lcom/lagradost/quicknovel/util/InAppUpdater$Companion$GithubAsset;", "target_commitish", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAssets", "()Ljava/util/List;", "getBody", "()Ljava/lang/String;", "getTag_name", "getTarget_commitish", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
        public static final class GithubRelease {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String tag_name = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String body = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.lagradost.quicknovel.util.InAppUpdater.Companion.GithubAsset> assets = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String target_commitish = null;
            
            public GithubRelease(@com.fasterxml.jackson.annotation.JsonProperty(value = "tag_name")
            @org.jetbrains.annotations.NotNull()
            java.lang.String tag_name, @com.fasterxml.jackson.annotation.JsonProperty(value = "body")
            @org.jetbrains.annotations.NotNull()
            java.lang.String body, @com.fasterxml.jackson.annotation.JsonProperty(value = "assets")
            @org.jetbrains.annotations.NotNull()
            java.util.List<com.lagradost.quicknovel.util.InAppUpdater.Companion.GithubAsset> assets, @com.fasterxml.jackson.annotation.JsonProperty(value = "target_commitish")
            @org.jetbrains.annotations.NotNull()
            java.lang.String target_commitish) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTag_name() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getBody() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.lagradost.quicknovel.util.InAppUpdater.Companion.GithubAsset> getAssets() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTarget_commitish() {
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
            public final java.util.List<com.lagradost.quicknovel.util.InAppUpdater.Companion.GithubAsset> component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.lagradost.quicknovel.util.InAppUpdater.Companion.GithubRelease copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "tag_name")
            @org.jetbrains.annotations.NotNull()
            java.lang.String tag_name, @com.fasterxml.jackson.annotation.JsonProperty(value = "body")
            @org.jetbrains.annotations.NotNull()
            java.lang.String body, @com.fasterxml.jackson.annotation.JsonProperty(value = "assets")
            @org.jetbrains.annotations.NotNull()
            java.util.List<com.lagradost.quicknovel.util.InAppUpdater.Companion.GithubAsset> assets, @com.fasterxml.jackson.annotation.JsonProperty(value = "target_commitish")
            @org.jetbrains.annotations.NotNull()
            java.lang.String target_commitish) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/lagradost/quicknovel/util/InAppUpdater$Companion$Update;", "", "shouldUpdate", "", "updateURL", "", "updateVersion", "changelog", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChangelog", "()Ljava/lang/String;", "getShouldUpdate", "()Z", "getUpdateURL", "getUpdateVersion", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
        public static final class Update {
            private final boolean shouldUpdate = false;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String updateURL = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String updateVersion = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String changelog = null;
            
            public Update(@com.fasterxml.jackson.annotation.JsonProperty(value = "shouldUpdate")
            boolean shouldUpdate, @com.fasterxml.jackson.annotation.JsonProperty(value = "updateURL")
            @org.jetbrains.annotations.Nullable()
            java.lang.String updateURL, @com.fasterxml.jackson.annotation.JsonProperty(value = "updateVersion")
            @org.jetbrains.annotations.Nullable()
            java.lang.String updateVersion, @com.fasterxml.jackson.annotation.JsonProperty(value = "changelog")
            @org.jetbrains.annotations.Nullable()
            java.lang.String changelog) {
                super();
            }
            
            public final boolean getShouldUpdate() {
                return false;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getUpdateURL() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getUpdateVersion() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getChangelog() {
                return null;
            }
            
            public final boolean component1() {
                return false;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.lagradost.quicknovel.util.InAppUpdater.Companion.Update copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "shouldUpdate")
            boolean shouldUpdate, @com.fasterxml.jackson.annotation.JsonProperty(value = "updateURL")
            @org.jetbrains.annotations.Nullable()
            java.lang.String updateURL, @com.fasterxml.jackson.annotation.JsonProperty(value = "updateVersion")
            @org.jetbrains.annotations.Nullable()
            java.lang.String updateVersion, @com.fasterxml.jackson.annotation.JsonProperty(value = "changelog")
            @org.jetbrains.annotations.Nullable()
            java.lang.String changelog) {
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
}