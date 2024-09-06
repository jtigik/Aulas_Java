package br.com.jtigik.arrays_collection;

public class Foreach {

    public static void main(String[] args) {
        double[] notas = {9.9, 8.6, 7.4, 9.4};

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i] + " ");
        }

        System.out.println();

        for (double nota : notas) {
            System.out.println(nota + " ");
        }
    }
}
