package com.tuanla.planeshooter

import android.app.Activity
import android.os.Bundle

public class StartGame : Activity() {

    private lateinit var gameView : GameView
    init {
        gameView = GameView(this)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(gameView)
    }
}