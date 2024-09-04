package com.example.practice1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.practice1.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.btnToPhoto.setOnClickListener{
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment2)
        }

        binding.btnToDescription.setOnClickListener{
            findNavController().navigate(R.id.action_firstFragment_to_thirdFragment2)
        }


        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = FirstFragment()
    }
}