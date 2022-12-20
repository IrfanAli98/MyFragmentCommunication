package com.example.myfragmentcommunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myfragmentcommunication.databinding.ActivityMainBinding
import com.example.myfragmentcommunication.databinding.OneFragmentBinding

class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityMainBinding
    private lateinit var mySharedViewModel: MySharedViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding= DataBindingUtil.setContentView(this, R.layout.activity_main)
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment_container1, FragmentOne())
        fragmentTransaction.commit()
        fragmentTransaction.add(R.id.fragment_container2, FragmentTwo())
        fragmentTransaction.commit()

    }
}