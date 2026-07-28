package ders9

fun main() {
    var ikinciIsim: String? = null
    println(ikinciIsim?.length)//noktadan önce ? kullanmak güvenli çağrı operatörüdür

    //güvenli çağrı operaötrünün açılımı
    if (ikinciIsim != null){
        println(ikinciIsim.length)
    }else{
        println(null)
    }
}