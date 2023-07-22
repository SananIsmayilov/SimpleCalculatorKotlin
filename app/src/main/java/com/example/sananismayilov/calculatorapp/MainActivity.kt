package com.example.sananismayilov.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.sananismayilov.calculatorapp.databinding.ActivityMainBinding
import javax.microedition.khronos.egl.EGL10

private  lateinit var binding : ActivityMainBinding
lateinit var result : String
lateinit var number1 : String
lateinit var number2 : String
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)




        binding.button.setOnClickListener {
            number1 = (binding.editTextText.text.toString())
            number2 = binding.editTextText2.text.toString()
            result = Calculate(number1.toInt(), number2.toInt()).topla()
            binding.textView.text = "Nəticə ${result}"
        }
        binding.button3.setOnClickListener {
            number1 = (binding.editTextText.text.toString())
            number2 = binding.editTextText2.text.toString()
            result = Calculate(number1.toInt(), number2.toInt() ).cix().toString()
            binding.textView.text = "Nəticə ${result}"
        }
        binding.button2.setOnClickListener {
            number1 = (binding.editTextText.text.toString())
            number2 = binding.editTextText2.text.toString()
            result = Calculate(number1.toInt(), number2.toInt() ).bol().toString()
            binding.textView.text = "Nəticə ${result}"
        }
        binding.button4.setOnClickListener {
            number1 = (binding.editTextText.text.toString())
            number2 = binding.editTextText2.text.toString()
            result = Calculate(number1.toInt(), number2.toInt() ).vur().toString()
            binding.textView.text = "Nəticə ${result}"
        }

    }

}