package fundamentos

fun main() {

    var x = 21

    when(x) {
        5 -> println("x == 5")
        8 -> println("x == 8")
        10 -> {
            println("---")
            println("x == 10")
            println("---")}
        0,-1 -> println("Zero ou -1")
        in 11..20 -> println("Entre 11 e 20")
        !in 11..20 -> println("Não está entre 11 e 20")
        else -> println("Numero nao mapeado")
    }

    println(comecaComOi("oi mundo!"))
    println(comecaComOi("mundo!"))

}

fun comecaComOi(x: Any): Boolean {
    return when(x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}