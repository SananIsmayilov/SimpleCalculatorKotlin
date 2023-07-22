package com.example.sananismayilov.calculatorapp

import kotlin.properties.Delegates

class Calculate (var number1 : Int,var number2 : Int){

    fun topla() : String{
       var yekun =  number1+number2
        return yekun.toString()
    }
    fun cix() : Int{
        return number1-number2
    }
    fun vur() : Int{
        return number1*number2
    }
    fun bol() : Int{
        return number1/number2
    }

}