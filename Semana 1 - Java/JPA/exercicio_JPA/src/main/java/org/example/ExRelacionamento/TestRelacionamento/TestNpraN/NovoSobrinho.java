package org.example.ExRelacionamento.TestRelacionamento.TestNpraN;

import org.example.ExRelacionamento.ModeloNpraN.Sobrinho;
import org.example.ExRelacionamento.ModeloNpraN.Tio;
import org.example.ExRelacionamento.TestRelacionamento.Test1pra1.ObterClienteAssento;
import org.example.infra.DAO;

public class NovoSobrinho {
    public static void main(String[] args) {
        Tio tia1 = new Tio("Maria");
        Tio tio2 = new Tio("Joao");

        Sobrinho sobrinha1 = new Sobrinho("Ana");
        Sobrinho sobrinho2 = new Sobrinho("Junior");

        tia1.getSobrinhos().add(sobrinha1);
        sobrinha1.getTios().add(tia1);

        tia1.getSobrinhos().add(sobrinho2);
        sobrinho2.getTios().add(tia1);

        tio2.getSobrinhos().add(sobrinha1);
        sobrinha1.getTios().add(tio2);

        tio2.getSobrinhos().add(sobrinho2);
        sobrinho2.getTios().add(tio2);

        DAO<Object> dao = new DAO<>();
        dao.abrirT()
                .inserir(tia1)
                .inserir(tio2)
                .inserir(sobrinha1)
                .inserir(sobrinho2)
                .fecharT()
                .fechar();
    }
}
