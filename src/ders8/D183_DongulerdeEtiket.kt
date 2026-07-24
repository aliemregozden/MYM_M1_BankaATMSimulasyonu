package ders8

fun main() {
   disdongu@ for (i in 1..3) {
        println("Dış döngü değeri: $i")

        for (j in 1..3){
            println("iç döngü değeri: $j")
        if (i == 2 && j ==2)
        break@disdongu
        }
    }
}