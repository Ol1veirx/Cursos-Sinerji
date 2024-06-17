package org.example.Hospital;

import jdk.jshell.Snippet;
import org.example.Paciente.Paciente;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.Predicate;

public class Hospital {
    private int id;
    private String nome;
    private List<Paciente> pacientes = new ArrayList<>();

    public Hospital() {}

    public Hospital(String nome) {
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

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void listarPaciente() {
        for (Paciente p : pacientes) {
            System.out.println(p);
        }
    }

    public void deletarPaciente(Paciente paciente) {
        Optional<Paciente> pacienteExists = buscarPaciente(paciente);

        if (pacienteExists.isPresent()) {
            pacientes.remove(paciente);
            System.out.println("Paciente removido com sucesso.");
        } else {
            System.out.println("Paciente não encontrado!");
        }
    }

    public Paciente alterarPaciente(Paciente paciente) {
        Scanner sc = new Scanner(System.in);

        Optional<Paciente> pacienteExists = buscarPaciente(paciente);

        if(pacienteExists.isPresent()) {
            System.out.print("Inform o novo nome: ");
            String newNome = sc.nextLine();
            paciente.setName(newNome);
            System.out.print("Informe a nova idade : ");
            int newIdade = sc.nextInt();
            paciente.setIdade(newIdade);
        } else {
            System.out.println("Paciente não encontrado! ");
        }
        return paciente;
    }

    public Optional<Paciente> buscarPaciente(Paciente paciente){
        Predicate<Paciente> findPaciente = p -> p.getId() == paciente.getId();
        Optional<Paciente> pacienteExists = pacientes.stream()
                .filter(findPaciente)
                .findFirst();

        return pacienteExists;
    }
}