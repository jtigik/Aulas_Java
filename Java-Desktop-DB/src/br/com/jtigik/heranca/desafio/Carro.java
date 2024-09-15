package br.com.jtigik.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual = 305;
    int delta = 0;

    public Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            this.velocidadeAtual += delta;
        }
    }

    public void frear() {
        if (velocidadeAtual >= delta) {
            this.velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    @Override
    public String toString() {
        return "Velocidade atual é --> " + velocidadeAtual + " km/h";
    }
}
