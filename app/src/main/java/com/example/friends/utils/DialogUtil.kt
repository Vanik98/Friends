package com.example.friends.utils

import android.content.Context
import android.view.View
import com.example.friends.anko.DialogLoadingUi
import com.example.friends.main.MainActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.ctx

object DialogUtil {

    private lateinit var loadingDialog: DialogLoadingUi

    fun openLoadingDialog(ui: AnkoContext<View>) {
        loadingDialog = DialogLoadingUi(ui)
    }

    fun closeLoadingDialog() {
        loadingDialog.dialog.dismiss()
    }
}