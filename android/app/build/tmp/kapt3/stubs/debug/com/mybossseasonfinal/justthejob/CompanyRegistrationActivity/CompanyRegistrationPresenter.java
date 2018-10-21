package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationPresenter;", "Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationContract$Presenter;", "apiService", "Lcom/mybossseasonfinal/justthejob/Services/ApiService;", "view", "Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationContract$View;", "(Lcom/mybossseasonfinal/justthejob/Services/ApiService;Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationContract$View;)V", "getCompany", "", "companyId", "", "postUsersCompany", "userId", "app_debug"})
public final class CompanyRegistrationPresenter implements com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationContract.Presenter {
    private com.mybossseasonfinal.justthejob.Services.ApiService apiService;
    private com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationContract.View view;
    
    /**
     * * 企業情報を取得するGetリクエスト
     */
    @java.lang.Override()
    public void getCompany(int companyId) {
    }
    
    /**
     * * 企業情報を追加するPostリクエスト
     */
    @java.lang.Override()
    public void postUsersCompany(int userId, int companyId) {
    }
    
    @javax.inject.Inject()
    public CompanyRegistrationPresenter(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.Services.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationContract.View view) {
        super();
    }
}