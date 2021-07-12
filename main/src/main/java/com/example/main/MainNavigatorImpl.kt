package com.example.main

import android.content.Context
import android.content.Intent
import com.example.navigation.main.MainNavigator

class MainNavigatorImpl : MainNavigator {

    override fun goToMain(context: Context) {
        context.startActivity(Intent(context, MainActivity::class.java))
    }
}