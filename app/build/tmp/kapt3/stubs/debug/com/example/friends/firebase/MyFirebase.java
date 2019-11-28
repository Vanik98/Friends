package com.example.friends.firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/friends/firebase/MyFirebase;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "message", "", "verificationID", "sendVerificationCode", "", "phoneNumber", "onFinishedListener", "Lcom/example/friends/mainactivty/MainScreenContract$MainModel$OnFinishedListener;", "signInWithPhoneAuthCrendential", "credential", "Lcom/google/firebase/auth/AuthCredential;", "verifySignInCode", "code", "app_debug"})
public final class MyFirebase {
    private com.google.firebase.auth.FirebaseAuth mAuth;
    private java.lang.String verificationID;
    private java.lang.String message;
    @org.jetbrains.annotations.NotNull()
    private android.app.Activity activity;
    
    public final void sendVerificationCode(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    com.example.friends.mainactivty.MainScreenContract.MainModel.OnFinishedListener onFinishedListener) {
    }
    
    public final void verifySignInCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    com.example.friends.mainactivty.MainScreenContract.MainModel.OnFinishedListener onFinishedListener) {
    }
    
    public final void signInWithPhoneAuthCrendential(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.AuthCredential credential, @org.jetbrains.annotations.NotNull()
    com.example.friends.mainactivty.MainScreenContract.MainModel.OnFinishedListener onFinishedListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    @javax.inject.Inject()
    public MyFirebase(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
}