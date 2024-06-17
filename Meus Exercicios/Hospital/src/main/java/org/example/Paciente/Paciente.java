package org.example.Paciente;

public class Paciente {
    private int id;
    private String name;
    private int idade;

    public Paciente() {}

    public Paciente(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public Paciente(int id, String nome, int idade){
        this.id = id;
        this.name = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Id: " + this.id + " - Nome: " + this.name + " - Idade: " + this.idade;
    }
}
