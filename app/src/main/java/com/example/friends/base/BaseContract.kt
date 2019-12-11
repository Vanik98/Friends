package com.example.friends.base

abstract class BaseContract {

    interface Presenter<in T> {
        fun subscribe()
        fun unsubscribe()
        fun attach(view: T)
    }

    interface View {

    }

    interface  Model{}

}