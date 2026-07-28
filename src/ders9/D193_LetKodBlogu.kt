package ders9

fun main() {
    var isim : String? = "Ahmad"

    var gosterilecekSonuc = isim?.let { "Merhaba $it Sisteme giriş yaptınız" } ?: "Misafir girişi"
    println(gosterilecekSonuc)
}