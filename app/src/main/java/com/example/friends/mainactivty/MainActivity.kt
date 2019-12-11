package com.example.friends.mainactivty

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.friends.R
import com.example.friends.base.BaseActivity
import com.example.friends.di.component.ApplicationComponent
import com.example.friends.di.component.DaggerActivityComponent
import com.example.friends.di.module.BaseActivityModule
import com.example.friends.di.module.FirbaseModule
import com.example.friends.di.module.MainModule
import com.example.friends.di.module.SaveDataModule
import com.example.friends.mapactivty.MapActivity
import com.example.friends.ui.DialogRegistrationUi
import com.example.friends.ui.MainActivityUI
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.ctx
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.toast
import javax.inject.Inject

class MainActivity : BaseActivity(),MainContract.MainView {

    override fun setupComponent(applicationComponent: ApplicationComponent) {
        DaggerActivityComponent.builder()
            .applicationComponent(applicationComponent)
            .baseActivityModule(BaseActivityModule(this))
            .mainModule(MainModule())
            .firbaseModule(FirbaseModule())
            .saveDataModule(SaveDataModule())
            .build()
            .inject(this)
    }

    @Inject lateinit var ui:MainActivityUI
    @Inject lateinit var presenter :MainContract.MainPresenter

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
            toast(getString(R.string.account_is_created))
        }
        else {
            toast(getString(R.string.account_is_not_created))
        }
    }

    override fun showMessageIsVerifyAccount(isVerify: Boolean) {
        if(isVerify){
            toast(getString(R.string.account_is_verify))
        }
        else {
           toast( getString(R.string.account_is_not_verify))
        }
    }

    override fun showMessageIsSignIn(isSignin: Boolean) {
        if(!isSignin){
            Toast.makeText(this,getString(R.string.not_signin),Toast.LENGTH_SHORT).show()
        }
    }

    override fun showVerificationDialog() {
        val dialogUI=DialogRegistrationUi(AnkoContext.Companion.create(ctx, ui.v))
        dialogUI.chackCode.onClick{
            val verifyCode = dialogUI.verifyCode.text.toString()
            presenter.checkVerificationCode(verifyCode)
        }
    }

    override fun openMapActivity(accountId:String) {
        val intent = Intent(this,MapActivity::class.java)
        intent.putExtra("accountId",accountId)
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



}
