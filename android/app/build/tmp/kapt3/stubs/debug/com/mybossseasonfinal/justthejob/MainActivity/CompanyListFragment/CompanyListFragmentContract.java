package com.mybossseasonfinal.justthejob.MainActivity.CompanyListFragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MainActivity/CompanyListFragment/CompanyListFragmentContract;", "", "Presenter", "View", "app_debug"})
public abstract interface CompanyListFragmentContract {
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MainActivity/CompanyListFragment/CompanyListFragmentContract$View;", "", "setMatchedCompany", "", "companies", "", "Lcom/mybossseasonfinal/justthejob/Models/Company;", "app_debug"})
    public static abstract interface View {
        
        public abstract void setMatchedCompany(@org.jetbrains.annotations.NotNull()
        java.util.List<com.mybossseasonfinal.justthejob.Models.Company> companies);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MainActivity/CompanyListFragment/CompanyListFragmentContract$Presenter;", "", "app_debug"})
    public static abstract interface Presenter {
    }
}