package com.example.smartguard_using_data_bind

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_introduction.*

class IntroductionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.hide()
        Handler().postDelayed(Runnable {
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        },12000)
        val slides= arrayOf(introslide("Welcome to your SmartGuard Hub!",R.drawable.blue,"The SmartGuard suite is controlled from the central 'Hub'.Be sure to use an active SIM card to communicate with the Hub!",Color.rgb(10,133,230)),
            introslide("Get started by adding devices here",R.drawable.cyan,"Adding a new device to expand your home security is as easy 3 taps!",Color.rgb(23,169,139)),
            introslide("Add others Hub easily",R.drawable.orange,"Have the SmartGuard Hub automatically notify other people when any sensor is triggered!",Color.rgb(255,127,80)),
            introslide("Get help whenever you need it,wherever you need it!",R.drawable.screen,"Help is available at every step,just tap the 'Help'icon on the top right to get quick answers!",Color.MAGENTA))

        slides.mapIndexed { index, slide ->
            slider_root.addView(getSlideViewBySlideData(slide),index)
        }
        val inAnim= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left)
        val outAnim= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right)

        slider_root.inAnimation=inAnim
        slider_root.outAnimation=outAnim
        slider_root.flipInterval=2500
        slider_root.startFlipping()

    }
    fun getSlideViewBySlideData(slide: introslide): View? {
        val view= LayoutInflater.from(this).inflate(R.layout.item_introduction,null)
        val title= view.findViewById<TextView>(R.id.textView_title)
        val description= view.findViewById<TextView>(R.id.textView_description)
        val logo= view.findViewById<ImageView>(R.id.circularImageView)
        val background=view.findViewById<ConstraintLayout>(R.id.constraint_layout)


        title.text=slide.title
        description.text=slide.description
        logo.setImageResource(slide.logo)
        background.setBackgroundColor(slide.background)

        return view


    }
}
