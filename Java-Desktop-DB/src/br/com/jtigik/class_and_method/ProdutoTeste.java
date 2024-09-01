package br.com.jtigik.class_and_method;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p0 = new Produto();
        p0.nome = "Notebook";
        p0.preco = 4567.79;
        p0.desconto = 0.25;

        var p1 = new Produto();
        p1.desconto = 0.30;
        p1.nome = "Disquete 3.5'' 1.44Mb";
        p1.preco = 10.00;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.75;
        p2.desconto = 0.29;

        System.out.println(p0.nome);
        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal0 = p0.preco * (1 - p0.desconto);
        double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.preco * (1 - p2.desconto);
        double mediaCarrinho = (precoFinal0 + precoFinal1 + precoFinal2) / 3;

        System.out.printf("Média do carrinho = R$ %.2f", mediaCarrinho);
    }
}
