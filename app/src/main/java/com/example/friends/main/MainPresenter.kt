package com.example.friends.main

import android.util.Log
import com.example.friends.data.model.User
import javax.inject.Inject

class MainPresenter @Inject constructor(
    var model: MainContract.MainModel
) : MainContract.MainPresenter {

    private lateinit var view: MainContract.MainView
    private lateinit var createdMessage:String
    override fun createAccount(user: User) {
        model.createAccount(user,
            object:MainContract.MainModel.OnFinishedListener{
                override fun onFinished(message: String) {
                    view.showVerificationDialog()
                    view.showMessageIsAccountCreated(true)
                    createdMessage = message
                    Log.i("vvv",message)
                }

                override fun onProgress() {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onFailure(t: Throwable) {
                    Log.i("vvv",t.message)
                    view.showMessageIsAccountCreated(false)
                }
            })
    }

    override fun checkVerificationCode(verificationCode: String){
        model.checkVerificationCode(verificationCode,object :MainContract.MainModel.OnFinishedListener{
            override fun onFinished(message: String) {
                if(createdMessage != "Account has already been created.") {
                    model.saveUserId(message)
                }
                view.showMessageIsVerifyAccount(true)
                view.openMapActivity(model.getUserId())
            }

            override fun onProgress() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onFailure(t: Throwable) {
                Log.i("vvv",t.message)
                view.showMessageIsAccountCreated(false)
            }
        })

    }

    override fun subscribe() {

    }

    override fun unsubscribe() {

    }

    override  fun attach(view: MainContract.MainView) {
        this.view = view
        val accountId:String = model.getUserId()
        Log.i("vvv", accountId)
        if(accountId.isNotEmpty()) {
            view.openMapActivity(model.getUserId())
        }
    }
}