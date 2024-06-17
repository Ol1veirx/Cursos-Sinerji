package org.example.Model.Livro;

public class Livro {
    private int id;
    private String nome;
    private String statusLeitura;

    public Livro() {}

    public Livro(String nome, String statusLeitura) {
        this.nome = nome;
        this.statusLeitura = statusLeitura;
    }

    public Livro(int id, String nome, String statusLeitura) {
        this.id = id;
        this.nome = nome;
        this.statusLeitura = statusLeitura;
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

    public String getStatusLeitura() {
        return statusLeitura;
    }

    public void setStatusLeitura(String statusLeitura) {
        this.statusLeitura = statusLeitura;
    }

    public String toString() {
        return "[Nome: " + nome + "]";
    }
}
