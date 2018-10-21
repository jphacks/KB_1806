package com.mybossseasonfinal.justthejob.MainActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010%\u001a\u00020\u0015H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006&"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MainActivity/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/mybossseasonfinal/justthejob/MainActivity/MainContract$View;", "Landroid/support/design/widget/NavigationView$OnNavigationItemSelectedListener;", "()V", "companyId", "", "getCompanyId", "()I", "setCompanyId", "(I)V", "count", "getCount", "setCount", "mainPresenter", "Lcom/mybossseasonfinal/justthejob/MainActivity/MainPresenter;", "getMainPresenter", "()Lcom/mybossseasonfinal/justthejob/MainActivity/MainPresenter;", "setMainPresenter", "(Lcom/mybossseasonfinal/justthejob/MainActivity/MainPresenter;)V", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onNavigationItemSelected", "item", "Landroid/view/MenuItem;", "onOptionsItemSelected", "onResume", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity implements com.mybossseasonfinal.justthejob.MainActivity.MainContract.View, android.support.design.widget.NavigationView.OnNavigationItemSelectedListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.mybossseasonfinal.justthejob.MainActivity.MainPresenter mainPresenter;
    private int companyId;
    private int count;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mybossseasonfinal.justthejob.MainActivity.MainPresenter getMainPresenter() {
        return null;
    }
    
    public final void setMainPresenter(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MainActivity.MainPresenter p0) {
    }
    
    public final int getCompanyId() {
        return 0;
    }
    
    public final void setCompanyId(int p0) {
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public MainActivity() {
        super();
    }
}