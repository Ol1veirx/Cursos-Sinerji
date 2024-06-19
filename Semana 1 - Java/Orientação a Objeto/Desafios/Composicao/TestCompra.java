public class TestCompra {
    public static void main(String[] args) {
        
        Produto arroz = new Produto("Arroz", 3.90);
        Produto feijao = new Produto("Feijao", 7.90);

        Item qtdArroz = new Item(2, arroz);
        Item qtdFeijao = new Item(3, feijao);

        Compra compra = new Compra();
        compra.itens.add(qtdArroz);
        compra.itens.add(qtdFeijao);

        Cliente c1 = new Cliente();
        c1.nome = "Liedson";
        c1.compras.add(compra);

        System.out.println(c1);
        System.out.printf("Valor total da compra R$ %.2f",c1.getValorTotal());

    }
}
