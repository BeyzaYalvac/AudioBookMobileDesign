package com.example.demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.demo.databinding.Fragment2Binding
import androidx.navigation.fragment.navArgs


class fragment2 : Fragment() {


    private var _binding: Fragment2Binding? = null
    private val tasarim get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment2Binding.inflate(inflater, container, false)

        tasarim.buttongiris.setOnClickListener{
        Navigation.findNavController(it).navigate(R.id.kaydolagec)
        }
        tasarim.kayTol.setOnClickListener { Navigation.findNavController(it).navigate(R.id.kaydolagec) }
        tasarim.sifrenidegistir.setOnClickListener { Navigation.findNavController(it).navigate(R.id.sifremiunuttumagecis) }
        return tasarim.root
    }


}