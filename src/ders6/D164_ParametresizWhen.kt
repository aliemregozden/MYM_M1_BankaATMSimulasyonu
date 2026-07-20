package ders6

fun main() {
    val kulaniciAdi = "admin"
    val sifre = "1234"

    when {
        kulaniciAdi.isEmpty()-> println("Hata kullanıcı adı boş bırakılamaz")
        sifre.isEmpty() -> println("Hata şifre alanı boş bırakılamaz")
        kulaniciAdi == "admin" && sifre == "1234" -> println("Giriş başarılı!")
        else -> println("Kullanıcı adı veya şifre yanlış")
    }
}