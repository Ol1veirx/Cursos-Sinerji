import Model.Hotel.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel saoFrancisco = new Hotel(1, "São Francisco");
        saoFrancisco.adicionarQuartos(5);
        saoFrancisco.listarQuartos();
    }
}