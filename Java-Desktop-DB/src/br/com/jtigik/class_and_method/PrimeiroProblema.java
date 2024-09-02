package br.com.jtigik.class_and_method;

public class PrimeiroProblema {

    /*
     * O problema está em acessar o valor de 'a',
     * já que o mesmo está fora do método estático.
     * Solucionar o problema sem alterar nada fora do método main().
     */

    int a = 3; // Não pode mexer.

    public static void main(String[] args) {
        PrimeiroProblema p = new PrimeiroProblema();

        System.out.println(p.a);
    }
}
