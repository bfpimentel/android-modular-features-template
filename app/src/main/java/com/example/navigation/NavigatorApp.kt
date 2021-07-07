package com.example.navigation

import android.app.Application
import com.example.core.NavigatorWrapper

class NavigatorApp : Application(){

    override fun onCreate() {
        super.onCreate()
        NavigatorWrapper.navigator = AppNavigator
    }
}