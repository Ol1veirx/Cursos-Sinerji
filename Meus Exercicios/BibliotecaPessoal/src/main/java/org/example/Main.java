package org.example;

import org.example.Model.Biblioteca.Biblioteca;
import org.example.Model.Livro.Livro;
import org.example.Model.Usuario.Usuario;

public class Main {
    public static void main(String[] args) {
        System.out.println(Usuario.bemVindo());

        Biblioteca b1 = new Biblioteca(1, "Penedense");
        Usuario u1 = new Usuario(1, "Liedson");
        Livro l1 = new Livro(1, "Crime e Castigo", "Lendo");

        b1.adicionarUsuario(u1);
        u1.novoLivro(l1);
        System.out.println(u1);
    }
}