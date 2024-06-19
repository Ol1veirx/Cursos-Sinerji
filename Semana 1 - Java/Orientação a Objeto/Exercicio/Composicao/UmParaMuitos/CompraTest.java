public class CompraTest {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "Liedson";
        c1.adicionarItem(new Item("Caneta", 20, 7.45));
        c1.adicionarItem(new Item("Borracha", 3, 3.45));
        c1.adicionarItem(new Item("Caderno", 3, 20.55));

        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());
    }
}
