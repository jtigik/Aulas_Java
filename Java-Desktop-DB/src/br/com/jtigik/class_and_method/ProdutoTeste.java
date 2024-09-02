package br.com.jtigik.class_and_method;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p0 = new Produto("Notebook", 4567.79);

        var p1 = new Produto("Disquete 3.5'' 1.44Mb", 10.35);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.75;
        Produto.desconto = 0.50;

        System.out.printf("%s - %.2f\n", p0.nome, p0.precoComDesconto());
        System.out.printf("%s - %.2f\n", p1.nome, p1.precoComDesconto());
        System.out.printf("%s - %.2f\n", p2.nome, p2.precoComDesconto());

        double precoFinal0 = p0.precoComDesconto();
        double precoFinal1 = p1.precoComDesconto(0.7);
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (precoFinal0 + precoFinal1 + precoFinal2) / 3;

        System.out.printf("Média do carrinho = R$ %.2f", mediaCarrinho);
    }
}
