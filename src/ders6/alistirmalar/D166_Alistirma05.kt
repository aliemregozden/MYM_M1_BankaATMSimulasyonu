package ders6.alistirmalar

/*
Kullanıcıdan müze ziyareti için yaşını girmesini isteyin. Girdiyi çökme riski taşımayacak şekilde güvenli
 bir tam sayıya çevirin (harf girilirse hata mesajı verin). Yaş değerine göre bilet kategorisini ve fiyatını
 when yapısını bir ifade (expression) olarak kullanarak bir değişkene atayın ve en sonda ekrana yazdırın.

0 – 6 yaş arası -> “Ücretsiz Tarife: 0 TL”
7 – 18 yaş arası -> “Öğrenci Tarifesi: 50 TL”
19 – 64 yaş arası -> “Tam Tarife: 100 TL”
65 ile 120 yaş arası -> “Emekli İndirimi: 40 TL”
Bu sınırlar dışındaki tüm sayılar için geçersiz yaş uyarısı verin.
 */
fun main() {
    println("yaş girin")
    val girdi = readln().toIntOrNull()

    if (girdi != null) {
        val biletBilgisi =
            when (girdi) {
                in 0..6 -> "ücretsiz 0tl"
                in 7..18 -> "öğrenci 50tl"
                in 19..64 -> "Tam tarife 100tl"
                in 65..120 -> "Emekli indirimi 40tl"
                else -> {
                    "geçerli bir yaş yazınız"
                }

            }
   println(biletBilgisi)
    }else{
        println("geçerli bir karakter girin")
    }
}