package com.example.localization

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        var open = findViewById<Button>(R.id.b_open)
        open.setOnClickListener {
            callLanguageActivity()
        }
    }

    fun callLanguageActivity() {
        var intent = Intent(this, LanguageActivity::class.java)
        startActivity(intent)
    }
}