// Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título, descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas. 
// Implemente métodos para adicionar, remover, buscar, marcar como concluída e listar tarefas por data de vencimento.
// Andreo Cavalli Restof
// Kaio José Lopes Portella

import java.time.LocalDate // Importando a classe LocalDate do pacote java.time

fun main() {
    val gerenciador = GerenciadorDeTarefas() //Instanciando um objeto da classe GerenciadorDeTarefas

    // Adicionar tarefas
    gerenciador.adicionarTarefa(Tarefa("Trabalhar", "Ir trabalhar na papelaria", LocalDate.of(2024, 4, 26), 1))
    gerenciador.adicionarTarefa(Tarefa("Faculdade", "Apresentar prova", LocalDate.of(2024, 4, 26), 1))
    gerenciador.adicionarTarefa(Tarefa("Compras", "Comprar coisas no mercado", LocalDate.of(2024, 4, 25), 3))

    // Marcar uma tarefa como concluída
    gerenciador.marcarComoConcluida("Trabalhar")
    gerenciador.marcarComoConcluida("Faculdade")
    gerenciador.marcarComoConcluida("Compras")
    // Listar tarefas
    println("Todas as Tarefas:")
    println(gerenciador) //Imprimindo todas as tarefas gerenciadas pelo gerenciador

    // Listar tarefas concluídas
    println("\nTarefas Concluídas:")
    gerenciador.listarTarefasConcluidas().forEach { //Iterando sobre cada tarefa concluída
        println(it)
    }

    // Listar tarefas por data de vencimento
    println("\nTarefas por Data de Vencimento:")
    gerenciador.listarTarefasPorDataVencimento().forEach { //Iterando sobre cada tarefa ordenada por data de vencimento
        println(it) //Imprimindo a tarefa
    }
}
