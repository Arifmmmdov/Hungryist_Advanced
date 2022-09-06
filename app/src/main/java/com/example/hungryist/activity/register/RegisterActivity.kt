package com.example.hungryist.activity.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.hungryist.databinding.ActivityRegisterBinding
import javax.security.auth.callback.PasswordCallback

class RegisterActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityRegisterBinding.inflate(layoutInflater)
    }

    private val viewModel by lazy {
        RegisterViewModel(this)
    }

    private var isEmailSection = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel.setClickableSpannableView(binding.termsAndConditions,this)
        setListeners()
    }

    private fun setListeners() {
        binding.register.setOnClickListener(this::onRegisterClicked)
        binding.login.setOnClickListener(this::moveToLoginFragment)
        binding.google.setOnClickListener(this::registerWithGoogle)
        binding.guest.setOnClickListener(this::registerWithGuest)
        binding.facebook.setOnClickListener(this::registerWithGoogle)
    }

    private fun registerWithGuest(view: View) {

    }

    private fun onRegisterClicked(view:View) {
        if(isPasswordRegular(binding.password.text.toString()))
            return
        if(viewModel.searchValidity(binding,isEmailSection) && searchConfirmation()){
            //TODO move to Main Page fragment
        }
    }

    private fun isPasswordRegular(password: String): Boolean {
        //TODO write here other password requirements
        if(password.length < 6){
            Toast.makeText(this,"The password can't be less than 6!",Toast.LENGTH_LONG).show()
            return false
        }
        return true
    }

    private fun searchConfirmation():Boolean {
        if(!binding.checkbox.isChecked){
            Toast.makeText(this,"You must read terms and conditions and accept!",Toast.LENGTH_LONG).show()
            binding.checkbox.error = "Accept it!"
            return false
            }
        return true
    }

    private fun registerWithGoogle(view:View) {
        //TODO register with google
    }

    private fun moveToLoginFragment(view:View) {
        //TODO move to LoginFragment
    }
}
