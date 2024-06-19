package Exercicios;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

// Nessa classe é passado um comando basico para criar uma tabela no banco de dados
public class CriarTabelaPessoas {
    public static void main(String[] args) throws SQLException {
        Connection conn = FabricaConexao.getConexao();
        String sql = "CREATE TABLE pessoas (" +
                "codigo SERIAL NOT NULL PRIMARY KEY," +
                "nome VARCHAR(80) NOT NULL" +
                ")";

        Statement stmt = conn.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso");
        conn.close();
    }
}
