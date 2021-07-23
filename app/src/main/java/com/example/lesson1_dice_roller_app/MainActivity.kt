package com.example.lesson1_dice_roller_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lesson1_dice_roller_app.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRoll.setOnClickListener {
            rollTheDice()
        }
    }

    private fun rollTheDice() {
        Toast.makeText(this, "Button Pressed", Toast.LENGTH_SHORT).show()
        val diceNumberToBeRolled = Random().nextInt(6)+1
        val drawableResource = when (diceNumberToBeRolled) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.imgDice.setImageResource(drawableResource)
    }
}