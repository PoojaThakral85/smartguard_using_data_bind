package com.example.smartguard_using_data_bind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil

import com.example.smartguard_using_data_bind.databinding.ActivityIntro2Binding

class IntroActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        val IntroActivity2databinding=DataBindingUtil.setContentView<ActivityIntro2Binding>(this,R.layout.activity_intro2)
        IntroActivity2databinding.setVariable(BR.intro2_label1,"Get started by adding devices here")
        IntroActivity2databinding.setVariable(BR.intro2_label2,"Adding a new device to expand your home security is as easy 3 taps!")
    }
}