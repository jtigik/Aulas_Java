package br.com.jtigik.control;

public class AppAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");

        aluno1.gerarMatricula();
        aluno2.gerarMatricula();

        // System.out.println("Nome: " + aluno1.getNome() + ", Matrícula: " +
        // aluno1.getMatricula());
        // System.out.println("Nome: " + aluno2.getNome() + ", Matrícula: " +
        // aluno2.getMatricula());
        System.out.println(aluno1);
        System.out.println(aluno2);
    }
}
