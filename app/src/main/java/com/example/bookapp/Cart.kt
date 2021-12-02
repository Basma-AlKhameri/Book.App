package com.example.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.shuhart.stepview.StepView

class Cart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
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
        }
    }
}