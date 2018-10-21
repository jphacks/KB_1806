package com.mybossseasonfinal.justthejob.CompanyRegistrationActivity;

import java.lang.System;

/**
 * * 企業登録画面
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationContract$View;", "()V", "companyInfo", "Lcom/mybossseasonfinal/justthejob/Models/Company;", "companyLogoImage", "Landroid/widget/ImageView;", "companyNameView", "Landroid/widget/TextView;", "companyRegistrationPresenter", "Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationPresenter;", "getCompanyRegistrationPresenter", "()Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationPresenter;", "setCompanyRegistrationPresenter", "(Lcom/mybossseasonfinal/justthejob/CompanyRegistrationActivity/CompanyRegistrationPresenter;)V", "registerButton", "Landroid/widget/Button;", "attachComapnyInfo", "", "fetchedCompanyInfo", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showCompanyLogo", "companyLogoUrl", "", "showCompanyName", "companyName", "showRegistrationDialog", "toMainView", "app_debug"})
public final class CompanyRegistrationActivity extends android.support.v7.app.AppCompatActivity implements com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationContract.View {
    private android.widget.TextView companyNameView;
    private android.widget.ImageView companyLogoImage;
    private android.widget.Button registerButton;
    private com.mybossseasonfinal.justthejob.Models.Company companyInfo;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationPresenter companyRegistrationPresenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationPresenter getCompanyRegistrationPresenter() {
        return null;
    }
    
    public final void setCompanyRegistrationPresenter(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * * 企業名の表示
     */
    @java.lang.Override()
    public void showCompanyName(@org.jetbrains.annotations.NotNull()
    java.lang.String companyName) {
    }
    
    /**
     * * 企業ロゴの表示
     */
    @java.lang.Override()
    public void showCompanyLogo(@org.jetbrains.annotations.NotNull()
    java.lang.String companyLogoUrl) {
    }
    
    /**
     * * Presenterで取得した企業情報をView内の変数にアタッチ
     */
    @java.lang.Override()
    public void attachComapnyInfo(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.Models.Company fetchedCompanyInfo) {
    }
    
    /**
     * * 登録ボタン タップ時の処理
     */
    private final void showRegistrationDialog(com.mybossseasonfinal.justthejob.Models.Company companyInfo) {
    }
    
    /**
     * * メイン画面へ遷移
     */
    private final void toMainView() {
    }
    
    public CompanyRegistrationActivity() {
        super();
    }
}