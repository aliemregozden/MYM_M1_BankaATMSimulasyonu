package ders9.alistirmalar

fun main() {
    /*
   Bir kargo şirketinin takip modülünü kodluyorsunuz.
    kargoNo adında nullable bir String değişken oluşturun ve başlangıçta null değerini atayın. Bu problemi iki farklı yöntemle çözün:

    Kotlin Yöntemi (Zarafet): Yukarıda yazdığınız çok satırlı if-else yapısını tamamen ortadan kaldırın. Sadece Safe Let (?.let {}) ve Elvis (?:)
    operatörlerini bir arada kullanarak, tüm bu kontrolü ve mesaj atamasını tek bir satırda (if-else kullanmadan) çözün ve sonucu ekrana bastırın.
     */
    var kargoNo: String? = "2344"
  var kargoMesaj =   kargoNo?.let {"Kargo Numaranız : ${it.length} uzunluğundadır "}?: "kargo nuramaarası henüz Belirli Değil"
println(kargoMesaj)
}