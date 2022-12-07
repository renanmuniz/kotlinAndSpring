package fundamentos

fun main() {
    printa1a10()
    printa10a1()
    printaPar1a10()
    printaRange(20, 30)
    whileMenorQue10()
    doWhileMenorQue10()
}

fun printa1a10() {
    println("---")
    for(numero in 1..10) {
        println(numero)
    }
}

fun printa10a1() {
    println("---")
    for(numero in 10 downTo 1) {
        println(numero)
    }
}

fun printaPar1a10() {
    println("---")
    for(numero in 1..10 step 2) {
        println(numero)
    }
}

fun printaRange(inicio: Int, fim: Int) {
    println("---")
    for(numero in inicio .. fim) {
        println(numero)
    }
}

fun whileMenorQue10() {
    println("---")
    var x = 0
    while(x<10) {
        println(x)
        x++
    }
}

fun doWhileMenorQue10() {
    println("---")
    var x = 0
    do {
        println(x)
        x++
    } while (x<10)
}