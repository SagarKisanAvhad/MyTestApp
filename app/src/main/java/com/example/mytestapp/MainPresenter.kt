package com.example.mytestapp

class MainPresenter(
    val view: MainContract.View
) : MainContract.Presenter {

    override fun sendMessage(message: String?) {

        if (!message.isNullOrEmpty())
            view.addMessage(message)


    }

    override fun changeInTextInput(message: String?) {

        if (message.isNullOrEmpty())
            view.disableSendButton()
        else
            view.enableSendButton()

    }
}