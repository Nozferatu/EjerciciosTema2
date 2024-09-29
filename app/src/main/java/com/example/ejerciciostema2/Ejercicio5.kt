package com.example.ejerciciostema2

fun main(){
    var gradosCelsius = 30
    var gradosFahrenheit = 86

    println("$gradosCelsius grados Celsius en Fahrenheit son " + convertirCelsiusAFahrenheit(gradosCelsius.toFloat()))
    println("$gradosFahrenheit grados Fahrenheit en Celsius son " + convertirFahrenheitACelsius(gradosFahrenheit.toFloat()))
}

fun convertirCelsiusAFahrenheit(grados:Float): Float{
    return grados * 1.8F + 32
}

fun convertirFahrenheitACelsius(grados:Float): Float{
    return (grados - 32) / 1.8F
}