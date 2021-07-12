package com.example.feature2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.feature2.databinding.ActivityFeature2Binding
import com.example.navigation.feature1.Feature1Navigator
import com.example.navigation.main.MainNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Feature2Activity : AppCompatActivity() {

    @Inject
    lateinit var mainNavigator: MainNavigator

    @Inject
    lateinit var feature1Navigator: Feature1Navigator

    private lateinit var binding: ActivityFeature2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeature2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFeatureOne.setOnClickListener {
            feature1Navigator.goToFeature1(this)
            finish()
        }

        binding.btnFeatureMain.setOnClickListener {
            mainNavigator.goToMain(this)
            finish()
        }
    }
}