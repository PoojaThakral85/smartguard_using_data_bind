package com.example.smartguard_using_data_bind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.smartguard_using_data_bind.databinding.ActivityIntro3Binding

class IntroActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        val IntroActivity3databinding = DataBindingUtil.setContentView<ActivityIntro3Binding>(this,R.layout.activity_intro3)
        IntroActivity3databinding.setVariable(BR.intro3_label1,"Add others Hub easily")
        IntroActivity3databinding.setVariable(BR.intro3_label2,"Have the SmartGuard Hub automatically notify other people when any sensor is triggered!")
    }
}