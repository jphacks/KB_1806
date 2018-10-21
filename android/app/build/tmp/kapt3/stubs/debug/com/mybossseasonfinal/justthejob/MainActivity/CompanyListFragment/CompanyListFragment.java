package com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\u001a\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0016\u0010 \u001a\u00020\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MainActivity/CompanyListFragment/CompanyListFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/mybossseasonfinal/justthejob/MainActivity/CompanyListFragment/CompanyListFragmentContract$View;", "Lcom/mybossseasonfinal/justthejob/MainActivity/CompanyListFragment/CompanyListAdapter$ViewHolder$ItemClickListener;", "()V", "companyId", "", "companyListFragmentPresenter", "Lcom/mybossseasonfinal/justthejob/MainActivity/CompanyListFragment/CompanyListFragmentPresenter;", "getCompanyListFragmentPresenter", "()Lcom/mybossseasonfinal/justthejob/MainActivity/CompanyListFragment/CompanyListFragmentPresenter;", "setCompanyListFragmentPresenter", "(Lcom/mybossseasonfinal/justthejob/MainActivity/CompanyListFragment/CompanyListFragmentPresenter;)V", "companyListRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "matchingCompanyList", "", "Lcom/mybossseasonfinal/justthejob/Models/Company;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onItemClick", "view", "position", "onViewCreated", "setMatchedCompany", "companies", "setMatchedCompanyRecyclerView", "Companion", "app_debug"})
public final class CompanyListFragment extends android.support.v4.app.Fragment implements com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragmentContract.View, com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListAdapter.ViewHolder.ItemClickListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragmentPresenter companyListFragmentPresenter;
    private android.support.v7.widget.RecyclerView companyListRecyclerView;
    private int companyId;
    private java.util.List<com.mybossseasonfinal.justthejob.Models.Company> matchingCompanyList;
    public static final com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragmentPresenter getCompanyListFragmentPresenter() {
        return null;
    }
    
    public final void setCompanyListFragmentPresenter(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragmentPresenter p0) {
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
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    android.view.View view, int position) {
    }
    
    @java.lang.Override()
    public void setMatchedCompany(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mybossseasonfinal.justthejob.Models.Company> companies) {
    }
    
    private final void setMatchedCompanyRecyclerView() {
    }
    
    public CompanyListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MainActivity/CompanyListFragment/CompanyListFragment$Companion;", "", "()V", "createInstance", "Lcom/mybossseasonfinal/justthejob/MainActivity/CompanyListFragment/CompanyListFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragment createInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}