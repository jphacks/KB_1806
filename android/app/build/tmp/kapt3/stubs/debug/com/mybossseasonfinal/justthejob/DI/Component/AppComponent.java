package com.mybossseasonfinal.justthejob.DI.Component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/mybossseasonfinal/justthejob/DI/Component/AppComponent;", "", "apiService", "Lcom/mybossseasonfinal/justthejob/Services/ApiService;", "application", "Landroid/app/Application;", "app_debug"})
@dagger.Component(modules = {com.mybossseasonfinal.justthejob.DI.Module.AppModule.class, com.mybossseasonfinal.justthejob.DI.Module.ApiModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.app.Application application();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.mybossseasonfinal.justthejob.Services.ApiService apiService();
}