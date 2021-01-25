package com.example.smartguard_using_data_bind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil

import com.example.smartguard_using_data_bind.databinding.ActivitySensorAddedBinding
import kotlinx.android.synthetic.main.activity_sensor_added.*

class SensorAddedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val SensorAddedeActivityDatabinding=DataBindingUtil.setContentView<ActivitySensorAddedBinding>(this,R.layout.activity_sensor_added)
        SensorAddedeActivityDatabinding.setVariable(BR.sensor_added_label1,"SENSOR ADDED")
        SensorAddedeActivityDatabinding.setVariable(BR.sensor_added_label2,"Front Door")
        SensorAddedeActivityDatabinding.setVariable(BR.sensor_added_label3,"ADD ANOTHER SENSOR")
        SensorAddedeActivityDatabinding.setVariable(BR.sensor_added_label4,"CONTINUE TO ADD USERS")
        textView4_sensor_added.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        textView3_sensor_added.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}