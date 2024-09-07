package br.com.jtigik.class_and_method;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class MatrizTurma {

    public static void main(String[] args) {
        try {
            int qtdAluno = Integer.parseInt(
                    JOptionPane.showInputDialog("Quantos alunos? "));

            int qtdNota = Integer.parseInt(
                    JOptionPane.showInputDialog("Quantas notas por aluno?"));

            double[][] notasTurma = new double[qtdAluno][qtdNota];
            double totalTurma = 0;

            for (int i = 0; i < notasTurma.length; i++) {
                for (int j = 0; j < notasTurma[i].length; j++) {

                    notasTurma[i][j] = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    String.format(
                                            "Informe a nota %d aluno %d: ",
                                            (j + 1), (i + 1))));
                }
            }

            for (double[] aluno : notasTurma) {
                for (double nota : aluno) {
                    totalTurma += nota;
                }
            }
            double media = totalTurma / (qtdAluno * qtdNota);

            JOptionPane.showMessageDialog(null, String.format(
                    "Resultado final: %.1f", media),
                    "Media total da turma",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro: " + e.getMessage(), "Atenção!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
