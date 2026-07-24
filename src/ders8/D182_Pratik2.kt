package ders8

fun main() {
    var secim: String
    do {
        print("oyun bitti tekrar oynamak ister misin: ")
        secim = readln().trim().lowercase()
    }while (secim == "e")
}