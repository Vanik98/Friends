package com.example.friends.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/friends/di/ActivityModule;", "", "activity", "Lcom/example/friends/base/BaseActivity;", "(Lcom/example/friends/base/BaseActivity;)V", "provideActivity", "app_debug"})
@dagger.Module()
public final class ActivityModule {
    private com.example.friends.base.BaseActivity activity;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.friends.base.BaseActivity provideActivity() {
        return null;
    }
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    com.example.friends.base.BaseActivity activity) {
        super();
    }
}