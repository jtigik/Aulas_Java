package br.com.jtigik.arrays_collection.equalshash;

public class EqulHash {

    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro da Silva";
        u1.email = "pedro.silva@senacrs.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro da Silva";
        u2.email = "pedro.silva@senacrs.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
    }
}
