package com.example.pmc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.pmc.databinding.FragmentDiseaseBinding


class DiseaseFragment : Fragment() {
    private lateinit var binding: FragmentDiseaseBinding
    private val diseaseVM: DiseaseVM by lazy { ViewModelProvider(this)[DiseaseVM::class.java] }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentDiseaseBinding.inflate(layoutInflater)

        binding.backBT.setOnClickListener {
            findNavController().navigate(R.id.action_diseaseFragment_to_MainDashboardFragment)
        }
        binding.searchBT.setOnClickListener {

            if(diseaseVM.resultDiseases(
                    binding.disSearch.query.toString(),
                    requireContext())
            ){
                findNavController().navigate(R.id.action_diseaseFragment_to_resultFragment)
                //call show result function here
            }
        }
        return binding.root
    }

}