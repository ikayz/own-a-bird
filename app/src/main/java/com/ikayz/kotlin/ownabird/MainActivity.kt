package com.ikayz.kotlin.ownabird

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ikayz.kotlin.ownabird.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}