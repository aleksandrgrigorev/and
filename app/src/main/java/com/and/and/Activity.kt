package com.and.and

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SecondFragment())
                .commitNow()
        }
    }
}