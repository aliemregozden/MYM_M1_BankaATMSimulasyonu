package ders6.alistirmalar

fun main() {
    val girdi: Any = true
    when (girdi) {
        is String -> {
            println("metin uzunluk ${girdi.length}")
        }

        is Int -> {
            println("Sayının 10 katı ${girdi * 10}")
        }

        is Boolean -> {


            if (girdi) {
                println("doğru")
            } else {
                println("yanlış")
            }
        }
    }
}