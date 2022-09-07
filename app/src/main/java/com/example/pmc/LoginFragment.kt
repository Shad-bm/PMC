package com.example.pmc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.pmc.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private val loginVM: LoginVM by lazy { ViewModelProvider(this)[LoginVM::class.java] }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        binding.loginBT.setOnClickListener {
            if (loginVM.login(
                binding.usernameET.text.toString(),
                binding.passwordET.text.toString(),
                requireContext()
            )){
                findNavController().navigate(R.id.action_loginFragment_to_MainDashboardFragment)
            }
            Toast.makeText(
                context,
                "Login failed , please check username and password",
                Toast.LENGTH_SHORT
            ).show()
        }
        return binding.root
    }
}