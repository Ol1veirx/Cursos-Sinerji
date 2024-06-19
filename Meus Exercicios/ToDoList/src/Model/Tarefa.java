package Model;

import Enums.StatusTarefa;

import java.util.Date;

public class Tarefa {
    private int id;
    private String nome;
    private String dataLimite;
    private StatusTarefa status = StatusTarefa.PENDENTE;

    public Tarefa() {}

    public Tarefa(int id, String nome, String dataLimite, StatusTarefa status) {
        this.id = id;
        this.nome = nome;
        this.dataLimite = dataLimite;
        this.status = status;
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

    public String getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(String dataLimite) {
        this.dataLimite = dataLimite;
    }

    public StatusTarefa getStatus() {
        return status;
    }

    public void setStatus(StatusTarefa status) {
        this.status = status;
    }

    public String toString() {
        return "Id: " + id + " - Nome: " + nome + " - Data Limite: " + dataLimite + " - Status: " + status;
    }
}
