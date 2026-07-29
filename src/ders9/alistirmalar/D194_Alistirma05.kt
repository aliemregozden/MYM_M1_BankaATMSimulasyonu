package ders9.alistirmalar

fun main() {
    val kuponTutar: Double? = null
    val sepetTutar = 500.0
    println("indirimli sepet tutarı: ${sepetTutar - (kuponTutar ?: 0.0)}")
}