package org.example.ExRelacionamento.TestRelacionamento.Test1pra1;

import org.example.ExRelacionamento.Modelo1pra1.Assento;
import org.example.ExRelacionamento.Modelo1pra1.Cliente;
import org.example.infra.DAO;

public class NovoClienteAssento2 {
    public static void main(String[] args) {
        Assento assento = new Assento("34J");
        Cliente cliente = new Cliente("Maria", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.inserirDiretamente(cliente);

    }
}
