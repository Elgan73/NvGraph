package com.stark.nvgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onStart() {
        super.onStart()
        firstBtnNext.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_firstFragment_to_secondFragment)
            val str = input_field.text.toString()
            newInstance(str)
        }
    }

    companion object {
        fun newInstance(isMyString: String) = FirstFragment().apply {
            arguments = Bundle().apply {
                putString("MyString", isMyString)
            }
        }
    }
}