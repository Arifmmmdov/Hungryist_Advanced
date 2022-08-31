package com.example.hungryist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hungryist.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityRegisterBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}