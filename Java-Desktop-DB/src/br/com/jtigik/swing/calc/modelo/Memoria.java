package br.com.jtigik.swing.calc.modelo;

public class Memoria {

    /*
    * Utilizado o padrão Singleton.
    * Onde há apenas uma instância de uma única Classe.
    * Ao definir o Construtor da Classe como 'private'.
    * Assim é possível controlar a criação dentro da
    * própria Classe.
     */
    private static final Memoria instancia = new Memoria();

    private String textoAtual = "";

    // private Memoria() {
    // }
    public static Memoria getInstancia() {
        return instancia;
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

}
