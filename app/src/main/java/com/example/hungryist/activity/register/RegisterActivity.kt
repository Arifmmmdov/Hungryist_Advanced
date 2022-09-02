package com.example.hungryist.activity.register

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.hungryist.R
import com.example.hungryist.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityRegisterBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setClickableSpannableView()
    }

    private fun setClickableSpannableView() {
        binding.termsAndConditions.movementMethod = LinkMovementMethod.getInstance()
        binding.termsAndConditions.setText(getSpannableString(), TextView.BufferType.SPANNABLE)


    }

    private fun getSpannableString():SpannableString{
        val spannableString = SpannableString(resources.getString(R.string.terms_and_conditions))
        val clickableSpan = object:ClickableSpan(){
            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.linkColor = ContextCompat.getColor(this@RegisterActivity,R.color.purple_700)
                ds.isUnderlineText = true
            }
            override fun onClick(p0: View) {
                //TODO move to Terms and conditions page
            }
        }

        spannableString.setSpan(clickableSpan,29,50,SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE)

        return spannableString
    }
}