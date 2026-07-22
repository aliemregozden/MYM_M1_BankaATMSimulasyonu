package ders7

fun main() {
    /*
    Mevcut ses seviyesini tutan val sesSeviyesi = 105 adında bir değişken oluşturun.
Bir if bloğu açın ve !in (içinde değilse) operatörünü kullanarak bu değerin 0..100 aralığının dışında olup olmadığını kontrol edin.
Eğer dışındaysa ekrana “Hata: Ses seviyesi sadece 0 ile 100 arasında olabilir!” uyarısını yazdırın.
else bloğunda ise “Ses seviyesi başarıyla ayarlandı.” mesajını gösterin.
Değişkeninize sırasıyla -5, 50 ve 100 değerlerini atayıp çalıştırarak, aralık kontrolünüzün (özellikle 100’ün dahil olup olmadığının) doğru çalışıp çalışmadığını test edin.
     */
    val sesSeviyesi = 102
    if (sesSeviyesi !in 0..100){
        println("ses seviyesi 100 ile 0 arasında olabilir!")
    }else{
        println("ses seviyesi ayarlandı")
    }
}