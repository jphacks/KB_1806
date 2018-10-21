package com.mybossseasonfinal.justthejob.MainActivity.MainFragment.EntrySheetFragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/EntrySheetFragment/EntrySheetFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/EntrySheetFragment/EntrySheetContract$View;", "()V", "buttonSubmitEntrySheet", "Landroid/widget/Button;", "editTextAfterEntry", "Landroid/widget/EditText;", "editTextReason", "editTextStandard", "editTextTry", "entrySheetPresenter", "Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/EntrySheetFragment/EntrySheetPresenter;", "getEntrySheetPresenter", "()Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/EntrySheetFragment/EntrySheetPresenter;", "setEntrySheetPresenter", "(Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/EntrySheetFragment/EntrySheetPresenter;)V", "textViewCompanyName", "Landroid/widget/TextView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "showCompanyName", "companyName", "", "Companion", "app_debug"})
public final class EntrySheetFragment extends android.support.v4.app.Fragment implements com.mybossseasonfinal.justthejob.MainActivity.MainFragment.EntrySheetFragment.EntrySheetContract.View {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.mybossseasonfinal.justthejob.MainActivity.MainFragment.EntrySheetFragment.EntrySheetPresenter entrySheetPresenter;
    private android.widget.Button buttonSubmitEntrySheet;
    private android.widget.TextView textViewCompanyName;
    private android.widget.EditText editTextAfterEntry;
    private android.widget.EditText editTextTry;
    private android.widget.EditText editTextReason;
    private android.widget.EditText editTextStandard;
    public static final com.mybossseasonfinal.justthejob.MainActivity.MainFragment.EntrySheetFragment.EntrySheetFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mybossseasonfinal.justthejob.MainActivity.MainFragment.EntrySheetFragment.EntrySheetPresenter getEntrySheetPresenter() {
        return null;
    }
    
    public final void setEntrySheetPresenter(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.MainFragment.EntrySheetFragment.EntrySheetPresenter p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void showCompanyName(@org.jetbrains.annotations.NotNull()
    java.lang.String companyName) {
    }
    
    public EntrySheetFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/EntrySheetFragment/EntrySheetFragment$Companion;", "", "()V", "createInstance", "Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/EntrySheetFragment/EntrySheetFragment;", "companyId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.mybossseasonfinal.justthejob.MainActivity.MainFragment.EntrySheetFragment.EntrySheetFragment createInstance(int companyId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}