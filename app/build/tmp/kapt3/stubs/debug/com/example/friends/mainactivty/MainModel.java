package com.example.friends.mainactivty;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0018H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/example/friends/mainactivty/MainModel;", "Lcom/example/friends/mainactivty/MainScreenContract$MainModel;", "firebase", "Lcom/example/friends/firebase/MyFirebase;", "msPref", "Lcom/example/friends/savedata/MySheradPreferans;", "(Lcom/example/friends/firebase/MyFirebase;Lcom/example/friends/savedata/MySheradPreferans;)V", "getFirebase", "()Lcom/example/friends/firebase/MyFirebase;", "setFirebase", "(Lcom/example/friends/firebase/MyFirebase;)V", "getMsPref", "()Lcom/example/friends/savedata/MySheradPreferans;", "setMsPref", "(Lcom/example/friends/savedata/MySheradPreferans;)V", "checkVerificationCode", "", "verificationCode", "", "onFinishedListener", "Lcom/example/friends/mainactivty/MainScreenContract$MainModel$OnFinishedListener;", "createAccount", "phoneNumber", "isSaveAnyUser", "", "saveAnyUser", "boolean", "app_debug"})
public final class MainModel implements com.example.friends.mainactivty.MainScreenContract.MainModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.friends.firebase.MyFirebase firebase;
    @org.jetbrains.annotations.NotNull()
    private com.example.friends.savedata.MySheradPreferans msPref;
    
    @java.lang.Override()
    public void saveAnyUser(boolean p0_32355860) {
    }
    
    @java.lang.Override()
    public boolean isSaveAnyUser() {
        return false;
    }
    
    @java.lang.Override()
    public void createAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    com.example.friends.mainactivty.MainScreenContract.MainModel.OnFinishedListener onFinishedListener) {
    }
    
    @java.lang.Override()
    public void checkVerificationCode(@org.jetbrains.annotations.NotNull()
    java.lang.String verificationCode, @org.jetbrains.annotations.NotNull()
    com.example.friends.mainactivty.MainScreenContract.MainModel.OnFinishedListener onFinishedListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.friends.firebase.MyFirebase getFirebase() {
        return null;
    }
    
    public final void setFirebase(@org.jetbrains.annotations.NotNull()
    com.example.friends.firebase.MyFirebase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.friends.savedata.MySheradPreferans getMsPref() {
        return null;
    }
    
    public final void setMsPref(@org.jetbrains.annotations.NotNull()
    com.example.friends.savedata.MySheradPreferans p0) {
    }
    
    @javax.inject.Inject()
    public MainModel(@org.jetbrains.annotations.NotNull()
    com.example.friends.firebase.MyFirebase firebase, @org.jetbrains.annotations.NotNull()
    com.example.friends.savedata.MySheradPreferans msPref) {
        super();
    }
}