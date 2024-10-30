package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == MyApplication.ACTION_CUSTOM_BROADCAST){
            val message = intent.getStringExtra("my message for broadcasting")
            Toast.makeText(context, "Broadcast received: $message", Toast.LENGTH_SHORT).show()
        }
    }
}