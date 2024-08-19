package br.com.jtigik.control;

public class For2 {
    /*
     * Implementar um Laço de números pares decrescente.
     * O laço inicia em 10 até 0.
     */
    public static void main(String[] args) {

        for (int contador = 10; contador >= 0; contador -= 2) {
            System.out.printf("Contador = %d\n", contador);
        }
    }
}
