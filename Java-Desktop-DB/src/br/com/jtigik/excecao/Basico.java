package br.com.jtigik.excecao;

public class Basico {

    public static void main(String[] args) {
        Aluno aluno = null;

        try {
            imprimirAluno(aluno);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao imprimir o nome do Aluno.");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o seguinte erro ao executar uma divisão: " + e.getMessage());
        }
        System.out.println("Fim da aplicação!");
    }

    public static void imprimirAluno(Aluno aluno) {
        System.out.println(aluno.getNome());
    }
}
