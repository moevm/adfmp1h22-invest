package com.example.invester

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.invester.databinding.FragmentMainBinding
import com.example.invester.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater)

        binding.toBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.addAction.setOnClickListener {
            findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToSearchFragment())
        }

        return binding.root
    }
}