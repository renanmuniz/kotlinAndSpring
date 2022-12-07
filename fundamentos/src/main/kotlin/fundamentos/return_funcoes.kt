package fundamentos

fun main() {
    println(retornaNumeroPorExtenso(1))
}

fun retornaNumeroPorExtenso(numero :Int): String {
    if(numero == 5)
        return "cinco"
    if(numero == 6)
        return "seis"
    return "numero nao mapeado"
}