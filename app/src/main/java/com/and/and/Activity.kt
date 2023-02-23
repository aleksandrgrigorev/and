package com.and.and

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout, ThirdFragment())
            .commit()
    }
}