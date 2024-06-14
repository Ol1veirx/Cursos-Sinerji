package Exercicios;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        Connection conn = FabricaConexao.getConexao();

        conn.close();
    }
}
