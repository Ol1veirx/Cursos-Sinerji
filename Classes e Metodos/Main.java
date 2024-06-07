public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Arroz";
        p1.preco = 3.00;

        Produto p2 = new Produto();
        p2.nome = "Celular";
        p2.preco = 1000;

        System.out.println(p1.preco);
        System.out.println(p1.precoComDesconto());

        System.out.println(p2.nome);
        System.out.println(p2.preco);
        System.out.println(p2.precoComDesconto());

        System.out.println(Produto.DESCONTO);
    }
}
