package com.example.feature2

import android.content.Context
import android.content.Intent
import com.example.navigation.feature2.Feature2Navigator

class Feature2NavigatorImpl : Feature2Navigator {

    override fun goToFeature2(context: Context) {
        context.startActivity(Intent(context, Feature2Activity::class.java))
    }
}