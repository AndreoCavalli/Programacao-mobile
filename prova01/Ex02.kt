// Escreva um programa que dado um inteiro positivo 𝑛, calcule e imprima o valor da seguinte soma
// Andreo Cavalli Restof
// Kaio José Lopes Portella

fun main() {
    // Solicita ao usuário que insira um número inteiro e positivo
    println("Digite um número inteiro e positivo:")
    // Lê a entrada do usuário e a converte para um inteiro ou retorna null se não for possível converter
    val n = readLine()!!.toIntOrNull()

    // Verifica se a entrada é inválida (null ou menor ou igual a zero)
    if (n == null || n <= 0) {
        // Imprime uma mensagem de erro e encerra a execução do programa
        println("Erro: Por favor, insira um número inteiro positivo.")
        return
    }

    // Inicializa a variável soma como 0.0
    var soma = 0.0

    // Loop para calcular a soma da série
    for (i in 1..n) {
        // Adiciona à soma o resultado da expressão i / (n - i + 1), convertendo i para Double para manter a precisão
        soma += i.toDouble() / (n - i + 1)
    }

    // Imprime o resultado da soma
    println("O valor de f($n) é $soma")
}
