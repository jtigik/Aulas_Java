package br.com.jtigik.control;

import javax.swing.JOptionPane;

public class NoiteINSS {
    public static void main(String[] args) {
        float recolher, salario = 0f;

        salario = Float.parseFloat(
                JOptionPane.showInputDialog("Informe o salário: "));

        if (salario > 6433.57) {
            recolher = 751.99f;
            JOptionPane.showMessageDialog(null,
                    String.format("O valor recolhido foi: R$: %.2f", recolher));
        } else {
            if (salario > 3305.22) {
                recolher = salario * 0.14f;
                JOptionPane.showMessageDialog(null,
                        String.format("O valor recolhido foi: R$: %.2f", recolher));
            } else {
                if (salario > 2203.48) {
                    recolher = salario * 0.12f;
                    JOptionPane.showMessageDialog(null,
                            String.format("O valor recolhido foi: R$: %.2f", recolher));
                } else {
                    if (salario > 1100.00) {
                        recolher = salario * 0.09f;
                        JOptionPane.showMessageDialog(null,
                                String.format("O valor recolhido foi: R$: %.2f", recolher));
                    } else {
                        recolher = salario * 0.075f;
                        JOptionPane.showMessageDialog(null,
                                String.format("O valor recolhido foi: R$: %.2f", recolher));
                    } // Fim else 7,5%
                } // Fim else 9,0%
            } // Fim else 12%
        } // Fim else 14%
    }// fim main
}// fim class
