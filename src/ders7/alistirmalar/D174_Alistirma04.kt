package ders7.alistirmalar

fun main() {


    for (i in 1..5) {
        print("$i. mesajı girin : ")
        var kullaniciMetin = readln().trim().lowercase()
        if (kullaniciMetin.contains("kampanya") ||
            kullaniciMetin.contains("bedava") ||
            kullaniciMetin.contains("kazandınız")
        ) {
            println("Spam mesaj engellendi")
        }else{
          println("temizlenen mesaj: $kullaniciMetin")
        }
    }
}