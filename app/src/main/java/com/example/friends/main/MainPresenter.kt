package com.example.friends.main

import android.util.Log
import com.example.friends.data.model.User
import javax.inject.Inject

class MainPresenter @Inject constructor(
    var model: MainContract.MainModel
) : MainContract.MainPresenter {

    private lateinit var view: MainContract.MainView

    override fun createAccount(user: User) {
        model.createAccount(user,
            object:MainContract.MainModel.OnFinishedListener{
                override fun onFinished(message: String) {
                    view.showVerificationDialog()
                    view.showMessageIsAccountCreated(true)
//                    Log.i("vvv",message)
//                    if (message == "created")
//                    {
////                        view.openMapActivity("")
//                    }else {
//                       //: onFinished taki main modely petqa jnjel,u bacel stex
////                        mainModel.saveAnyUser(true)
//                        view.showVerificationDialog()
//                        accountCreatedMessage(true)
//                    }
                }

                override fun onProgress() {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onFailure(t: Throwable) {
                    view.showMessageIsAccountCreated(false)
                }
            })
    }

    override fun checkVerificationCode(verificationCode: String){
        model.checkVerificationCode(verificationCode,object :MainContract.MainModel.OnFinishedListener{
            override fun onFinished(message: String) {
                view.showMessageIsVerifyAccount(true)
                view.openMapActivity(model.getUserSavePhoneNumber())
            }

            override fun onProgress() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onFailure(t: Throwable) {
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
        val phoneNumber:String = model.getUserSavePhoneNumber()
        Log.i("vvv", phoneNumber)
        if(phoneNumber.isNotEmpty()) {
            view.openMapActivity(model.getUserSavePhoneNumber())
        }
    }
}