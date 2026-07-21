package ders6.alistirmalar


fun main() {
    println("Ay numarası girin")
    val ay = readln().toIntOrNull()

    val mevsim =
        if (ay != null) {
            when (ay) {
          1,2,12 -> "Kış"
                3,4,5 -> "ilkbahar"
                6,7,8 -> "Yaz"
                9,10,11 -> "Sonbahar"
                else -> {"Lütfen geçerli bir ay girin"}
            }

        } else {
            println("lütfen geçerli karkater girin")
        }
    println(mevsim)
}