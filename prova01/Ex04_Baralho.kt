// Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor. Crie uma classe Baralhoque represente um baralho de cartas completo. 
// Implemente métodos para embaralhar o baralho, distribuir cartas. Entregue 5 cartas para um Jogador que vai verificar se as cartas possuem combinações vencedoras
// Andreo Cavalli Restof
// Kaio José Lopes Portella

class Baralho {
    // Array contendo os naipes das cartas
    // Array = Estrutura de dados que armazena uma coleção de elementos do mesmo tipo, organizados em uma sequência indexada
    // Cada elemento é acessado através de um índice numérico e pode ser modificado ou acessado individualmente
    private val naipes = arrayOf("♠", "♥", "♦", "♣")
    // Array contendo os valores das cartas
    private val valores = arrayOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
    // Lista mutável para armazenar as cartas do baralho
    private val cartas = mutableListOf<Carta>()
    // Inicializador do Baralho, onde as cartas são criadas e adicionadas à lista
    init {
        for (naipe in naipes) {
            for (valor in valores) {
                cartas.add(Carta(valor, naipe))
            }
        }
    }
    // Método para embaralhar as cartas do baralho
    fun embaralhar() {
        cartas.shuffle()
    }
    // Método para distribuir uma quantidade específica de cartas do baralho
    fun distribuir(qtd: Int): List<Carta> {
        // Verifica se há cartas suficientes no baralho para distribuir
        if (cartas.size < qtd) throw IllegalStateException("Não há cartas suficientes no baralho para distribuir.")
        // Retorna uma lista com as primeiras qtd cartas do baralho e remove-as do baralho original
        return cartas.take(qtd).also {
            cartas.removeAll(it)
        }
    }
}
