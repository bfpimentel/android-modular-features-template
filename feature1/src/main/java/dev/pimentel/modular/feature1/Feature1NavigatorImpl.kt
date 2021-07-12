package dev.pimentel.modular.feature1

import android.content.Context
import android.content.Intent
import dev.pimentel.modular.navigation.feature1.Feature1Navigator

class Feature1NavigatorImpl : Feature1Navigator {

    override fun goToFeature1(context: Context) {
        context.startActivity(Intent(context, Feature1Activity::class.java))
    }
}