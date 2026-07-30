package ders10Proje

fun main() {
    println("\uD83D\uDCB2---\uD83D\uDCB0BANKA SİSTEMİ\uD83D\uDCB0---\uD83D\uDCB2")
    var denemeHakki = 3
    val sifre = "1234"
    var bakiye = 1000.0
    val red = "\u001b[31m"
    val reset = "\u001b[0m"
    while (denemeHakki > 0) {

        print("\uD83D\uDD12Lütfen şifre giriniz: ")
        var kullanicsifre = readln().trim()
        if (kullanicsifre == sifre) {
            println("✅Doğru şifre girdiniz✅")
            break
        } else {
            denemeHakki--
            if (denemeHakki == 0) {
                println("$red deneme hakkınız biti, kartınız donduruluyor $reset")
                return
            }

            println("$red şifre yanlış, kalan deneme hakkınız: $denemeHakki $reset")
        }


    }

    do {
        println(
            """
                
            ☰
            1. Bakiye Sorgulama 
            2. Para Yatırma      
            3. Para Çekme       
            4. Çıkış.
            ☰

        """.trimIndent()
        )
        print("Lütfen işleminizi seçin: ")
        val kullaniciSecim = readln().toIntOrNull()
        when (kullaniciSecim) {
            1 -> println("Bakiyeniz: $bakiye TL")
            2 -> {
                print("\uD83D\uDCB2Yatırcağınız miktarı girin: ")
                val yatirilacakMiktar = readln().toDoubleOrNull() ?: 0.0
                if (yatirilacakMiktar <= 0) {
                    println("$red❌Lütfen geçerli bir rakam giriniz❌$reset")
                } else {
                    bakiye += yatirilacakMiktar
                    println("yatırılan miktar: $yatirilacakMiktar,güncel bakiyeniz: $bakiye")
                }
            }

            3 -> {
                print("\uD83D\uDCB2çekeceğiniz miktarı girin\uD83D\uDCB2: ")
                val cekilecekMiktar = readln().toDoubleOrNull() ?: 0.0
                if (cekilecekMiktar <= 0) {


                    println("$red ❌lütfen geçerli bir sayı girin❌$reset")
                } else if (cekilecekMiktar > bakiye) {
                    println("$red YETERSİZ BAKİYE $reset")
                } else {
                    bakiye -= cekilecekMiktar
                    println("çekilen miktar: $cekilecekMiktar, güncel bakiyeniz: $bakiye")
                }

            }

            4 -> {
                println("Programdan çıkılıyor ➜], kartınızı lütfen alınız ,iyi günler")
            }

            else -> println("$red❌Lütfen geçerli bir komut girin❌$reset")


        }

    } while (kullaniciSecim != 4)


}
