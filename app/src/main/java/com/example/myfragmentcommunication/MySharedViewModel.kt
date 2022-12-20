package com.example.myfragmentcommunication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MySharedViewModel: ViewModel() {
    val textmsg = MutableLiveData<String>()

    fun setText(text: String){
        textmsg.postValue(text)
    }
}