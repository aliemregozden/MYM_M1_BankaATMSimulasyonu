package ders6

fun main() {
    val gizemliObje : Any = 32

    when(gizemliObje){
        is String -> println("Bu bir string ifadedir, uzunluğu ${gizemliObje.length}")
        is Int -> println("Bu bir tam sayıdır. Bu sayının Karesi: ${gizemliObje*gizemliObje}")
    }
}