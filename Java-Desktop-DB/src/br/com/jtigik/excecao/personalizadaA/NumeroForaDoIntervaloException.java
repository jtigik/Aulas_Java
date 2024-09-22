package br.com.jtigik.excecao.personalizadaA;

public class NumeroForaDoIntervaloException extends RuntimeException {

    private final String nomeDoAtributo;

    public NumeroForaDoIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo.",
                nomeDoAtributo);
    }
}
