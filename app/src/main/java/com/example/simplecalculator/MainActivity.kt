package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var result:String = "0"
        var afterSum:String = "0"
        var finalResult:String = "0"



        binding.btn0.setOnClickListener {
            finalResult = "0"
            if(!resultOver(result)){
                return@setOnClickListener
            }
            result+=0
            binding.resultText.text = result.toLong().toString()
        }

        binding.btn1.setOnClickListener {
            finalResult = "0"
            if(!resultOver(result)){
                return@setOnClickListener
            }
            result+=1
            binding.resultText.text = result.toLong().toString()


        }

        binding.btn2.setOnClickListener {
            finalResult = "0"
            if(!resultOver(result)){
                return@setOnClickListener
            }
            result+=2
            binding.resultText.text =  result.toLong().toString()
        }
        binding.btn3.setOnClickListener {
            finalResult = "0"
            if(!resultOver(result)){
                return@setOnClickListener
            }
            result+=3
            binding.resultText.text =  result.toLong().toString()
        }
        binding.btn4.setOnClickListener {
            finalResult = "0"
            if(!resultOver(result)){
                return@setOnClickListener
            }
            result+=4
            binding.resultText.text =  result.toLong().toString()
        }
        binding.btn5.setOnClickListener {
            finalResult = "0"
            if(!resultOver(result)){
                return@setOnClickListener
            }
            result+=5
            binding.resultText.text =  result.toLong().toString()
        }
        binding.btn6.setOnClickListener {
            finalResult = "0"
            if(!resultOver(result)){
                return@setOnClickListener
            }
            result+=6
            binding.resultText.text =  result.toLong().toString()
        }
        binding.btn7.setOnClickListener {
            finalResult = "0"
            if(!resultOver(result)){
                return@setOnClickListener
            }
            result+=7
            binding.resultText.text =  result.toLong().toString()
        }
        binding.btn8.setOnClickListener {
            finalResult = "0"
            if(!resultOver(result)){
                return@setOnClickListener
            }
            result+=8
            binding.resultText.text =  result.toLong().toString()
        }
        binding.btn9.setOnClickListener {
            finalResult = "0"
            if(!resultOver(result)){
                return@setOnClickListener
            }
            result+=9
            binding.resultText.text =  result.toLong().toString()
        }

        binding.btnsum.setOnClickListener {
            if(finalResult != "0"){
                afterSum = finalResult
            }else{
                afterSum = result
            }

            result = "0"

        }

        binding.btnresult.setOnClickListener {
            var needToClear = true
            if(finalResult !="0"){
                needToClear = false
            }
            if(needToClear){
            finalResult = (result.toLong() + afterSum.toLong()).toString()
            binding.resultText.text = finalResult

                result = "0"
                afterSum = "0"
            }

        }

        binding.btnreset.setOnClickListener {
            result = "0"
            afterSum = "0"
            finalResult = "0"
            binding.resultText.text = "0"
        }

    }

    fun resultOver(result: String):Boolean{
        if(result.length > 16){
            return false
        }

        return true
    }


}