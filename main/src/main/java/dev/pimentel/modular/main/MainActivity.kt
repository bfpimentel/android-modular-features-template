package dev.pimentel.modular.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.pimentel.modular.main.databinding.ActivityMainBinding
import dev.pimentel.modular.navigation.feature1.Feature1Navigator
import dev.pimentel.modular.navigation.feature2.Feature2Navigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var feature1Navigator: Feature1Navigator

    @Inject
    lateinit var feature2Navigator: Feature2Navigator

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFeatureOne.setOnClickListener {
            feature1Navigator.goToFeature1(this)
        }

        binding.btnFeatureTwo.setOnClickListener {
            feature2Navigator.goToFeature2(this)
        }
    }
}