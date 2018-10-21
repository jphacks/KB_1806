package com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/mybossseasonfinal/justthejob/MatchingByEntrySheetCompleteActivity/MatchingByEntrySheetCompleteActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/mybossseasonfinal/justthejob/MatchingByEntrySheetCompleteActivity/MatchingByEntrySheetCompleteContract$View;", "()V", "companyId", "", "getCompanyId", "()I", "setCompanyId", "(I)V", "content", "", "imageViewWorker", "Landroid/widget/ImageView;", "imgUrl", "matchingByEntrySheetCompletePresenter", "Lcom/mybossseasonfinal/justthejob/MatchingByEntrySheetCompleteActivity/MatchingByEntrySheetCompletePresenter;", "getMatchingByEntrySheetCompletePresenter", "()Lcom/mybossseasonfinal/justthejob/MatchingByEntrySheetCompleteActivity/MatchingByEntrySheetCompletePresenter;", "setMatchingByEntrySheetCompletePresenter", "(Lcom/mybossseasonfinal/justthejob/MatchingByEntrySheetCompleteActivity/MatchingByEntrySheetCompletePresenter;)V", "name", "textViewBestMatchWorker", "Landroid/widget/TextView;", "textViewMatchRate", "userId", "getWorkerInfomation", "", "matchingWorker", "Lcom/mybossseasonfinal/justthejob/Models/MatchingWorker;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setWorkerInfomation", "worker", "Lcom/mybossseasonfinal/justthejob/Models/Worker;", "app_debug"})
public final class MatchingByEntrySheetCompleteActivity extends android.support.v7.app.AppCompatActivity implements com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompleteContract.View {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompletePresenter matchingByEntrySheetCompletePresenter;
    private android.widget.ImageView imageViewWorker;
    private android.widget.TextView textViewBestMatchWorker;
    private android.widget.TextView textViewMatchRate;
    private java.lang.String content;
    private int userId;
    private java.lang.String name;
    private java.lang.String imgUrl;
    private int companyId;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompletePresenter getMatchingByEntrySheetCompletePresenter() {
        return null;
    }
    
    public final void setMatchingByEntrySheetCompletePresenter(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompletePresenter p0) {
    }
    
    public final int getCompanyId() {
        return 0;
    }
    
    public final void setCompanyId(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void getWorkerInfomation(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.Models.MatchingWorker matchingWorker) {
    }
    
    @java.lang.Override()
    public void setWorkerInfomation(@org.jetbrains.annotations.NotNull()
    com.mybossseasonfinal.justthejob.Models.Worker worker) {
    }
    
    public MatchingByEntrySheetCompleteActivity() {
        super();
    }
}