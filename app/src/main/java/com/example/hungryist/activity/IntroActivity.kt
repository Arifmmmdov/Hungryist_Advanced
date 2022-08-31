package com.example.hungryist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hungryist.R
import com.example.hungryist.databinding.ActivityIntroBinding
import com.example.hungryist.fragment.SplashFragment

class IntroActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityIntroBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        showFragment()
    }

    private fun showFragment() {
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .replace(binding.fragmentContainer.id,SplashFragment())
            .commit()
    }
}