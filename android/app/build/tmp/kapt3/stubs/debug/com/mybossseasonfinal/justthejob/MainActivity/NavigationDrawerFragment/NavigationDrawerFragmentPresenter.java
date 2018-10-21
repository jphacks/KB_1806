package com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MainActivity/NavigationDrawerFragment/NavigationDrawerFragmentPresenter;", "Lcom/mybossseasonfinal/justthejob/MainActivity/NavigationDrawerFragment/NavigationDrawerFragmentContract$Presenter;", "apiService", "Lcom/mybossseasonfinal/justthejob/Services/ApiService;", "view", "Lcom/mybossseasonfinal/justthejob/MainActivity/NavigationDrawerFragment/NavigationDrawerFragmentContract$View;", "(Lcom/mybossseasonfinal/justthejob/Services/ApiService;Lcom/mybossseasonfinal/justthejob/MainActivity/NavigationDrawerFragment/NavigationDrawerFragmentContract$View;)V", "getCompany", "", "companyId", "", "getContents", "", "Lcom/mybossseasonfinal/justthejob/Models/Content;", "app_debug"})
public final class NavigationDrawerFragmentPresenter implements com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment.NavigationDrawerFragmentContract.Presenter {
    private final com.mybossseasonfinal.justthejob.Services.ApiService apiService = null;
    private final com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment.NavigationDrawerFragmentContract.View view = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mybossseasonfinal.justthejob.Models.Content> getContents() {
        return null;
    }
    
    public final void getCompany(int companyId) {
    }
    
    @javax.inject.Inject()
    public NavigationDrawerFragmentPresenter(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.Services.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.NavigationDrawerFragment.NavigationDrawerFragmentContract.View view) {
        super();
    }
}