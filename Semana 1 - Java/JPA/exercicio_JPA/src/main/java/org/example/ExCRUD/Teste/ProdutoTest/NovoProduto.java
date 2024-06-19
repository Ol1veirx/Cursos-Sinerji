package org.example.ExCRUD.Teste.ProdutoTest;

import org.example.ExCRUD.Basico.Produto;
import org.example.infra.DAO;

// Classe utilizando o DAO para fazer as operações
public class NovoProduto {
    public static void main(String[] args) {
        // Observe que ficou muito mais simples a implementação
        DAO<Produto> dao = new DAO<>(Produto.class);

        // Com somente duas linhas conseguimos instanciar um objeto do tipo produto
        // E logo em seguida inserir o mesmo no banco de dados utilizando o DAO
        Produto produto = new Produto("Monitor 23", 789.98);
        dao.inserirDiretamente(produto).fechar();
    }
}
