package br.com.jtigik.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", "dos Santos", 30);

        p1.setNome("Amaro");
        p1.setIdade(-45);

        System.out.println(p1);// Lendo valores da Classe

        System.out.println(p1.getNomeCompleto());
    }
}
