package org.example.ExRelacionamento.TestRelacionamento.Test1pra1;

import org.example.ExRelacionamento.Modelo1pra1.Assento;
import org.example.ExRelacionamento.Modelo1pra1.Cliente;
import org.example.infra.DAO;

public class ObterClienteAssento {
    public static void main(String[] args) {
        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

        Cliente cliente = daoCliente.obterPorId(1L);
        System.out.println(cliente.getAssento().getNome());
        daoCliente.fechar();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);
        Assento assento = daoAssento.obterPorId(4L);
        System.out.println(assento.getCliente().getNome());

        daoAssento.fechar();
    }
}
