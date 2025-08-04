package aula

import classes.Cliente
import classes.ProdutoGroovy
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
        c.setNome "Zézinho"
        c.setData new Date()
        c.somar(1, 10)
        println(c.getNome() + " - " + c.getData())
    }

    @Test
    //Constructor Names Arguments
    // Maper cpnstructor
    void exercicio3() {
        Cliente c = new Cliente()
        println c.getNome() + " - " + c.getData()

        c = new Cliente(nome: "Zézinho")
        println c.getNome() + " - " + c.getData()

        c = new Cliente(data: new Date())
        println c.getNome() + " - " + c.getData()

        // Com varios mapeamentos de variaveis do objeto
        c = new Cliente(nome: "Luizinho", data: new Date())
        println c.getNome() + " - " + c.getData()
    }

    @Test
    // Parei aqui, em 3:59 minutos do vídeo da aula 7
    void exercicio4() {
        Cliente c = new Cliente(nome: "Fernando", data: new Date())
        println c["nome"] // Pega o dado do atributo a partir de uma string, caso ele exista
        println c['data'] // Interessante que funciona assim com aspas simples também
        c["nome"] = "Marcão" // Atribui dado a um atributo a partir de uma string, caso ela exista.
        println c["nome"]
    }

    @Test
    void exercicio5() {
        ProdutoGroovy p = new ProdutoGroovy(nome: "CD",valor: 10.00)
        println(p.nome) // Acesso direto sem necessidade de usar o get ou set
        println(p.valor)
        p.valor = 20.00 // Atiubuição direta sem uso do set
        println(p.valor)
    }
}
