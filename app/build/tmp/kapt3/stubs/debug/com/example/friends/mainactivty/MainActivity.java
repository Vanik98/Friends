package com.example.friends.mainactivty;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\u0011H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006%"}, d2 = {"Lcom/example/friends/mainactivty/MainActivity;", "Lcom/example/friends/base/BaseActivity;", "Lcom/example/friends/mainactivty/MainScreenContract$MainView;", "()V", "presenter", "Lcom/example/friends/mainactivty/MainScreenContract$MainPresenter;", "getPresenter", "()Lcom/example/friends/mainactivty/MainScreenContract$MainPresenter;", "setPresenter", "(Lcom/example/friends/mainactivty/MainScreenContract$MainPresenter;)V", "ui", "Lcom/example/friends/ui/MainActivityUI;", "getUi", "()Lcom/example/friends/ui/MainActivityUI;", "setUi", "(Lcom/example/friends/ui/MainActivityUI;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onStart", "openMapActivity", "openVerificationDialog", "context", "Landroid/content/Context;", "setupComponent", "applicationComponent", "Lcom/example/friends/di/component/ApplicationComponent;", "showMessageIsAccountCreated", "isCreate", "", "showMessageIsVerifyAccount", "isVerify", "showMessageisSignIn", "isSignin", "showVerifycationDialog", "app_debug"})
public final class MainActivity extends com.example.friends.base.BaseActivity implements com.example.friends.mainactivty.MainScreenContract.MainView {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.friends.ui.MainActivityUI ui;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.friends.mainactivty.MainScreenContract.MainPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void setupComponent(@org.jetbrains.annotations.NotNull()
    com.example.friends.di.component.ApplicationComponent applicationComponent) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.friends.ui.MainActivityUI getUi() {
        return null;
    }
    
    public final void setUi(@org.jetbrains.annotations.NotNull()
    com.example.friends.ui.MainActivityUI p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.friends.mainactivty.MainScreenContract.MainPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.example.friends.mainactivty.MainScreenContract.MainPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void showMessageIsAccountCreated(boolean isCreate) {
    }
    
    @java.lang.Override()
    public void showMessageIsVerifyAccount(boolean isVerify) {
    }
    
    @java.lang.Override()
    public void showMessageisSignIn(boolean isSignin) {
    }
    
    @java.lang.Override()
    public void openMapActivity() {
    }
    
    private final void openVerificationDialog(android.content.Context context) {
    }
    
    @java.lang.Override()
    public void showVerifycationDialog() {
    }
    
    public MainActivity() {
        super();
    }
}