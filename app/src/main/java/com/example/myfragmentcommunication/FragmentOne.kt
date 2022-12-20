package com.example.myfragmentcommunication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myfragmentcommunication.databinding.OneFragmentBinding

class FragmentOne:Fragment() {
    private lateinit var mySharedViewModel: MySharedViewModel
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,
                              savedInstanceState: Bundle?): View?{
        val oneFragmentBinding:OneFragmentBinding = DataBindingUtil.inflate(inflater,R.layout.one_fragment, container, false)

        oneFragmentBinding.btnSubmit.setOnClickListener {
            mySharedViewModel.setText(oneFragmentBinding.etInput.text.toString())
        }
        return oneFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mySharedViewModel = ViewModelProvider(requireActivity())[MySharedViewModel::class.java]
    }
}