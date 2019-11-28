package com.example.friends.mainactivty;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/friends/mainactivty/MainScreenContract;", "", "MainModel", "MainPresenter", "MainView", "app_debug"})
public abstract interface MainScreenContract {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/friends/mainactivty/MainScreenContract$MainView;", "Lcom/example/friends/base/BaseContract$View;", "openMapActivity", "", "showMessageIsAccountCreated", "isCreate", "", "showMessageIsVerifyAccount", "isVerify", "showMessageisSignIn", "showVerifycationDialog", "app_debug"})
    public static abstract interface MainView extends com.example.friends.base.BaseContract.View {
        
        public abstract void showMessageIsAccountCreated(boolean isCreate);
        
        public abstract void showMessageIsVerifyAccount(boolean isVerify);
        
        public abstract void showVerifycationDialog();
        
        public abstract void showMessageisSignIn(boolean isVerify);
        
        public abstract void openMapActivity();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H&\u00a8\u0006\t"}, d2 = {"Lcom/example/friends/mainactivty/MainScreenContract$MainPresenter;", "Lcom/example/friends/base/BaseContract$Presenter;", "Lcom/example/friends/mainactivty/MainScreenContract$MainView;", "checkVerificationCode", "", "verificationCode", "", "createAccount", "phoneNumber", "app_debug"})
    public static abstract interface MainPresenter extends com.example.friends.base.BaseContract.Presenter<com.example.friends.mainactivty.MainScreenContract.MainView> {
        
        public abstract void checkVerificationCode(@org.jetbrains.annotations.NotNull()
        java.lang.String verificationCode);
        
        public abstract void createAccount(@org.jetbrains.annotations.NotNull()
        java.lang.String phoneNumber);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&\u00a8\u0006\u000f"}, d2 = {"Lcom/example/friends/mainactivty/MainScreenContract$MainModel;", "Lcom/example/friends/base/BaseContract$Model;", "checkVerificationCode", "", "verificationCode", "", "onFinishedListener", "Lcom/example/friends/mainactivty/MainScreenContract$MainModel$OnFinishedListener;", "createAccount", "phoneNumber", "isSaveAnyUser", "", "saveAnyUser", "boolean", "OnFinishedListener", "app_debug"})
    public static abstract interface MainModel extends com.example.friends.base.BaseContract.Model {
        
        public abstract void checkVerificationCode(@org.jetbrains.annotations.NotNull()
        java.lang.String verificationCode, @org.jetbrains.annotations.NotNull()
        com.example.friends.mainactivty.MainScreenContract.MainModel.OnFinishedListener onFinishedListener);
        
        public abstract void createAccount(@org.jetbrains.annotations.NotNull()
        java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
        com.example.friends.mainactivty.MainScreenContract.MainModel.OnFinishedListener onFinishedListener);
        
        public abstract void saveAnyUser(boolean p0_32355860);
        
        public abstract boolean isSaveAnyUser();
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/friends/mainactivty/MainScreenContract$MainModel$OnFinishedListener;", "", "onFailure", "", "t", "", "onFinished", "message", "", "app_debug"})
        public static abstract interface OnFinishedListener {
            
            public abstract void onFinished(@org.jetbrains.annotations.NotNull()
            java.lang.String message);
            
            public abstract void onFailure(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable t);
        }
    }
}