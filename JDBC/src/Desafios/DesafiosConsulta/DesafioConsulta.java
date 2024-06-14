package Desafios.DesafiosConsulta;

import Exercicios.FabricaConexao;
import Exercicios.Pessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Essa é minha resposta

// Nesse desafio, apos algumas pesquisa descobri que quando utilizamos preparedStatment NÃO podemos passar no execute query o comando sql
// Apenas chama o metodo sem passar nada
public class DesafioConsulta {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection conn = FabricaConexao.getConexao();

        System.out.println("Qual letra deseja consulta? ");
        String letra = sc.next();

        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "%" + letra + "%");
        ResultSet result = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (result.next()) {
            int codigo = result.getInt("codigo");
            String nome  = result.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getCodigo() + " ===> " + pessoa.getNome());
        }

        conn.close();
        sc.close();
    }
}
