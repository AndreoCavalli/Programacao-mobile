// Crie uma classe abstrata Animal com atributos como nome, idade e som. Crie classes derivadas de Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro. 
// Implemente métodos específicos para cada tipo de animal, como latir, miar e cantar. Utilize herança e polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.
// Andreo Cavalli Restof
// Kaio José Lopes Portella

fun main() {
    // Lista de animais
    val listaAnimais = listOf(
        Cachorro("Neymar", 10, "Au au au"),
        Gato("Nikão", 6, "Miau miau"),
        Passaro("Messi", 4, "Fiu fiu")
    )

    // interação sobre a lista e exibir informações sobre cada animal
    for (animal in listaAnimais) {
        println("Nome: ${animal.nome}, Idade: ${animal.idade}, Som: ${animal.Som}")
        // Faz uma chamada do Som por polimorfismo
        animal.fazerSom() // Chama o método fazerSom() do objeto animal que é polimórfico dependendo do tipo de animal
        println()
    }
}
