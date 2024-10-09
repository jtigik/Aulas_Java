package br.com.jtigik.swing.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o código: ");

        int codigo = entrada.nextInt();

        Connection conexao = FabricaDeConexao.getConexao();

        String sql = "DELETE FROM pessoa WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);

        if (stmt.executeUpdate() > 0) {
            System.out.println("Registro excluido com sucesso!");
        } else {
            System.out.println("Houve um erro, nada foi alterado!");
        }

        System.out.println(stmt.executeUpdate() > 0 ? "Registro excluido com sucesso!" : "Houve um erro, nada foi alterado!");

        conexao.close();
        entrada.close();

    }
}
