package dev.pimentel.modular.main

import android.content.Context
import android.content.Intent
import dev.pimentel.modular.navigation.main.MainNavigator

class MainNavigatorImpl : MainNavigator {

    override fun goToMain(context: Context) {
        context.startActivity(Intent(context, MainActivity::class.java))
    }
}