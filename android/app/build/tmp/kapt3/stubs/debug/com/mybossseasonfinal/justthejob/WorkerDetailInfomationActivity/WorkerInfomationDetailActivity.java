package com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u0010\u00102\u001a\u00020/2\u0006\u00103\u001a\u000204H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u000e\u0010\'\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u00a8\u00065"}, d2 = {"Lcom/mybossseasonfinal/justthejob/WorkerDetailInfomationActivity/WorkerInfomationDetailActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/mybossseasonfinal/justthejob/WorkerDetailInfomationActivity/WorkerInfomationDetailContract$View;", "()V", "buttonApplication", "Landroid/widget/Button;", "getButtonApplication", "()Landroid/widget/Button;", "setButtonApplication", "(Landroid/widget/Button;)V", "companyId", "", "imageViewWorkerPhoto", "Landroid/widget/ImageView;", "getImageViewWorkerPhoto", "()Landroid/widget/ImageView;", "setImageViewWorkerPhoto", "(Landroid/widget/ImageView;)V", "textViewHoliday", "Landroid/widget/TextView;", "getTextViewHoliday", "()Landroid/widget/TextView;", "setTextViewHoliday", "(Landroid/widget/TextView;)V", "textViewSelfIntroduction", "getTextViewSelfIntroduction", "setTextViewSelfIntroduction", "textViewWorkDetail", "getTextViewWorkDetail", "setTextViewWorkDetail", "textViewWorkerDepartment", "getTextViewWorkerDepartment", "setTextViewWorkerDepartment", "textViewWorkerName", "getTextViewWorkerName", "setTextViewWorkerName", "textViewYear", "getTextViewYear", "setTextViewYear", "workerId", "workerInfomationDetailPresenter", "Lcom/mybossseasonfinal/justthejob/WorkerDetailInfomationActivity/WorkerInfomationDetailPresenter;", "getWorkerInfomationDetailPresenter", "()Lcom/mybossseasonfinal/justthejob/WorkerDetailInfomationActivity/WorkerInfomationDetailPresenter;", "setWorkerInfomationDetailPresenter", "(Lcom/mybossseasonfinal/justthejob/WorkerDetailInfomationActivity/WorkerInfomationDetailPresenter;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setWorkerInfomation", "worker", "Lcom/mybossseasonfinal/justthejob/Models/Worker;", "app_debug"})
public final class WorkerInfomationDetailActivity extends android.support.v7.app.AppCompatActivity implements com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailContract.View {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailPresenter workerInfomationDetailPresenter;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView imageViewWorkerPhoto;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView textViewWorkerName;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView textViewWorkerDepartment;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView textViewYear;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView textViewSelfIntroduction;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView textViewWorkDetail;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView textViewHoliday;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button buttonApplication;
    private int workerId;
    private int companyId;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailPresenter getWorkerInfomationDetailPresenter() {
        return null;
    }
    
    public final void setWorkerInfomationDetailPresenter(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getImageViewWorkerPhoto() {
        return null;
    }
    
    public final void setImageViewWorkerPhoto(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewWorkerName() {
        return null;
    }
    
    public final void setTextViewWorkerName(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewWorkerDepartment() {
        return null;
    }
    
    public final void setTextViewWorkerDepartment(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewYear() {
        return null;
    }
    
    public final void setTextViewYear(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewSelfIntroduction() {
        return null;
    }
    
    public final void setTextViewSelfIntroduction(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewWorkDetail() {
        return null;
    }
    
    public final void setTextViewWorkDetail(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewHoliday() {
        return null;
    }
    
    public final void setTextViewHoliday(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getButtonApplication() {
        return null;
    }
    
    public final void setButtonApplication(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setWorkerInfomation(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.Models.Worker worker) {
    }
    
    public WorkerInfomationDetailActivity() {
        super();
    }
}