package com.example.intercambiodatos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.intercambiodatos.databinding.FragmentRegistroBinding

class RegistroFragment : Fragment() {
    private  var _binding: FragmentRegistroBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //aqui ejecutamos binding
        _binding = FragmentRegistroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnEntrar.setOnClickListener {
            val name = binding.etNombre.text.toString()
            val bundle = Bundle()
            bundle.putString("name", name)

            val segundoFragment = SegundoFragment()
            segundoFragment.arguments = bundle


            parentFragmentManager.beginTransaction().replace(R.id.fRegistro, segundoFragment)
                .addToBackStack(null)
                .commit()


        }
    }

}