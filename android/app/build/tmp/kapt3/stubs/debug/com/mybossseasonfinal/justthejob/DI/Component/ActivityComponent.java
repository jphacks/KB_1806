package com.mybossseasonfinal.justthejob.DI.Component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lcom/mybossseasonfinal/justthejob/DI/Component/ActivityComponent;", "", "inject", "", "companyRegistrationActivity", "Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationActivity;", "mainActivity", "Lcom/mybossseasonfinal/justthejob/MainActivity/MainActivity;", "matchingByEntrySheetCompleteActivity", "Lcom/mybossseasonfinal/justthejob/MatchingByEntrySheetCompleteActivity/MatchingByEntrySheetCompleteActivity;", "matchingRequestCompleteActivity", "Lcom/mybossseasonfinal/justthejob/MatchingRequestCompleteActivity/MatchingRequestCompleteActivity;", "workerInfomationDetailActivity", "Lcom/mybossseasonfinal/justthejob/WorkerDetailInfomationActivity/WorkerInfomationDetailActivity;", "app_debug"})
@dagger.Component(dependencies = {com.mybossseasonfinal.justthejob.DI.Component.AppComponent.class}, modules = {com.mybossseasonfinal.justthejob.DI.Module.ActivityModule.class})
@com.mybossseasonfinal.justthejob.PerActivity()
public abstract interface ActivityComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.MainActivity mainActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationActivity companyRegistrationActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailActivity workerInfomationDetailActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity.MatchingRequestCompleteActivity matchingRequestCompleteActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompleteActivity matchingByEntrySheetCompleteActivity);
}