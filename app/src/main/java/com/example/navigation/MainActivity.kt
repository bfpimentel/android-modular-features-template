package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.example.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val navigator = AppNavigator
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnFeatureOne.setOnClickListener {
            navigator.goToFeature1(this)
            finish()
        }
        binding.btnFeatureTwo.setOnClickListener {
            navigator.goToFeature2(this)
            finish()
        }
    }
}