

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Liedson", 85.5);

        Comida c1 = new Comida();
        c1.nome = "macarrao";
        c1.peso = 2.5;

        System.out.println(p1.peso);

        p1.comer(c1);

        System.out.println(p1.peso);    
    }
}
