package com.mybossseasonfinal.justthejob.DI.Component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/mybossseasonfinal/justthejob/DI/Component/FragmentComponent;", "", "inject", "", "companyListFragment", "Lcom/mybossseasonfinal/justthejob/MainActivity/CompanyListFragment/CompanyListFragment;", "entrySheetFragment", "Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/EntrySheetFragment/EntrySheetFragment;", "workerIllustrationFragment", "Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/WorkerIllustrationFragment/WorkerIllustrationFragment;", "navigationDrawerFragment", "Lcom/mybossseasonfinal/justthejob/MainActivity/NavigationDrawerFragment/NavigationDrawerFragment;", "app_debug"})
@dagger.Component(dependencies = {com.mybossseasonfinal.justthejob.DI.Component.AppComponent.class}, modules = {com.mybossseasonfinal.justthejob.DI.Module.FragmentModule.class})
@com.mybossseasonfinal.justthejob.PerFragment()
public abstract interface FragmentComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment.NavigationDrawerFragment navigationDrawerFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment.CompanyListFragment companyListFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.MainFragment.WorkerIllustrationFragment.WorkerIllustrationFragment workerIllustrationFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.MainFragment.EntrySheetFragment.EntrySheetFragment entrySheetFragment);
}