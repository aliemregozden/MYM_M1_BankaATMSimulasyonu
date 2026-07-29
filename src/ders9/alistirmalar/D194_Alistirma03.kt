package ders9.alistirmalar

/*
Kullanıcıdan readln().toIntOrNull() kullanarak doğum yılını alın. Eğer kullanıcı harf girerse (yani sonuç null çıkarsa) sistem çökmek yerine
 Elvis operatörünü devreye soksun ve doğum yılını varsayılan olarak bulunduğumuz yıl kabul etsin. Sonuç olarak kullanıcının hesaplanan yaşını ekrana yazdırın.
 */
fun main() {
    println("Doğdunuz yılı girin")
    val kullaniciDogumYil = readln().toIntOrNull() ?: 2026

    val kullaniciYas = 2026 - kullaniciDogumYil
println("Kullanıcı doğum yılı: $kullaniciDogumYil, kullanıcı Yaş: $kullaniciYas")
}