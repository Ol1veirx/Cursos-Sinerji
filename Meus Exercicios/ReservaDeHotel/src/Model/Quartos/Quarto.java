package Model.Quartos;

import Enums.StatusQuarto;
import Model.Hospede.Hospede;

public class Quarto {
    private int id;
    private int numero;
    private StatusQuarto statusQuarto = StatusQuarto.DISPONIVEL;
    private Hospede hospede;

    public Quarto() {
        id+=1;
        numero+=1;
    }

    public Quarto(int numero, StatusQuarto statusQuarto, Hospede hospede) {
        this.numero = numero;
        this.statusQuarto = statusQuarto;
        this.hospede = hospede;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public StatusQuarto getStatusQuarto() {
        return statusQuarto;
    }

    public void setStatusQuarto(StatusQuarto statusQuarto) {
        this.statusQuarto = statusQuarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public String toString() {
        return "ID: " + id + " - Numero: " + numero + " -  Status: " + statusQuarto + "\n";
    }
}
