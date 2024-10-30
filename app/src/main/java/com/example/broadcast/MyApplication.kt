package com.example.broadcast

import android.app.Application

class MyApplication : Application() {
    companion object{
        const val ACTION_CUSTOM_BROADCAST = "com.example.broadcast.ACTION_CUSTOM_BROADCAST"
    }
}