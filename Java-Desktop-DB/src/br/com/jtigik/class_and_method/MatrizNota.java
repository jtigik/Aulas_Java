package br.com.jtigik.class_and_method;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MatrizNota {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Quantos alunos?: ");
            int qtdAlunos = entrada.nextInt();

            System.out.println("Quantas notas por aluno?: ");
            int qtdNotas = entrada.nextInt();

            double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

            int total = 0;

            for (int i = 0; i < notasDaTurma.length; i++) {// Representa os alunos
                for (int j = 0; j < notasDaTurma[i].length; j++) {//Representa as notas de cada aluno.
                    System.out.printf("Informe a nota %d do Aluno %s: ", j + 1, i + 12);

                    notasDaTurma[i][j] = entrada.nextDouble();
                    total += notasDaTurma[i][j];
                }
            }
            double media = total / (qtdAlunos * qtdNotas);

            System.out.println();

            for (double[] notasAluno : notasDaTurma) {
                System.out.println(Arrays.toString(notasAluno));
            }

            JOptionPane.showMessageDialog(null,
                    String.format("A média da Turma é: %.1f", media),
                    "Resultado Final",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
