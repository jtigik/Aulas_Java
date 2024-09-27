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
        System.out.println(tipoComando);

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
            if (null != texto) //Quando não for número, processar...
            {
                switch (texto) {
                    case "AC":
                        return TipoComando.ZERAR;
                    case "/":
                        return TipoComando.DIV;
                    case "*":
                        return TipoComando.MULT;
                    case "+":
                        return TipoComando.SOMA;
                    case "-":
                        return TipoComando.SUB;
                    case "=":
                        return TipoComando.IGUAL;
                    case ",":
                        return TipoComando.VIRGULA;
                    default:
                        break;
                }
            }
        }
        return null;
    }
}
