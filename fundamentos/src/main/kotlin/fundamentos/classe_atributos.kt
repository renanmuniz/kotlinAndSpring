package fundamentos

class Carro(var cor: String, var anoFabricacao: Int, var dono: Dono) {
}

class Dono(var nome: String, var idade: Int) {
}

fun main() {
    var carro = Carro("Branco", 2021, Dono("Gustavo", 24))
    println(carro.cor)
    println(carro.anoFabricacao)
    carro.cor = "Preto"
    println(carro.cor)
    println(carro.dono.nome)
    println(carro.dono.idade)
    carro.dono.nome = "Daniel"
    println(carro.dono.nome)
}