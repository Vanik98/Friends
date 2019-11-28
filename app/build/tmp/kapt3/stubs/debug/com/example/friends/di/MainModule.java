package com.example.friends.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/example/friends/di/MainModule;", "", "()V", "provideMainModel", "Lcom/example/friends/mainactivty/MainScreenContract$MainModel;", "firebase", "Lcom/example/friends/firebase/MyFirebase;", "msPref", "Lcom/example/friends/savedata/MySheradPreferans;", "provideMainPresenter", "Lcom/example/friends/mainactivty/MainScreenContract$MainPresenter;", "mainModel", "provideMainUI", "Lcom/example/friends/ui/MainActivityUI;", "app_debug"})
@dagger.Module()
public final class MainModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.friends.ui.MainActivityUI provideMainUI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.friends.mainactivty.MainScreenContract.MainPresenter provideMainPresenter(@org.jetbrains.annotations.NotNull()
    com.example.friends.mainactivty.MainScreenContract.MainModel mainModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.friends.mainactivty.MainScreenContract.MainModel provideMainModel(@org.jetbrains.annotations.NotNull()
    com.example.friends.firebase.MyFirebase firebase, @org.jetbrains.annotations.NotNull()
    com.example.friends.savedata.MySheradPreferans msPref) {
        return null;
    }
    
    public MainModule() {
        super();
    }
}