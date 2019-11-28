package com.example.friends.mapactivty;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/friends/mapactivty/MapActivtyContract;", "", "MainModel", "MainPresenter", "MapView", "app_debug"})
public abstract interface MapActivtyContract {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/example/friends/mapactivty/MapActivtyContract$MapView;", "Lcom/example/friends/base/BaseContract$View;", "app_debug"})
    public static abstract interface MapView extends com.example.friends.base.BaseContract.View {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Lcom/example/friends/mapactivty/MapActivtyContract$MainPresenter;", "Lcom/example/friends/base/BaseContract$Presenter;", "Lcom/example/friends/mapactivty/MapActivtyContract$MapView;", "app_debug"})
    public static abstract interface MainPresenter extends com.example.friends.base.BaseContract.Presenter<com.example.friends.mapactivty.MapActivtyContract.MapView> {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/friends/mapactivty/MapActivtyContract$MainModel;", "Lcom/example/friends/base/BaseContract$Model;", "OnFinishedListener", "app_debug"})
    public static abstract interface MainModel extends com.example.friends.base.BaseContract.Model {
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/friends/mapactivty/MapActivtyContract$MainModel$OnFinishedListener;", "", "onFailure", "", "t", "", "onFinished", "app_debug"})
        public static abstract interface OnFinishedListener {
            
            public abstract void onFinished();
            
            public abstract void onFailure(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable t);
        }
    }
}