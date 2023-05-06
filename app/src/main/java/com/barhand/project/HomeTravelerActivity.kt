package com.betrip.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.betrip.project.travelers.CreateEvent
import com.betrip.project.travelers.SettingTraveler
import com.betrip.project.travelers.fragments.event_fragment
import com.betrip.project.travelers.fragments.routes_fragment

import com.betrip.project.travelers.models.TravelEvent
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeTravelerActivity : AppCompatActivity() {


   // lateinit var travelEventAdapter: TravelEventAdapter
    val eventsFragment= event_fragment()
    val routesFragment= routes_fragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_home_traveler)
        //loadContact()

        replacePrincipalLayout(eventsFragment)
        menuListener()
    }

    private fun routes(){
        val intent = Intent(this, SettingTraveler::class.java)
        startActivity(intent)
    }
    private fun Add(){
        val intent = Intent(this, CreateEvent::class.java)
        startActivity(intent)
    }
    private fun menuListener(){

    }
    fun replacePrincipalLayout(fragment: Fragment){
        if(fragment!=null){
            val transacion=supportFragmentManager.beginTransaction()
        }
    }



}