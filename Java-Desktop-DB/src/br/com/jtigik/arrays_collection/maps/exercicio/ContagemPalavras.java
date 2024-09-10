package br.com.jtigik.arrays_collection.maps.exercicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemPalavras {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite uma frase:");
            String frase = scanner.nextLine();

            String[] palavras = frase.split(" ");
            Map<String, Integer> contagemPalavras = new HashMap<>();

            for (String palavra : palavras) {
                if (contagemPalavras.containsKey(palavra)) {
                    contagemPalavras.put(palavra, contagemPalavras.get(palavra) + 1);
                } else {
                    contagemPalavras.put(palavra, 1);
                }
            }

            for (Map.Entry<String, Integer> entrada : contagemPalavras.entrySet()) {
                System.out.println(entrada.getKey() + ": " + entrada.getValue());
            }
        }
    }
}
