package com.example.mytestapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun addMessage(message: String) {

    }

    override fun disableSendButton() {

    }

    override fun enableSendButton() {

    }
}
