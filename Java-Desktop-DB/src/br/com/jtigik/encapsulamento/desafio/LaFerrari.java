package br.com.jtigik.encapsulamento.desafio;

public class LaFerrari extends Carro {

    public LaFerrari() {
        super(310);
    }

    @Override
    public void acelerar() {

        delta += 15;
    }
}
