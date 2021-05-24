package com.example.smirag

import android.os.Bundle
import android.text.SpannableString
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment: Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

          button.setOnClickListener {
              val action = HomeFragmentDirections.actionHomeFragmentToSecondFragment()
              findNavController().navigate(action)
          }
    }
}