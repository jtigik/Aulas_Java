package br.com.jtigik.class_and_method;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto() {

    }

    Produto(String nomeProduto, double precoInicial, double descontoInicial) {
        nome = nomeProduto;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoGerente) {
        return preco * (1 - (desconto + descontoGerente));
    }
}