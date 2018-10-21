package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationContract;", "", "Presenter", "View", "app_debug"})
public abstract interface CompanyRegistrationContract {
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&\u00a8\u0006\u000b"}, d2 = {"Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationContract$View;", "", "attachComapnyInfo", "", "companyInfo", "Lcom/mybossseasonfinal/justthejob/Models/Company;", "showCompanyLogo", "companyLogoUrl", "", "showCompanyName", "companyName", "app_debug"})
    public static abstract interface View {
        
        public abstract void showCompanyName(@org.jetbrains.annotations.NotNull()
        java.lang.String companyName);
        
        public abstract void showCompanyLogo(@org.jetbrains.annotations.NotNull()
        java.lang.String companyLogoUrl);
        
        public abstract void attachComapnyInfo(@org.jetbrains.annotations.NotNull()
        com.mybossseasonfinal.justthejob.Models.Company companyInfo);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationContract$Presenter;", "", "getCompany", "", "companyId", "", "postUsersCompany", "userId", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getCompany(int companyId);
        
        public abstract void postUsersCompany(int userId, int companyId);
    }
}