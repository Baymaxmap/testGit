package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.broadcast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val myReceiver = MyBroadcastReceiver()
    lateinit var myBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        myBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(myBinding.root)

        val filter = IntentFilter(MyApplication.ACTION_CUSTOM_BROADCAST)
        registerReceiver(myReceiver, filter)

        myBinding.buttonBroadcast.setOnClickListener {
            val intent = Intent(MyApplication.ACTION_CUSTOM_BROADCAST)
            intent.putExtra("my message for broadcasting", "dmm")
            sendBroadcast(intent)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(myReceiver)
    }

}