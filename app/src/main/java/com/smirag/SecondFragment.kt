package com.example.smirag

import android.os.Bundle
import android.text.SpannableString
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment: Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

     button4.setOnClickListener {
         val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment()
         findNavController().navigate(action)
     }
    }
}