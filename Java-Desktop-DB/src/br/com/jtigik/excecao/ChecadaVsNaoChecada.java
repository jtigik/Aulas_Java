package br.com.jtigik.excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
        try {
            gerarErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        gerarErro2();
        System.out.println("Fim do programa!");
    }

    public static void gerarErro1() {
        throw new RuntimeException("Ocorreu um erro #1");
    }

    public static void gerarErro2() {
        new Exception("Ocorreu um erro #2");
    }
}
