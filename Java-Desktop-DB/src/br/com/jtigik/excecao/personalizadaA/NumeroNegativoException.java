package br.com.jtigik.excecao.personalizadaA;

public class NumeroNegativoException extends RuntimeException {

    private final String nomeDoAtributo;

    public NumeroNegativoException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está negativo.",
                nomeDoAtributo);
    }
}
