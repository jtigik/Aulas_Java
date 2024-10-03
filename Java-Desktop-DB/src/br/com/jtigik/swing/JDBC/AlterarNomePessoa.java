package br.com.jtigik.swing.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

    @SuppressWarnings("static-access")
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o código da Pessoa: ");
        int codigo = entrada.nextInt();

        String sql = "SELECT * FROM pessoa WHERE codigo = ?";

        Connection conexao = new FabricaDeConexao().getConexao();

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);
        ResultSet res = stmt.executeQuery();

        if (res.next()) {
            Pessoa p = new Pessoa(res.getInt(1), res.getString(2));
            System.out.println("O nome atual é: " + p.getNome());

            System.out.println("Informe outro número: ");
            String novoNome = entrada.nextLine();

            sql = "UPDATE pessoa SET nome = ? WHERE";
            entrada.close();
            stmt.close();
            stmt = conexao.prepareStatement(sql);

        }
    }
}
