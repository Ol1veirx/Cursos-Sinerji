package Exercicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
// Fazendo uma consulta com JDBC
public class ConsultarPessoas1 {
    public static void main(String[] args) throws SQLException {
        // Conecta com o banco de dados
        Connection conn = FabricaConexao.getConexao();
        // Criar o comando de consulta na tabela pessoas
        String sql = "SELECT * FROM pessoas;";
        // Cria o statment para passar o comando sql
        Statement stmt = conn.createStatement();
        // chama o result set que é para armazenar o resultado dessa consulta
        ResultSet result = stmt.executeQuery(sql);

        // Criar uma lista do tipo pessoas para armazenar elas
        List<Pessoa> pessoas = new ArrayList<>();

        // Enquanto houver um pessoa será feito todo trabalho de pegar os resultados e armazena nas variaveis
        while (result.next()) {
            // variavel codigo que pega o resultado inteiro da coluna codigo
            int codigo = result.getInt("codigo");
            // variavel nome que pega o resultado string da coluna nome
            String nome = result.getString("nome");
            // Instancia uma nova pessoa e armazena na lista criada
            pessoas.add(new Pessoa(codigo, nome));
        }

        // Para cada pessoas inserida na lista sera retornado da seguinte forma
        for(Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " ===> " + p.getNome());
        }
        conn.close();
    }
}
