package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
    }


    private fun rollDice(){

        val randomInt = Random().nextInt(6)+1
        val resultText:TextView = findViewById(R.id.result_text)
        val resultText1:TextView = findViewById(R.id.result_text1)
        val resultText2:TextView = findViewById(R.id.result_text2)
        resultText.text = randomInt.toString()
        resultText1.text = randomInt.toString()
        resultText2.text = randomInt.toString()
    }
}
