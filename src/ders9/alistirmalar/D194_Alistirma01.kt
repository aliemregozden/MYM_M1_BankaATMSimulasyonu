package ders9.alistirmalar

fun main() {

    val kullaniciAdi = "ibo"
    val kullaniciSoyad: String? = null
    val kullaniciYas: Int? = 12

    println("yaş: ${kullaniciYas ?: 0}, soyad: ${kullaniciSoyad ?: "Soyad belli değil"}, ad $kullaniciAdi")

}