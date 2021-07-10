package com.example.feature1

import android.content.Context
import android.content.Intent
import com.example.navigation.feature1.Feature1Navigator

class Feature1NavigatorImpl : Feature1Navigator {

    override fun goToFeature1(context: Context) {
        context.startActivity(Intent(context, Feature1Activity::class.java))
    }
}