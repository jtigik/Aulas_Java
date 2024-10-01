package br.com.jtigik.swing.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoa1 {

    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaDeConexao.getConexao();

        String sql = "SELECT * FROM pessoa";
        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);
        //Executa a query e retorna o resultado da pesquisa

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) { //Vai recebendo todos so registros retornado pelo DB

            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");

            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + "--> " + p.getNome());
        }

        stmt.close();
        conexao.close();
    }
}
