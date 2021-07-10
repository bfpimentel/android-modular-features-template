package com.example.feature1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.feature1.databinding.ActivityFeature1Binding
import com.example.navigation.feature2.Feature2Navigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Feature1Activity : AppCompatActivity() {

    @Inject
    lateinit var feature2Navigator: Feature2Navigator

    private lateinit var binding: ActivityFeature1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeature1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFeatureTwo.setOnClickListener {
            feature2Navigator.goToFeature2(this)
            finish()
        }

        binding.btnFeatureMain.setOnClickListener {
//            navigator.goToMain(this)
//            finish()
        }
    }
}