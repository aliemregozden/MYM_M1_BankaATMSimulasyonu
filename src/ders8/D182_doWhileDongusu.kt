package ders8

fun main() {
    var sayac = 1
    // do-while döngüsü koşul false da olsa en az bir kez çalışır
    do {
        println("Sayaç değeri: $sayac")
    } while (sayac < 1)

    //şifre kontrolu örneği
    var sifre : String
    var dogruSifre = "12345"

    do {
        println("Şifre girin")
        sifre = readln()

        if (sifre!= dogruSifre){
            println("yanlış şifre")
        }else{
            println(
                "doğru şifre"
            )
        }
    }while (sifre != dogruSifre)
    println("Sisteme giriş yapıldı")
}