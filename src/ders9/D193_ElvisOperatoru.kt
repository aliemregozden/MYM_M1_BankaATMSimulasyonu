package ders9

fun main() {
    var kullaniciAdi: String? = null
    var gosterliecekIsim = kullaniciAdi ?: "Misafir"//?: elvis operatörü değer null ise ona varsayılan bir değer atar
    println("Merhaba, $gosterliecekIsim")

    //elvis operatörünün açıllımı
    if (gosterliecekIsim != null) {
        println("merhaba $gosterliecekIsim")
    } else {
        println("merhaba misafir")
    }

    //ikinci örnek
    var mesaj: String? = null
    var uzunluk = mesaj?.length ?: 0

    //üçüncü örnek
    println("Yaşını gir: ")
    var yas = readln().toIntOrNull()?:"yaş girerken rakam kullanın"
    println("yaşınız $yas")
}