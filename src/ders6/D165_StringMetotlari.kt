package ders6

fun main() {
    val hamGirdi = "merHabA KoTliN"
    val temizGirdi =
        hamGirdi.trim().lowercase()
    println("Temiz girdi: $temizGirdi")

    if (temizGirdi == "merhaba kotlin"){
        println("Doğru")
    }else{
        println("yanlış")
    }

    if (temizGirdi.contains("kot")){
        println("içeriyor")
    }else{
        println("içermiyor")
    }

    println(temizGirdi.substring(8,11))
println(temizGirdi.split(" ")[0])
    println(temizGirdi.replaceFirstChar {
     it.uppercase()
    })
}