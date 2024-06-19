package Exercicios;

import java.sql.SQLException;

public class DAOTest {
    public static void main(String[] args) throws SQLException {
        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        System.out.println(dao.incluir(sql, "Marquinhos Bala"));
        System.out.println(dao.incluir(sql, "Juca Balada"));
        dao.incluir(sql, "Garel do Mel");

        dao.close();
    }
}
