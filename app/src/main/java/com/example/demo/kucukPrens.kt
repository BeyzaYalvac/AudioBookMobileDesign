package com.example.demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.demo.databinding.Fragment2Binding
import com.example.demo.databinding.FragmentKucukPrensBinding


class kucukPrens : Fragment() {


    private var _binding: FragmentKucukPrensBinding ?= null
    private val tasarim get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKucukPrensBinding.inflate(inflater, container, false)


        return tasarim.root
    }
}