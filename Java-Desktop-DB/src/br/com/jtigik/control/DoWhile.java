package br.com.jtigik.control;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        /*
         * if(...) sentença; ou {...}
         * while() sentença; ou {...}
         * for()...;...;...) sentença; ou {...}
         * do sentença; ou {...} while(...)
         */

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {

            System.out.println("Diga as palavras mágicas!");
            System.out.print("Quer sair?");
            texto = entrada.nextLine();

        } while (!texto.equalsIgnoreCase("Por favor"));

        System.out.println("Obrigado!");
        entrada.close();
    }
}
