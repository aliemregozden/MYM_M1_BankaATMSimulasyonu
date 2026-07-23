package ders7.alistirmalar

fun main() {
    /*
    1’den 100’e kadar olan sayılar arasında (100 dahil) sadece çift sayıların toplamını bulan bir program yazın.
     */
    var sonuc = 0
    for (i in 2..100 step 2) {
        sonuc += i
    }
    println("1den 100e kadar olan çift sayıların toplamı $sonuc")
}