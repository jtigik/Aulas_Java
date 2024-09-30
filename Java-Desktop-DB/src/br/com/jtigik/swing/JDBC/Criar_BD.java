package br.com.jtigik.swing.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Criar_BD {

    public static void main(String[] args) throws SQLException {
        /* final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "874592";

        Connection conexao = DriverManager.getConnection(url, usuario, senha); */

        Connection conexao = FabricaDeConexao.getConexao();

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS javaDesktop");

        System.out.println("Banco criado com sucesso!");

        conexao.close();
    }
}
