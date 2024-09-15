package br.com.jtigik.heranca.desafio;

public class LaFerrari extends Carro {

    LaFerrari() {
        super(310);
    }

    @Override
    public void acelerar() {

        delta += 15;
    }
}
