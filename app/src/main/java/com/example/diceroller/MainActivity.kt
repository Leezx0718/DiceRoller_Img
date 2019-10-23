package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    lateinit var diceImage3 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage3 = findViewById(R.id.dice_image3)


        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun getRandom(): Int {

        val randomInt = Random().nextInt(6) + 1
        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //diceImage.setImageResource(drawableResource)
    }

    private fun rollDice() {
        //Toast.makeText(this, "button clicked",
        //    Toast.LENGTH_SHORT).show()
        diceImage.setImageResource(getRandom())
        diceImage2.setImageResource(getRandom())
        diceImage3.setImageResource(getRandom())

    }
}
