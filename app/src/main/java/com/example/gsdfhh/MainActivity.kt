package com.example.gsdfhh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btndalej).setOnClickListener(){
            findViewById<ImageView>(R.id.imgGaleria).setImageResource(R.drawable.fabianski)
        }
        findViewById<Button>(R.id.btndalej).setOnClickListener(){
            findViewById<ImageView>(R.id.imgGaleria).setImageResource(R.drawable.szczesny)
        }
        findViewById<Button>(R.id.btndalej).setOnClickListener(){
            findViewById<ImageView>(R.id.imgGaleria).setImageResource(R.drawable.schmeihel)
        }
    }

}