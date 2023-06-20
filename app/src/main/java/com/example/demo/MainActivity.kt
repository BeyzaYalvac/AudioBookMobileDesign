package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var tasarim: ActivityMainBinding
        super.onCreate(savedInstanceState)
        tasarim=ActivityMainBinding.inflate(layoutInflater)
        val navHostFragment=supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(tasarim.navigationView,navHostFragment.navController)

        tasarim.toolbar.title="MinyKids"
        val toggle= ActionBarDrawerToggle(this,tasarim.draver,tasarim.toolbar,0,0)
        tasarim.draver.addDrawerListener(toggle)
        toggle.syncState()
        val baslik=tasarim.navigationView.inflateHeaderView(R.layout.nav_baslik)
        setContentView(tasarim.root)
    }
}