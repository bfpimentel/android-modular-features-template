package com.example.feature1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.core.NavigatorWrapper
import com.example.feature1.databinding.ActivityFeature1Binding

class Feature1Activity : AppCompatActivity() {

    private val navigator: Feature1Navigator = NavigatorWrapper.getNavigator()
    private lateinit var binding: ActivityFeature1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeature1Binding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnFeatureTwo.setOnClickListener {
            navigator.goToFeature2(this)
            finish()
        }
        binding.btnFeatureMain.setOnClickListener {
            navigator.goToMain(this)
            finish()
        }
    }
}