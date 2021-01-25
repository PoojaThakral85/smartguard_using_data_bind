package com.example.smartguard_using_data_bind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.smartguard_using_data_bind.databinding.ActivityMainSplashBinding


class MainActivitySplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       /* setContentView(R.layout.activity_main_splash)
        findViewById<TextView>(R.id.textView_splash).apply {
            this.text="Hello"
        }*/
        val MainActivitySplashDataBinding= DataBindingUtil.setContentView<ActivityMainSplashBinding>(this,R.layout.activity_main_splash)
        MainActivitySplashDataBinding.setVariable(BR.splashlabel,"Powered By Android")
        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        Handler().postDelayed(Runnable {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        },3000)
    }
}