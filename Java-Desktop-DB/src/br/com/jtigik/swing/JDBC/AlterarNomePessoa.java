package br.com.jtigik.swing.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o código da pessoa: ");
        int codigo = entrada.nextInt();

        String select = "SELECT codigo, nome FROM pessoa WHERE CODIGO = ?";

        Connection conexao = FabricaDeConexao.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, codigo);
        ResultSet resultado = stmt.executeQuery();

        if (resultado.next()) {
            Pessoa p = new Pessoa(
                    resultado.getInt(1),
                    resultado.getString(2));

            System.out.printf("O nome atual é: %s\n\n", p.getNome());

            entrada.nextLine();

            System.out.print("Informe o novo Nome: ");
            String novoNome = entrada.nextLine();

            String update = "UPDATE pessoa SET nome = ? WHERE codigo = ?";

            stmt.close();
            stmt = conexao.prepareStatement(update);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);

            stmt.execute();

            System.out.println("Pessoa alterada com sucesso!");
        } else {
            System.out.println("Registro não encontrado!");
        }

        conexao.close();
        entrada.close();
    }
}
