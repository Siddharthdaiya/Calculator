
package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAc.setOnClickListener {
            binding.InputText.text=""
            binding.outputText.text=""
        }

        binding.btn0.setOnClickListener {
            binding.InputText.append("0")
        }
        binding.btn1.setOnClickListener {
            binding.InputText.append("1")
        }
        binding.btn2.setOnClickListener {
            binding.InputText.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.InputText.append("3")
        }
        binding.btn4.setOnClickListener {
            binding.InputText.append("4")
        }
        binding.btn5.setOnClickListener {
            binding.InputText.append("5")
        }
        binding.btn6.setOnClickListener {
            binding.InputText.append("6")
        }
        binding.btn7.setOnClickListener {
            binding.InputText.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.InputText.append("8")
        }
        binding.btn9.setOnClickListener {
            binding.InputText.append("9")
        }
        binding.btnPlus.setOnClickListener {
            binding.InputText.append(" + ")
        }
        binding.btnMinus.setOnClickListener {
            binding.InputText.append(" - ")
        }
        binding.btnDivide.setOnClickListener {
            binding.InputText.append(" / ")
        }
        binding.btnMultiply.setOnClickListener {
            binding.InputText.append(" * ")
        }
        binding.btnDot.setOnClickListener {
            binding.InputText.append(".")
        }
        binding.btnStartBracket.setOnClickListener {
            binding.InputText.append(" ( ")
        }
        binding.btnEndBracket.setOnClickListener {
            binding.InputText.append(" ) ")
        }
        binding.btnEqualto.setOnClickListener {
            val expression= ExpressionBuilder(binding.InputText.text.toString()).build()
            val result=expression.evaluate()
            val longresult=result.toLong()
            if (result==longresult.toDouble())
            {
                binding.outputText.text= longresult.toString()
            }else{
                binding.outputText.text=result.toString()
            }

        }

    }
}