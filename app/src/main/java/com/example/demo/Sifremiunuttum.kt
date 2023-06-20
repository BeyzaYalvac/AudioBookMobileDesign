package com.example.demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.demo.databinding.FragmentKayitolBinding
import com.example.demo.databinding.FragmentSifremiunuttumBinding


class Sifremiunuttum : Fragment() {


    private var _binding: FragmentSifremiunuttumBinding?=null
    private val tasarim get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSifremiunuttumBinding.inflate(inflater, container, false)


        return tasarim.root
    }
}