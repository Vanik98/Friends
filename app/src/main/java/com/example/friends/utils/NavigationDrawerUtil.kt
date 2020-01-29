package com.example.friends.utils

import android.content.Intent
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.friends.R
import com.example.friends.base.BaseActivity
import com.example.friends.friendsinfo.FriendsInfoActivity
import com.example.friends.map.MapActivity
import com.example.friends.settings.SettingsActivity
import com.google.android.material.navigation.NavigationView

object NavigationDrawerUtil {

    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout
    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle



    fun setToolBar(activity: BaseActivity) {
        //        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
        drawerLayout = activity.findViewById(R.id.drawerlayout)
        toolbar = activity.findViewById(R.id.toolbar)
        activity.setSupportActionBar(toolbar)
        activity.supportActionBar!!.setDisplayShowTitleEnabled(false)
        actionBarDrawerToggle = ActionBarDrawerToggle(activity,
            drawerLayout,
            toolbar, 0, 0)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        navigationView = activity.findViewById(R.id.navigation_menu)
        setNavigationViewListener(activity)
    }

    private fun setNavigationViewListener(activity: BaseActivity) {
        navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_map -> {
                    if (!navigationView.menu.getItem(0).isChecked) {
                        navigationView.setCheckedItem(R.id.nav_map)
                        activity.startActivity(Intent(activity, MapActivity::class.java))
                    }
                }
                R.id.nav_friends -> {
                    if (!navigationView.menu.getItem(1).isChecked) {
                        navigationView.setCheckedItem(R.id.nav_friends)
                        activity.startActivity(Intent(activity, FriendsInfoActivity::class.java))
                        activity.finish()
                    }
                }
                R.id.nav_settings -> {
                    if (!navigationView.menu.getItem(2).isChecked) {
                        navigationView.setCheckedItem(R.id.nav_settings)
                        activity.startActivity(Intent(activity, SettingsActivity::class.java))
                        activity.finish()
                    }
                }
            }
            true
        }
    }
}