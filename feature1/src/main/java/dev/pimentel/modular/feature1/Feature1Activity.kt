package dev.pimentel.modular.feature1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.pimentel.modular.feature1.databinding.ActivityFeature1Binding
import dev.pimentel.modular.navigation.feature2.Feature2Navigator
import dev.pimentel.modular.navigation.main.MainNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Feature1Activity : AppCompatActivity() {

    @Inject
    lateinit var mainNavigator: MainNavigator

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
            mainNavigator.goToMain(this)
            finish()
        }
    }
}