package br.com.jtigik.excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
        try {
            gerarErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            gerarErro2();
        } catch (Exception e) {
            // e.printStackTrace(); // Imprime a 'Pilha' de execução;
            System.out.println(e.getMessage());
        }
        System.out.println("Fim do programa!");
    }

    // Exceção NÃO checada ou NÃO verificada.
    public static void gerarErro1() {
        throw new RuntimeException("Ocorreu um erro #1");
    }

    // Exceção checada ou verificada
    public static void gerarErro2() throws Exception {
        throw new Exception("Ocorreu um erro #2");
    }
}
