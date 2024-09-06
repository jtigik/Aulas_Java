package br.com.jtigik.arrays_collection;

import java.util.Scanner;

public class Desafiando {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas notas?: ");
        int qtdNotas = entrada.nextInt();
        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota: ");
            notas[i] = entrada.nextDouble();
        }
        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        double media = total / notas.length;

        System.out.println("A média é " + media + "!");
        entrada.close();
    }
}
