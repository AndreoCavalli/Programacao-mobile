// Crie uma classe abstrata Animal com atributos como nome, idade e som. Crie classes derivadas de Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro. 
// Implemente métodos específicos para cada tipo de animal, como latir, miar e cantar. Utilize herança e polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.
// Andreo Cavalli Restof
// Kaio José Lopes Portella

// Classe Passaro, que herda da classe Animal
class Passaro(nome: String, idade: Int, Som: String) : Animal(nome, idade, "Fiu fiu") {
    // Construtor que recebe nome, idade e Som, e passa "Fiu fiu" como Som padrão para a classe Animal

    // Implementação do método fazerSom para o pássaro
    override fun fazerSom() {
        println("$nome está feliz: $Som")
    }
}
