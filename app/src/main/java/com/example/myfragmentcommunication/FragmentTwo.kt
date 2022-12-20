package com.example.myfragmentcommunication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myfragmentcommunication.databinding.TwoFragmentBinding

class FragmentTwo: Fragment() {
    private lateinit var mySharedViewModel: MySharedViewModel
//    private lateinit var twoFragmentBinding: TwoFragmentBinding
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val twoFragmentBinding: TwoFragmentBinding = DataBindingUtil.inflate(inflater,R.id.fragment_container2, container, false )

        return twoFragmentBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mySharedViewModel = ViewModelProvider(requireActivity())[MySharedViewModel::class.java]
//        mySharedViewModel.textmsg.observe(requireActivity(), Observer {
//            twoFragmentBinding.tvResult.text = it
//        })
    }
}