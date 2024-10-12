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

        System.out.print("Informe a idade da pessoa: ");
        int idade = entrada.nextInt();

        System.out.print("Informe o CPF da pessoa: ");
        entrada.nextLine();
        String cpf = entrada.nextLine();

        Connection conexao = FabricaDeConexao.getConexao();

        // String sql = "INSERT INTO pessoa (nome) values (?)";
        String sql = "INSERT INTO pessoa (nome, idade, cpf) values (?, ?, ?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        // stmt.execute();
        stmt.setInt(2, idade);
        // stmt.execute();
        stmt.setString(3, cpf);
        // stmt.executeUpdate();
        stmt.execute();

        System.out.println("Pessoa cadastrada com sucesso!");

        entrada.close();
    }
}
