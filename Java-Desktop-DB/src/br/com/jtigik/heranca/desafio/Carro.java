package br.com.jtigik.heranca.desafio;

public class Carro {

    int velocidadeAtual = 0;

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar() {
        this.velocidadeAtual += 5;
    }

    public void frear() {
        if (velocidadeAtual >= 5) {
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
