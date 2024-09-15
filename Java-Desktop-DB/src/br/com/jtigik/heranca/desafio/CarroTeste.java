package br.com.jtigik.heranca.desafio;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c1 = new Civic();
        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        c1.frear();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        LaFerrari c2 = new LaFerrari();
        c2.acelerar();
        System.out.println("A-La Ferrari -->" + c2);

        c2.acelerar();
        System.out.println("A-La Ferrari -->" + c2);
        c2.frear();
        System.out.println("F-La Ferrari -->" + c2);
        c2.acelerar();
        System.out.println("A-La Ferrari -->" + c2);
        c2.frear();
        System.out.println("F-La Ferrari -->" + c2);

    }
}
