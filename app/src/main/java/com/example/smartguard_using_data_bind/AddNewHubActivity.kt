package com.example.smartguard_using_data_bind

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil

import com.example.smartguard_using_data_bind.databinding.AddNewHubBinding

import kotlinx.android.synthetic.main.activity_complete_verification.view.*
import kotlinx.android.synthetic.main.add_new_hub.*


class AddNewHubActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val AddnewhubActivitydatabinding= DataBindingUtil.setContentView<AddNewHubBinding>(this, R.layout.add_new_hub)
        AddnewhubActivitydatabinding.setVariable(BR.add_new_hub_label_1,"Hubs are the central base stations of the SmartGuard suite. To register a hub, please do the following :")
        AddnewhubActivitydatabinding.setVariable(BR.add_new_hub_label_2,"Insert ab active SIM card that can send/receive SMS(with sufficient credit) into the Hub")
        AddnewhubActivitydatabinding.setVariable(BR.add_new_hub_label_3,"Power on the Hub and let it boot")
        AddnewhubActivitydatabinding.setVariable(BR.add_new_hub_label_4,"Add the Phone No. of the SIM card in the Hub below, and press the 'Add Hub' button")
        button_add_hub_new.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}