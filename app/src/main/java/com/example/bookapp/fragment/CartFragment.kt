package com.example.bookapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.example.bookapp.R
import com.example.bookapp.databinding.CartFragmentBinding
import com.shuhart.stepview.StepView
import kotlinx.android.synthetic.*


class CartFragment : Fragment(R.layout.cart_fragment) {
    private var _binding: CartFragmentBinding? = null
    // with the backing property of the kotlin we extract
    // the non null value of the _binding
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
fun stepupStepupView(){

    //val stepView=view.findViewById(R.id.step_view_cart)
    binding.stepViewCart.state
         // You should specify only stepsNumber or steps array of strings.
        // In case you specify both steps array is chosen.
        .steps(object : ArrayList<String?>() {
            init {
                add("First step")
                add("Second step")
                add("Third step")
            }
        })
        .stepsNumber(3)
        .animationDuration(resources.getInteger(android.R.integer.config_shortAnimTime))
        .commit()
}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CartFragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


    }
