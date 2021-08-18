package com.example.myappfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var etButtonOne: Button
    private lateinit var etButtonTwo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        etButtonOne = findViewById(R.id.buttonOne)
        etButtonTwo = findViewById(R.id.buttonTwo)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, firstFragment)
            commit()
        }
        etButtonOne.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, firstFragment)
                commit()
            }
            etButtonTwo.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flfragment, secondFragment)
                    commit()
                }

            }
        }
    }
}