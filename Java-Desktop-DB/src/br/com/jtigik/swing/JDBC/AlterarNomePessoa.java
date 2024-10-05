package br.com.jtigik.swing.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o código da pessoa: ");
        int codigo = entrada.nextInt();

        String sql = "SELECT * FROM pessoa WHERE CÓDIGO = ?";

        Connection conexao = FabricaDeConexao.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);
        ResultSet resultado = stmt.executeQuery();

        if (resultado.next()) {
            Pessoa p = new Pessoa(
                    resultado.getInt(1),
                    resultado.getString(2));

        }

        conexao.close();
        entrada.close();
    }
}
