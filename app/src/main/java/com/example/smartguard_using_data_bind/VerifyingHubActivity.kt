package com.example.smartguard_using_data_bind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.example.smartguard_using_data_bind.databinding.ActivityVerifyingHubBinding

class VerifyingHubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val VerifyinghubActivityDatabinding=DataBindingUtil.setContentView<ActivityVerifyingHubBinding>(this,R.layout.activity_verifying_hub)
        VerifyinghubActivityDatabinding.setVariable(BR.verifying_hub_label_1,"VERIFYING")
        VerifyinghubActivityDatabinding.setVariable(BR.verifying_hub_label_2," + 91 9945245432")
        VerifyinghubActivityDatabinding.setVariable(BR.verifying_hub_label_3,"This might take a few minutes")
        VerifyinghubActivityDatabinding.setVariable(BR.verifying_hub_label_4,"Please don't leave the app")
        Handler().postDelayed(Runnable {
            val intent= Intent(this,verificationcomplete::class.java)
            startActivity(intent)
        },2500)
    }
}