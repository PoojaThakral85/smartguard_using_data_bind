package com.example.smartguard_using_data_bind

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.smartguard_using_data_bind.databinding.ActivityCompleteVerificationBinding
import kotlinx.android.synthetic.main.activity_complete_verification.*
import kotlinx.android.synthetic.main.add_new_hub.*

class verificationcomplete  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val VerificationCompleteActivityDataBinding= DataBindingUtil.setContentView<ActivityCompleteVerificationBinding>(this,R.layout.activity_complete_verification)
        VerificationCompleteActivityDataBinding.setVariable(BR.verification_complete_labell,"VERIFICATION COMPLETE")
        VerificationCompleteActivityDataBinding.setVariable(BR.verification_complete_label2,"91 XXXXXXXXXX")
        VerificationCompleteActivityDataBinding.setVariable(BR.verification_complete_label3,"CONTINUE")
        textView_3_verification_complete.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}