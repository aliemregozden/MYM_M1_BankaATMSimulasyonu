package ders8

fun main() {
    for (i in 1..100){
        if (i == 5){
        println("Aranan sayı bulundu döngü kırılıyor")
            break
        }
        println("$i ")
    }
}