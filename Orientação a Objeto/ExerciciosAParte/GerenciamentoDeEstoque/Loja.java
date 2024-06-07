public class Loja {
    public static void main(String[] args) {
        
        Produto p1 = new Produto(1, "Arroz", 3.90, 20);
        Produto p2 = new Produto(2, "Feijao", 6.90, 15);
        Produto p3 = new Produto(3, "Macarrao", 2.50, 40);

        Estoque estoque = new Estoque();
        estoque.addProduto(p1);
        estoque.addProduto(p2);
        estoque.addProduto(p3);
        System.out.println(estoque.listaDeProdutos());

        estoque.attQtdEmEstoque(2, 5);
        System.out.println(estoque.listaDeProdutos());
        estoque.attQtdEmEstoque(1, 10);

        System.out.println(estoque.listaDeProdutos());
        estoque.removeProduto(p3);
    }
}
