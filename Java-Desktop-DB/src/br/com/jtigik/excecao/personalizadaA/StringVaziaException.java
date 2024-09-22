package br.com.jtigik.excecao.personalizadaA;

public class StringVaziaException extends RuntimeException {

    private final String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está vazio.",
                nomeDoAtributo);
    }
}
