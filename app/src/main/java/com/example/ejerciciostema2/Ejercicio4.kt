package com.example.ejerciciostema2

fun main(){
    informacionPersonal("Carlos", 19, "Granada")
}

fun informacionPersonal(nombre:String, edad:Int, ciudad:String): Unit{
    println("Hola $nombre, tienes $edad años y vives en $ciudad")
}