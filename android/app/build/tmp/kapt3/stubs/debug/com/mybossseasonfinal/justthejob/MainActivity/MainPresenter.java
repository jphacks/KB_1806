package com.mybossseasonfinal.justthejob.MainActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MainActivity/MainPresenter;", "Lcom/mybossseasonfinal/justthejob/MainActivity/MainContract$Presenter;", "apiService", "Lcom/mybossseasonfinal/justthejob/Services/ApiService;", "view", "Lcom/mybossseasonfinal/justthejob/MainActivity/MainContract$View;", "(Lcom/mybossseasonfinal/justthejob/Services/ApiService;Lcom/mybossseasonfinal/justthejob/MainActivity/MainContract$View;)V", "apiRequest", "", "app_debug"})
public final class MainPresenter implements com.mybossseasonfinal.justthejob.MainActivity.MainContract.Presenter {
    private com.mybossseasonfinal.justthejob.Services.ApiService apiService;
    private com.mybossseasonfinal.justthejob.MainActivity.MainContract.View view;
    
    @java.lang.Override()
    public void apiRequest() {
    }
    
    @javax.inject.Inject()
    public MainPresenter(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.Services.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.MainContract.View view) {
        super();
    }
}