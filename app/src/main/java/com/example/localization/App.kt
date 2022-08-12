package com.example.localization

import android.app.Application
import timber.log.Timber

class App:Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(object : Timber.DebugTree(){


            override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
                super.log(priority, "$tag", message, t)

            }
        })


        Timber.d("App created")
    }

}