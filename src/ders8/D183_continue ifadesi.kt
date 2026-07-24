package ders8

fun main() {
    var sayac = 0
    for (i in 1..5) {
        if (i % 2 == 0) {
            println("Bu adım atlanıyor")
            sayac++
            continue
        }
        print("$i")
    }
    println("çift sayı adedi : $sayac")
}