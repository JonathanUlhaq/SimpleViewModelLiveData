package com.belajar.simplemvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.belajar.simplemvvm.ViewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    lateinit var btn_tab:Button
    lateinit var tv_number:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inisialisasi()
        textValue()
        incrementLogic()
    }

    fun inisialisasi()
    {
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        btn_tab = findViewById(R.id.btn_tap)
        tv_number = findViewById(R.id.tv_number)
    }


    fun incrementLogic()
    {
        btn_tab.setOnClickListener {
            var x:Int = ++mainViewModel.nomor
            mainViewModel.testCurrentInt.value = x
            Log.e("NOMOR: ",mainViewModel.testCurrentInt.value.toString())

        }
    }

    fun textValue()
    {
        mainViewModel.testCurrentInt.observe(this, Observer {
            tv_number.text = it.toString()
        })
    }

}