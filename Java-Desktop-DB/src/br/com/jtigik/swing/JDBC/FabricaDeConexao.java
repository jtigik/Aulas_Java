package br.com.jtigik.swing.JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaDeConexao {

    public static Connection getConexao() {
        try {
            Properties propertie = getProperties();
            final String url = propertie.getProperty("banco.url");
            final String usuario = propertie.getProperty("banco.usuario");
            final String senha = propertie.getProperty("banco.senha");

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException {
        Properties propertie = new Properties();
        String caminho = "/conexao.properties";

        propertie.load(FabricaDeConexao.class.getResourceAsStream(caminho));
        return propertie;
    }
}
