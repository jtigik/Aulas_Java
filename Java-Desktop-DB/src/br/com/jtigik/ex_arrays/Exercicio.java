package br.com.jtigik.ex_arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exercicio {

    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];

        // Após a criação, o array é inicializado com 'zeros'
        JOptionPane.showMessageDialog(null,
                Arrays.toString(notasAlunoA));

        // Atribuição.
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.6;

        //Imprimindo
        JOptionPane.showMessageDialog(null,
                Arrays.toString(notasAlunoA));

        //Percorrendo o Arrray.
        /*
        double total = 0;
        for (int i = 0; i < 3; i++) {
                total += notasAlunoA[i];
        }
         */
        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }

        //Maneira simples daexecutar uma média simples.
        JOptionPane.showMessageDialog(null,
                String.format(
                        "Resultado final: %.1f", totalAlunoA / 3));

        //Utilizando elementos da classe Arrays (atributo 'length')
        JOptionPane.showMessageDialog(null,
                String.format(
                        "Resultado final: %.1f", totalAlunoA / notasAlunoA.length));

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }

        JOptionPane.showMessageDialog(null,
                String.format(
                        "Resultado final: %.1f", totalAlunoB / notasAlunoB.length));
    }
}
