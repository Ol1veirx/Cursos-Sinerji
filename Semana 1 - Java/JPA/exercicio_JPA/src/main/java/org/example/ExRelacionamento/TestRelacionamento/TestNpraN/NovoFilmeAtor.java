package org.example.ExRelacionamento.TestRelacionamento.TestNpraN;

import org.example.ExRelacionamento.ModeloNpraN.Ator;
import org.example.ExRelacionamento.ModeloNpraN.Filme;
import org.example.infra.DAO;

public class NovoFilmeAtor {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Star Wars Ep 4", 8.9);
        Filme filme2 = new Filme("O Fugitivo", 8.1);

        Ator ator1 = new Ator("Harrinson Ford");
        Ator atriz2 = new Ator("Carrie Fisher");

        filme1.addAtor(ator1);
        filme1.addAtor(atriz2);

        filme2.addAtor(ator1);

        DAO<Filme> dao = new DAO<>();
        dao.inserirDiretamente(filme1);
    }
}
