package br.com.jtigik.arrays_collection.equalshash;

public class Usuario {

    String nome;
    String email;

    public boolean equals(Object obj) {
        Usuario outro = (Usuario) obj;

        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual = outro.email.equals(this.email);
    }
    return nomeIgual && emailIgual ;
}
}
