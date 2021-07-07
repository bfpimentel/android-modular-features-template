package com.example.feature1

import android.content.Context

interface Feature1Navigator {

    fun goToFeature2(context: Context)

    fun goToMain(context: Context)
}