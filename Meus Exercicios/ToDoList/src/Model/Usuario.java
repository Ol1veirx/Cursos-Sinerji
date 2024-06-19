package Model;

import java.util.*;

import static Enums.StatusTarefa.CONCLUIDA;

public class Usuario {
    private int id;
    private String nome;
    private List<Tarefa> tarefas = new ArrayList<>();

    public Usuario() {}

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void adicionarTarefa() {
        Scanner sc = new Scanner(System.in);
        Tarefa tarefa = new Tarefa();
        System.out.print("Informe o id da sua tarefa: ");
        tarefa.setId(sc.nextInt());
        System.out.print("Qual o nome da sua tarefa: ");
        tarefa.setNome(sc.next());
        System.out.print("A data limite: ");
        tarefa.setDataLimite(sc.next());

        this.tarefas.add(tarefa);
    }

    public void removerTarefa(int tarefa_id) {
        tarefas.removeIf(tarefa -> tarefa.getId() == tarefa_id);
    }

    public void marcarComoConcluida(int tarefa_id) {
        for (Tarefa t : tarefas) {
            if (t.getId() == tarefa_id) {
                t.setStatus(CONCLUIDA);
            }
        }
    }

    public void listarTarefas() {
        if (tarefas != null) {
            System.out.println(tarefas);
        } else {
            System.out.println("Lista de tarefas vazia");
        }
    }
}
