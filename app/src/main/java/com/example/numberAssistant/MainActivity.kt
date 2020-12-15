package com.example.numberAssistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitNumber.setOnClickListener { submit() }
    }

    private fun submit() {
        val number = inputNumber.text.toString().toInt()

        //Finding the factors of the number
        val factorList = mutableListOf<Int>(0)
        for (i in 1..100) {
            if (number % i == 0) {
                factorList.add(i)
            }
        }

        //Finding if the number is a prime number
        var isPrime = false
        if (factorList.size == 3)
        {
            isPrime = true
        }
        else
            isPrime = false

        //Displaying the information
        //Factors
        var listOfFactors = ""
        for (i in factorList) {
            listOfFactors += i.toString()
            listOfFactors += " "
        }
        outputFactors.text = listOfFactors

        //Is Prime
        if (isPrime) {
            isPrimeBox.text = "Yes"
        }
        else {
            isPrimeBox.text = "No"
        }

    }


}
