package ders6

fun main() {
    val biletSinifi = 'B'
    val sinifAciklamasi =
        when (biletSinifi) {
            'E' -> "Ekonomi"
            'B' -> "Business"
            'F' -> "First class"
            else -> "Bilinmeyen Bilet sınıfı"
        }
    println("Uçuş sınıfıız: $sinifAciklamasi")

}