package ders7.alistirmalar

fun main() {
    /*
    Kullanıcıdan pozitif bir tam sayı girmesini isteyin. Gelen veriyi güvenli
     bir şekilde tam sayıya çevirdikten sonra, bu sayının faktöriyel değerini hesaplayarak ekrana yazdırın.
     (Örneğin: 5! = 5 * 4 * 3 * 2 * 1 = 120 gibi.  Kullanıcı 5 girdiğinde çıktı sadece “5! = 120”
     olmalıdır. Çarpım aşamalarını yan yana yazdırmanıza gerek yoktur.)
     */

    println("pozitif bir tam sayı girin")
    val sayi = readln().toIntOrNull()
    if (sayi == null || sayi < 0) {
        println("geçerli bir sayı girin")
    } else {
        var sonuc = 1
        for (i in sayi downTo 1) {
            sonuc *= i

        }
        println("$sayi! = $sonuc")
    }


}