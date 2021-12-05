package com.example.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.bookapp.adapters.ViewPagerAdapter
import com.shuhart.stepview.StepView
import kotlinx.android.synthetic.main.activity_cart.*
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition

class Cart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        stepupStepupView()
        setupViewPager()
        setupButtons()

    }
    lateinit var stepView: StepView
        fun stepupStepupView(){
             stepView= findViewById(R.id.step_view_cart)
            stepView.state
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
            stepView.setOnStepClickListener { position->
                viewPager.setCurrentItem(position,false)
            }
        }


    private fun setupViewPager(){
        viewPager.adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        viewPager.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    setButtons(position)
                    stepView.go(position,true)
                }
            }
        ){

        }
    }
    private fun setupButtons(){
        backButtonCart.setOnClickListener {
            viewPager.setCurrentItem(viewPager.currentItem-1,false)
        }

       nextButtonCart.setOnClickListener {
            viewPager.setCurrentItem(viewPager.currentItem+1,false)
        }
    }
    private fun setButtons(position:Int){
        when (position){
            0 ->{
                backButtonCart.visibility = View.INVISIBLE
                nextButtonCart.visibility = View.VISIBLE
            }
            1->{
                backButtonCart.visibility = View.VISIBLE
                nextButtonCart.visibility = View.VISIBLE
            }
            2->{
                backButtonCart.visibility = View.VISIBLE
                nextButtonCart.visibility = View.INVISIBLE
            }
        }
    }
}


