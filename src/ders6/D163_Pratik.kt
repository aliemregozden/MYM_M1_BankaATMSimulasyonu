package ders6

fun main() {
    val can = 100

    when (can) {
        0 -> println("Karakter öldü, oyun bitt")
        1, 2, 3 -> println("Kritik Seviye hemen iksir için")
        in 4..50 -> println("Tehlikedesiniz savunmada kalın")
        in 51..100 -> println("Sağliğiniz yerinde savaşa devam")
        else -> println("Geçersiz değer")
    }
}