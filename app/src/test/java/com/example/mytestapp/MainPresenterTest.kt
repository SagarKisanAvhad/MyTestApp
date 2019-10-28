package com.example.mytestapp

import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.never
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class MainPresenterTest {

    private lateinit var presenter: MainPresenter

    @Mock
    private lateinit var view: MainContract.View

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        presenter = MainPresenter(view)
    }

    @Test
    fun sendMessage_NullInput_NoMessageSent() {
        // arrange
        val input = null
        //act
        presenter.sendMessage(input)
        //check
        verify(view, never()).addMessage(input)
    }

    @Test
    fun sendMessage_EmptyInput_NoMessageSent() {
        // arrange
        val input = ""
        //act
        presenter.sendMessage(input)
        //check
        verify(view, never()).addMessage(input)
    }

    @Test
    fun sendMessage_NormalInput_MessageSent() {
        // arrange
        val input = "Hello"
        //act
        presenter.sendMessage(input)
        //check
        verify(view).addMessage(input)
    }


    @Test
    fun changeInTextInput_NullInput_disableButton() {

        // arrange
        val input = null
        //act
        presenter.changeInTextInput(input)
        //check
        verify(view).disableSendButton()
        verify(view, never()).enableSendButton()

    }

    @Test
    fun changeInTextInput_EmptyInput_disableButton() {

        // arrange
        val input = ""
        //act
        presenter.changeInTextInput(input)
        //check
        verify(view).disableSendButton()
        verify(view, never()).enableSendButton()

    }

    @Test
    fun changeInTextInput_NormalInput_enableButton() {

        // arrange
        val input = "Hello"
        //act
        presenter.changeInTextInput(input)
        //check
        verify(view).enableSendButton()
        verify(view, never()).disableSendButton()

    }

}