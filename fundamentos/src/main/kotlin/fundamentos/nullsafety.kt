package fundamentos

fun main() {

    var nome: String = "renan"
//    nome = null   ERRO

//    var sobrenome:String = null  ERRO

    var teste:String
//    println(teste)  ERRO deve ser inicializada

    var nomeCompleto : String?
    nomeCompleto = null

    println(nomeCompleto)  //null
//    println(nomeCompleto.length) //Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    println(nomeCompleto?.length) //imprime null e nao da nullPointerException
    println(nomeCompleto?.length?.toShort())

    var idadeUsuario = 18
    var idade:Int = idadeUsuario ?: 0
    println(idade) //18

    var lista : List<Int?> = listOf(1,2,3, null, 5)
    var listaNullable : List<Int>? = null



}