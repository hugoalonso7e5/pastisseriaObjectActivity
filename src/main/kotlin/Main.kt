package org.example

fun main() {
    println("---Pastes---")
    val crusan = Pasta("Croissant",1.55,0.255,150.0)
    val ensaimada = Pasta("Ensaimada",1.75,0.215,175.0)
    val donut = Pasta("Donut",1.25,0.100,89.0)

    println(crusan)
    println(ensaimada)
    println(donut)

    println()
    //begudes
    val aigua = Beguda("Aigua", 1.00,false)
    val cafe = Beguda("cafe", 1.35,true)
    val teVermell = Beguda("Te Vermell", 1.50,false)
    val cola = Beguda("cola", 1.65,true)


    println("---Begudes---")
    println(aigua)
    println(cafe)
    println(teVermell)
    println(cola)
    println()

}