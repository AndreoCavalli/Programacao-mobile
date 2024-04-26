// Escreva um programa que leia um número entre 1 e 12 correspondendo a um mês do ano e imprima o nome desse mês. Utilize o comando when. Caso o valor seja fora deste intevalo, imprima uma mensagem de erro.
// Andreo Cavalli Restof
// Kaio José Lopes Portella
fun main() {
    // Solicita ao usuário que insira um número entre 1 e 12 correspondente a um mês do ano.
    println("Digite um número de 1 a 12 para representar um mês:")

// Lê a entrada do usuário e converte para um número inteiro.
    val NumeroMes = readLine()?.toIntOrNull()

// Verifica se o número está dentro do intervalo permitido (1 a 12).
    when (NumeroMes) {
        in 1..12 -> {
            // Determina o nome do mês com base no número escrito.
            val NomeMes = when (NumeroMes) {
                1 -> "Janeiro"
                2 -> "Fevereiro"
                3 -> "Março"
                4 -> "Abril"
                5 -> "Maio"
                6 -> "Junho"
                7 -> "Julho"
                8 -> "Agosto"
                9 -> "Setembro"
                10 -> "Outubro"
                11 -> "Novembro"
                12 -> "Dezembro"
                else -> ""
            }
            // Exibe o mês correspondente ao número fornecido.
            println("O número $NumeroMes corresponde ao mês de $NomeMes.")
        }
        else -> {
            // Informa ao usuário que o número fornecido é inválido.
            println("Valor inserido inválido! Por favor, insira um número de 1 a 12.")
        }
    }
}
