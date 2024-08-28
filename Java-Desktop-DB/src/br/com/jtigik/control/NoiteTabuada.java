package br.com.jtigik.control;

import javax.swing.JOptionPane;

public class NoiteTabuada {
    public static void main(String[] args) {
        int fator, multiplicar;

        fator = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Informe o valor do fator: "));

        for (int i = 1; i <= 10; i++) {
            multiplicar = i * fator;
            JOptionPane.showMessageDialog(
                    null, String.format(
                            "O valor da multiplicação: %d", multiplicar));
        }
    }// fim main
}// fim class
