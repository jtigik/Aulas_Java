package br.com.jtigik.arrays_collection.equalshash;

public class Usuario {

    String nome;
    String email;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario outro) {

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
