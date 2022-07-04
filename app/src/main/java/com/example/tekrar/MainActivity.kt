package com.example.tekrar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }
    fun Welcome(view : View){
        val intent= Intent (applicationContext,Welcome::class.java)
        startActivity(intent)
    }
    fun ACTİV(view : View){
        val intent= Intent (applicationContext,ACTİV::class.java)
        startActivity(intent)
    }


}