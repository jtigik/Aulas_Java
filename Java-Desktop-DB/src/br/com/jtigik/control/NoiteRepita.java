package br.com.jtigik.control;

import javax.swing.JOptionPane;

public class NoiteRepita {
    public static void main(String[] args) {
        float num, soma = 0f;

        do {
            num = Float.parseFloat(
                    JOptionPane.showInputDialog(
                            "Informe um número ou digite zero para sair: "));
            soma += num;
            JOptionPane.showMessageDialog(null,
                    String.format("A soma é: %.1f", soma));
        } while (num != 0);
    }// Fim main
}// Fim class
