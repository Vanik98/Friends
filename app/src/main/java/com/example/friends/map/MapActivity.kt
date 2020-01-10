package com.example.friends.map

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.friends.R
import com.example.friends.base.BaseActivity
import com.example.friends.di.component.ApplicationComponent
import com.example.friends.di.component.DaggerActivityComponent
import com.example.friends.di.module.BaseActivityModule
import com.example.friends.di.module.FirbaseModule
import com.example.friends.di.module.MapModule
import com.example.friends.data.model.User
import com.example.friends.friends.UsersFriendsActivity
import com.example.friends.settings.SettingsActivity

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.navigation.NavigationView
import javax.inject.Inject

class MapActivity : BaseActivity(),OnMapReadyCallback, MapContract.MapView {

    override fun setupComponent(applicationComponent: ApplicationComponent) {
        DaggerActivityComponent.builder()
            .applicationComponent(applicationComponent)
            .baseActivityModule(BaseActivityModule(this))
            .mapModule(MapModule())
            .firbaseModule(FirbaseModule())
            .build()
            .inject(this)
    }

    @Inject lateinit var presenter: MapPresenter

    private lateinit var mMap: GoogleMap
    private lateinit var locationManager : LocationManager
    private lateinit var locationListener: LocationListener
    private lateinit var myGelolocation:MarkerOptions

    private lateinit var navigationView: NavigationView
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toolbar: androidx.appcompat.widget.Toolbar
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        setMap()
        setToolBar()
        navigationView = findViewById(R.id.navigation_menu)
        //        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
        presenter.attach(this)
        val accountId = intent.getStringExtra("accountId")
        presenter.loadData(accountId)

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) === PackageManager.PERMISSION_GRANTED) {

                }
            }
        }

    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        if(ContextCompat.checkSelfPermission(this,android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),1)
        }

    }

    override fun showUserInformation(user: User) {
        if (user != null){
            showGeolocation(user)
//            val firends = user.friends
//            for (i in 0 until firends!!.usersIdList.size){
//                val friend = firends.usersIdList[i]
//                val friendUser = presenter.loadFriendData(friend)
//                showGeolocation(friendUser)
//            }
        }
    }

    private fun setMap(){
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    private fun showGeolocation(user: User){
//        myGelolocation = MarkerOptions().position(LatLng(40.1811, 44.5136)).title("Vanik")
//        mMap.addMarker(myGelolocation)
        locationManager = this.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), 1)
        }
        locationListener = object : LocationListener {
            override fun onLocationChanged(location: Location?) {
                val latiude = location!!.latitude
                val longitude = location!!.longitude
                val icon= BitmapDescriptorFactory.fromResource(R.drawable.vanik)
                myGelolocation = MarkerOptions().position(LatLng(latiude, longitude)).title(user.name).icon(icon)
                mMap.addMarker(myGelolocation)
                mMap.animateCamera(
                    CameraUpdateFactory.newLatLngZoom(
                        LatLng(
                            latiude,
                            longitude
                        ), 15.0f
                    )
                )
            }

            override fun onStatusChanged(
                provider: String?,
                status: Int,
                extras: Bundle?
            ) {
            }

            override fun onProviderEnabled(provider: String?) {
            }

            override fun onProviderDisabled(provider: String?) {

            }
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 100000, 20f, locationListener)
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 100000, 20f, locationListener)

    }

    private fun setToolBar() {
        drawerLayout = findViewById(R.id.drawerlayout)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
        actionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
//        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
    }

    private fun setNavigationViewListener(){
        navigationView.setNavigationItemSelectedListener {
             when(it.itemId) {
                 R.id.nav_map -> {}
                 R.id.nav_friends -> startActivity(Intent(this, UsersFriendsActivity::class.java))
                 R.id.nav_friends -> startActivity(Intent(this, SettingsActivity::class.java))
             }
             true
        }
    }
}
