package ders7

fun main() {
    // in
    for (i in 1..5){
        println("$i. Madde$i")
    }
println("--------------------------")
    for (harf in 'a'..'z'){
        println("${harf.uppercase()}. ")
    }

    //until
    for (i in 1 until 5){
        println(i)
    }

    println("-----------------------")
    //downTo ve Step
    for (i in 10 downTo 1 step 2){
        println(i)
    }
}