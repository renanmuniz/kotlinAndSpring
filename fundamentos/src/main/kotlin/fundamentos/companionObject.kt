package fundamentos

class MinhaClasse {
    companion object {
        fun criaClasse(): MinhaClasse {
            return MinhaClasse()
        }
    }
}

class SegundaClasse {
    fun criaClasse(): SegundaClasse {
        return SegundaClasse()
    }
}

fun main() {
    var segundaClasse = SegundaClasse().criaClasse()


}