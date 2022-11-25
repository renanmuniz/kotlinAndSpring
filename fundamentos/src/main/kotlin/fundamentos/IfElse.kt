package fundamentos

fun main() {
    println(parImpar(1))
    println(parImpar(2))
}

fun parImpar(numero: Int): String {
    return if (numero % 2 == 0) {
        "par"
    } else {
        "impar"
    }
}