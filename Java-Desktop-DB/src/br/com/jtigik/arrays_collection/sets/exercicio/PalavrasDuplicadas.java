package br.com.jtigik.arrays_collection.sets.exercicio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PalavrasDuplicadas {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite uma frase:");
            String frase = scanner.nextLine();

            String[] palavras = frase.split(" ");
            Set<String> palavrasUnicas = new HashSet<>();
            boolean duplicada = false;

            for (String palavra : palavras) {
                if (!palavrasUnicas.add(palavra)) {
                    duplicada = true;
                    break;
                }
            }

            if (duplicada) {
                System.out.println("A frase contém palavras duplicadas.");
            } else {
                System.out.println("A frase não contém palavras duplicadas.");
            }
        }
    }
}
