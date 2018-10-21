package com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/mybossseasonfinal/justthejob/WorkerDetailInfomationActivity/WorkerInfomationDetailPresenter;", "Lcom/mybossseasonfinal/justthejob/WorkerDetailInfomationActivity/WorkerInfomationDetailContract$Presenter;", "apiService", "Lcom/mybossseasonfinal/justthejob/Services/ApiService;", "view", "Lcom/mybossseasonfinal/justthejob/WorkerDetailInfomationActivity/WorkerInfomationDetailContract$View;", "(Lcom/mybossseasonfinal/justthejob/Services/ApiService;Lcom/mybossseasonfinal/justthejob/WorkerDetailInfomationActivity/WorkerInfomationDetailContract$View;)V", "getWorker", "", "companyId", "", "workerId", "app_debug"})
public final class WorkerInfomationDetailPresenter implements com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailContract.Presenter {
    private com.mybossseasonfinal.justthejob.Services.ApiService apiService;
    private com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailContract.View view;
    
    @java.lang.Override()
    public void getWorker(int companyId, int workerId) {
    }
    
    @javax.inject.Inject()
    public WorkerInfomationDetailPresenter(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.Services.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailContract.View view) {
        super();
    }
}