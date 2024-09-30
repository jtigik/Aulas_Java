package br.com.jtigik.swing.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {

    public static Connection getConexao() {
        try {
            final String url
                    = "jdbc:mysql://localhost/javaDesktop?verifyServerCertificate=false&useSSL=true";
            final String usuario = "root";
            final String senha = "874592";

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
