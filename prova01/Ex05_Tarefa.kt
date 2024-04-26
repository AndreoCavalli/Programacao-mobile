// Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título, descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas. 
// Implemente métodos para adicionar, remover, buscar, marcar como concluída e listar tarefas por data de vencimento.
// Andreo Cavalli Restof
// Kaio José Lopes Portella

import java.time.LocalDate // Importando a classe LocalDate do pacote java.time

// Definindo uma classe para representar uma tarefa
data class Tarefa(
    val titulo: String, // Título da tarefa
    val descricao: String, // Descrição da tarefa
    val dataVencimento: LocalDate, // Data de vencimento da tarefa
    val prioridade: Int, // Prioridade da tarefa
    var concluida: Boolean = true //Indica se a tarefa foi concluída
)
