package org.example.Model.Biblioteca;

import org.example.Model.Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private int id;
    private String nome;
    private List<Usuario> usuarios = new ArrayList<>();

    public Biblioteca() {}

    public Biblioteca(int id, String nome) {
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

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
