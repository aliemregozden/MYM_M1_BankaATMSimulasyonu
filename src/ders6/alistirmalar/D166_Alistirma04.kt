package ders6.alistirmalar

/*
Kullanıcıdan readln() ile bir metin alın. Kullanıcının metnin sağına soluna yanlışlıkla boşluk bırakabileceğini ve
büyük/küçük harf karışık yazabileceğini hesaba katarak metni önce temizleyin. Temizlenmiş metin üzerinden parametresiz bir when yapısıyla şu kontrolleri yapın:

Girilen komut tam olarak “merhaba” ise: “Size de merhaba!” yazdırın.
Girilen komut tam olarak “saat kaç” ise: “Şu an saat 14:00” yazdırın.
Eğer komutun içinde “hava” kelimesi geçiyorsa: “Dışarıda harika bir hava var.” yazdırın.
Hiçbiri eşleşmezse: “Ne demek istediğinizi anlayamadım.” yazdırın.
 */
fun main() {
    print("Metin girin: ")
    val kullaniciMetin = readln().trim().lowercase()
    when  {
        kullaniciMetin == "merhaba" -> {
            println("size de merhaba")
        }

        kullaniciMetin == "saat kaç" -> {
            println("saat 12.30")
        }

        kullaniciMetin.contains("hava") -> {
            println("hava iyidr")
        }

        else -> {
            println("komut algılanamadı")
        }
    }
}