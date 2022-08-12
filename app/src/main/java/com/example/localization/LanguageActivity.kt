package com.example.localization

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber
import java.lang.String.format
import java.util.*

class LanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)
        initView()
    }

    fun initView() {

        var b_uzbek = findViewById<Button>(R.id.b_uzbek)
        var b_Yapon = findViewById<Button>(R.id.b_Yapon)
        var b_kores = findViewById<Button>(R.id.b_kores)
        var b_xitoy = findViewById<Button>(R.id.b_xitoy)


        b_uzbek.setOnClickListener {

            setLocale("uz")
        }
        b_Yapon.setOnClickListener {
            setLocale("ja")
        }
        b_kores.setOnClickListener {
            setLocale("ko")
        }
        b_xitoy.setOnClickListener {
            setLocale("zh")
        }

        var one = resources.getQuantityString(R.plurals.my_car, 1, 1)
        var two = resources.getQuantityString(R.plurals.my_car, 2, 4)
        var many = resources.getQuantityString(R.plurals.my_car, 5, 11)

        Timber.d(one)
        Timber.d(two)
        Timber.d(many)

    }

    fun setLocale(lan: String) {

        var locale = Locale(lan)
        Locale.setDefault(locale)
        var config = Configuration()
        config.locale = locale
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
        finish()
    }

}