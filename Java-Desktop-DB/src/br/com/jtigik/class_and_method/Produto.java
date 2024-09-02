package br.com.jtigik.class_and_method;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {

    }

    Produto(String nomeProduto, double precoInicial) {
        nome = nomeProduto;
        preco = precoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoGerente) {
        return preco * (1 - (desconto + descontoGerente));
    }
}