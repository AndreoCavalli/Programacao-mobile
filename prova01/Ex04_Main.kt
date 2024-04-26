// Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor. Crie uma classe Baralhoque represente um baralho de cartas completo. 
// Implemente métodos para embaralhar o baralho, distribuir cartas. Entregue 5 cartas para um Jogador que vai verificar se as cartas possuem combinações vencedoras
// Andreo Cavalli Restof
// Kaio José Lopes Portella

fun main() {
    // Criando um novo objeto Baralho
    val baralho = Baralho()
    // Embaralhando o baralho
    baralho.embaralhar()
    // Criando um novo objeto Jogador
    val jogador = Jogador()
    // Distribuindo 5 cartas do baralho para o jogador e armazenando as cartas recebidas
    val cartasRecebidas = baralho.distribuir(5)
    // O jogador recebe as cartas distribuídas
    jogador.receberCartas(cartasRecebidas)
}
