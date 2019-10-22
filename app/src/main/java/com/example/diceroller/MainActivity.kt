package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        diceImage = findViewById(R.id.dice_image1)
        diceImage = findViewById(R.id.dice_image2)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
    }


    private fun rollDice(){

        val randomInt = Random().nextInt(6)+1

        val diceImage : ImageView = findViewById(R.id.dice_image)
        val diceImage1 : ImageView = findViewById(R.id.dice_image1)
        val diceImage2 : ImageView = findViewById(R.id.dice_image2)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage1.setImageResource(drawableResource)
        diceImage2.setImageResource(drawableResource)

    }
}
