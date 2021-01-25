package com.example.smartguard_using_data_bind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.smartguard_using_data_bind.databinding.ActivityIntro1Binding

class IntroActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        val IntroActivity1databinding=DataBindingUtil.setContentView<ActivityIntro1Binding>(this,R.layout.activity_intro1)
        IntroActivity1databinding.setVariable(BR.intro1_label1,"Welcome to your SmartGuard Hub!")
        IntroActivity1databinding.setVariable(BR.intro1_label2,"The SmartGuard suite is controlled from the central 'Hub'.Be sure to use an active SIM card to communicate with the Hub!")
    }
}