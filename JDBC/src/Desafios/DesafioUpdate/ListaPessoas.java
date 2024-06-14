package Desafios.DesafioUpdate;

import Exercicios.FabricaConexao;
import Exercicios.Pessoa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {
    public static void listarPessoas() throws SQLException {
        Connection conn = FabricaConexao.getConexao();

        String sql = "SELECT * FROM pessoas ORDER BY codigo";

        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

        while (result.next()) {
            int codigo = result.getInt("codigo");
            String nome = result.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        System.out.println("Lista de Pessoas: ");
        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " ===> " + p.getNome());
        }

        conn.close();
    }
}
