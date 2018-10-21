package com.mybossseasonfinal.justthejob.MainActivity.MainFragment.WorkerIllustrationFragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/WorkerIllustrationFragment/WorkerIllustrationFragmentContract;", "", "Presenter", "View", "app_debug"})
public abstract interface WorkerIllustrationFragmentContract {
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/WorkerIllustrationFragment/WorkerIllustrationFragmentContract$View;", "", "setWorkers", "", "workers", "", "Lcom/mybossseasonfinal/justthejob/Models/Worker;", "app_debug"})
    public static abstract interface View {
        
        public abstract void setWorkers(@org.jetbrains.annotations.NotNull()
        java.util.List<com.mybossseasonfinal.justthejob.Models.Worker> workers);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MainActivity/MainFragment/WorkerIllustrationFragment/WorkerIllustrationFragmentContract$Presenter;", "", "getWorkers", "", "companyId", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getWorkers(int companyId);
    }
}