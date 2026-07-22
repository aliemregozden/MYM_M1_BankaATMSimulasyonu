package ders7

fun main() {
    /*
    Problem 3: Alfabe sıralama aracı için, 'a' harfinden başlayıp 'f'
    harfine kadar (f dahil) olan tüm harfleri sırayla yan yana ekrana bastıran bir döngü yazın.
     */
    println("*** Latin Harfleri ***")
    for (i in 'a'..'f') {
        print(i)
    }
        println("\n*** Türkçe Harfleri ***")
        val turkceAlfabe = "abcçdefgğhıijklmnoöprsştuüvyz"
        for (i in turkceAlfabe) {
            print(i)
        }
    }
