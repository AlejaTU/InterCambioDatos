package com.example.intercambiodatos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.intercambiodatos.databinding.FragmentSegundoBinding

class SegundoFragment : Fragment() {

    private  var _binding: FragmentSegundoBinding? = null
    private val binding get() = _binding!!

    private var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        name = requireArguments().getString("name")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSegundoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //mostrar el nombre del textview del primer fragment
        binding.tvMostrarnombre.text = "$name!"
    }

}