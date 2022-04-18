package com.example.invester

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.invester.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMainBinding.inflate(inflater)

        binding.Ebalo.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToProfileFragment())
        }

        binding.GAZPROM.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToAboutFragment(binding.GAZPROM.text.toString()))
        }

        binding.SBERBANK.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToAboutFragment(binding.SBERBANK.text.toString()))
        }

        binding.MAGNIT.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToAboutFragment(binding.MAGNIT.text.toString()))
        }

        binding.PEREKRESTOK.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToAboutFragment(binding.PEREKRESTOK.text.toString()))
        }

        binding.KURKRILO.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToAboutFragment(binding.KURKRILO.text.toString()))
        }

        binding.ROSTELEKOM.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToAboutFragment(binding.ROSTELEKOM.text.toString()))
        }

        binding.LUKOYL.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToAboutFragment(binding.LUKOYL.text.toString()))
        }

        return binding.root
    }


}