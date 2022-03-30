package com.example.lesson6v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.example.lesson6v2.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val v = getValue(this)
        if (v != 0) {
            binding.tv.isVisible = false
        }

        binding.btn.setOnClickListener {
            setValue(this, 1)
            binding.tv.isVisible = false
        }
    }
}