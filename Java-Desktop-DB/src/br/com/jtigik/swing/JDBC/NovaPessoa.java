package br.com.jtigik.swing.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o Nome da pessoa: ");
        String nome = entrada.nextLine();

        Connection conexao = FabricaDeConexao.getConexao();

        String sql = "INSERT INTO pessoa (nome) values (?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);

        stmt.execute();

        System.out.println("Pessoa cadastrada com sucesso!");

        entrada.close();
    }
}
