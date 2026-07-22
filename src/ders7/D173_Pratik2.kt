package ders7

fun main() {
    /*
    Problem 2: Bir sistem geri sayım arayüzü tasarlıyorsunuz. 20 sayısından başlayıp 0‘a kadar (0 dahil)
    ikişer ikişer geriye doğru azalan sayıları yan yana konsola yazdıran bir döngü kurun.
     */
    for (i in 20 downTo 0 step 2) {
    print("$i ")
    }
}