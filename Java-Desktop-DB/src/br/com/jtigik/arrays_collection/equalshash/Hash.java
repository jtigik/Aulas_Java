package br.com.jtigik.arrays_collection.equalshash;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario("Paulo"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Giovane"));

        System.out.println(usuarios.contains(new Usuario("Giovane")));
    }

}
