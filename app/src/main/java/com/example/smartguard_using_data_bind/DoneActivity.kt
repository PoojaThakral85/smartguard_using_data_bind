package com.example.smartguard_using_data_bind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.smartguard_using_data_bind.databinding.ActivityDoneBinding

import kotlinx.android.synthetic.main.activity_done.*
import kotlinx.android.synthetic.main.add_new_hub.*

class DoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val DoneActivityDataBinding= DataBindingUtil.setContentView<ActivityDoneBinding>(this,R.layout.activity_done)
        DoneActivityDataBinding.setVariable(BR.donelabel1,"DONE")
        DoneActivityDataBinding.setVariable(BR.donelabel2,"91 XXXXXXXXXX")
        imageView_1_done.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}