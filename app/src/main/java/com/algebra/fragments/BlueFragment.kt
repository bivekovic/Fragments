package com.algebra.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

class BlueFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val blueFragment =  inflater.inflate(R.layout.fragment_blue, container, false)
        val args = arguments?.getString(ARGS_KEY)
        //Toast.makeText(activity, args, Toast.LENGTH_LONG).show()

        val tvResult: TextView = blueFragment.findViewById(R.id.tvResult)
        tvResult.text = args

        return blueFragment
    }

}
