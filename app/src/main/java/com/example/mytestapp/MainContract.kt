package com.example.mytestapp

interface MainContract {

    interface View {
        fun addMessage(message: String)
        fun disableSendButton()
        fun enableSendButton()
    }

    interface Presenter {
        fun sendMessage(message: String)
        fun changeInTextInput(message: String)
    }
}