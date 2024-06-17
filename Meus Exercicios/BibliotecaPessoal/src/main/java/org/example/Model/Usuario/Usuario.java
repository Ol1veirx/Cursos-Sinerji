package org.example.Model.Usuario;

import org.example.Model.Livro.Livro;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String nome;
    private List<Livro> livros = new ArrayList<>();

    public Usuario() {}

    public Usuario(int id, String nome) {
        this.id = id;
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

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public static String bemVindo() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------------------");
        sb.append(" Bem vindo ao nosso sistema de leitura!");
        sb.append(" -------------------------------------------");
        return sb.toString();
    }

    public void novoLivro(Livro livro) {
        livros.add(livro);
    }

    public String toString() {

        return "Nome: " + nome + " - Livros: " + livros;
    }
}
