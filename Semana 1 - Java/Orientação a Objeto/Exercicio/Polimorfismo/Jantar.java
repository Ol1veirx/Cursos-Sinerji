public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(85.5);

        Alimento ingrediente1 = new Arroz(0.25);
        Alimento ingrediente2 = new Feijao(0.2);
        Alimento sobremesa = new Sorvete(0.25);

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(sobremesa);

        System.out.println(convidado.getPeso());
    }
}
