package Exercicios;

import java.sql.*;

public class criarBanco {
    public static void main(String[] args) throws SQLException {
        // Strings utilizadas para conexao com o banco de dados
        final String url = "jdbc:postgresql://localhost:5432/";
        final String user = "postgres";
        final String password = "vasco2020";

        // Interface do java responsavel por fazer a conexao
        Connection conn = DriverManager.getConnection(url, user, password);

        // Interface que possibilita interagir com banco atraves de comando SQL
        Statement stmt = conn.createStatement();

        // Criação de um Banco de dados utilizando comando SQL
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("Banco criado com sucesso");

        conn.close();
    }
}
