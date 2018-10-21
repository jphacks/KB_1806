package com.mybossseasonfinal.justthejob.DI.Module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0006H\u0007J\b\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\u0003H\u0007J\b\u0010\u0011\u001a\u00020\tH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/mybossseasonfinal/justthejob/DI/Module/FragmentModule;", "", "navigationDrawerFragmentView", "Lcom/mybossseasonfinal/justthejob/MainActivity/NavigationDrawerFragment/NavigationDrawerFragmentContract$View;", "(Lcom/mybossseasonfinal/justthejob/MainActivity/NavigationDrawerFragment/NavigationDrawerFragmentContract$View;)V", "companyListFragmentView", "Lcom/mybossseasonfinal/justthejob/MainActivity/CompanyListFragment/CompanyListFragmentContract$View;", "(Lcom/mybossseasonfinal/justthejob/MainActivity/CompanyListFragment/CompanyListFragmentContract$View;)V", "workerIllustrationFragmentView", "Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/WorkerIllustrationFragment/WorkerIllustrationFragmentContract$View;", "(Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/WorkerIllustrationFragment/WorkerIllustrationFragmentContract$View;)V", "entrySheetFragmentView", "Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/EntrySheetFragment/EntrySheetContract$View;", "(Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/EntrySheetFragment/EntrySheetContract$View;)V", "provideCompanyListFragmentView", "provideEntrySheetFragmentView", "provideNavigationDrawerFragmentView", "provideWorkerIllustrationFragmentView", "app_debug"})
@dagger.Module()
public final class FragmentModule {
    private com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment.NavigationDrawerFragmentContract.View navigationDrawerFragmentView;
    private com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragmentContract.View companyListFragmentView;
    private com.mybossseasonfinal.justthejob.MainActivity.MainFragment.WorkerIllustrationFragment.WorkerIllustrationFragmentContract.View workerIllustrationFragmentView;
    private com.mybossseasonfinal.justthejob.MainActivity.MainFragment.EntrySheetFragment.EntrySheetContract.View entrySheetFragmentView;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.mybossseasonfinal.justthejob.PerFragment()
    public final com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment.NavigationDrawerFragmentContract.View provideNavigationDrawerFragmentView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.mybossseasonfinal.justthejob.PerFragment()
    public final com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragmentContract.View provideCompanyListFragmentView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.mybossseasonfinal.justthejob.PerFragment()
    public final com.mybossseasonfinal.justthejob.MainActivity.MainFragment.WorkerIllustrationFragment.WorkerIllustrationFragmentContract.View provideWorkerIllustrationFragmentView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.mybossseasonfinal.justthejob.PerFragment()
    public final com.mybossseasonfinal.justthejob.MainActivity.MainFragment.EntrySheetFragment.EntrySheetContract.View provideEntrySheetFragmentView() {
        return null;
    }
    
    public FragmentModule(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment.NavigationDrawerFragmentContract.View navigationDrawerFragmentView) {
        super();
    }
    
    public FragmentModule(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragmentContract.View companyListFragmentView) {
        super();
    }
    
    public FragmentModule(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.MainFragment.WorkerIllustrationFragment.WorkerIllustrationFragmentContract.View workerIllustrationFragmentView) {
        super();
    }
    
    public FragmentModule(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.MainFragment.EntrySheetFragment.EntrySheetContract.View entrySheetFragmentView) {
        super();
    }
}