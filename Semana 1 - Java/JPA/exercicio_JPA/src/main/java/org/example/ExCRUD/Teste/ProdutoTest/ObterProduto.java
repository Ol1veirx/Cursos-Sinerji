package org.example.ExCRUD.Teste.ProdutoTest;

import org.example.ExCRUD.Basico.Produto;
import org.example.ExCRUD.Basico.ProdutoDAO;

import java.util.List;

public class ObterProduto {
    public static void main(String[] args) {
        // Dessa forma não precisa passar o tipo ao instanciar o DAO
        // Pois essa classe abaixo herda o DAO ja passando o tipo produto nela tornando a mesma mais especifica
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();
        for(Produto p : produtos) {
            System.out.println("ID: " + p.getId() + " - NOME: " + p.getNome());
        }

        double precoTotal = produtos
                .stream()
                .map(p -> p.getPreco())
                .reduce(0.0, (t, p) -> t + p)
                .doubleValue();
        System.out.println("O valor total é R$ " + precoTotal);
        dao.fechar();
    }
}
