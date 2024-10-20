package com.pardeep.yogify.login_signup_screen

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.pardeep.yogify.R
import com.pardeep.yogify.databinding.FragmentVeriicationScreenBinding

/**
 * A simple [Fragment] subclass.
 * Use the [veriication_screen.newInstance] factory method to
 * create an instance of this fragment.
 */

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class veriication_screen : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    var randomNumber = 0
    var binding : FragmentVeriicationScreenBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         val bundle = arguments?:return
        randomNumber = bundle.getInt("randomNumber")
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_veriication_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("Random Number: " + randomNumber)

//        binding?.TextInputLayout1?.editText?.addTextChangedListener(object : TextWatcher {
////            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
////                TODO("Not yet implemented")
////            }
////
////            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
////                TODO("Not yet implemented")
////            }
//
//            override fun afterTextChanged(s: Editable?) {
//                TODO("Not yet implemented")
//                if (s.toString().length == 1) {
//                    binding?.TextInputLayout2?.editText?.requestFocus()
//                }
//                else if (s.toString().length == 1){
//                    binding?.TextInputLayout3?.editText?.requestFocus()
//                }
//            }
//        })

        binding?.verifyBtn?.setOnClickListener {
            val enterCode = binding?.TextInputLayout1?.editText?.text.toString()+binding?.TextInputLayout2?.editText?.text?.toString()+binding?.TextInputLayout3?.editText?.text.toString()+binding?.TextInputLayout4?.editText?.text.toString()+binding?.TextInputLayout5?.editText?.text.toString()
            println("Enter Code: " + enterCode)
            if(enterCode == randomNumber.toString()){
                Toast.makeText(requireContext(), "login Successfully", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(requireContext(), "Code not match | Try Again", Toast.LENGTH_SHORT).show()
            }
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment veriication_screen.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            veriication_screen().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}