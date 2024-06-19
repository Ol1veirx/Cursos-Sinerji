package Exercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


// O padrao DAO tenta separar a aplicação de toda logica com o banco de dados deixando a aplicação mais robusta
public class DAO {
    private Connection connection;

    public int incluir(String sql, Object... atributos) {
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            adicionarAtributos(stmt, atributos);

            if (stmt.executeUpdate() > 0) {
                ResultSet result = stmt.getGeneratedKeys();

                if(result.next()) {
                    return result.getInt(1);
                }
            }

            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {
        int index = 1;
        for(Object atributo : atributos) {
            if (atributo instanceof String) {
                stmt.setString(index, (String) atributo);
            } else if(atributo instanceof Integer) {
                stmt.setInt(index, (Integer) atributo);
            }
            index++;
        }
    }

    public void close() throws SQLException {
        try {
            getConnection().close();
        } catch (SQLException _) {

        } finally {
            connection = null;
        }
    }

    private Connection getConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                return connection;
            }
        } catch (SQLException e) {

        }

        connection = FabricaConexao.getConexao();
        return connection;
    }
}
