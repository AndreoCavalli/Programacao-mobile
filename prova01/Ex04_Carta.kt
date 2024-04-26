// Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor. Crie uma classe Baralhoque represente um baralho de cartas completo. 
// Implemente métodos para embaralhar o baralho, distribuir cartas. Entregue 5 cartas para um Jogador que vai verificar se as cartas possuem combinações vencedoras
// Andreo Cavalli Restof
// Kaio José Lopes Portella

// Declaração de uma class chamada Carta, que representa uma carta de baralho
data class Carta(val valor: String, val naipe: String) {
    // Sobrescreve a função toString() para retornar uma representação legível da carta
    override fun toString() = "$valor$naipe"
}
