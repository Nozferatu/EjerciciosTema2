package com.example.ejerciciostema2

fun main(){
    saludar("Carlos", 19)
}

fun saludar(nombre:String, edad:Int): Unit{
    println("Hola $nombre, tienes $edad años.")
}