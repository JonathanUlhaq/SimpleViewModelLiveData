package com.belajar.simplemvvm.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel() {

    var nomor:Int = 0
    val testCurrentInt : MutableLiveData<Int> by  lazy {
        MutableLiveData<Int>()
    }

}