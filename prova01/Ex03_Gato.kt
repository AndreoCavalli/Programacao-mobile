// Crie uma classe abstrata Animal com atributos como nome, idade e som. Crie classes derivadas de Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro. 
// Implemente métodos específicos para cada tipo de animal, como latir, miar e cantar. Utilize herança e polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.
// Andreo Cavalli Restof
// Kaio José Lopes Portella

// Classe Gato, que herda da classe Animal
class Gato(nome: String, idade: Int, Som: String) : Animal(nome, idade, "Miau miau") {
    // Construtor que recebe nome, idade e Som, e passa "Miau miau" como Som padrão para a classe Animal

    // Implementação do método fazerSom para o gato
    override fun fazerSom() {
        println("$nome está miando: $Som")
    }
}
