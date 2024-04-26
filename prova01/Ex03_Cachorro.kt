// Crie uma classe abstrata Animal com atributos como nome, idade e som. Crie classes derivadas de Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro. 
// Implemente métodos específicos para cada tipo de animal, como latir, miar e cantar. Utilize herança e polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.
// Andreo Cavalli Restof
// Kaio José Lopes Portella

// Classe Cachorro, que herda da classe Animal
class Cachorro(nome: String, idade: Int, Som: String) : Animal(nome, idade, "Au au au") {
    // Construtor que recebe nome, idade e Som, e passa "Au au au" como Som padrão para a classe Animal

    // Implementação do método fazerSom para o cachorro
    override fun fazerSom() {
        println("$nome está bravo: $Som")
    }
}
