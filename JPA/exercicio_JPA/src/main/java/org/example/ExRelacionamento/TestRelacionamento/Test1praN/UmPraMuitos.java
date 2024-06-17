package org.example.ExRelacionamento.TestRelacionamento.Test1praN;

import org.example.ExRelacionamento.Modelo1praN.ItemPedido;
import org.example.ExRelacionamento.Modelo1praN.Pedido;
import org.example.infra.DAO;

public class UmPraMuitos {
    public static void main(String[] args) {
        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorId(1L);
        dao.fechar();

        for(ItemPedido item : pedido.getItens()) {
            System.out.println(item.getQtd());
            System.out.println(item.getProduto().getNome());
        }

    }
}
