package Exercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirPessoas {
    public static void main(String[] args) throws SQLException {
        Connection conn = FabricaConexao.getConexao();
        Scanner sc = new Scanner(System.in);

        // Inserir o nome do usuario por meio do terminal
        System.out.println("Informe o nome: ");
        String nome = sc.nextLine();

        // A interrogação serve para informar que ali vai algum parametro
        // Forma mais segura do que simplesmente concatenar
        // Isso evita ataques de SQL Injection
        String sql = "INSERT INTO pessoas (nome) VALUES (?)";

        // Diferente do Statment o PreparedStatment faz um verificação mais aprimorada do comando SQL
        PreparedStatement pstmt = conn.prepareStatement(sql);
        // Nessa comando passamos o index (a interrogaçaõ colocada no comando SQL e a var que armazena o valor a ser inserido
        // Se fosse necessário passar outro parâmetro duplicaria a linha, mudaria o index pra 2 e passaria a variavel
        pstmt.setString(1, nome);
        pstmt.execute();

        System.out.println("Pessoas inserida com sucesso!");
        sc.close();
        conn.close();
    }
}
