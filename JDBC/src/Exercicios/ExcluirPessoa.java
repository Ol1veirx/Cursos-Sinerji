package Exercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o codigo para deletar: ");
        int codigo = sc.nextInt();

        Connection conn = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, codigo);
        int linhasAfetadas = stmt.executeUpdate();
        if(linhasAfetadas > 0){
            System.out.println("Pessoa excluida com sucesso");
            System.out.println("Linhas afetadas: " + linhasAfetadas);
        } else {
            System.out.println("Nada feito");
        }

        sc.close();
        conn.close();
    }
}
