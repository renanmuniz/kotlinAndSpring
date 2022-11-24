package fundamentos

fun main() {
    var mutavel = 0
    val imutavel = 10

    println(mutavel)
    mutavel = 1
    println(mutavel)

//    imutavel = 0
}

class variaveis {
    lateinit var teste: String

    fun inicializarVariaveis() {
        teste = "Teste"
    }
}