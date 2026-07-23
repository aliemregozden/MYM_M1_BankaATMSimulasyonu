package ders7.alistirmalar

fun main() {
    /*
    Kullanıcıdan 1 ile 10 arasında bir sayı alın. Bu sayının çarpım tablosunu for döngüsü kullanarak ekrana yazdırın.
     */
    println("1 ile 10 arasında sayı girin")
    val sayi = readln().toIntOrNull()
    if (sayi !in 1..10 || sayi == null) {
        println("geçerli sayı girin")
    }else{
        for (i in 1..10){
            println("$i * $sayi = ${i*sayi}")
        }
    }

}