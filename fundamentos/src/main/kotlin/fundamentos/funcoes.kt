package fundamentos

fun main() {
    println("Hello World ${retornaNome()}")
    var nome = retornaNome()
    println(nome)
    dizOi(nome,30)
    dizOi(idade = 30, nome = "Renan")
    dizOi("Renan")
}

fun retornaNome(): String {
    return "Gustavo"
}

fun dizOi(nome: String, idade: Int = 0) {
    println("Oi $nome, idade $idade")
}