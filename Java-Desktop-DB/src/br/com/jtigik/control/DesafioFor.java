package br.com.jtigik.control;

public class DesafioFor {

    /*
     * Desafio:
     * Implementar um laço que imprima da mesma
     * forma que a estrutura abaixo, poré, sem
     * utilizar número para controlar as voltas.
     */

    public static void main(String[] args) {
        String valor = "#";
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }

        for (String val = "#"; !val.equals("######"); val += "#") {
            System.out.println(val);
        }
    }
}
