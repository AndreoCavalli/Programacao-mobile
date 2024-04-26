// Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título, descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas. 
// Implemente métodos para adicionar, remover, buscar, marcar como concluída e listar tarefas por data de vencimento.
// Andreo Cavalli Restof
// Kaio José Lopes Portella

class GerenciadorDeTarefas {
    // Lista mutável para armazenar as tarefas
    private val tarefas = mutableListOf<Tarefa>()

    // Método para adicionar uma nova tarefa à lista
    fun adicionarTarefa(tarefa: Tarefa) {
        tarefas.add(tarefa)
    }
    // Método para remover uma tarefa da lista
    fun removerTarefa(tarefa: Tarefa) {
        tarefas.remove(tarefa)
    }
    // Método para buscar uma tarefa pelo título
    fun buscarTarefa(titulo: String): Tarefa? {
        // Retorna a primeira tarefa encontrada com o título especificado, ou null se não encontrada
        return tarefas.find { it.titulo == titulo }
    }
    // Método para marcar uma tarefa como concluída pelo título
    fun marcarComoConcluida(titulo: String) {
        // Encontra a tarefa com o título especificado e a marca como concluída se encontrada
        tarefas.find { it.titulo == titulo }?.concluida = true
    }
    // Método para listar as tarefas ordenadas por data de vencimento
    fun listarTarefasPorDataVencimento(): List<Tarefa> {
        // Retorna a lista de tarefas ordenada pelo campo de data de vencimento
        return tarefas.sortedBy { it.dataVencimento }
    }
    // Método para listar as tarefas concluídas
    fun listarTarefasConcluidas(): List<Tarefa> {
        // Retorna a lista de tarefas que estão marcadas como concluídas
        return tarefas.filter { it.concluida }
    }
    // Método para listar as tarefas não concluídas
    fun listarTarefasNaoConcluidas(): List<Tarefa> {
        // Retorna a lista de tarefas que não estão marcadas como concluídas
        return tarefas.filterNot { it.concluida }
    }
    // Método toString() para representação textual do gerenciador de tarefas
    override fun toString(): String {
        // Retorna uma representação concatenada de todas as tarefas
        return tarefas.joinToString(separator = "\n") { tarefa ->
            "${tarefa.titulo} - Vence em: ${tarefa.dataVencimento} - " +
                    "Prioridade: ${tarefa.prioridade} - Concluída: ${tarefa.concluida}"
        }
    }
}
