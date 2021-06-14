package com.example.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add.setOnClickListener {
           var num1= Integer.parseInt(num1.text.toString())
            var num2= Integer.parseInt(num2.text.toString())

            ans.text= "Answer :Addition = ${num1+num2}"

        }
       sub.setOnClickListener {
            var num1= Integer.parseInt(num1.text.toString())
            var num2= Integer.parseInt(num2.text.toString())

            ans.text= "Answer :Subtraction = ${num1-num2}"

        }
        multiply.setOnClickListener {
            var num1= Integer.parseInt(num1.text.toString())
            var num2= Integer.parseInt(num2.text.toString())

            ans.text= "Answer :Multiplication = ${num1*num2}"

        }
        divide.setOnClickListener {
            var num1= Integer.parseInt(num1.text.toString())
            var num2= Integer.parseInt(num2.text.toString())

            ans.text= if(num2!=0) "Answer :Division = ${String.format("%0,2f",(num1*1.0/num2))}" else "Invalid input"

        }

    }
}