package com.lagradost.quicknovel.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u00020\b*\u00020\tJ\"\u0010\n\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ2\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u0012*\u00020\u000b2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u0012\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u0002J\n\u0010\u0016\u001a\u00020\b*\u00020\tJ\n\u0010\u0017\u001a\u00020\b*\u00020\tR\u001c\u0010\u0003\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/lagradost/quicknovel/util/BackupUtils;", "", "()V", "restoreFileSelector", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "backup", "", "Landroidx/fragment/app/FragmentActivity;", "restore", "Landroid/content/Context;", "backupFile", "Lcom/lagradost/quicknovel/util/BackupUtils$BackupFile;", "restoreSettings", "", "restoreDataStore", "restoreMap", "T", "map", "", "isEditingAppSettings", "restorePrompt", "setUpBackup", "BackupFile", "BackupVars", "app_debug"})
public final class BackupUtils {
    @org.jetbrains.annotations.Nullable()
    private static androidx.activity.result.ActivityResultLauncher<java.lang.String[]> restoreFileSelector;
    @org.jetbrains.annotations.NotNull()
    public static final com.lagradost.quicknovel.util.BackupUtils INSTANCE = null;
    
    private BackupUtils() {
        super();
    }
    
    public final void backup(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$backup) {
    }
    
    public final void setUpBackup(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$setUpBackup) {
    }
    
    public final void restorePrompt(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$restorePrompt) {
    }
    
    private final <T extends java.lang.Object>void restoreMap(android.content.Context $this$restoreMap, java.util.Map<java.lang.String, ? extends T> map, boolean isEditingAppSettings) {
    }
    
    public final void restore(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$restore, @org.jetbrains.annotations.NotNull()
    com.lagradost.quicknovel.util.BackupUtils.BackupFile backupFile, boolean restoreSettings, boolean restoreDataStore) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/lagradost/quicknovel/util/BackupUtils$BackupFile;", "", "datastore", "Lcom/lagradost/quicknovel/util/BackupUtils$BackupVars;", "settings", "(Lcom/lagradost/quicknovel/util/BackupUtils$BackupVars;Lcom/lagradost/quicknovel/util/BackupUtils$BackupVars;)V", "getDatastore", "()Lcom/lagradost/quicknovel/util/BackupUtils$BackupVars;", "getSettings", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class BackupFile {
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.util.BackupUtils.BackupVars datastore = null;
        @org.jetbrains.annotations.NotNull()
        private final com.lagradost.quicknovel.util.BackupUtils.BackupVars settings = null;
        
        public BackupFile(@com.fasterxml.jackson.annotation.JsonProperty(value = "datastore")
        @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.util.BackupUtils.BackupVars datastore, @com.fasterxml.jackson.annotation.JsonProperty(value = "settings")
        @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.util.BackupUtils.BackupVars settings) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.util.BackupUtils.BackupVars getDatastore() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.util.BackupUtils.BackupVars getSettings() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.util.BackupUtils.BackupVars component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.util.BackupUtils.BackupVars component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.util.BackupUtils.BackupFile copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "datastore")
        @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.util.BackupUtils.BackupVars datastore, @com.fasterxml.jackson.annotation.JsonProperty(value = "settings")
        @org.jetbrains.annotations.NotNull()
        com.lagradost.quicknovel.util.BackupUtils.BackupVars settings) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0016\b\u0001\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\u001e\b\u0001\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u00c6\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003H\u00c6\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003H\u00c6\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0018\u00010\u0003H\u00c6\u0003J\u00a1\u0001\u0010\u001d\u001a\u00020\u00002\u0016\b\u0003\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0016\b\u0003\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\u001e\b\u0003\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0007H\u00d6\u0001J\t\u0010!\u001a\u00020\u0004H\u00d6\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\'\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011\u00a8\u0006\""}, d2 = {"Lcom/lagradost/quicknovel/util/BackupUtils$BackupVars;", "", "_Bool", "", "", "", "_Int", "", "_String", "_Float", "", "_Long", "", "_StringSet", "", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "get_Bool", "()Ljava/util/Map;", "get_Float", "get_Int", "get_Long", "get_String", "get_StringSet", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
    public static final class BackupVars {
        @org.jetbrains.annotations.Nullable()
        private final java.util.Map<java.lang.String, java.lang.Boolean> _Bool = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Map<java.lang.String, java.lang.Integer> _Int = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Map<java.lang.String, java.lang.String> _String = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Map<java.lang.String, java.lang.Float> _Float = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Map<java.lang.String, java.lang.Long> _Long = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> _StringSet = null;
        
        public BackupVars(@com.fasterxml.jackson.annotation.JsonProperty(value = "_Bool")
        @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.Boolean> _Bool, @com.fasterxml.jackson.annotation.JsonProperty(value = "_Int")
        @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.Integer> _Int, @com.fasterxml.jackson.annotation.JsonProperty(value = "_String")
        @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> _String, @com.fasterxml.jackson.annotation.JsonProperty(value = "_Float")
        @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.Float> _Float, @com.fasterxml.jackson.annotation.JsonProperty(value = "_Long")
        @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.Long> _Long, @com.fasterxml.jackson.annotation.JsonProperty(value = "_StringSet")
        @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.String>> _StringSet) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.lang.Boolean> get_Bool() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.lang.Integer> get_Int() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.lang.String> get_String() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.lang.Float> get_Float() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.lang.Long> get_Long() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> get_StringSet() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.lang.Boolean> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.lang.Integer> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.lang.String> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.lang.Float> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.lang.Long> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lagradost.quicknovel.util.BackupUtils.BackupVars copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "_Bool")
        @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.Boolean> _Bool, @com.fasterxml.jackson.annotation.JsonProperty(value = "_Int")
        @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.Integer> _Int, @com.fasterxml.jackson.annotation.JsonProperty(value = "_String")
        @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> _String, @com.fasterxml.jackson.annotation.JsonProperty(value = "_Float")
        @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.Float> _Float, @com.fasterxml.jackson.annotation.JsonProperty(value = "_Long")
        @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.Long> _Long, @com.fasterxml.jackson.annotation.JsonProperty(value = "_StringSet")
        @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.String>> _StringSet) {
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