package br.com.jtigik.polimorfismo;

public class Comida {

    private double peso;

    public Comida(double peso) {
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public final void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }
}
