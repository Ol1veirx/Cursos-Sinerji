package Model.Hotel;

import Model.Hospede.Hospede;
import Model.Quartos.Quarto;

import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    private int id;
    private String nome;
    private List<Quarto> quartos = new ArrayList<>();
    private List<Hospede> hospedes = new ArrayList<>();

    public Hotel() {}

    public Hotel(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Hotel(String nome) {
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

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }
    public void adicionarQuartos(int qtdQuartos) {
        int id = 0;
        int numeroQuarto = 0;
        while(quartos.size() <= qtdQuartos) {
            Quarto quarto = new Quarto();
            quartos.add(quarto);
            quarto.setId(id += 1);
            quarto.setNumero(numeroQuarto += 1);
        }
    }

    public void listarQuartos() {
        System.out.println(quartos);
    }

    public void adicionarReserva() {
        Scanner sc = new Scanner(System.in);
        Hospede hospede = new Hospede();
        System.out.println("Bem vindo ao hotel " + nome + "!");
        System.out.println("Vamos fazer uma reserva? Esse são os quartos disponiveis: ");
        listarQuartos();
        System.out.print("Qual o seu nome: ");
        hospede.setNome(sc.next());
        System.out.print("Qual quarto deseja fazer a reserva: ");


    }
}
