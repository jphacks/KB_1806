package com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MatchingByEntrySheetCompleteActivity/MatchingByEntrySheetCompleteContract;", "", "Presenter", "View", "app_debug"})
public abstract interface MatchingByEntrySheetCompleteContract {
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MatchingByEntrySheetCompleteActivity/MatchingByEntrySheetCompleteContract$View;", "", "getWorkerInfomation", "", "matchingWorker", "Lcom/mybossseasonfinal/justthejob/Models/MatchingWorker;", "setWorkerInfomation", "worker", "Lcom/mybossseasonfinal/justthejob/Models/Worker;", "app_debug"})
    public static abstract interface View {
        
        public abstract void getWorkerInfomation(@org.jetbrains.annotations.NotNull()
        com.mybossseasonfinal.justthejob.Models.MatchingWorker matchingWorker);
        
        public abstract void setWorkerInfomation(@org.jetbrains.annotations.NotNull()
        com.mybossseasonfinal.justthejob.Models.Worker worker);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MatchingByEntrySheetCompleteActivity/MatchingByEntrySheetCompleteContract$Presenter;", "", "getBestMatchWorker", "", "companyId", "", "userId", "getWorker", "workerId", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getBestMatchWorker(int companyId, int userId);
        
        public abstract void getWorker(int companyId, int workerId);
    }
}