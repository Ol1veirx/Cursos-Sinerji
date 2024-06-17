package org.example;

import org.example.Hospital.Hospital;
import org.example.Paciente.Paciente;

public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente(23,"Liedson", 21);
        Paciente p2 = new Paciente(24,"Jose", 45);
        Paciente p3 = new Paciente(25,"Maria", 32);
        Paciente p4 = new Paciente(12, "Kika", 23);
        Paciente p5 = new Paciente("Vasco", 23);

        Hospital veraCruz = new Hospital("Vera Cruz");
        veraCruz.adicionarPaciente(p1);
        veraCruz.adicionarPaciente(p2);
        veraCruz.adicionarPaciente(p3);
        veraCruz.adicionarPaciente(p4);
        veraCruz.adicionarPaciente(p5);

        veraCruz.listarPaciente();
    }
}