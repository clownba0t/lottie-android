package com.airbnb.lottie.issues

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import com.airbnb.lottie.issues.R
import kotlinx.android.synthetic.main.activity_main.*
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Reproduce any issues here.
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.reload).setOnClickListener { load() }
        load()
    }

    private fun load() {
        findViewById<LottieAnimationView>(R.id.animation).setAnimationFromUrl("https://raw.githubusercontent.com/airbnb/lottie-ios/master/Example/lottie-swift/TestAnimations/PinJump.json")
    }
}
