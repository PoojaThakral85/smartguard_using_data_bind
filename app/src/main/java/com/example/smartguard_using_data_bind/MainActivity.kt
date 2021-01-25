package com.example.smartguard_using_data_bind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartguard_using_data_bind.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_main_verification_complete.setOnClickListener {
        val intent=Intent(this, verificationcomplete::class.java)
            startActivity(intent)
        }

        button_main_scanning_for_sensor.setOnClickListener {
                val intent=Intent(this, ScanActivity::class.java)
                startActivity(intent)

        }
        button_confirm_to_remove_user.setOnClickListener {
            val intent=Intent(this,ConfirmtoremoveuserActivity::class.java)
            startActivity(intent)
        }
        button_main_done.setOnClickListener {
                val intent=Intent(this,DoneActivity::class.java)
                startActivity(intent)

        }
        button_main_sensor_added.setOnClickListener {
            val intent=Intent(this, SensorAddedActivity::class.java)
            startActivity(intent)

        }

        button_main_splash.setOnClickListener {
            val intent = Intent(this, MainActivitySplash::class.java)
            startActivity(intent)
        }
        button_verifying_hub_main.setOnClickListener {
            val intent = Intent(this, VerifyingHubActivity::class.java)
            startActivity(intent)
        }
        button_add_hub_new_main.setOnClickListener {
                val intent=Intent(this,AddNewHubActivity::class.java)
                startActivity(intent)
            }

        button_main_intro.setOnClickListener {
            val intent=Intent(this,IntroductionActivity::class.java)
            startActivity(intent)
        }
        button_main_intro_1.setOnClickListener {
            val intent=Intent(this,IntroActivity1::class.java)
            startActivity(intent)
        }
        button_main_intro_2.setOnClickListener {
            val intent=Intent(this,IntroActivity2::class.java)
            startActivity(intent)
        }
        button_main_intro_3.setOnClickListener {
            val intent=Intent(this,IntroActivity3::class.java)
            startActivity(intent)
        }
        button_main_intro_4.setOnClickListener {
            val intent=Intent(this,IntroActivity4::class.java)
            startActivity(intent)
        }
    }
}