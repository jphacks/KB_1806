package com.mybossseasonfinal.justthejob.DI.Module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rB\u000f\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0006H\u0007J\b\u0010\u0012\u001a\u00020\u0003H\u0007J\b\u0010\u0013\u001a\u00020\u000fH\u0007J\b\u0010\u0014\u001a\u00020\fH\u0007J\b\u0010\u0015\u001a\u00020\tH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/mybossseasonfinal/justthejob/DI/Module/ActivityModule;", "", "mainView", "Lcom/mybossseasonfinal/justthejob/MainActivity/MainContract$View;", "(Lcom/mybossseasonfinal/justthejob/MainActivity/MainContract$View;)V", "companyRegistrationView", "Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationContract$View;", "(Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationContract$View;)V", "workerInfomationDetailView", "Lcom/mybossseasonfinal/justthejob/WorkerDetailInfomationActivity/WorkerInfomationDetailContract$View;", "(Lcom/mybossseasonfinal/justthejob/WorkerDetailInfomationActivity/WorkerInfomationDetailContract$View;)V", "matchingRequestCompleteView", "Lcom/mybossseasonfinal/justthejob/MatchingRequestCompleteActivity/MatchingRequestCompleteContract$View;", "(Lcom/mybossseasonfinal/justthejob/MatchingRequestCompleteActivity/MatchingRequestCompleteContract$View;)V", "matchingByEntrySheetCompleteView", "Lcom/mybossseasonfinal/justthejob/MatchingByEntrySheetCompleteActivity/MatchingByEntrySheetCompleteContract$View;", "(Lcom/mybossseasonfinal/justthejob/MatchingByEntrySheetCompleteActivity/MatchingByEntrySheetCompleteContract$View;)V", "provideCompanyRegistrationContractView", "provideMainContractView", "provideMatchingByEntrySheetCompleteView", "provideMatchingRequestCompleteView", "provideWorkerInfomationDetailContractView", "app_debug"})
@dagger.Module()
public final class ActivityModule {
    private com.mybossseasonfinal.justthejob.MainActivity.MainContract.View mainView;
    private com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationContract.View companyRegistrationView;
    private com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailContract.View workerInfomationDetailView;
    private com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity.MatchingRequestCompleteContract.View matchingRequestCompleteView;
    private com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompleteContract.View matchingByEntrySheetCompleteView;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.mybossseasonfinal.justthejob.PerActivity()
    public final com.mybossseasonfinal.justthejob.MainActivity.MainContract.View provideMainContractView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.mybossseasonfinal.justthejob.PerActivity()
    public final com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationContract.View provideCompanyRegistrationContractView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.mybossseasonfinal.justthejob.PerActivity()
    public final com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailContract.View provideWorkerInfomationDetailContractView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.mybossseasonfinal.justthejob.PerActivity()
    public final com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity.MatchingRequestCompleteContract.View provideMatchingRequestCompleteView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.mybossseasonfinal.justthejob.PerActivity()
    public final com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompleteContract.View provideMatchingByEntrySheetCompleteView() {
        return null;
    }
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.MainContract.View mainView) {
        super();
    }
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationContract.View companyRegistrationView) {
        super();
    }
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailContract.View workerInfomationDetailView) {
        super();
    }
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity.MatchingRequestCompleteContract.View matchingRequestCompleteView) {
        super();
    }
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompleteContract.View matchingByEntrySheetCompleteView) {
        super();
    }
}