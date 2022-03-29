package com.example.compressapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.compressapp.databinding.FragmentClientBinding

class ClientFragment : Fragment() {

    private lateinit var binding: FragmentClientBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentClientBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCompanies.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("type", "companies")
            Navigation.createNavigateOnClickListener(
                R.id.action_clientFragment_to_companyFragment,
                bundle
            )
                .onClick(it)
        }

        binding.btnYourDevices.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("type", "devices")
            Navigation.createNavigateOnClickListener(
                R.id.action_clientFragment_to_companyFragment,
                bundle
            )
                .onClick(it)
        }

    }

}