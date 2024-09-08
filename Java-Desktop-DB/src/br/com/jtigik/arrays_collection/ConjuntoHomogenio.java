package br.com.jtigik.arrays_collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHomogenio {

    public static void main(String[] args) {

        // Set<String> listaAprovados = new HashSet<>()
        SortedSet<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Pedro");
        listaAprovados.add("Bernardo");

        for (var candidato : listaAprovados) {
            System.out.println(candidato);
        }

        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Pedro");
        listaAprovados.add("Bernardo");

        for (var candidato : listaAprovados) {
            System.out.println(candidato);
        }
    }
}
