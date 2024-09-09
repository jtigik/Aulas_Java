package br.com.jtigik.arrays_collection.sets.exercicio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumerosUnicos {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        Set<Integer> numerosUnicos = new HashSet<>();

        System.out.println("Digite números inteiros (digite -1 para parar):");
        while (true) {
            int numero = scanner.nextInt();
            if (numero == -1) {
                break;
            }
            numerosUnicos.add(numero);
        }

        System.out.println("Números únicos:");
        for (int numero : numerosUnicos) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
