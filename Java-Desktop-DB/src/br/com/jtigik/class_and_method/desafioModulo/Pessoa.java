package br.com.jtigik.class_and_method.desafioModulo;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
        }
    }

    String apresentar() {
        return "Olá, eu sou " + nome + " eu tenho " + peso + "kg";
    }
}
