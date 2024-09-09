package br.com.jtigik.arrays_collection.sets;

import java.util.HashSet;

public class ConjuntoDesordenado {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) {
        // Criando conjunto heterogênio
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //Convertendo duoble para Double
        conjunto.add(true); // Vonvertendo boolean para Boolean
        conjunto.add("Teste");
        conjunto.add(1); // Convertendo int para Integer
        conjunto.add('x');

        System.out.println();

        System.out.println("O tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("O tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        HashSet nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(4);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear(); //Limpando todas posições do Set.
        System.out.println(conjunto);

    }
}
