package com.example.friends.mainactivty

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.friends.R
import com.example.friends.base.BaseActivity
import com.example.friends.di.*
import com.example.friends.di.component.ApplicationComponent
import com.example.friends.di.module.ActivityModule
import com.example.friends.di.module.FirbaseModule
import com.example.friends.di.module.MainModule
import com.example.friends.di.module.SaveDataModel
import com.example.friends.mapactivty.MapsActivity
import com.example.friends.ui.DialogRegistrationUi
import com.example.friends.ui.MainActivityUI
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.ctx
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.setContentView
import javax.inject.Inject

class MainActivity : BaseActivity(),MainScreenContract.MainView {
    override fun setupComponent(applicationComponent: ApplicationComponent) {
        DaggerActivityComponent.builder()
            .applicationComponent(applicationComponent)
            .activityModule(ActivityModule(this))
            .mainModule(MainModule())
            .firbaseModule(FirbaseModule())
            .saveDataModel(SaveDataModel())
            .build()
            .inject(this)
    }

    @Inject lateinit var ui:MainActivityUI
    @Inject lateinit var presenter :MainScreenContract.MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui.setContentView(this)
        presenter.attach(this)
        openVerificationDialog(this)
    }

    override fun onStart() {
        presenter.subscribe()
        super.onStart()
    }

    override fun onPause() {
        presenter.unsubscribe()
        super.onPause()
    }

    override fun showMessageIsAccountCreated(isCreate: Boolean) {
        if(isCreate){
            Toast.makeText(this,getString(R.string.account_is_created),Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this, getString(R.string.account_is_not_created), Toast.LENGTH_SHORT).show()
        }
    }
    override fun showMessageIsVerifyAccount(isVerify: Boolean) {
        if(isVerify){
            Toast.makeText(this,getString(R.string.account_is_verify),Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this, getString(R.string.account_is_not_verify), Toast.LENGTH_SHORT).show()
        }
    }

    override fun showMessageisSignIn(isSignin: Boolean) {
        if(!isSignin){
            Toast.makeText(this,getString(R.string.not_signin),Toast.LENGTH_SHORT).show()
        }
    }


    override fun openMapActivity() {
        val intent = Intent(this,MapsActivity::class.java)
        startActivity(intent)
    }

    private fun openVerificationDialog(context:Context) {
        ui.create_account.onClick {
            val phoneNumber = ui.phoneNumber.text.toString()
            if(phoneNumber.isNotEmpty() && phoneNumber.length < 10 ) {
                presenter.createAccount("${ui.numberCode.text.toString()}${ui.phoneNumber.text.toString()}")

            }else{
                Toast.makeText(context,getString(R.string.take_number_error),Toast.LENGTH_SHORT).show()
            }
        }
    }


     override fun showVerifycationDialog() {
        val dialogUI=DialogRegistrationUi(AnkoContext.Companion.create(ctx, ui.v))
        dialogUI.chackCode.onClick{
            val verifyCode = dialogUI.verifyCode.text.toString()
            presenter.checkVerificationCode(verifyCode)
        }
    }

}
