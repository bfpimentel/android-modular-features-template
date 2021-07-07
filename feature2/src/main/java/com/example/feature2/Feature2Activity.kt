package com.example.feature2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.core.NavigatorWrapper
import com.example.feature2.databinding.ActivityFeature2Binding

class Feature2Activity : AppCompatActivity() {

    private val navigator: Feature2Navigator = NavigatorWrapper.getNavigator()
    private lateinit var binding: ActivityFeature2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeature2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnFeatureOne.setOnClickListener {
            navigator.goToFeature1(this)
            finish()
        }
        binding.btnFeatureMain.setOnClickListener {
            navigator.goToMain(this)
            finish()
        }
    }
}