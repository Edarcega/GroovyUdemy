package aula

import classes.Cliente
import org.junit.Test

class Exercicios {

    @Test
    void exercicio1ponto2() {
        int a = 10 // Em groovy todas as variaveis são objetos, inclusive as declaradas como primitivas.
        println a.class // Quando o metodo so tem um parametro ao chama-ló não precisa passar os parentestes
        println a.toString()
        println 10.toString() // lietral aceita "." porque é objeto

        println 11g.class.name // ao digitar "g" mapeado para BIG integer
        BigDecimal teste = 200.50 // . alguma coisa no java vira float no groovy vira BigDecimal
        print teste
    }

    @Test
    void exercicio2() {
        Cliente c = new Cliente()
        c.setNome "Zéxinho"
        c.setData new Date()
        c.somar(1, 10)
    }

    @Test
    // Maper cpnstructor
    void exercioco3() {
        Cliente c = new Cliente()
        println c.getNome() + " - " + c.getData()

        c = new Cliente(nome: "Zézinho")
        println c.getNome() + " - " + c.getData()

        c = new Cliente(data: new Date())
        println c.getNome() + " - " + c.getData()

        c = new Cliente(nome: "Luizinho", data: new Date())
        println c.getNome() + " - " + c.getData()

    }

}
