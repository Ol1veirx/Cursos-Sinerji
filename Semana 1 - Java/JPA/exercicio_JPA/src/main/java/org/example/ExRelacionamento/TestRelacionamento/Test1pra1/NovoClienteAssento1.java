package org.example.ExRelacionamento.TestRelacionamento.Test1pra1;

import org.example.ExRelacionamento.Modelo1pra1.Assento;
import org.example.ExRelacionamento.Modelo1pra1.Cliente;
import org.example.infra.DAO;

public class NovoClienteAssento1 {
    public static void main(String[] args) {
        Assento assento = new Assento("16R");
        Cliente cliente = new Cliente("Tuca", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirT().inserir(assento).inserir(cliente).fecharT().fechar();
    }
}
