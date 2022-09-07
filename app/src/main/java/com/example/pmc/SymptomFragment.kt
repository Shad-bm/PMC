package com.example.pmc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.pmc.databinding.FragmentSymptomBinding


class SymptomFragment : Fragment() {
    private lateinit var binding: FragmentSymptomBinding
    private val symptomVM: SymptomVM by lazy { ViewModelProvider(this)[SymptomVM::class.java] }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentSymptomBinding.inflate(layoutInflater)

        binding.backBT.setOnClickListener {
            findNavController().navigate(R.id.action_symptomFragment_to_MainDashboardFragment)
        }

        binding.searchBT.setOnClickListener {
            if(symptomVM.resultSymptoms(
                    binding.symSearch.query.toString(),
                    requireContext())
            ){
                findNavController().navigate(R.id.action_symptomFragment_to_resultFragment)
                //call show result function here
            }
        }

        return binding.root
    }
}