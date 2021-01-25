package com.example.smartguard_using_data_bind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.smartguard_using_data_bind.databinding.ActivityIntro4Binding

class IntroActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        val IntroACtivity4databinding=DataBindingUtil.setContentView<ActivityIntro4Binding>(this,R.layout.activity_intro4)
        IntroACtivity4databinding.setVariable(BR.intro4_label1,"Get help whenever you need it,wherever you need it!")
        IntroACtivity4databinding.setVariable(BR.intro4_label2,"Help is available at every step,just tap the 'Help'icon on the top right to get quick answers!")
    }
}