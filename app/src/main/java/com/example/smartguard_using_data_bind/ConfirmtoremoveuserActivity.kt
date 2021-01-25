package com.example.smartguard_using_data_bind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.smartguard_using_data_bind.databinding.ActivityConfirmtoremoveuserBinding
import kotlinx.android.synthetic.main.activity_confirmtoremoveuser.*

class ConfirmtoremoveuserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ConfirmuserActivityDatabinding= DataBindingUtil.setContentView<ActivityConfirmtoremoveuserBinding>(this,R.layout.activity_confirmtoremoveuser)
        ConfirmuserActivityDatabinding.setVariable(BR.confirm_to_remove_user_label_1,"ARE YOU SURE?")
        ConfirmuserActivityDatabinding.setVariable(BR.confirm_to_remove_user_label_2,"The sensor will no longer be a part of the Hub, and will not be able to trigger the siren if interrupted.")
        ConfirmuserActivityDatabinding.setVariable(BR.confirm_to_remove_user_label_3,"You can always register the sensor again later.")
        ConfirmuserActivityDatabinding.setVariable(BR.confirm_to_remove_user_label_4,"NO")
        ConfirmuserActivityDatabinding.setVariable(BR.confirm_to_remove_user_label_5,"YES, REMOVE")
        textView_5_confirm_remove_user.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        textView_4_confirm_remove_user.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}