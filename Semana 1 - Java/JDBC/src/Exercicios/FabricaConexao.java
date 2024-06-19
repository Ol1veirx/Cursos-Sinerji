package Exercicios;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// Classe usada para realizar conexao com banco de dados de forma mais rapida
public class FabricaConexao {

    // Metodo responsavel por fazer essa conexao
    public static Connection getConexao() {
        try{
            Properties prop = getProperties();
            String url = prop.getProperty("banco.url");
            String user = prop.getProperty("banco.user");
            String password = prop.getProperty("banco.password");

            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | IOException e){
            throw new RuntimeException(e);
        }
    }
    
    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        String caminho = "/conexao.properties";
        prop.load(FabricaConexao.class.getResourceAsStream(caminho));
        return prop;
    }
}
