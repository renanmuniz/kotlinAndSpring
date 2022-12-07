package fundamentos

fun main() {
    var lista = listOf(1,2,3,4,5,6,7,8,9,10) //listas sao imutaveis
    lista.forEach { println(it) }

    var listaMutavel = mutableListOf(1,2,3,4,5,6,7,8,9,10) //Assim sao mutaveis
    listaMutavel.add(11)
    listaMutavel.forEach { println(it) }
    listaMutavel.remove(11)
    listaMutavel.removeAt(0)
    listaMutavel.forEach { println(it) }

    lista.forEach { println(it) }

    for(numero in lista) {
        println(numero)
    }

    println(lista[0])
    println(lista[2])
    println(lista[9])
//    println(lista[15])
    println(lista.size)
    println(lista.indexOf(6))

    val pares = lista.filter { it % 2 == 0 }
    println(pares)

    val paresPrimeiroValor = lista.filter { it % 2 == 0 }.first()
    println(paresPrimeiroValor)

    println("lista desordenada:")
    val listaOrdenada = mutableListOf(3,1,6,7,4,9,6,0,2)
    listaOrdenada.forEach { println(it) }
    println("lista ordenada:")
    listaOrdenada.sort()
    listaOrdenada.forEach { println(it) }

    var mapChaveValor = mutableMapOf("um" to 1, "dois" to 2, "tres" to 3)
    println(mapChaveValor.keys)
    println(mapChaveValor.values)
    println(mapChaveValor["um"])
    println(mapChaveValor["dois"])
    mapChaveValor["cinco"] = 5
    println(mapChaveValor["quatro"]) //null
    println(mapChaveValor["cinco"])

    mapChaveValor.remove("dois")
    println(mapChaveValor["dois"])

    println(mapChaveValor)

}