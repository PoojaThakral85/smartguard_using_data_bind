package com.example.smartguard_using_data_bind

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.smartguard_using_data_bind.databinding.ActivityScanBinding
import kotlinx.android.synthetic.main.activity_scan.*

class ScanActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ScanActivityDataBinding= DataBindingUtil.setContentView<ActivityScanBinding>(this,R.layout.activity_scan)
        ScanActivityDataBinding.setVariable(BR.scan_labell,"SCANNING FOR SENSOR")
        ScanActivityDataBinding.setVariable(BR.scan_label2,"This may take a few moments")
        ScanActivityDataBinding.setVariable(BR.scan_label3,"Please be patient")
        ScanActivityDataBinding.setVariable(BR.scan_label4,"CANCEL")
        textView_4_scanning_for_sensor.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}