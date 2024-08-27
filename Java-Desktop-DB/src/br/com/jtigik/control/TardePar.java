package br.com.jtigik.control;

import javax.swing.JOptionPane;

public class TardePar {
    public static void main(String[] args) {
        // Declaração de variáveis
        float num, media, soma = 0f;
        int cont = 0;

        for (cont = 0; cont < 3; cont++) {
            num = Float.parseFloat(
                    JOptionPane.showInputDialog(null,
                            "Informe uma nota: "));
            soma += num;
        }
        media = soma / cont;

        JOptionPane.showMessageDialog(null, "A média é: " + media);

        JOptionPane.showMessageDialog(null,
                String.format("A média é: %.1f", media));

    }// Fim do main
} // Fim Class
