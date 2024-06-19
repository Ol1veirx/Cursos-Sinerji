package org.example.ExRelacionamento.TestRelacionamento.Test1praN;

import org.example.ExCRUD.Basico.Produto;
import org.example.ExRelacionamento.Modelo1praN.ItemPedido;
import org.example.ExRelacionamento.Modelo1praN.Pedido;
import org.example.infra.DAO;

public class NovoPedido {
    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();

        Produto produto = new Produto("Geladeira", 2789.99);
        Pedido pedido = new Pedido();
        ItemPedido item = new ItemPedido(pedido, produto, 10);

        dao.abrirT()
                .inserir(produto)
                .inserir(pedido)
                .inserir(item)
                .fecharT()
                .fechar();
    }
}
