package com.algebra.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

const val TAG = "RedFragment"
const val ARGS_KEY = "ArgsKey"

class RedFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i(TAG, "onCreateView")

        val redFragment =  inflater.inflate(R.layout.fragment_red, container, false)
        val bStart: Button = redFragment.findViewById(R.id.bStart)
        val etText: EditText = redFragment.findViewById(R.id.etText)

        bStart.setOnClickListener {
            //Toast.makeText(activity, etText.text.toString(), Toast.LENGTH_LONG).show()

            val bundle = Bundle().apply {
                putString(ARGS_KEY, etText.text.toString())
            }

            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragmentContainer, BlueFragment().apply { arguments = bundle })
                ?.commit()
        }

        return redFragment
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i(TAG, "onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG, "onDetach")
    }

}
