package com.example.navigation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NavigatorApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}