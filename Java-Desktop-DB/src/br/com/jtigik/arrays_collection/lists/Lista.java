package br.com.jtigik.arrays_collection.lists;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");

        lista.add(u1); //
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lea"));
        lista.add(new Usuario("Jonas"));
        lista.add(new Usuario("Livia"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Bianca"));

        System.out.println(lista.get(2).nome);

        System.out.println("Index >> " + lista.remove(1)); //Removendo pelo index

        System.out.println("Object >> " + lista.remove(new Usuario("Carlos")));

        System.out.println("Tem Livia? - R.: " + lista.contains(new Usuario("Livia")));

        for (Usuario usuario : lista) {
            System.out.println(usuario);
        }
    }
}
