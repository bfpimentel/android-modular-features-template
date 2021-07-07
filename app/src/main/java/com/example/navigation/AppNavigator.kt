package com.example.navigation

import android.content.Context
import android.content.Intent
import com.example.core.Navigator
import com.example.feature1.Feature1Activity
import com.example.feature1.Feature1Navigator
import com.example.feature2.Feature2Activity
import com.example.feature2.Feature2Navigator

object AppNavigator : Feature1Navigator, Feature2Navigator, Navigator {

    override fun goToMain(context: Context) {
        context.startActivity(Intent(context, MainActivity::class.java))
    }

    override fun goToFeature2(context: Context) {
        context.startActivity(Intent(context, Feature2Activity::class.java))
    }

    override fun goToFeature1(context: Context) {
        context.startActivity(Intent(context, Feature1Activity::class.java))
    }
}