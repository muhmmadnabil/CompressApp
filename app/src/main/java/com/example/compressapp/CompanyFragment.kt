package com.example.compressapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.compressapp.databinding.FragmentCompanyBinding

class CompanyFragment : Fragment() {

    private lateinit var binding: FragmentCompanyBinding
    private lateinit var type: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCompanyBinding.inflate(inflater, container, false)

        type = arguments?.getString("type")!!

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            if (type == "companies") {
                recyclerView.adapter = MyAdapter(createCompaniesList())
            } else if (type == "devices") {
                recyclerView.adapter = MyAdapter(createDevicesList())
            } else {
                recyclerView.adapter = MyAdapter(createClientsList())
            }
        }


    }

    private fun createCompaniesList(): ArrayList<AdapterData> {
        val list = ArrayList<AdapterData>()

        for (i in 0 until 15) {
            list.add(AdapterData("Samsung", "Big industry company"))
        }
        return list
    }

    private fun createDevicesList(): ArrayList<AdapterData> {
        val list = ArrayList<AdapterData>()

        for (i in 0 until 15) {
            list.add(AdapterData("Camera sensor", "Camera with 5mp"))
        }
        return list
    }

    private fun createClientsList(): ArrayList<AdapterData> {
        val list = ArrayList<AdapterData>()

        for (i in 0 until 15) {
            list.add(AdapterData("Mohamed", "Mohamed Ahmed Mohamed"))
        }
        return list
    }


}