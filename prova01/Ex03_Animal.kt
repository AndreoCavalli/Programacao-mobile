// Crie uma classe abstrata Animal com atributos como nome, idade e som. Crie classes derivadas de Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro. 
// Implemente métodos específicos para cada tipo de animal, como latir, miar e cantar. Utilize herança e polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.
// Andreo Cavalli Restof
// Kaio José Lopes Portella

// Define propriedades e métodos comuns a todos os animais
abstract class Animal(open val nome: String, open val idade: Int,open val Som: String)
{
    // Método abstrato fazerSom(), que será implementado pelas subclasses
    abstract fun fazerSom()
}
