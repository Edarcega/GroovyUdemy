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

}
