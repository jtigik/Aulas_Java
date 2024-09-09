package br.com.jtigik.arrays_collection.lists.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> numeros = new ArrayList<>();

            System.out.println("Digite números inteiros (digite -1 para parar):");
            while (true) {
                int numero = scanner.nextInt();
                if (numero == -1) {
                    break;
                }
                numeros.add(numero);
            }

            System.out.println("Números pares:");
            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    System.out.println(numero);
                }
            }
        }
    }
}
