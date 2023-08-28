package com.example.overlay

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, ForegroundService::class.java)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Log.d("krrr", "startForegroundService")
            startForegroundService(intent)
        } else {
            Log.d("krrr", "startService")
            startService(intent)
        }
    }
}
