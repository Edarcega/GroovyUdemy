package classes

class Nota {
    Integer itens
    Double valor

    Nota plus (Nota nota) {
        // Mapeamento do plus +
        println "Plus"
        Nota newNota = new Nota()
        newNota.itens = this.itens + nota.itens
        newNota.valor = this.valor + nota.valor
        newNota
    }

    Nota next () {
        // Mapeamento ++
        println "next"
        this.itens += 1
        this.valor += 1
        this
    }

}
