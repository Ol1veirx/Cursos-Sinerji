package Desafios.DesafioUpdate;

import Exercicios.FabricaConexao;
import Exercicios.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// Esse desafio eu fiz um updgrade nele para utilizar conceitos que eu aprendi
// Além de implementar o update (onde eu aprendi que o update utilizar QueryUpdate e retorna um INT) eu criei um classe para lista as pessoas
// MINHA RESPOSTA
public class AlterarPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection cnn = FabricaConexao.getConexao();

        // Classe que faz consulta no BD e retorna uma lista de pessoas
        ListaPessoas.listarPessoas();

        System.out.print("Agora informe o novo nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe o id da pessoa que deseja alterar? ");
        int id = sc.nextInt();

        // Toda logica para alterar uma pessoa
        String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        PreparedStatement stmt = cnn.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setInt(2, id);
        int result = stmt.executeUpdate();

        // Se houver alteração em no minimo uma linha ele retorna a mensagem de sucesso
        if(result > 0) {
            System.out.println(result + " linha(s) alterada(s) com sucesso!");
        } else {
            System.out.println("Erro na alteração");
        }

        Pessoa pessoaAtualizada = new Pessoa(id, nome);

        System.out.println("A pessoa com id " + pessoaAtualizada.getCodigo() + " atualizou o nome para: " + pessoaAtualizada.getNome());

        sc.close();
        cnn.close();
    }
}
