package Model.Hospede;

import Model.Hotel.Hotel;
import Model.Quartos.Quarto;

import java.util.Date;

public class Hospede {
    private int id;
    private String nome;
    private final Date dataCheckIn = new Date();
    private String dataCheckout;
    private Quarto quarto;
    private Hotel hotel;

    public Hospede() {}

    public Hospede(int id, String nome, Quarto quarto, Hotel hotel) {
        this.id = id;
        this.nome = nome;
        this.quarto = quarto;
        this.hotel = hotel;
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

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
