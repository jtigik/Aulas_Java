package br.com.jtigik.swing.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

    /*
    * Utilizado o padrão Singleton.
    * Onde há apenas uma instância de uma única Classe.
    * Ao definir o Construtor da Classe como 'private'.
    * Assim é possível controlar a criação dentro da
    * própria Classe.
     */
    private enum TipoComando {
        ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA;
    };

    private static final Memoria instancia = new Memoria();

    private String textoAtual = "";

    private final List<MemoriaObservador> observadores = new ArrayList<>();
    // ArrayList para armazenar todos os observadores.

    private Memoria() {
    }

    public static Memoria getInstancia() {
        return instancia;
    }

    public void adicionarObservador(MemoriaObservador observador) {
        observadores.add(observador);
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

    public void processarComando(String valor) {

        //Tratando valor quando 'AC' for pressionado.
        if ("AC".equals(valor)) {
            textoAtual = "";
        } else {
            textoAtual += valor;
        }

        // Para cada novo comando (botão pressionado)
        // captura o valor do Buttom e adiciona ao texto atual
        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
        // e notifica todos os observadores sobre a atualização.
    }

    /*
     * Não basta implementar a Interface, é preciso se registrar dentro da Classe Memória.
     * Por isso, Classe Memória deve possuir um método que grava todos os Observadores.
     */
}
