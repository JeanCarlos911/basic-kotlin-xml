package com.jeank.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyVoidFunction()
    }

    private fun MyVoidFunction () {
        //salida por consola
        println("De esta forma se imprime una línea, recordemos que es como un java con mejoras y con mayor enfoque en android")

        //Aqui se puede combinar el uso de java con kotlin
        val constDeveloper = Person("Jean Carlos SC", 19)
        println("My name is " + constDeveloper.getName() + ",\n and i am " + constDeveloper.getAge() + " years old.")

        //val es una constante y var una variable
        var num1 = 100
        val num2: Int

        num2 = 3

        num1 = 120
        //num2 = 5 /*Val cannot be reassigned*/

        println (num1 + num2)

        //functions
        println(myFunctionWithParameters(98, 99) + "\n" + anotherFormOfWriteFunction(97, 100))

        println("Con esto es más que suficiente para empezar un proyecto, felicidades ! 😎")
    }

    private fun myFunctionWithParameters(num1: Int, num2: Int): String{
        return "First number: $num1\nSecond number: $num2"
    }

    private fun anotherFormOfWriteFunction(num1: Int, num2: Int) = "$num1 x $num2 = ${num1 * num2}"

}