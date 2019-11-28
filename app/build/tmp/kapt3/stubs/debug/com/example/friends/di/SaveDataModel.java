package com.example.friends.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/example/friends/di/SaveDataModel;", "", "()V", "provideMySheradPreferans", "Lcom/example/friends/savedata/MySheradPreferans;", "sPref", "Landroid/content/SharedPreferences;", "provideSharedPreferences", "activity", "Lcom/example/friends/base/BaseActivity;", "app_debug"})
@dagger.Module()
public final class SaveDataModel {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull()
    com.example.friends.base.BaseActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.friends.savedata.MySheradPreferans provideMySheradPreferans(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sPref) {
        return null;
    }
    
    public SaveDataModel() {
        super();
    }
}