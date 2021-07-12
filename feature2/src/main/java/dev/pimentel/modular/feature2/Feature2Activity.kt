package dev.pimentel.modular.feature2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.pimentel.modular.feature2.databinding.ActivityFeature2Binding
import dev.pimentel.modular.navigation.feature1.Feature1Navigator
import dev.pimentel.modular.navigation.main.MainNavigator
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