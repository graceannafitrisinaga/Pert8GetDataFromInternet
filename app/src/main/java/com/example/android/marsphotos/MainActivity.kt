package com.example.android.marsphotos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * MainActivity menyetel tampilan konten activity_main, wadah fragmen yang berisi ringkasanFragment.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}