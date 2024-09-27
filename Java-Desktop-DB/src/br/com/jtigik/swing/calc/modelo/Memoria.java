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
    private static enum TipoComando {
        ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA;
    };

    private static final Memoria instancia = new Memoria();

    private String textoAtual = "";

    private final List<MemoriaObservador> observadores = new ArrayList<>();

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

    public void processarComando(String texto) {

        TipoComando tipoComando = detectarTipoComando(texto);
        //Linha provisória, apenas para testar o retorno do método.

        if ("AC".equals(texto)) {
            textoAtual = "";
        } else {
            textoAtual += texto;
        }

        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));

    }

    private TipoComando detectarTipoComando(String texto) {
        if (textoAtual.isEmpty() && texto.equals("0")) {
            return null;
        }
        try {
            Integer.valueOf(texto);
            return TipoComando.NUMERO;
        } catch (NumberFormatException e) {
            //Quando não for número, processar...
            if ("AC".equals(texto)) {
                return TipoComando.ZERAR;
            } else if ("/".equals(texto)) {
                return TipoComando.DIV;
            } else if ("*".equals(texto)) {
                return TipoComando.MULT;
            } else if ("+".equals(texto)) {
                return TipoComando.SOMA;
            } else if ("-".equals(texto)) {
                return TipoComando.SUB;
            } else if ("=".equals(texto)) {
                return TipoComando.IGUAL;
            } else if (",".equals(texto)) {
                return TipoComando.VIRGULA;
            }
        }
        return null;
    }
}
