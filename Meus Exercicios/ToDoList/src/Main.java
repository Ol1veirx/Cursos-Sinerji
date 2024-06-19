import Enums.StatusTarefa;
import Model.Tarefa;
import Model.Usuario;

public class Main {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa(1, "Estudar", "19/06/2024", StatusTarefa.PENDENTE);
        Tarefa t2 = new Tarefa(2, "Treinar", "19/06/2024", StatusTarefa.PENDENTE);
        Usuario u1 = new Usuario(1, "Liedson");

        u1.adicionarTarefa();
        u1.listarTarefas();
    }
}