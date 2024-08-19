package br.com.jtigik.control;

public class For1 {
    public static void main(String[] args) {
        int cont = 1;
        while (cont <= 10) {
            System.out.println("Dentro do While!");
            cont = cont + 1;
        }

        for (int contador = 1; contador <= 10; contador += 2) {
            System.out.printf("contador = %d\n", contador);
        }

        for (int contador = 1; contador <= 10; contador++) {
            System.out.printf("contador = %d\n", contador);
        }

        for (; cont >= 0; cont--) {
            System.out.printf("cont = %d\n", cont);
        }

        for (; cont <= 10;) {
            System.out.printf("cont = %d\n", cont);
            cont += 2;
        }

        for (; true;)
            System.out.println("Laço infinito!");
    }
}
