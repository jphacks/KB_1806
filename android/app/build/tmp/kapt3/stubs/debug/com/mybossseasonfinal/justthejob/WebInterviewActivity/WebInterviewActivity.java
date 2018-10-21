package com.mybossseasonfinal.justthejob.WebInterviewActivity;

import java.lang.System;

/**
 * * Web面接画面
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0014J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J+\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f2\u0006\u0010 \u001a\u00020!H\u0016\u00a2\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0013H\u0002J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u000fH\u0002J\b\u0010&\u001a\u00020\u0013H\u0002J\b\u0010\'\u001a\u00020\u0013H\u0002J\b\u0010(\u001a\u00020\u0013H\u0002J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\fH\u0002J\b\u0010+\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/mybossseasonfinal/justthejob/WebInterviewActivity/WebInterviewActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "_bConnected", "", "_handler", "Landroid/os/Handler;", "_localStream", "Lio/skyway/Peer/Browser/MediaStream;", "_mediaConnection", "Lio/skyway/Peer/MediaConnection;", "_peer", "Lio/skyway/Peer/Peer;", "_remoteStream", "_strOwnId", "", "tvOwnId", "Landroid/widget/TextView;", "closeRemoteStream", "", "destroyPeer", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPeerSelected", "strPeerId", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setMediaCallbacks", "showCurrentPeerId", "ownId", "startLocalStream", "toMainView", "unsetMediaCallbacks", "unsetPeerCallback", "peer", "updateActionButtonTitle", "app_debug"})
public final class WebInterviewActivity extends android.support.v7.app.AppCompatActivity {
    private io.skyway.Peer.Peer _peer;
    private io.skyway.Peer.Browser.MediaStream _localStream;
    private java.lang.String _strOwnId;
    private android.os.Handler _handler;
    private io.skyway.Peer.Browser.MediaStream _remoteStream;
    private io.skyway.Peer.MediaConnection _mediaConnection;
    private boolean _bConnected;
    private android.widget.TextView tvOwnId;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void showCurrentPeerId(java.lang.String ownId) {
    }
    
    private final void startLocalStream() {
    }
    
    private final void onPeerSelected(java.lang.String strPeerId) {
    }
    
    private final void setMediaCallbacks() {
    }
    
    private final void updateActionButtonTitle() {
    }
    
    private final void closeRemoteStream() {
    }
    
    private final void destroyPeer() {
    }
    
    private final void unsetPeerCallback(io.skyway.Peer.Peer peer) {
    }
    
    private final void unsetMediaCallbacks() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void toMainView() {
    }
    
    public WebInterviewActivity() {
        super();
    }
}