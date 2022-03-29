package com.example.compressapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.compressapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnClient.setOnClickListener {
            Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_clientFragment)
                .onClick(it)
        }

        binding.btnCompany.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("type", "client")
            Navigation.createNavigateOnClickListener(
                R.id.action_mainFragment_to_companyFragment,
                bundle
            ).onClick(it)
        }

    }

}