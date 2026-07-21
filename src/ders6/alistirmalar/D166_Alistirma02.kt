package ders6.alistirmalar

fun main() {
   println("Sepet tutarı girin")
    val sepetTutari = readln().toDoubleOrNull()

    if (sepetTutari != null) {
        when (sepetTutari) {
            in 0.00..99.9 -> {
                val kargoUcreti = 30.0
                println("Kargo ücreti $kargoUcreti toplam miktar ${kargoUcreti + sepetTutari}")
            }

            in 100.0..299.9 -> {
                val kargoUcreti = 15
                println("Kargo ücreti $kargoUcreti toplam miktar ${kargoUcreti + sepetTutari}")
            }
            in 300.0..Double.MAX_VALUE -> {
            val kargoUcreti = 0
                println("Kargo ücretsiz! toplam miktar ${kargoUcreti + sepetTutari}")
            }else -> {
                println("Sepet tutarı negatif bir değer olamaz")
            }
        }
    } else {
        println("Lütfen geçerli bir sayısal tutar giriniz")
    }
}