package br.com.jtigik.swing.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Criar_BD {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaDeConexao.getConexao();

        Statement stmt = conexao.createStatement();

        stmt.execute(
                "CREATE DATABASE IF NOT EXISTS javaDesktop");

        System.out.println(
                "Banco criado com sucesso!");

        conexao.close();
    }
}
