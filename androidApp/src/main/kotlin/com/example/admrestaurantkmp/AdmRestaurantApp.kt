package com.example.admrestaurantkmp

import android.app.Application
import com.example.admrestaurantkmp.di.initKoin
import org.koin.android.ext.koin.androidContext

class AdmRestaurantApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@AdmRestaurantApp)
        }
    }
}