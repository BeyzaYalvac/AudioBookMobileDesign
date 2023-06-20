package com.example.demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.demo.databinding.Fragment1Binding
import com.example.demo.databinding.FragmentKayitolBinding


class kayitol : Fragment() {



    private var _binding: FragmentKayitolBinding?=null
    private val tasarim get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKayitolBinding.inflate(inflater, container, false)

        tasarim.button.setOnClickListener{
            tasarim.button.setOnClickListener{
                Navigation.findNavController(it).navigate(R.id.kucukprensgeciss)
            }
        }
        return tasarim.root
    }


}