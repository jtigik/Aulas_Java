package br.com.jtigik.control;

public class AppCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2021);

        carro1.exibirInformacoes();
        carro2.exibirInformacoes();
    }
}
