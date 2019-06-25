package com.tuanla.planeshooter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton


class MainActivity : Activity() {

    private lateinit var btnPlayGame : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addControls()
        addEvents()
    }



    private fun addControls() {
        btnPlayGame = findViewById(R.id.btnStart)

    }

    private fun addEvents() {

        btnPlayGame.setOnClickListener{
            Log.i("ImageButton","click")
            var iStartGame= Intent(this,StartGame::class.java)
            startActivity(iStartGame)
            finish()
        }
    }
}
