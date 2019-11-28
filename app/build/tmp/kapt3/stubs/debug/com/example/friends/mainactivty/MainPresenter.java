package com.example.friends.mainactivty;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\rH\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/friends/mainactivty/MainPresenter;", "Lcom/example/friends/mainactivty/MainScreenContract$MainPresenter;", "mainModel", "Lcom/example/friends/mainactivty/MainScreenContract$MainModel;", "(Lcom/example/friends/mainactivty/MainScreenContract$MainModel;)V", "getMainModel", "()Lcom/example/friends/mainactivty/MainScreenContract$MainModel;", "setMainModel", "view", "Lcom/example/friends/mainactivty/MainScreenContract$MainView;", "accountCreatedMessage", "", "isCreated", "", "attach", "checkVerificationCode", "verificationCode", "", "createAccount", "phoneNumber", "subscribe", "unsubscribe", "verificationMessage", "isVerify", "app_debug"})
public final class MainPresenter implements com.example.friends.mainactivty.MainScreenContract.MainPresenter {
    private com.example.friends.mainactivty.MainScreenContract.MainView view;
    @org.jetbrains.annotations.NotNull()
    private com.example.friends.mainactivty.MainScreenContract.MainModel mainModel;
    
    @java.lang.Override()
    public void createAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber) {
    }
    
    @java.lang.Override()
    public void checkVerificationCode(@org.jetbrains.annotations.NotNull()
    java.lang.String verificationCode) {
    }
    
    private final void accountCreatedMessage(boolean isCreated) {
    }
    
    private final void verificationMessage(boolean isVerify) {
    }
    
    @java.lang.Override()
    public void subscribe() {
    }
    
    @java.lang.Override()
    public void unsubscribe() {
    }
    
    @java.lang.Override()
    public void attach(@org.jetbrains.annotations.NotNull()
    com.example.friends.mainactivty.MainScreenContract.MainView view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.friends.mainactivty.MainScreenContract.MainModel getMainModel() {
        return null;
    }
    
    public final void setMainModel(@org.jetbrains.annotations.NotNull()
    com.example.friends.mainactivty.MainScreenContract.MainModel p0) {
    }
    
    @javax.inject.Inject()
    public MainPresenter(@org.jetbrains.annotations.NotNull()
    com.example.friends.mainactivty.MainScreenContract.MainModel mainModel) {
        super();
    }
}