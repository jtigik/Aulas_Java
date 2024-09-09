package br.com.jtigik.arrays_collection.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapas {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(7, "Ricardo");
        usuarios.put(19, "Antonio");
        usuarios.put(22, "Mary");
        usuarios.put(5, "Ginger");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());

        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(19));
        System.out.println(usuarios.containsValue("Ginger"));
        System.out.println(usuarios.get(7));

        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for (var valor : usuarios.values()) {
            System.out.println(valor);
        }

        for (Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print(registro.getKey() + " - ");
            System.out.println(registro.getValue());
        }
    }

}
