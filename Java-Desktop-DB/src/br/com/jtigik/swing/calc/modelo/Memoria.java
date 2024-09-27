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

    private TipoComando ultimaOperacao = null;
    private boolean substituir = false;
    private String textoBuffer = "";

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

        /* if (tipoComando == null) {
            return;
        } else if (tipoComando == TipoComando.ZERAR) {
            textoAtual = "";
            textoBuffer = "";
            substituir = false;
            ultimaOperacao = null;
        } else if (tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
            textoAtual = substituir ? texto : textoAtual + texto;
            substituir = false;
        } else {
            substituir = true;
            textoAtual = obterResulatdoOperacao();
            textoBuffer = textoAtual;
            ultimaOperacao = tipoComando;
        } */
        if (null == tipoComando) {
            return;
        } else {
            switch (tipoComando) {
                case ZERAR -> {
                    textoAtual = "";
                    textoBuffer = "";
                    substituir = false;
                    ultimaOperacao = null;
                }
                case NUMERO, VIRGULA -> {
                    textoAtual = substituir ? texto : textoAtual + texto;
                    substituir = false;
                }
                default -> {
                    substituir = true;
                    textoAtual = obterResulatdoOperacao();
                    textoBuffer = textoAtual;
                    ultimaOperacao = tipoComando;
                }
            }
        }

        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));

    }

    private String obterResulatdoOperacao() {
        if (ultimaOperacao == null) {
            return textoAtual;
        }
        double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
        double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));

        double resultado = 0;

        /* if (ultimaOperacao == TipoComando.SOMA) {
        resultado = numeroBuffer + numeroAtual;
        } else if (ultimaOperacao == TipoComando.SUB) {
        resultado = numeroBuffer - numeroAtual;
        } else if (ultimaOperacao == TipoComando.MULT) {
        resultado = numeroBuffer * numeroAtual;
        } else if (ultimaOperacao == TipoComando.DIV) {
        resultado = numeroBuffer / numeroAtual;
        } */
        if (null != ultimaOperacao) {
            switch (ultimaOperacao) {
                case SOMA ->
                    resultado = numeroBuffer + numeroAtual;
                case SUB ->
                    resultado = numeroBuffer - numeroAtual;
                case MULT ->
                    resultado = numeroBuffer * numeroAtual;
                case DIV ->
                    resultado = numeroBuffer / numeroAtual;
                default -> {
                }
            }
        }

        String resultadoString = Double.toString(resultado).replace(".", ",");

        boolean inteiro = resultadoString.endsWith(",0");

        return inteiro ? resultadoString.replace(",0", "") : resultadoString;
    }

    private TipoComando detectarTipoComando(String texto) {
        if (textoAtual.isEmpty() && texto.equals("0")) {
            return null;
        }
        try {
            Integer.valueOf(texto);
            return TipoComando.NUMERO;
        } catch (NumberFormatException e) {
            if (null != texto) {//Quando não for número, processar...
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
                } else if (",".equals(texto) && !textoAtual.contains(",")) {
                    return TipoComando.VIRGULA;
                }
            }
            return null;
        }
    }
}
