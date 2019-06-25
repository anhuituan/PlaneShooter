package com.tuanla.planeshooter

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.view.View

public class GameView(v: Context) : View(v) {



    init {


    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val bmpBackground = BitmapFactory.decodeResource(resources,R.drawable.background)
        canvas!!.drawBitmap(bmpBackground,0f,0f,null)

    }
}