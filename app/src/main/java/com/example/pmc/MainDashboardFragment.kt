package com.example.pmc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pmc.databinding.FragmentMaindashboardBinding


class MainDashboardFragment : Fragment() {

    private lateinit var binding:FragmentMaindashboardBinding

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
            binding = FragmentMaindashboardBinding.inflate(layoutInflater)

            binding.searchBySB.setOnClickListener {
                findNavController().navigate(R.id.symptomFragment)
            }
            binding.searchByDB.setOnClickListener {
                findNavController().navigate(R.id.symptomFragment)
            }
            return binding.root
        }
}
