package com.blogspot.atifsoftwares.agecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //handle button click
        calculateAgeBtn.setOnClickListener {
            //get age from EditText
            val userDOB = ageEt.text.toString().trim() //.trim() removes space from start and end of text
            //get current year
            val year:Int = Calendar.getInstance().get(Calendar.YEAR)
            //validate
            if (userDOB == ""){ //if no value is entered
                Toast.makeText(this, "Please enter year", Toast.LENGTH_SHORT).show()
            }
            else if (userDOB > year.toString()){ //if Entered Year > Current Year
                Toast.makeText(this, "Entered year should be less then current year", Toast.LENGTH_SHORT).show()
            }
            else{
                //current year - entered year
                val myAge = year - userDOB.toInt() //year is Int value, but userDOB was string value so it should be converted to Int
                //set the value of myAge to TextView
                myAgeTv.text = "Age is " +myAge+ " Years"
            }
        }
    }
}
